from pyspark.sql import SparkSession, types

spark = (
    SparkSession
    .builder
    .appName('cleaning_orders_dataset_with_pyspark')
    .getOrCreate()
)

orders_data = spark.read.parquet('orders_data.parquet')
orders_data.toPandas().head()

# Check the schema of the dataset to see the data types of each column
orders_data.printSchema()

# -----------------------------------------------------------------------------------------

from pyspark.sql import functions as F
from pyspark.sql.types import DateType

# Add a new column 'time_of_day' based on the hour of 'order_date'
orders_data_clean = orders_data.withColumn(
    'time_of_day', 
    F.when((F.hour('order_date') >= 6) & (F.hour('order_date') < 12), 'morning')
     .when((F.hour('order_date') >= 12) & (F.hour('order_date') < 18), 'afternoon')
     .when((F.hour('order_date') >= 18) & (F.hour('order_date') < 24), 'evening')
     .otherwise('night')
)

# Filter out rows where 'time_of_day' is 'night'
orders_data_clean = orders_data_clean.filter(F.col('time_of_day') != 'night')

# Cast 'order_date' column to DateType
orders_data_clean = orders_data_clean.withColumn('order_date', F.col('order_date').cast(DateType()))

# Display the 'time_of_day'
# orders_data_clean.select('time_of_day').distinct().show()

# ----------------------------------------------------------------------------------------------------

# Convert 'product' and 'category' columns to lowercase
orders_data_clean = orders_data_clean.withColumn('product', F.lower(F.col('product')))
orders_data_clean = orders_data_clean.withColumn('category', F.lower(F.col('category')))

# Filter out rows where 'product' contains 'tv'
orders_data_clean = orders_data_clean.filter(~F.col('product').contains('tv'))

# Display the 'product' and 'category' columns
# orders_data_clean.select(['product', 'category']).show()

# ---------------------------------------------------------------------------------------------------

# Explore the structure of purchase_address
orders_data_clean.select('purchase_address').show(truncate=False)

# Create a new column with an extracted state
orders_data_clean = orders_data_clean.withColumn('purchase_state', F.split('purchase_address', ', ').getItem(2))
orders_data_clean = orders_data_clean.withColumn('purchase_state', F.split('purchase_state', ' ').getItem(0))

# Count the number of unique states and save it as n_states
n_states = orders_data_clean.select('purchase_state').distinct().count()

# ------------------------------------------------------------------------------------------------------

# Prepare and export the table
orders_data_clean.write.mode('overwrite').parquet('orders_data_clean.parquet')

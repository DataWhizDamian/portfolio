# Re-run this cell
# Import required libraries
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
crimes = pd.read_csv("crimes.csv", parse_dates=["Date Rptd", "DATE OCC"], dtype={"TIME OCC": str})
crimes.head()


# Extract the hour from the "TIME OCC" column and convert it to integer
crimes['HOUR OCC'] = crimes['TIME OCC'].str[:2].astype(int)

# Plot the frequencies of crimes by hour
plt.figure(figsize=(12, 6))
sns.countplot(x='HOUR OCC', data=crimes, palette='viridis')
plt.title('Frequency of Crimes by Hour')
plt.xlabel('Hour of the Day')
plt.ylabel('Number of Crimes')
plt.xticks(range(0, 24))
plt.grid(True)
plt.show()

# Determine the peak crime hour
peak_crime_hour = crimes['HOUR OCC'].mode()[0]
peak_crime_hour


# Filter crimes that occurred between 10pm and 3:59am
night_crimes = crimes[(crimes['TIME OCC'].astype(int) >= 2200) | (crimes['TIME OCC'].astype(int) < 400)]

# Find the area with the highest frequency of night crimes
peak_night_crime_location = night_crimes['AREA NAME'].value_counts().idxmax()
peak_night_crime_location


# Define age bins and labels
age_bins = [0, 17, 25, 34, 44, 54, 64, np.inf]
age_labels = ["0-17", "18-25", "26-34", "35-44", "45-54", "55-64", "65+"]

# Create a new column 'Age Bracket' in the crimes DataFrame
crimes['Age Bracket'] = pd.cut(crimes['Vict Age'], bins=age_bins, labels=age_labels, right=True)

# Count the number of crimes committed against each age group
victim_ages = crimes['Age Bracket'].value_counts().sort_index()
victim_ages

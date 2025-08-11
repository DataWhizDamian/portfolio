As a Data Engineer at an electronics e-commerce company, Voltmart, you have been requested by a peer Machine Learning team to clean the data containing the information about orders made last year. They are planning to further use this cleaned data to build a demand forecasting model. To achieve this, they have shared their requirements regarding the desired output table format.

An analyst shared a parquet file called `"orders_data.parquet"` for you to clean and preprocess. 

You can see the dataset schema below along with the **cleaning requirements**:

## `orders_data.parquet`

| column | data type | description | cleaning requirements | 
|--------|-----------|-------------|-----------------------|
| `order_date` | `timestamp` | Date and time when the order was made | _Modify: Remove orders placed between 12am and 5am (inclusive); convert from timestamp to date_ |
| `time_of_day` | `string` | Period of the day when the order was made | _New column containing (lower bound inclusive, upper bound exclusive): "morning" for orders placed 5-12am, "afternoon" for orders placed 12-6pm, and "evening" for 6-12pm_ |
| `order_id` | `long` | Order ID | _N/A_ |
| `product` | `string` | Name of a product ordered | _Remove rows containing "TV" as the company has stopped selling this product; ensure all values are lowercase_ |
| `product_ean` | `double` | Product ID | _N/A_ |
| `category` | `string` | Broader category of a product | _Ensure all values are lowercase_ |
| `purchase_address` | `string` | Address line where the order was made ("House Street, City, State Zipcode") | _N/A_ |
| `purchase_state` | `string` | US State of the purchase address | _New column containing: the State that the purchase was ordered from_ |
| `quantity_ordered` | `long` | Number of product units ordered | _N/A_ |
| `price_each` | `double` | Price of a product unit | _N/A_ |
| `cost_price` | `double` | Cost of production per product unit | _N/A_ |
| `turnover` | `double` | Total amount paid for a product (quantity x price) | _N/A_ |
| `margin` | `double` | Profit made by selling a product (turnover - cost) | _N/A_ |

<br>

[datacamp_project_link](https://www.datacamp.com/datalab/w/8883c4ab-ebad-4c56-883d-d65bb7e060eb/edit?emitCellOutputs=false&reducedMenuBar=true&showExploreMore=false&showLeftNavigation=false&showNavBar=false&showPublicationButton=false&showOnlyRelevantSampleIntegrationIds[]=89e17161-a224-4a8a-846b-0adc0fe7a4b1&showOnlyRelevantSampleIntegrationIds[]=e0c96696-ae0a-46fb-b6f9-1a43eb428ecb&showOnlyRelevantSampleIntegrationIds[]=b1fcb109-b4fe-4543-bc98-681df8c4dc6e&showOnlyRelevantSampleIntegrationIds[]=fcf37a0e-f8bd-4c85-95a5-201d3eebea48&showOnlyRelevantSampleIntegrationIds[]=db697c09-0402-4a02-b327-26018dc2ecce&showOnlyRelevantSampleIntegrationIds[]=7569175e-98be-4c89-9873-c20f699a9cc7&fetchUnlistedSampleIntegrationIds[]=7569175e-98be-4c89-9873-c20f699a9cc7#086e2bd3-ff58-423b-98e0-a7e4c979d7f3)

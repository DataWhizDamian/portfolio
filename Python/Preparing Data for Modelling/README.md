A common problem when creating models to generate business value from data is that the datasets can be so large that it can take days for the model to generate predictions. Ensuring that your dataset is stored as efficiently as possible is crucial for allowing these models to run on a more reasonable timescale without having to reduce the size of the dataset.

You've been hired by a major online data science training provider called *Training Data Ltd.* to clean up one of their largest customer datasets. This dataset will eventually be used to predict whether their students are looking for a new job or not, information that they will then use to direct them to prospective recruiters.

You've been given access to `customer_train.csv`, which is a subset of their entire customer dataset, so you can create a proof-of-concept of a much more efficient storage solution. The dataset contains anonymized student information, and whether they were looking for a new job or not during training:

| Column                   | Description                                                                      |
|------------------------- |--------------------------------------------------------------------------------- |
| `student_id`             | A unique ID for each student.                                                    |
| `city`                   | A code for the city the student lives in.                                        |
| `city_development_index` | A scaled development index for the city.                                         |
| `gender`                 | The student's gender.                                                            |
| `relevant_experience`    | An indicator of the student's work relevant experience.                          |
| `enrolled_university`    | The type of university course enrolled in (if any).                              |
| `education_level`        | The student's education level.                                                   |
| `major_discipline`       | The educational discipline of the student.                                       |
| `experience`             | The student's total work experience (in years).                                  |
| `company_size`           | The number of employees at the student's current employer.                       |
| `company_type`           | The type of company employing the student.                                       |
| `last_new_job`           | The number of years between the student's current and previous jobs.             |
| `training_hours`         | The number of hours of training completed.                                       |
| `job_change`             | An indicator of whether the student is looking for a new job (`1`) or not (`0`). |



[datacamp_project_link](https://www.datacamp.com/datalab/w/dad8dd8d-15b2-4376-8412-aea42d31aea8/edit?emitCellOutputs=false&reducedMenuBar=true&showExploreMore=false&showLeftNavigation=false&showNavBar=false&showPublicationButton=false&showOnlyRelevantSampleIntegrationIds[]=89e17161-a224-4a8a-846b-0adc0fe7a4b1&showOnlyRelevantSampleIntegrationIds[]=e0c96696-ae0a-46fb-b6f9-1a43eb428ecb&showOnlyRelevantSampleIntegrationIds[]=b1fcb109-b4fe-4543-bc98-681df8c4dc6e&showOnlyRelevantSampleIntegrationIds[]=fcf37a0e-f8bd-4c85-95a5-201d3eebea48&showOnlyRelevantSampleIntegrationIds[]=db697c09-0402-4a02-b327-26018dc2ecce&showOnlyRelevantSampleIntegrationIds[]=7569175e-98be-4c89-9873-c20f699a9cc7&fetchUnlistedSampleIntegrationIds[]=7569175e-98be-4c89-9873-c20f699a9cc7#13757e62-aca2-48f4-b569-a838af11bdd5)

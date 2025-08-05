-- What is the oldest business on each continent?
SELECT bc.continent, bc.business, bc.year_founded, bc.country
FROM (
    SELECT business, year_founded, country, continent
    FROM businesses
    JOIN countries USING (country_code)
) bc
JOIN (SELECT continent, MIN(year_founded) AS year_founded
    FROM businesses
    JOIN countries 
    USING (country_code)
    GROUP BY continent
) c 
ON bc.continent = c.continent AND bc.year_founded = c.year_founded

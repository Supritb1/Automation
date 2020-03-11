Feature: Get the weather details of the city

Scenario: Hyderabad weather details
Given Get the weather details of city "/city"
When i prform GET for city "Hyderabad"
Then i should get Temperature as "22.78 Degree celsius"
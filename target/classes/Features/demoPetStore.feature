Feature: validate Pet Store
@test
Scenario: validate pet Store transactions
Given user domain "https://petstore.swagger.io/v2/pet"
And user add endPoint "/findByStatus"
When user get data with param "status" value "available,sold"
Then user get response
Then user verify all results containing "available,sold" and not containing "pending"

Scenario: Add new available pet to store
Given user domain "https://petstore.swagger.io/v2/pet"


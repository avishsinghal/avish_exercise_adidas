Feature: validate Pet Store
@test
Scenario: validate pet Store transactions
Given user domain "https://petstore.swagger.io/v2/pet"
And user add endPoint "/findByStatus"
When user get data with param "status" value "available,sold"
Then user get response
Then user verify all results containing "available,sold" and not containing "pending"

Scenario: Add new available pet and then update to sold to store
Given user domain "https://petstore.swagger.io/v2/pet"
When user hit request and validate response
Then user update pet to sold
Then user verify all results containing "sold" and not containing "available,pending"
Then user delete pet id "111" from inventory
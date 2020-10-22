Feature: Customer navigation through product categories Phones Laptops and Monitors and purchase one product

  Scenario: Validate purchase amount is equal to placed order amount
    Given user Launch url "https://www.demoblaze.com/index.html"
    When user navigate to "Phones"
    Then user validates expected products "Samsung galaxy s6,Nokia lumia 1520" are visible
    When user navigate to "Laptops"
    Then user validates expected products "Sony vaio i5,Sony vaio i7" are visible
    When user navigate to "Monitors"
    Then user validates expected products "Apple monitor 24" are visible
    When user navigate to "Laptops"
    When user click product "Sony vaio i5"
    Then user add product to cart
    When user accept pop up confirmation
    Then user move to "Home"
    When user navigate to "Laptops"
    When user click product "Dell i7 8gb"
    Then user add product to cart
    When user accept pop up confirmation
    Then user move to "Cart"
    Then user verifies product are there "Sony vaio i5,Dell i7 8gb"
    When user delete product "Dell i7 8gb"
    Then user verify product is deleted "Dell i7 8gb"
    When user click on Place order
    Then user fill form fields
    Then user capture total amount from the pop-up
    When user click on purchase
    Then user capture purchase ID and Amount
    Then user verify amount should match to urchase amount
    Then close browser
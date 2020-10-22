$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demoOnlineShop.feature");
formatter.feature({
  "line": 1,
  "name": "Customer navigation through product categories Phones Laptops and Monitors and purchase one product",
  "description": "",
  "id": "customer-navigation-through-product-categories-phones-laptops-and-monitors-and-purchase-one-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate purchase amount is equal to placed order amount",
  "description": "",
  "id": "customer-navigation-through-product-categories-phones-laptops-and-monitors-and-purchase-one-product;validate-purchase-amount-is-equal-to-placed-order-amount",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch url \"https://www.demoblaze.com/index.html\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user navigate to \"Phones\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user validates expected products \"Samsung galaxy s6,Nokia lumia 1520\" are visible",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user navigate to \"Laptops\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user validates expected products \"Sony vaio i5,Sony vaio i7\" are visible",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user navigate to \"Monitors\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user validates expected products \"Apple monitor 24\" are visible",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user navigate to \"Laptops\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user click product \"Sony vaio i5\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user add product to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user accept pop up confirmation",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user move to \"Home\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user navigate to \"Laptops\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user click product \"Dell i7 8gb\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user add product to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user accept pop up confirmation",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user move to \"Cart\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user verifies product are there \"Sony vaio i5,Dell i7 8gb\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user delete product \"Dell i7 8gb\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user verify product is deleted \"Dell i7 8gb\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user click on Place order",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user fill form fields",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user capture total amount from the pop-up",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user click on purchase",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user capture purchase ID and Amount",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user verify amount should match to urchase amount",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.demoblaze.com/index.html",
      "offset": 17
    }
  ],
  "location": "DemoOnlineStore.user_launch_url(String)"
});
formatter.result({
  "duration": 13173411100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Phones",
      "offset": 18
    }
  ],
  "location": "DemoOnlineStore.user_navigate_to(String)"
});
formatter.result({
  "duration": 327454500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung galaxy s6,Nokia lumia 1520",
      "offset": 34
    }
  ],
  "location": "DemoOnlineStore.user_validates_expected_products_are_visible(String)"
});
formatter.result({
  "duration": 54659400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptops",
      "offset": 18
    }
  ],
  "location": "DemoOnlineStore.user_navigate_to(String)"
});
formatter.result({
  "duration": 126607000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sony vaio i5,Sony vaio i7",
      "offset": 34
    }
  ],
  "location": "DemoOnlineStore.user_validates_expected_products_are_visible(String)"
});
formatter.result({
  "duration": 75719700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Monitors",
      "offset": 18
    }
  ],
  "location": "DemoOnlineStore.user_navigate_to(String)"
});
formatter.result({
  "duration": 128935100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple monitor 24",
      "offset": 34
    }
  ],
  "location": "DemoOnlineStore.user_validates_expected_products_are_visible(String)"
});
formatter.result({
  "duration": 324850600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptops",
      "offset": 18
    }
  ],
  "location": "DemoOnlineStore.user_navigate_to(String)"
});
formatter.result({
  "duration": 86145900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sony vaio i5",
      "offset": 20
    }
  ],
  "location": "DemoOnlineStore.user_click_product(String)"
});
formatter.result({
  "duration": 990209800,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_add_product_to_cart()"
});
formatter.result({
  "duration": 825910600,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_accept_pop_up_confirmation()"
});
formatter.result({
  "duration": 4091306600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 14
    }
  ],
  "location": "DemoOnlineStore.user_move_to_home(String)"
});
formatter.result({
  "duration": 4357680800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptops",
      "offset": 18
    }
  ],
  "location": "DemoOnlineStore.user_navigate_to(String)"
});
formatter.result({
  "duration": 116230100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell i7 8gb",
      "offset": 20
    }
  ],
  "location": "DemoOnlineStore.user_click_product(String)"
});
formatter.result({
  "duration": 3221363200,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_add_product_to_cart()"
});
formatter.result({
  "duration": 4257148900,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_accept_pop_up_confirmation()"
});
formatter.result({
  "duration": 4046864100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cart",
      "offset": 14
    }
  ],
  "location": "DemoOnlineStore.user_move_to_home(String)"
});
formatter.result({
  "duration": 1580128400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sony vaio i5,Dell i7 8gb",
      "offset": 33
    }
  ],
  "location": "DemoOnlineStore.user_verifies_product_are_there(String)"
});
formatter.result({
  "duration": 5991806700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell i7 8gb",
      "offset": 21
    }
  ],
  "location": "DemoOnlineStore.user_delete_product(String)"
});
formatter.result({
  "duration": 89230800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell i7 8gb",
      "offset": 32
    }
  ],
  "location": "DemoOnlineStore.user_verify_product_is_deleted(String)"
});
formatter.result({
  "duration": 15084478800,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_click_on_place_order()"
});
formatter.result({
  "duration": 83440400,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_fill_form_fields()"
});
formatter.result({
  "duration": 993313800,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_capture_total_amount_from_the_pop_up()"
});
formatter.result({
  "duration": 65346100,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_click_on_purchase()"
});
formatter.result({
  "duration": 154793400,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_capture_purchase_id_and_amount()"
});
formatter.result({
  "duration": 50069800,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.user_verify_amount_should_match_to_urchase_amount()"
});
formatter.result({
  "duration": 92000,
  "status": "passed"
});
formatter.match({
  "location": "DemoOnlineStore.close_browser()"
});
formatter.result({
  "duration": 790597600,
  "status": "passed"
});
formatter.uri("demoPetStore.feature");
formatter.feature({
  "line": 1,
  "name": "validate Pet Store",
  "description": "",
  "id": "validate-pet-store",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "validate pet Store transactions",
  "description": "",
  "id": "validate-pet-store;validate-pet-store-transactions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user domain \"https://petstore.swagger.io/v2/pet\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user add endPoint \"/findByStatus\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user get data with param \"status\" value \"available,sold\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user get response",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user verify all results containing \"available,sold\" and not containing \"pending\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://petstore.swagger.io/v2/pet",
      "offset": 13
    }
  ],
  "location": "DemoPetStore.user_domain(String)"
});
formatter.result({
  "duration": 647352100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/findByStatus",
      "offset": 19
    }
  ],
  "location": "DemoPetStore.user_add_endPoint(String)"
});
formatter.result({
  "duration": 79700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "status",
      "offset": 26
    },
    {
      "val": "available,sold",
      "offset": 41
    }
  ],
  "location": "DemoPetStore.user_get_data_with_param_value(String,String)"
});
formatter.result({
  "duration": 58831200,
  "status": "passed"
});
formatter.match({
  "location": "DemoPetStore.user_get_response()"
});
formatter.result({
  "duration": 6881674000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "available,sold",
      "offset": 36
    },
    {
      "val": "pending",
      "offset": 72
    }
  ],
  "location": "DemoPetStore.user_verify_all_results_containing_and_not_containing(String,String)"
});
formatter.result({
  "duration": 770554500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Add new available pet and then update to sold to store",
  "description": "",
  "id": "validate-pet-store;add-new-available-pet-and-then-update-to-sold-to-store",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user domain \"https://petstore.swagger.io/v2/pet\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user hit request and validate response",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user update pet to sold",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user verify all results containing \"sold\" and not containing \"available,pending\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user delete pet id \"111\" from inventory",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://petstore.swagger.io/v2/pet",
      "offset": 13
    }
  ],
  "location": "DemoPetStore.user_domain(String)"
});
formatter.result({
  "duration": 1317300,
  "status": "passed"
});
formatter.match({
  "location": "DemoPetStore.user_hit_request_and_validate_response()"
});
formatter.result({
  "duration": 7822663100,
  "status": "passed"
});
formatter.match({
  "location": "DemoPetStore.user_update_pet_to_sold()"
});
formatter.result({
  "duration": 3637783100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sold",
      "offset": 36
    },
    {
      "val": "available,pending",
      "offset": 62
    }
  ],
  "location": "DemoPetStore.user_verify_all_results_containing_and_not_containing(String,String)"
});
formatter.result({
  "duration": 581500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "111",
      "offset": 20
    }
  ],
  "location": "DemoPetStore.user_delete_pet_id_from_inventory(String)"
});
formatter.result({
  "duration": 2818018800,
  "status": "passed"
});
});
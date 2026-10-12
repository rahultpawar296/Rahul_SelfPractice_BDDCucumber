Feature: SwagLab application end to end feature

  Background:
    Given user open Swaglab application login url "URL"
    When user enter UN as "#UN"
    And wait for 1 sec
    And user enter PWD as "#PWD"
    And wait for 1 sec
    And user click on login button
    And wait for 1 sec
    Then verify home page visible with logo text as "Swag Labs"

  @BikeLight_product_checkoutWithFinalSubmit
  Scenario: TC01- Buy Sauce Labs Bike Light and checkout
    When user click on Add to Cart Sauce Labs Bike Light item
    And wait for 2 sec
    Then use click on Cart Page
    And wait for 2 sec
    Then verify title of Cart page should be  "Your Cart"
    Then verify quantity of items in Cart should be 1
    Then verify title of added product is "Sauce Labs Bike Light"
    Then user clicks on checkout button
    And wait for 2 sec
    Then verify title of Checkout page should be  "Checkout: Your Information"
    And user enters First Name as "Rahul"
    And user enters Last Name as "Pawar"
    And user enters Zip Code as "411001"
    And wait for 2 sec
    Then user clicks on Continue button
    Then verify title of Checkout overview page should be  "Checkout: Overview"
    And wait for 2 sec
    Then user clicks on Finish button
    And wait for 2 sec
    Then verify title of Checkout complete page should be  "Checkout: Complete!"
    Then verify order completion message should be as "Thank you for your order!"
    And wait for 2 sec

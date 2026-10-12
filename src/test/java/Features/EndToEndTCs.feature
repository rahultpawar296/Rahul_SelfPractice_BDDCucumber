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

  @product_checkoutWithFinalSubmit
  Scenario: TC01- Buy Sauce Labs Bike Light and checkout
    When user click on Add to Cart Sauce Labs Bike Light item
    And wait for 2 sec
    Then use click on Cart Page
    And wait for 2 sec
    Then verify title of Cart page should be  "Your Cart"
    Then verify quantity of items in Cart should be 1
    Then verify title of added product is ""
    Then user clicks on checkout button
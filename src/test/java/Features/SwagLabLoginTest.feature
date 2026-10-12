Feature: SwagLab Login feature

  Background:
    Given user open Swaglab application login url "URL"

Scenario: TC1 Validate login with valid credentials
 # Given user open Swaglab application login url "URL"
  And user enters username as "UN"
  And user enters password as "PWD"
  And user click on login button
  Then verify home page visible with logo text as "Swag Labs"

  Scenario: TC2 Validate login with invalid credentials
  #  Given user open Swaglab application login url "URL"
    And user enters invalid username as "UN1"
    And user enters invalid password as "PWD1"
    And user click on login button
    Then login failed with error msg visible as "Username and password do not match"


  Scenario: TC3 login with valid credentials
  #  Given user open Swaglab application login url "URL"
    When user enter UN as "#UN"
    And user enter PWD as "#PWD"
    And user click on login button
    Then verify home page visible with logo text as "Swag Labs"


  @loginWithCorrectAndIncorrectCredentials
  Scenario Outline: TC4- login with correct & incorrect credentials
    When user enter UN as "<username>"
    When wait for 2 sec
    And user enter PWD as "<password>"
    When wait for 1 sec
    And user click on login button
    Then verify login failed error message with message "<expectedErrorMsg>"
    Examples:
      |username| password| expectedErrorMsg                                                           |
      | #UN     | xyz1    |  Epic sadface: Username and password do not match any user in this service |
      | abc2   | #PWD    |  Epic sadface: Username and password do not match any user in this service |
      | abc3   | xyz3    |  Epic sadface: Username and password do not match any user in this service |

Feature: SwagLab Login feature

Scenario: TC1 Validate login with valid credentials
  Given user open Swaglab application login url "URL"
  And user enters username as "UN"
  And user enters password as "PWD"
  And user click on login button
  Then verify home page visible with logo text as "Swag Labs"






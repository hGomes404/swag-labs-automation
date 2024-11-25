Feature: Perform logging in Swag Labs

  Background:
    Given I navigate to Swag Labs website

  Scenario: Authenticate into the user account
    Given I login using standard user
    Then I search for the first lower price product

Feature: Perform logging in Swag Labs

  Background:
    Given I navigate to Swag Labs website

  Scenario Outline: Authenticate into the user account
    Then I login using <username> user
    Examples:
    | username           |
    | standard           |
    | locked out         |
    | problem            |
    | performance glitch |

  Scenario: Add the first lower price product to the basket
    Then I login using standard user
    And I search for the first lower price product
    Then I add the product to the basket
    And I confirm the product is in the basket

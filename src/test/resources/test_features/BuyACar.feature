@Regression
Feature: Buying a car feature

  #Parameterized Step Definitions
  Scenario: I want to buy a car with 5000
    Given I have 5000 money
    When going to dealer ship
    Then I can buy "Toyota"

    Scenario: I want to buy a car with 43000
      Given I have 43000 money
      When going to dealer ship
      Then  I can buy "BMW"

      Scenario Outline: Buying a car with multiple value
        Given I have <amount> money
        When going to dealer ship
        Then I can buy "<make>"

        Examples:
        |amount    |make      |
        |5000      |Toyota   |
        |43000     |BMW       |
        |76000     |Audi      |
        |85000     |Tesla     |


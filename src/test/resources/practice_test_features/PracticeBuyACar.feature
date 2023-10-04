@Regression1
Feature: Buying a car feature1

  Scenario: 1I want to buy a car with 5000;
    Given 1I have 50001 money
    When 1going to dealer ship
    Then II can buy "Toyota"

  Scenario: 1I want to buy a car with 45000;
    Given 1I have 43000 money
    When 1going to dealer ship
    Then II can buy "BMW"

  Scenario Outline: IBuying a car with value
    Given 1I have <amount> money
    When 1going to dealer ship
    Then II can buy "<make>"

    Examples:
    |amount|make   |
    |4000  | Toyota|
    |34000 | BMW   |
    |67000 | Audi  |
    |80000 | Tesla |

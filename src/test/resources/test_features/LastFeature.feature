@Regression @Smoke @US_11
Feature: Last feature for today

  Scenario: Testing
    Given open browser "chrome"
    When sending username "supervisor" and password "tek_supervisor"
    And Click on login button
    Then Login Successfully
    And close browser
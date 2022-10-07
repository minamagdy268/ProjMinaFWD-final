@MyRegression

Feature: User could access slider items

  Background: user opens chrome browser.
    # Please add Login steps here if you want to proceed manually with this test scenario.

    # Test Scenario 14
  Scenario: User clicks on first slider link.
    When User clicks on first slider button
    And User click on first slider link
    Then User redirected to first slider link

  Scenario: User clicks on second slider link.
    When User select the second slider button
    And User click on second slider link
    Then User is redirected to second slider link
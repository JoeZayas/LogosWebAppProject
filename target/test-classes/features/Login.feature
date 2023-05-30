Feature: Login Functionality

  Scenario: Valid Login
    Given user is navigated to logos.com home page
    When user clicks on sign in button at top right of page
    Then user is navigated to auth window
    And user enters username and password
    And user clicks on sign in button
    Then user is navigated back to logo.com home page
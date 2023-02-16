Feature: Login Page Functionality

  Scenario: User Login Top Right
    Given user is navigated to logos bible application
    When user clicks top right sign in button
    When authentication pop-up appears
    When user enters valid username and password
    And user clicks on pop up sign in button
    Then user is logged into application

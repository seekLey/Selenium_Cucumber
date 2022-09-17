Feature: To test login functionality of the application

  Background:

  Scenario: To test login page
    Given when user is on login page
    When verify the title of the page
    And enter username and password
    Then click on login button

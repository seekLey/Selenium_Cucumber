Feature: Automation Demo Site

  Background: Automation Test application

  Scenario: To test login page and Page title
    Given launch the browser
    And verify the page Title

  Scenario Outline: To test HTML Form
    Given search for the HTML Form
    Then click on the Form link and verify title
    And enter username <Username>
    And enter password <Password>
    And enter text area <TextArea>
    And upload file

    Examples:
      | Username | Password    | TextArea   |
      | "Shawn"  | "Shawn@123" | "Comment1" |

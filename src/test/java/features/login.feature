Feature: Automation Demo Site

  Background: Automated HTML Form Filling

  Scenario: To test login page and Page title
    Given launch the browser
    And verify the page Title

  Scenario Outline: Enter Data in HTML form and Upload File
    Given search for the HTML Form
    Then click on the Form link and verify title
    And enter username <Username>
    And enter password <Password>
    And enter text area <TextArea>
    And upload file

    Examples:
      | Username | Password    | TextArea            |
      | "Shawn"  | "Shawn@123" | "Text Area Comment" |

  Scenario: To test the Checkbox and Radio button selection
    Given verify the page Title
    Then click on the Form link and verify title
    Then user is on HTML Form page
    Then select Checkbox 1, Checkbox 2 and Checkbox 3 and verify selection
    Then unselect Checkbox 1 and verify de-selection



#    Then select a Radio 1 button and verify Radio button 2 and 3
#    And select Multiple Selection <Values>
#    And Select a value from <Dropdown>

#    Examples:
#      | Values      | Dropdown           |
#      | "Selection" | "Drop Down Item 3" |
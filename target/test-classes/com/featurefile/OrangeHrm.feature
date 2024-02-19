
Feature: Orange HRM application
 @AB-1
 Scenario Outline: To verify login functionality in the application
 Given User launch the browser
 When User enter username as "<uname>"
 And User enter the password as "<pwd>"
 When User click on the login button
 Then User should navigate to the dashboard page
 Examples:
          | uname  | pwd       |
          | Admin  | admin123  |
          | Vimala | vimala123 |

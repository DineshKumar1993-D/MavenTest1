Feature: To Test The Adactin Hotel Booking Application

Scenario: User Checks The Login Functionality
Given user Launch The Url Of The Adactin Application
When user Enter The Following Credentials In The Respective Field
|Username|Password|
|Java@123|32675672|
|Selenium|2676732|
|Cypress|2765673|

#When user Enter The Username "<Username>"In The Respective Field
#And user Enter The Password "<Password>" In The Respective Field
Then user Clicks The Loginbutton and Its Navigates The Search hotel Page
#Examples: 
#|Username|Password|
#|Java@123|32675672|
#|Selenium|2676732|
#|Cypress|2765673|

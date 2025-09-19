@smoke
Feature: Login
  As a user, I want to log into the application so that I can see the dashboard

  Scenario Outline: Valid login using Excel data
  Given user is on login page
  When user logs in with excel sheet <user> and <pass>
  Then flash message should contain "You logged into a secure area!"

Examples:
  | user     | pass                |
  | tomsmith | SuperSecretPassword! |
 
  

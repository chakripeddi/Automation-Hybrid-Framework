@regression @smoke
Feature: Profile/Dashboard verification
  Scenario Outline: Verify dashboard header
    Given user is on login page
  When user logs in with excel sheet <user> and <pass>

    Then dashboard header should be "Secure Area"

    Examples:
  | user     | pass                |
  | tomsmith | SuperSecretPassword! |
  | tomsmith | SuperSecretPassword! |
  | tomsmith | SuperSecretPassword! |
  
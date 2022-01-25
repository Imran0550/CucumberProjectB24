@try
Feature: login to trycloud application

Scenario: login to tryCloud application
  Given user is on tyrClod login page
  When user enters "User13" in username field
  And user enters "Userpass123" is password field
  Then user should be able to login
  And user should be able to see:
  |Recommended files|
  |Talk mentions    |
  |Upcoming events  |


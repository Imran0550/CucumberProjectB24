@smoke
Feature: user searches for multiple things on amazon website

  Scenario: searching multiple things on amazon
    Given User is on Amazon home page
    Then User should be able to search for the following:
             |coats|
             |play station|
             |mac|
             |iphones|
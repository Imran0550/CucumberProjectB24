Feature: User etsy search
  As a user, when I search for an item, I Should be able to see the results


  Scenario: User searches for wooden spoon
    Given User is on etsy home page
    Then Page title should be as expected
    When User searches for wooden spoon
    Then Page title should start with wooden spoon
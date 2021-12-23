Feature: Search something on Amazon
  As a user, I should be able to search an item on Amazon website


  Scenario: User search for an item
    Given User is on Amazon home page
    When User searches for anything
    Then User should be able to see the results of the search

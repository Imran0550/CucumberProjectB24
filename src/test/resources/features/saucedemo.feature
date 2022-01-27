@toDo
Feature: buy something


  Background: : user should see all products
    Given user is on sauce demo login page
    When user enters the following:
    |Username|standard_user|
    |Password| secret_sauce |
    And user clicks on login button
    Then user should be able to see "PRODUCTS" at top of page


    Scenario: user adds something to cart

      Then user should able to see "Sauce Labs Backpack"
      And user click on add to cart


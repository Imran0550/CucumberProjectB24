@lyft
Feature: Searching Lyft fare details
  As a rider, I should be able to enter pickup and drop off locations and see the estimate fare


  Scenario: Fare estimate using City
    Given user is on the lyft fare estimate home page
    When user enters "Mclean,VA" to pick up address
    And user enters "Woodbridge,VA" to drop off location
    And user clicks on get estimate button
    Then user should be able to see estimate

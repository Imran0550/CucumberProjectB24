@lyft
Feature: Searching Lyft fare details
  As a rider, I should be able to enter pickup and drop off locations and see the estimate fare


  Background:
    Given user is on the lyft fare estimate home page

  Scenario: Fare estimate using City
    When user enters "Mclean,VA" to pick up address
    And user enters "Woodbridge,VA" to drop off location
    And user clicks on get estimate button
    Then user should be able to see estimate

  Scenario: Fare estimate using full address

    When user enters "81 Carriage hill dr, Fredericksburg, VA 22405" to pick up address
    And user enters "1600 Pennsylvania Avenue NW, Washington, DC 20500" to drop off location
    And user clicks on get estimate button
    Then user should be able to see estimate

  Scenario: Fare estimate using full address
    When user enters "" to pick up address
    And user enters "" to drop off location
    And user clicks on get estimate button
    Then user should see error message

@php
Feature: php login functionality

  Scenario: login functionality
    Given user is on php home page
    When user enters "admin@phptravels.com" in email field
    And user enters "demoadmin" in password field
    And user clicks login
    Then user should be able to see dashboard
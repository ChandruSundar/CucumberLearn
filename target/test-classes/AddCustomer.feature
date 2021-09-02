#Author: your.email@your.domain.com
Feature: Demo Telecom

  Scenario: Add Customer flow validation
    Given user launches telecom application
    And user clicks on telecom application
    When user needs to fill up the details
    And user clicks on submit button
    Then user verify customer id is generated

#Author: your.email@your.domain.com


Feature: Demo Telecom

Background:

    And user clicks on telecom application
@sanity 
  Scenario: Add Customer flow validation
    
    When user needs to fill up the details
    And user clicks on submit button
    Then user verify customer id is generated
    
    @smoke
    Scenario: Add Customer flow validation by 1 dimensional list
    
    When user needs to fill up the details by 1 dimensional list
    |java|Selenium|java@gmail.com|Chennai|0002992|
    And user clicks on submit button
    Then user verify customer id is generated

    #Scenario: Add Customer validation by 1D map concept
    #
    #When user needs to fill up the details by 1 dimensional list
      #| Fname | Soundar         |
      #| Lname | Rajan           |
      #| mail  | Rajan@gmail.com |
      #| addr  | Addr            |
      #| phno  |        65465464 |
     #And user clicks on submit button
    #Then user verify customer id is generated
    #
     #Scenario Outline: Add Customer flow validation
 #		
    #When user needs to fill up the details "<Fname>""<Lname>""<mail>""<addr>""<phno>"
    #And user clicks on submit button
    #Then user verify customer id is generated
     #
    #Examples: 
      #| Fname | Lname | mail | addr | phno | 
      #| Chandru|Sundar|Ch@gmail.com|address|78789789|  
     #	| Prasath|sunrendar|spr@gmail.com|address|778787789|  
     
#Author: sandeep_dhote@infosys.com

Feature: Rates API for latest foreign exchange rates
@RatesAPI

  Scenario: 1_Verify Latest Foreign Exchange rates API
    Given Open latest Rates API url 
    When Send request to get API availability
    Then  I Should get sucess status of the latest API
    
 @RatesAPI   
    Scenario: 2_Verify Latest Foreign Exchange Rates with Symbols API
    Given Open Symbol Rates API url 
    When Send request to get API availability for Symbol
    Then I Should get sucess status of the Symbol API
    
 @RatesAPI   
    Scenario: 3_Verify Latest Foreign Exchange Rates with base API
    Given Open Base Rates API url 
    When Send request to get API availability for Base
    Then I Should get sucess status of the Base API
  
 @RatesAPI   
    Scenario: 4_Verify Latest Foreign Exchange Rates with Symbol_Base API
    Given Open Symbol_Base Rates API url
    When Send request to get API availability for Symbol_Base
    Then I Should get sucess status of the Symbol_Base API


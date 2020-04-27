#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

Feature: Rates API for latest foreign exchange rates
  @RatesAPI6
  
  Scenario: To Check status code of all  Rates APIs
    Given Open Rates API url
    | url  |
      | https://api.ratesapi.io/api/latest |
      | https://api.ratesapi.io/api/latest?symbols=USD,GBP |
      | https://api.ratesapi.io/api/latest?base=USD |
      | https://api.ratesapi.io/api/latest?base=USD&symbols=GBP |
    When Get the response of provided API
    Then I verify the code in step
      #| code |
      #|     200 |
      #|     200 |
      #|     200 |
      #|     200 |

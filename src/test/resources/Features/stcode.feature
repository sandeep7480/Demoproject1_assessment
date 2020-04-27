Feature: Rates API for latest foreign exchange rates
  @RatesAPI7
  
Scenario Outline: To Check status code of all Rates APIs  
Given I hit below enpoints "<url>"  
Then I get the success response as 200  
And I am able to verify the details "<value>" 
Examples: 
| url | value |   
| https://api.ratesapi.io/api/latest |  latest |
| https://api.ratesapi.io/api/latest?symbols=USD,GBP | Symbols |  
| https://api.ratesapi.io/api/latest?base=USD | base |  
| https://api.ratesapi.io/api/latest?base=USD&symbols=GBP | Symbols_base |
  
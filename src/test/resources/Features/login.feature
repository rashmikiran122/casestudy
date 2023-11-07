@smoketest
Feature: feature to test login 
Scenario: check login is successful 

    Given user open URL "https://www.demoblaze.com/"
    And user click on login
    Then user enter username "rashmi.kiran" and password "march@2023"
    And clicks on login button
   # Then user navigat to home page

   # Examples: 
    #  |username|password|
    #  |rashmi.kiran|march@2023|
    
Feature: Login

Background: 
Given I see OrangeHrm Logo


@back
  Scenario: Valid login
    
    When I enter enter user name and password
    And I click login button
    Then I successfully loged on
@back
  Scenario: 
   
    When I enter enter invalid user name and password
    And I click login button
    Then I see error message is displayed

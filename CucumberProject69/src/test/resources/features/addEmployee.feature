Feature: Add employee and verify

  Background: 
    Given I logged into OrangeHrm
    And I click on PIM link
    And I click on add employe link

  
  Scenario Outline: Add employe
    Given I logged into OrangeHrm
    When I click on PIM link
    And I click on add employe link
    And I provide employee details "<name>" and "<mname>" and "<lname>" and "<location>"
    Then I click on save buttun
    And I see employe add successfully "<name>" and "<lname>"

    Examples: 
      | name     | mname | lname    | location    |
      | Ross     | Dino  | Geiler   | West Office |
      | Chandler | Haha  | Bieng    | HQ          |
      | Jo       | Actor | Tribiani | East Office |

  @smoke
  Scenario: Add Employee and Create Login Details
    When I provide firstname,midlename, lastname and location
    And I click on create login details
    And I provide all mandatory fields
    And I click on save button
    Then I see employee is added successfully

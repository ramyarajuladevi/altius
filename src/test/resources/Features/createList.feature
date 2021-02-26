#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

Feature: Create a New List

Background: Navigate to Application
 Given Open chrome and navigate to url "https://vardenisiffror.se/unitlists"
 
  @CreateList
  Scenario: Creating List
    
    When Create Device list with "MyList" and "Stockholm"
    And Device List Created successfully with the name "MyList"
    Then I close browser

  @DeleteList
  Scenario: Remove List
    
    When Create Device list with "MyList" and "Stockholm"
    And Delete List successfully with the name "MyList"
    Then I close browser

  @RenameList
  Scenario: Rename List
   
    When Create Device list with "MyList" and "Stockholm"
    And Renamed  "MyList" List successfully with the name "RenameList"
    Then I close browser

  @ChangeColor
  Scenario: Changing color List
   
    When Create Device list with "Devicelist" and "Stockholm"
    And "Devicelist" List Change Color successfully with the color "select-color-7"
    Then I close browser

  @Search
  Scenario: Validation when Orgname not found in the search
    
    When Create Device list with "DeviceList1" and Validate "Goteberg" in search
    Then I close browser

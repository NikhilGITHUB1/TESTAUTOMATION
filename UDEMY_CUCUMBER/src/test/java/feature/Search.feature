Feature: Title of your feature
 
 @smoke
  Scenario: Title of your scenario
    Given user is on the greekart landing page
    When user search for Cucumber vegetables
    Then "Cucumber" results are displayed
    
    
  
 @regression
  Scenario Outline: Title of your scenario
    Given user is on the greekart landing page
    When user search for <vegname> vegetables
    And added items to cart
    And user proceeds to checkout page for purchase
    Then verify selected <vegname> items are displayed in checkout page
     Examples: 
      | vegname  | 
      | Brinjal  | 
      | Beetroot | 
     
    
        


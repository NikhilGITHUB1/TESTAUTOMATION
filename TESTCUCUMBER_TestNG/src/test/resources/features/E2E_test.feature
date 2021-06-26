Feature: Title of your feature
  I want to use this template for my feature file
  
  @tag1
  Scenario Outline: Title of your scenario
    Given user is on Home Page
    When he search for "dress"
    And choose to buy the first item 
    And moves to checkout from mini cart
    And enter "<customer>" personal details on checkout page
    #And enter personal details on checkout page
    #And select same delivery address
    #And select payment method as “check” payment
    And place the order
    #Then verify the order details
    Examples:
      | customer  |
      | Lakshay   |
  

  #@tag1
  #Scenario: Title of your scenario
    #Given I am on the Home Page
    #And I search for a movie
    #When I add it to watchlist
    #And I visit the watchlist
    #And I see the movie in the watchlist
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

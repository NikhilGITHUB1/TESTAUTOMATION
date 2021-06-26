Feature: Applications login

  @regression1
  Scenario: HomePage default login
    Given user is on the Netbanking login page
    When user login into application with username "Nikhils" and password "kanojias"
    Then Home page is populated
    And Cards displayed are "true"    
    
    
  @datatablenew
  Scenario: Browser up states
  	Given the browser is opened
  	When values are entered in the browser
  	Then search button is clicked
  	And the datatable is fetched as maps
  	|name|age|sex|
  	|nikhil17|343|M|
  	|kalyani17|292|F|  

  @mobile
  Scenario: HomePage default login
    Given user is on the Netbanking login page
    When user login into application with username "kumari" and password "kanojias"
    Then Home page is populated
    And Cards displayed are "true"

  @mobile
  Scenario: HomePage default login
    Given user is on the Netbanking login page
    When user login into application with username "nisha" and password "kanojias"
    Then Home page is populated
    And Cards displayed are "true"

  @regression1
  Scenario: HomePage default login
    Given user is on the Netbanking login page
    When user login into application with username "nisha" and password "kanojias"
    Then Home page is populated
    And Cards displayed are "true"

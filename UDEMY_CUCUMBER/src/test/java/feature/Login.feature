Feature: Application login

 # Background: 
  #  Given validate the browser
  #  When browser is triggered
  #  Then check if browser is started
  
  
  Scenario: Browser up state
  	Given the browser is opened
  	When values are entered in the browser
  	Then search button is clicked
  	
  	
  @datatablenew @skip
  Scenario: Browser up state
  	Given the browser is opened
  	When values are entered in the browser
  	Then search button is clicked
  	And the datatable is fetched as maps
  	|name|age|sex|
  	|nikhil|34|M|
  	|kalyani|29|F|

  @smoke1
  Scenario: HomePage default login
    Given user is on the Netbanking login page
    When user login into application with username "Nikhil" and password "kanojia"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: HomePage default login
    Given user is on the Netbanking login page
    When user login into application with username "kumari" and password "kalyani"
    Then Home page is populated
    And Cards displayed are "false"

  @datatable
  Scenario: HomePage default login
    Given user is on the Netbanking login page
    When user signs up with following details
      | illu | minati  | 33 | 8884325937 |
      | monu | kanojia | 33 | 8884325937 |
    Then Home page is populated
    And Cards displayed are "false"

  #parameterization
  Scenario Outline: HomePage default login
    Given user is on the Netbanking login page
    When user login into application with user <username> and pass <password>
    When user login into application with user "nik" and pass "kan"
    Then Home page is populated
    And Cards displayed are "false"

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |

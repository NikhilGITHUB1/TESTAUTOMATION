Feature: test data tables

  @smoketest
  Scenario: Successful navigation to the Cart page valid
	Given User is on Home Page
	When User Navigates to the Specific Page via maps
	| Username   | 
  | testuser_1 | 
  | testuser_2 | 
	And User returns to shop
	Then User is on the Home Page

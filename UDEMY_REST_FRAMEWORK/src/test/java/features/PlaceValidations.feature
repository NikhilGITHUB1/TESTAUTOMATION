Feature: Validating Place Apis

  
  Scenario Outline: Verify if place successfully added using AddPlace api
	  Given Add place payload with data "<name>" "<language>" "<address>"
    When user calls "AddPlaceApi" with "POST" http request
    Then the Api call is success with status code 200
    And "status" in the response body is "OK"
    And "scope" in the response body is "APP"
    And verify that placeid created maps to "<name>" in "GetPlaceApi"
    
    Examples:
    | name            | language | address |
    | nikhil          | hindi    | liluah  |
    #| nikhil1         | hindi1   | liluah1 |
    
  @DeletePlace 
  Scenario: Verify Delete Place api
	  Given Delete place payload 
    When user calls "DeletePlaceApi" with "POST" http request
    Then the Api call is success with status code 200
    And "status" in the response body is "OK"
  
    
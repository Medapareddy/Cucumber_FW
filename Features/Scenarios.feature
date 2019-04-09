Feature: Validating the fields/labels in application and handling windows

Scenario: Successful Login to application and verifies the fields in application
	Given User is on Home Page
	When Application logo is displaying
	Then On Page load all the labels and fields are loaded as expected
	
Scenario: Searching for invalid location
	Given Providing input value to the location input field
	Then Searching for the invalid location and verifying
	
Scenario: Searching for valid location details
	Given Providing input value to the location field
	Then Searching for the location provided
	And Verifying for the location searches 

Scenario: Access Customer Support page in new tab(Window Handles)
	Given Look for the support center and performed click
	Then Handles tabs upon successful navigation
	
Scenario: Close the browser on successful validation
	When Close the browser
	Then Message displayed Successfully closed the application
Feature: Debugging feature
	
Scenario: Successfully login
	Given you are on the sign in page
	Then login with the username "{default.username}" and password "{default.password}"
	Then wait 5 seconds
	Then navigate to Network
	Then wait 5 seconds
	Then navigate to Storage
	Then wait 5 seconds
	Then navigate to Compute
	Then wait 5 seconds
 	Then navigate to Useage
	Then wait 5 seconds
	Then navigate to Support Plans
	Then wait 5 seconds
	Then navigate to Access
	Then wait 5 seconds
	Then navigate to Documentation
	Then wait 5 seconds
	Then kill the browser

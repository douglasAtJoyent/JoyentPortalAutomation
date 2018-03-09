Feature: Sign In page


#JNT-1	Normal	UI	Sign In page	Authorization	Sign In page overview	Unregistered user	1. Access 'Sign in' page	"Sign in to Joyent' page should have the following attributes:
#1. Fields: Username and Password;
#2. 'SIGN IN' button;
#3. 'Reset via email' link;
#4. 'Create Account' link."
#JNT-2	Normal	UI	Sign in page	Authorization	Check Sign In	JNT-1	"1. Fill in valid username and password into required fields
#2. Click 'SIGN IN' button"	User should be signed in and redirected to Dashboard page.
#JNT-3	Normal	UI	Sign in page	Authorization	Check Username validation	JNT-1	"1. Submit form with empty Username
#2. Submit form with invalid Username"	"1. Error message 'Username and password are required' should appear
#2. Error message 'The username or password is incorrect' should appear"
#JNT-4	Normal	UI	Sign in page	Authorization	Check Password validation	JNT-1	"1. Submit form with empty Password
#2. Submit form with invalid Password"	"1. Error message 'Username and password are required' should appear
#2. Error message 'The username or password is incorrect' should appear"
#JNT-5	Normal	Functional	Sign in page	Authorization	Sign Up with Marketo form	JNT-1	1. Click 'Create Account' link	1. User should be redirected to Marketo Sign Up Free Trial page


Scenario: Normal UI	Sign In page
	Given you are on the sign in page
	Then verify Username 
	Then verify Password;
	Then verify SIGN IN 
    Then verify Reset via email
    Then verify Create Account

    
Scenario: Filling in Check Username validation
	Given you are on the sign in page
	Then login with the username "" and password "" and the error "Username and password are required" should appear
	Then login with the username "InvalidUserName" and password "fdsfdfdsfds" and the error "The username or password is incorrect or expired" should appear
	Then kill the browser

Scenario: Filling in Check Password validation
	Given you are on the sign in page
	Then login with the username "douglas.anderson" and password "" and the error "Username and password are required" should appear
	Then login with the username "douglas.anderson" and password "NotmyrealPassword" and the error "The username or password is incorrect or expired" should appear
	Then kill the browser
	
Scenario: Successfully login
	Given you are on the sign in page
	Then login with the username "{default.username}" and password "{default.password}"
	Then kill the browser
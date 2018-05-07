Feature: Free CRM Page Test 
Scenario: Validate Home Page 
	Given The Home Page Url 
	When User is on home Page 
	Then User enetres Username and password 
	Then User click on Login button 
	Then Main Page is Displayed
	Then Validadte Main page
Feature: Add New Deal 

Scenario: Home page with Login

	Given The home page Url 
	When User is on CRM page the page title is FreeCRM 
	Then User entered Username and Password 
		|Username|Password |
		|naveenk |test@123 |
		
	Then User Clicks on login button 
	Then Now user in home page the title is CRMPRO 
	Then Moves to New Deal page 
	Then User enters new deal details
	
	|Title 	 |Company 	|Probability % 	| Owner					|Status		|Reports				|
	|GoodDeal|Accenture	|		50		|Naveen K (naveenk)		| Closed	|Exclude from reports	|	
	|BadDeal |Cognizant	|		40		|Naveen K (naveenk)		| Closed     | Exclude from reports  |

	Then Close the browser

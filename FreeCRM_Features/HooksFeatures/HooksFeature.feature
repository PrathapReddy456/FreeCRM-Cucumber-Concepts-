Feature: Test CRM page

@First
Scenario: Add new case 
	Given User is on Case Page 
	When User enters Case details 
	|Title	|State	|Type	 |Contact|
	|NewCase|Closed	|Enquiry|Prathap|
	Then User is created new case
	
@Second
	Scenario: Add new Document
	Given User is on doc page
	When User enters doc details
	|Title	|Version|Tags	 |
	|NewDoc	|Fourth	|45Hook	 |
	
	Then User is created new doc
	
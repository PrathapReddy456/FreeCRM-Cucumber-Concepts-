 Feature: Login Feature
 
#Scenario: Home page with Login

#Given The home page Url
#When User Entered into CRM page the page title is FreeCRM
#Then User entered "naveenk" 
#Then  Entered "test@123"
#Then Click on login button
#Then User entered into home page the title is CRMPRO 
 

Scenario Outline: Home page with Login

Given The home page Url
When User Entered into CRM page the page title is FreeCRM
Then User entered "<Username>"
Then  Entered "<Password>"
Then Click on login button
Then User entered into home page the title is CRMPRO
Then Close the browser

Examples:

		|Username|Password|
		|naveenk |test@123|
		|prathap |prathap@456|
		|tinku   |tinku@456|
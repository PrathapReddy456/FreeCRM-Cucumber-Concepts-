Feature: Add New Contact

Scenario Outline: Home page with Login
 
Given The home page Url
When User entered into CRM page the page title is FreeCRM
Then User entered "<Username>"
Then Entered "<Password>"
Then Click on login button
Then User entered into home page the title is CRMPRO
Then Moves to new contact page
Then User select"<title>" and enter "<First Name>","<Middle Name>","<Last Name>","<Suffix>"
Then Select Receive Email and AllowCalls as No
Then Click on Save
Then Close the browser

Examples:

		|Username|Password|title|First Name|Middle Name|Last Name|Suffix|
		|naveenk |test@123|Mr.  |Prathap   | Raj	   |Kumar	 |sr.	|
		|naveenk |test@123|Sir	|Ardar     |Cotton     |Dora     |Sr.   |
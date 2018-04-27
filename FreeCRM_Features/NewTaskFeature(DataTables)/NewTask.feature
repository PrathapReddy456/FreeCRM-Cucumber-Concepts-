Feature: Add New Contact

Scenario: Home page with Login
 
Given The home page Url
When User is on CRM page the page title is FreeCRM
Then User entered Username and Password
|naveenk |test@123 |

Then User Clicks on login button
Then Now user in home page the title is CRMPRO
Then Moves to new task page
Then User enters title  and select deadline_day, deadline_month,deadline_year,deadline_hour,deadline_minute,status,completion%,Type, case, ownerassinedto.
|QATestingTeam | 28| April| 2018| 22| 30|Complete | 95 | Presentation | Important |Naveen K |
Then Click on Save
#Then Close the browser

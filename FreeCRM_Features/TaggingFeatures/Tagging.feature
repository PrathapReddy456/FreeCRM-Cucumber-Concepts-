Feature: Free CRM different tests

@SmokeTset @RegressionTest
Scenario: Login with correct username and password
Given This is  a valid login

@SmokeTset
Scenario: Login with wrong  username and password
Given This is  a invalid login

@RegressionTest
Scenario: Create new contact
Given This a contact test

@SmokeTest @RegressionTest
Scenario: Create new deal
Given This is a deal test

@RegressionTest
Scenario: Create new task
Given This is a task test

@RegressionTest
Scenario: Create new  case
Given This is a case test


@SmokeTest @RegressionTest @E2ETest
Scenario: Verify left panel links
Given It is a Panel link test

@SmokeTest @E2ETest
Scenario: Search a deal
Given This is search deal test

@SmokeTest @E2ETest
Scenario: Search a deal
Given This is search deal test

@SmokeTest @E2ETest
Scenario: Search a contact
Given This is search contact test

@SmokeTest @E2ETest
Scenario: Search a task
Given This is search task test

@SmokeTest @E2ETest
Scenario: Search a email
Given This is search email test

@SmokeTest @E2ETest
Scenario: Search a company
Given This is search company test

@E2ETest
Scenario: Application Logout
Given this is a logout test
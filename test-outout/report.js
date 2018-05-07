$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RITHWIK/My_Work2/FreeCRM-Cucumber/src/main/java/com/qa/features/FreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Page Test",
  "description": "",
  "id": "free-crm-page-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Home Page",
  "description": "",
  "id": "free-crm-page-test;validate-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "The Home Page Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User is on home Page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enetres Username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Main Page is Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validadte Main page",
  "keyword": "Then "
});
formatter.match({
  "location": "CucwithPStepDef.the_Home_Page_Url()"
});
formatter.result({
  "duration": 1781194758,
  "error_message": "java.lang.NullPointerException\r\n\tat com.qa.utill.TestBase.Intialization(TestBase.java:44)\r\n\tat cuwithPageStepDef.CucwithPStepDef.the_Home_Page_Url(CucwithPStepDef.java:15)\r\n\tat ✽.Given The Home Page Url(C:/Users/RITHWIK/My_Work2/FreeCRM-Cucumber/src/main/java/com/qa/features/FreeCRM.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CucwithPStepDef.user_is_on_home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucwithPStepDef.user_enetres_Username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucwithPStepDef.user_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucwithPStepDef.main_Page_is_Displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucwithPStepDef.validadte_Main_page()"
});
formatter.result({
  "status": "skipped"
});
});
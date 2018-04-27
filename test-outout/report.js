$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RITHWIK/My_Work2/FreeCRM-Cucumber/FreeCRM_Features/NewTaskFeature/NewTask.feature");
formatter.feature({
  "line": 1,
  "name": "Add New Contact",
  "description": "",
  "id": "add-new-contact",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Home page with Login",
  "description": "",
  "id": "add-new-contact;home-page-with-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The home page Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on CRM page the page title is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User entered Username and Password",
  "rows": [
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Now user in home page the title is CRMPRO",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Moves to new task page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enters title  and select deadline_day, deadline_month,deadline_year,deadline_hour,deadline_minute,status,completion%,Type, case, ownerassinedto.",
  "rows": [
    {
      "cells": [
        "QATestingTeam",
        "28",
        "April",
        "2018",
        "22",
        "30",
        "Complete",
        "95",
        "Presentation",
        "Important",
        "Naveen K"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click on Save",
  "keyword": "Then "
});
formatter.match({
  "location": "NewtaskStepDef.the_home_page_Url()"
});
formatter.result({
  "duration": 19242037150,
  "status": "passed"
});
formatter.match({
  "location": "NewtaskStepDef.user_is_on_CRM_page_the_page_title_is_FreeCRM()"
});
formatter.result({
  "duration": 162998990,
  "status": "passed"
});
formatter.match({
  "location": "NewtaskStepDef.user_entered_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 781049430,
  "status": "passed"
});
formatter.match({
  "location": "NewtaskStepDef.user_Clicks_on_login_button()"
});
formatter.result({
  "duration": 2689877638,
  "status": "passed"
});
formatter.match({
  "location": "NewtaskStepDef.now_user_in_home_page_the_title_is_CRMPRO()"
});
formatter.result({
  "duration": 29174744,
  "status": "passed"
});
formatter.match({
  "location": "NewtaskStepDef.moves_to_new_task_page()"
});
formatter.result({
  "duration": 985703283,
  "status": "passed"
});
formatter.match({
  "location": "NewtaskStepDef.user_enters_title_and_select_deadline_day_deadline_month_deadline_year_deadline_hour_deadline_minute_status_completion_Type_case_ownerassinedto(DataTable)"
});
formatter.result({
  "duration": 4942583237,
  "status": "passed"
});
formatter.match({
  "location": "NewtaskStepDef.click_on_Save()"
});
formatter.result({
  "duration": 443626395,
  "status": "passed"
});
});
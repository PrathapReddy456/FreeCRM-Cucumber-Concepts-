$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RITHWIK/My_Work2/FreeCRM-Cucumber/FreeCRM_Features/NewDealFeature(Map Object)/NewDeal.feature");
formatter.feature({
  "line": 1,
  "name": "Add New Deal",
  "description": "",
  "id": "add-new-deal",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Home page with Login",
  "description": "",
  "id": "add-new-deal;home-page-with-login",
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
        "Username",
        "Password"
      ],
      "line": 8
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Now user in home page the title is CRMPRO",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Moves to New Deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User enters new deal details",
  "rows": [
    {
      "cells": [
        "Title",
        "Company",
        "Probability %",
        "Owner",
        "Status",
        "Reports"
      ],
      "line": 16
    },
    {
      "cells": [
        "GoodDeal",
        "Accenture",
        "50",
        "Naveen K (naveenk)",
        "Closed",
        "Exclude from reports"
      ],
      "line": 17
    },
    {
      "cells": [
        "BadDeal",
        "Cognizant",
        "40",
        "Naveen K (naveenk)",
        "Closed",
        "Exclude from reports"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
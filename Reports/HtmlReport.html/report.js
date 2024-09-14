$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureAdac.feature");
formatter.feature({
  "line": 1,
  "name": "To Test The Adactin Hotel Booking Application",
  "description": "",
  "id": "to-test-the-adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Checks The Login Functionality",
  "description": "",
  "id": "to-test-the-adactin-hotel-booking-application;user-checks-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url Of The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Following Credentials In The Respective Field",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 6
    },
    {
      "cells": [
        "Java@123",
        "32675672"
      ],
      "line": 7
    },
    {
      "cells": [
        "Selenium",
        "2676732"
      ],
      "line": 8
    },
    {
      "cells": [
        "Cypress",
        "2765673"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#When user Enter The Username \"\u003cUsername\u003e\"In The Respective Field"
    },
    {
      "line": 12,
      "value": "#And user Enter The Password \"\u003cPassword\u003e\" In The Respective Field"
    }
  ],
  "line": 13,
  "name": "user Clicks The Loginbutton and Its Navigates The Search hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Url_Of_The_Adactin_Application()"
});
formatter.result({
  "duration": 8500399499,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Following_Credentials_In_The_Respective_Field(DataTable)"
});
formatter.result({
  "duration": 267226100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_The_Loginbutton_and_Its_Navigates_The_Search_hotel_Page()"
});
formatter.result({
  "duration": 521388500,
  "status": "passed"
});
});
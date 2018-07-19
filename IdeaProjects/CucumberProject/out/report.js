$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("wiki-login.feature");
formatter.feature({
  "line": 1,
  "name": "Wikipedia Login Page",
  "description": "",
  "id": "wikipedia-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Can not login given wrong credentials",
  "description": "",
  "id": "wikipedia-login-page;can-not-login-given-wrong-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "browser with Wikipedia Login Page open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input \u003clogin\u003e into Login field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user input \u003cpassword\u003e into Password field",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "wikipedia-login-page;can-not-login-given-wrong-credentials;",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 11,
      "id": "wikipedia-login-page;can-not-login-given-wrong-credentials;;1"
    },
    {
      "cells": [
        "bartek",
        "test1234"
      ],
      "line": 12,
      "id": "wikipedia-login-page;can-not-login-given-wrong-credentials;;2"
    },
    {
      "cells": [
        "marcin",
        "haselkomocne123"
      ],
      "line": 13,
      "id": "wikipedia-login-page;can-not-login-given-wrong-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Can not login given wrong credentials",
  "description": "",
  "id": "wikipedia-login-page;can-not-login-given-wrong-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "browser with Wikipedia Login Page open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input bartek into Login field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user input test1234 into Password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Wikipedia Login Page",
      "offset": 13
    }
  ],
  "location": "WikiLogin.browserWithPageOpen(String)"
});
formatter.result({
  "duration": 4050242403,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bartek",
      "offset": 11
    },
    {
      "val": "Login",
      "offset": 23
    }
  ],
  "location": "WikiLogin.userInputLoginIntoLoginField(String,String)"
});
formatter.result({
  "duration": 332042019,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1234",
      "offset": 11
    },
    {
      "val": "Password",
      "offset": 25
    }
  ],
  "location": "WikiLogin.userInputLoginIntoLoginField(String,String)"
});
formatter.result({
  "duration": 213860240,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Can not login given wrong credentials",
  "description": "",
  "id": "wikipedia-login-page;can-not-login-given-wrong-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "browser with Wikipedia Login Page open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input marcin into Login field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user input haselkomocne123 into Password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Wikipedia Login Page",
      "offset": 13
    }
  ],
  "location": "WikiLogin.browserWithPageOpen(String)"
});
formatter.result({
  "duration": 2833392774,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "marcin",
      "offset": 11
    },
    {
      "val": "Login",
      "offset": 23
    }
  ],
  "location": "WikiLogin.userInputLoginIntoLoginField(String,String)"
});
formatter.result({
  "duration": 176924394,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "haselkomocne123",
      "offset": 11
    },
    {
      "val": "Password",
      "offset": 32
    }
  ],
  "location": "WikiLogin.userInputLoginIntoLoginField(String,String)"
});
formatter.result({
  "duration": 272410697,
  "status": "passed"
});
});
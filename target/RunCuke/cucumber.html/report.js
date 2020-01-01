$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/search-outline.feature");
formatter.feature({
  "line": 1,
  "name": "Searching on google using sceanrio outline",
  "description": "",
  "id": "searching-on-google-using-sceanrio-outline",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Direct search on Google firefox",
  "description": "",
  "id": "searching-on-google-using-sceanrio-outline;direct-search-on-google-firefox",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch browser \"\u003cbrowserName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User navigate to \"\u003curl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters search term \"\u003csearch\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on search button",
  "keyword": "And "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "searching-on-google-using-sceanrio-outline;direct-search-on-google-firefox;",
  "rows": [
    {
      "cells": [
        "browserName",
        "url",
        "search"
      ],
      "line": 9,
      "id": "searching-on-google-using-sceanrio-outline;direct-search-on-google-firefox;;1"
    },
    {
      "cells": [
        "chrome",
        "http://google.com",
        "Way2Automation"
      ],
      "line": 10,
      "id": "searching-on-google-using-sceanrio-outline;direct-search-on-google-firefox;;2"
    },
    {
      "cells": [
        "firefox",
        "http://google.com",
        "Way2Automation selenium"
      ],
      "line": 11,
      "id": "searching-on-google-using-sceanrio-outline;direct-search-on-google-firefox;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 46013639,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Direct search on Google firefox",
  "description": "",
  "id": "searching-on-google-using-sceanrio-outline;direct-search-on-google-firefox;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch browser \"chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User navigate to \"http://google.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters search term \"Way2Automation\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 16
    }
  ],
  "location": "GoogleSteps.launch_browser(String)"
});
formatter.result({
  "duration": 3962183455,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://google.com",
      "offset": 18
    }
  ],
  "location": "GoogleSteps.user_navigate_to(String)"
});
formatter.result({
  "duration": 834622762,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Way2Automation",
      "offset": 25
    }
  ],
  "location": "GoogleSteps.user_enters_search_term(String)"
});
formatter.result({
  "duration": 1121794669,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.click_on_search_button()"
});
formatter.result({
  "duration": 1230397468,
  "status": "passed"
});
formatter.after({
  "duration": 1036908023,
  "status": "passed"
});
formatter.before({
  "duration": 258319,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Direct search on Google firefox",
  "description": "",
  "id": "searching-on-google-using-sceanrio-outline;direct-search-on-google-firefox;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Launch browser \"firefox\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User navigate to \"http://google.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters search term \"Way2Automation selenium\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 16
    }
  ],
  "location": "GoogleSteps.launch_browser(String)"
});
formatter.result({
  "duration": 4699156221,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://google.com",
      "offset": 18
    }
  ],
  "location": "GoogleSteps.user_navigate_to(String)"
});
formatter.result({
  "duration": 1543541293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Way2Automation selenium",
      "offset": 25
    }
  ],
  "location": "GoogleSteps.user_enters_search_term(String)"
});
formatter.result({
  "duration": 1105330917,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.click_on_search_button()"
});
formatter.result({
  "duration": 1506314197,
  "status": "passed"
});
formatter.after({
  "duration": 2028461422,
  "status": "passed"
});
});
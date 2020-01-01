Feature: Searching on google using sceanrio outline

Scenario Outline: Direct search on Google firefox
  Given Launch browser "<browserName>"
  When User navigate to "<url>"
  Then User enters search term "<search>"
  And click on search button
  Examples:
  |browserName|url|search|
  |chrome			|http://google.com|Way2Automation|
  |firefox			|http://google.com|Way2Automation selenium|
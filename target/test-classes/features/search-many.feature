Feature: Searching on google

  Scenario: Direct search on Google firefox
    Given Launch browser "firefox"
    When User navigate to "http://google.com"
    Then User enters search term "Way2Automation selenium"
    And click on search button

  Scenario: Direct search on Google chrome
    Given Launch browser "chrome"
    When User navigate to "http://google.com"
    Then User enters search term "Way2Automation"
    And click on search button

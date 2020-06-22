Feature: feature to test Google search

  Scenario: Validate google search is working

    Given browser is open
    And user is on google search page
    When user enter a text to search
    And hits enter
    Then user is navigated to search result page
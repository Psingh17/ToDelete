

Feature:

  Scenario: Verify the user login
    Given user is on login page
    When user enters username and password
    And clicks non login button
    Then user should be navigated to homepage
Feature: it is required to enter the swaglabs page to make

  Scenario: Login in the pages
    Given Luis open pages
    When I enter the main screen of the page
      | username      | password     |
      | standard_user | secret_sauce |
    Then I successfully entered the page
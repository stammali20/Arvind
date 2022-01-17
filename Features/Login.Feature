Feature: Login

  Scenario: Login test with valid credentials.
    Given user launched browser.
    Then opned the application url.
    And user enter the user name and password.
    Then click on log.
    And verify the login successful.

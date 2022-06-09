Feature: Web Login
  @smoke
  Scenario: user should be able to login with credentials
    Given user is on login page
    When user enters valid credentials
    And hit submit
    Then User is able to login successfully

  @functional
  Scenario: user should not be able to login with invalid credentials
    Given user is on login page
    When user enters invalid credentials
    And hit submit
    Then error message is shown on display


#    mvn clean test -D"cucumber.filter.tags=@smoke"
@login @android
Feature: Login

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    Given User is on login page
    When User input username "admin"
    When User input password "admin"
    When User tap button login
    Then User successfully login

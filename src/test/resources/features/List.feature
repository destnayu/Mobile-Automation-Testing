@list @android
Feature: List Menu

  Background:
    Given User is on login page
    When User input username "admin"
    When User input password "admin"
    When User tap button login
    Then User successfully login

  @test @positive

  Scenario: User successfully scroll menu list
    Given User is already login
    When User go to list menu
    And User do scroll list menu

  @LongPress @positive
  Scenario: Long press the mobile object
    Given User is already login
    When User go to list menu
    Then User doing long press in the list

  @TapMultiple @positive
  Scenario: Tap multiple times the mobile object
    Given User is already login
    When User go to list menu
    Then User doing tap multiple times in the list

  @ScrollToText @positive
  Scenario: Scroll to text the mobile object
    Given User is already login
    When User go to list menu
    Then User doing scroll to text in the list
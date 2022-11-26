@calculator @android
Feature: List Menu

  Background:
    Given User is on login page
    When User input username "admin"
    When User input password "admin"
    When User tap button login
    Then User successfully login

  @test @positive
  Scenario: Summation of numbers
    Given User input Angka1 is 12
    And User input Angka2 is 2
    When User tap dropdown button
    Then User select operator button +
    Then User tap equal button
    And Label Hasil should be 14

  @positive
  Scenario: Reduction of numbers
    Given User input Angka1 is 12
    And User input Angka2 is 2
    When User tap dropdown button
    Then User select operator button -
    Then User reduction numbers tap equal button
    And Label Hasil should be 10

  @positive
  Scenario: Div of numbers
    Given User input Angka1 is 12
    And User input Angka2 is 2
    When User tap dropdown button
    Then User select operator button div
    Then User div numbers tap equal button
    And Label Hasil should be 6

  @positive
  Scenario: Multiplication of numbers
    Given User input Angka1 is 12
    And User input Angka2 is 2
    When User tap dropdown button
    Then User select operator button *
    Then User multi numbers tap equal button
    And Label Hasil should be 24
Feature: User Login

  Background:
    Given the user is on the login page

  Scenario: Successful login
    When the user enters a valid username "user1"
    Then the user is redirected to the homepage
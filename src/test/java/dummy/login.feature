Feature: Login

  Scenario: Successful Login
    Given i Enterthe Username
    And i Enter the password
    When i click on Login button
    Then Home page is displayed

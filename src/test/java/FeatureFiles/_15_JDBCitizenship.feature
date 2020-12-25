Feature: Check Control db with JDBC

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Citizenship page

    Scenario:
      And  Check control ui and db list on citizenship page with "select * from Citizenship" query
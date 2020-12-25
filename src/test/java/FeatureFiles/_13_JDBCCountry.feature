Feature: Testing JDBC Country

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Country testing with JDBC

    Then Send The query the database "select * from country order by id desc" and control match
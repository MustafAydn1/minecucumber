Feature: Testing JDBC Cities

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully


    Scenario: Cities testing with JDBC

      And Navigate to cities page
        | setupOne   |
        | parameters |
        | cities     |

      And Send The Query the database "select * from cities;" and control match
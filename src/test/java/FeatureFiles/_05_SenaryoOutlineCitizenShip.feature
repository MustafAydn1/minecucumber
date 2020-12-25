Feature: Citizenship with senaryooutline

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Citizenship page

  @SmokeTest
  Scenario Outline: Citizenship create and delete with senaryo outline

    When User Create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    Then Success message should be displayed

    When User Create a Citizenship name as "<CitizenshipName>" short name as "<CitizenshipShortName>"
    Then Error message should be displayed
    And Click on close button

    Then User delete the "<CitizenshipName>"
    Then Success message should be displayed


    Examples:
      | CitizenshipName | CitizenshipShortName |
      | AhmetUlkesi88xva | ahmtU1829            |
      | AyseUlkesi188xva | AyseU1829            |
      | KayaUlkesi188xva | Kayau1829            |


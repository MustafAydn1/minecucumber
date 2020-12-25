Feature: Country Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page

  @SmokeTest @RegressionTest
  Scenario: Create a country

    When Create a country name as "Anadoluz" and code as "Anadolua2a01az1a"
    Then Success message should be displayed
#Bu kısmı 02_CountrySteps in aynı isimli When metodundan oluşturacak.
#Yenıden kodu yazmaya gerek yok.


  Scenario: Edit a country

    When User edit the "Anadoluz" to "Anadolu2z"
    Then Success message should be displayed

#edit ve delete yi ilk kez burada tanımladık._03_Country de
#iki ayrı When için edit ve delete nın kodları yazıldı.


  Scenario: Delete a country

    When User delete the "Anadolu2z"
    Then Success message should be displayed

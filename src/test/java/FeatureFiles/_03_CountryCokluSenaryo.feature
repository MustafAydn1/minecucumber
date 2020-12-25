Feature: Country Multi Scenario

  #Senaryolarda aynı olan ilk kısımlar Background olarak yazılabilir
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create a country

    When Create a country
    Then Success message should be displayed


  Scenario: Create a country parameter data

    When Create a country name as "temurUlkeacq2" and code as "codeacq2"
    Then Success message should be displayed


#Son scenarıo da feature ye yazılan name as "" ifadesindekini
#otomatık olarak yazdır yaptık.Bunun için Steps e yeni kod ekledik.
#Burada string "" ifade gorsun yeter. ne yazdıgı onemsiz.

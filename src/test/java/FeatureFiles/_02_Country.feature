Feature: Country functionality

  Scenario: Create Country
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
#Buraya kadar olan kod LoginSteps den otomatık olarak gelecek
#Country oluşturacagımız kısmını extradan yazacagız
#Login ile country kadar zaten gelmiştik
#Devamı ayrı işlemler gerektiriyor.


    And Navigate to country page
    When Create a country
    Then Success message should be displayed



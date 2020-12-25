Feature: New Exams Functionalty



  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Enterance Exams
    And Click on the element in the left class
    |entranceExams|
    |examSetup|
    |entranceExams2|

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the dialog content classs
    |examName|Mustafaaydin7|



    And Click on the element in the content classs
      | academicPeriod |
      | option1        |
      | gradeLevel     |
      | option1        |
      | documentType   |
      | option1        |
      | addExams       |
      | saveExams      |

    Then Success message should be displayed

    And Click on the element in the left class
      |entranceExams|
      |examSetup|
      |entranceExams2|

    And User delete the "Mustafaaydin7"

# burada "<Mustafaaydin5>" yazarsan OLMAZ.çunku bu senaryoOutline kodu
#Oysa ki aynı işlevde ve aynı kod loguna uzantılı çalısıyor

#BU YUZDEN:: Adımların kelime/harf aynı olduklarına ve
# hangi yöntemle yapıldıklarına dikat et

    Then Success message should be displayed


#Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName    | AcademicPeriodOption | GradeLevelOption | documentTypeOption |
#| Math exam   | Option2              | Option4          | Option4            |
#| IT exam     | Option1              | Option1          | Option1            |
#| Oracle exam | Option2              | Option2          | Option2            |
#| Math exam   | Option1              | Option3          | Option3            |

Feature: Outline Exams Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
@RegressionTest
    Scenario Outline: Enterance Exams

      And Click on the element in the left class
        |entranceExams|
        |examSetup|
        |entranceExams2|
      And Click on the element in the content class
        | addButton |

      When User sending the keys in the dialog content classs
        |examName|<ExamName>|

      And Click on the element in the content classs
        | academicPeriod         |
        | <AcademicPeriodOption> |
        | gradeLevel             |
        | <GradeLevelOption>     |
        | documentType           |
        | <documentTypeOption>   |
        | addExams               |
        | saveExams              |

      Then Success message should be displayed

      And Click on the element in the left class
        |entranceExams|
        |examSetup|
        |entranceExams2|

      And User delete the "<ExamName>"

      Then Success message should be displayed
      Examples:
     | ExamName    | AcademicPeriodOption | GradeLevelOption | documentTypeOption |
     | Math exam   | option2              | option4          | option4            |
     | IT exam     | option1              | option1          | option1            |
     | Oracle exam | option2              | option2          | option2            |
     | Math exam   | option1              | option3          | option3            |
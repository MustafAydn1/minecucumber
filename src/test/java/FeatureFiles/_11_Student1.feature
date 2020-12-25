Feature: Students Functionality


  Scenario: Create Student

    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

    And Click on the element in the left class
      | student  |
      | students |

    And Click on the element in the content class
      | addButton |

    When User sending the keys in the dialog content classs
    |firstname|Mustafa|
    |lastname|Aydin|

    And Click on the element in the content classs

      | gender          |
      | male            |
      | stdntGradeLevel |
      | whiteN          |
      | schlDepartmn    |
      | schlDprtmn1     |
      | section         |
      | section1        |
      | citizenship     |
      | citizenship1    |
      | sDocumentType    |
      | personalID    |

    When User sending the keys in the dialog content classs
      |documentNumber|12340|

    And Click on the element in the content classs
      | representatives |
      | btnAdd          |
    #  | representive    |
    #  | repSelect1         |

    When User sending the keys in the dialog content classs
      | repfirstname | MEHMET     |
      | replastname  | AYDIN      |
      | repPhone     | 5304567890 |

    And Click on the element in the content classs
      | repCountry |
      | option1    |
      | repAdd     |
      | saveButton    |



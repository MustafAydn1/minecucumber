Feature: DataTable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create Country
    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | country    |

    And Click on the element in the content class
      | addButton |


    When User sending the keys in the dialog content class
      | nameInput | ismetCountryzq1ziio |
      | codeInput | 123q1ziio           |

    And Click on the element in the content class
      | saveButton |


    And Click on the element in the content class
      | addButton |
    When User sending the keys in the dialog content class
      | nameInput | aliiiiiiiiixo       |
      | codeInput | 123q1ziiio          |

    And Click on the element in the content class
      | saveButton |

  #    | nameInput | veliiiiiix         |
   #   | codeInput | 123q1ziiii         |
    #  | nameInput | Deliiiiiix         |
     # | codeInput | 1123q1ziiii        |

# neden sadece sonuncuyu gösteriyor. ???
# bırden cok ardarda nasıl oluştururuz


    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed


     Scenario:  Create a Nationalities

       And Click on the element in the left class
         | setupOne   |
         | parameters |
         | nationality    |

       And Click on the element in the content class
         | addButton |

       When User sending the keys in the dialog content class
         | nameInput | mustafa111 |

       And Click on the element in the content class
         | saveButton |


       And Click on the element in the content class
         | addButton |
       When User sending the keys in the dialog content class
         | nameInput | ali1 |
       And Click on the element in the content class
         | saveButton |


       And Click on the element in the content class
         | addButton |
       When User sending the keys in the dialog content class
         | nameInput | veli1 |
       And Click on the element in the content class
         | saveButton |


       And Click on the element in the content class
         | addButton |
       When User sending the keys in the dialog content class
         | nameInput | halukby11 |

       And Click on the element in the content class
         | saveButton |


       Then Success message should be displayed


  Scenario:  Create a fees

    And Click on the element in the left class
      | setupOne   |
      | parameters |
      | fees    |

    And Click on the element in the content class
      | addButton |


    When User sending the keys in the dialog content class
      | nameInput       | mustafaxw |
      | codeInput       | 12159     |
      | integrationCode | 1217    |
      | priorityCode    | 103       |

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed


# önemli olan buradaki sıralamam, stepsdekisıralamanın önemi yok
#her class için de farklı senaryo yazalım ki oradan alsın

#    Senaryo Outline da verilen değerler için tüm senaryo her satır kadar tekrar çalıştırılıyordu.
#    DataTable da ise, sadece ilgili step için toplu veri gönderme imkanı oluşuyor.

#DataTable çoklu veri girişinde yazarken zorluk ama calışırken
#Kolaylık saglar ve calışırken zamandan kazanırsın
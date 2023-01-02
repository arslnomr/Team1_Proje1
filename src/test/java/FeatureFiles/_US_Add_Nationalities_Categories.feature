Feature: Nationalities Position Categories

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

    Scenario Outline: Add Nationalities Categories

      And Click on the element in left nav
        |setUp    |
        | parameters  |
        |nationalities |

      And Click on the element in the Dialog
    |addButton|

      And User sending the keys in Dialog content
        |nameInput|<name>|
      And Click on the element in the Dialog
        |saveButton|
Then Success message should be displayed
      Examples:
        | name|
        |  Turkmeni |
        |  Georgian1 |

  Scenario Outline: Edit Nationalities

  And Click on the element in left nav
    |setUp    |
    | parameters  |
    |nationalities |

  And User sending the keys in Dialog content
    |searchInput|<srcName>|
  And Click on the element in the Dialog
    |searchButton|
  And Click on the element in the Dialog
    |editButton|
  And User sending the keys in Dialog content
    |nameInput|<name>|
    |shortInput|<shortName>|
  And Click on the element in the Dialog
    |saveButton|
  Then Success message should be displayed
  Examples:
    |  srcName |name|shortName|
  | Azerbaijani|  Azerbaijani |Georgian|
  |    Qazaxi|  Qazaxi| Ozbeki         |

    Scenario Outline: Delete Nationalities

      And Click on the element in left nav
        |setUp    |
        | parameters  |
        |nationalities |

      And User sending the keys in Dialog content
        |searchInput|<srcName>|
      And Click on the element in the Dialog
        |searchButton|
      And Click on the element in the Dialog
        |deleteButton|
      And Click on the element in the Dialog
        |deleteDialogBtn|
      Examples:
        | srcName |
      | Azerbaijani|
Feature:Parameters grade levels Functionalty
  #feature ın karşısına yazı yazmadığımızda parallel test veya extent rapor olmuyor

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario Outline:Add Grade level to set up details of parameters

    And Click on the element in left nav
      | setupOne    |
      | parameters  |
      | gradeLevels |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput  | <name>       |
      | shortName  | <shortName>  |
      | orderInput | <orderInput> |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed
    Examples:
      | name | shortName | orderInput |
      | al   | ver       | 3          |
      | ka   | zim       | 4          |


  Scenario Outline:Edit Grade level to set up details of parameters

    And Click on the element in left nav
      | setupOne    |
      | parameters  |
      | gradeLevels |
    And gedit user admin as "<searchName>" in grade levels

    And User sending the keys in Dialog content
      | nameInput  | <name>       |
      | shortName  | <shortName>  |
      | orderInput | <orderInput> |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed
    Examples:
      | searchName | name | shortName | orderInput |
      | al         | ma   | pe       | 11          |
      | ka         | hir  | in        | 12          |


  Scenario Outline:Delete Grade level to set up details of parameters

    And Click on the element in left nav
      | setupOne    |
      | parameters  |
      | gradeLevels |
    And delete user admin as "<searchName>" in grade levels

    Then Success message should be displayed
    Examples:
      | searchName |
      | ma          |
      | hir         |




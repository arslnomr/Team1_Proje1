Feature:HumanResources  Positions Functionalty
  #feature ın karşısına yazı yazmadığımızda parallel test veya extent rapor olmuyor

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario Outline:Add Position to set up details of human resources

    And Click on the element in left nav
      | humanResrc    |
      | positionSetup |
      | positions     |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | <name>      |
      | shortName | <shortName> |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | <name>      |
      | shortName | <shortName> |
    And Click on the element in the Dialog
      | saveButton |
    Then Already exist message should be displayed
    Examples:
      | name | shortName |
      | ayse | cik       |
      | akin | ipek      |


  Scenario Outline:Edit position to set human resources details

    And Click on the element in left nav
      | humanResrc    |
      | positionSetup |
      | positions     |
    And User sending the keys in Dialog content
      | searchInput | <srcName> |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | <name>      |
      | shortName | <shortName> |
    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed
    Examples:
      | srcName | name   | shortName |
      | akin    | melike | pek       |
      | ayse    | akkiz  | ip        |


  Scenario Outline:Delete position to set human resources details

    And Click on the element in left nav
      | humanResrc    |
      | positionSetup |
      | positions     |
    And User delete item from Dialog
      | <name> |
    Then Success message should be displayed
    Examples:
      | name   |
      | melike |
      | akkiz  |
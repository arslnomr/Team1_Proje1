Feature:HumanResources  Attestation Functionalty
  #feature ın karşısına yazı yazmadığımızda parallel test veya extent rapor olmuyor

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario :Add Attestation to set up details of human resources

    And Click on the element in left nav
| humanResrc    |
| positionSetup |
| AttestationBtn |
And Click on the element in the Dialog
| addButton |
And User sending the keys in Dialog content
| nameInput | mahmut  |

And Click on the element in the Dialog
| saveButton |
Then Success message should be displayed


  Scenario :Edit position to set human resources details

    And Click on the element in left nav
      | humanResrc    |
      | positionSetup |
      | AttestationBtn     |
    And User sending the keys in Dialog content
      | searchInput | mahmut |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | nameInput | mehmet |

    And Click on the element in the Dialog
      | saveButton |
    Then Success message should be displayed



  Scenario :Delete position to set human resources details

    And Click on the element in left nav
      | humanResrc    |
      | positionSetup |
      | AttestationBtn     |
    And User delete item from Dialog
      | mehmet |
    Then Success message should be displayed

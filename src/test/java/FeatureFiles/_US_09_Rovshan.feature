Feature: Bank Account
  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario: Add Bank Account Categories

    And Click on the element in left nav
      |setUpB    |
      | parameters  |
      |bankAccount |
    And Click on the element in the Dialog
      |addButton|
    And User sending the keys in Dialog content
      |nameInput|Rovshan |
      | iban    |AZ123548|
      |IntegrationCode|116660009|
    And Click on the element in the Dialog
      |currency|
      |currency2|
    And Click on the element in the Dialog
      |saveButton|
    Then Success message should be displayed

  Scenario Outline: Edit Bank account
    And Click on the element in left nav
      |setUpB  |
      | parameters |
      |bankAccount |
    And Click on the element in the Dialog
      |editButton|
    And User sending the keys in Dialog content
      |nameInput|<name>|
      |iban|<shortName>|
      |IntegrationCode|<code> |

    And Click on the element in the Dialog
      |saveButton|
    Then Success message should be displayed
    Examples:
      |name|shortName|code    |
      |Nazim|USD145699|899667ad|


  Scenario: Delete Bank account
    And Click on the element in left nav
      |setUpB        |
      | parameters  |
      |bankAccount |
    And Click on the element in the Dialog
      |deleteButton|
    And Click on the element in the Dialog
      |deleteDialogBtn|
    Then Success message should be displayed
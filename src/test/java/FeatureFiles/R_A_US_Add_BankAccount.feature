Feature: Bank Account

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario: Add Bank Account Categories

    And Click on the element in left nav
      |setUp    |
      | parameters  |
      |bankAccounts |
    And Click on the element in the Dialog
      |addButton|
    And User sending the keys in Dialog content
      |nameInput|Rovshen |
      | iban    |AZ12354|
      |IntegrationCode|116660005 |
    And Click on the element in the Dialog
      |currency|
      |currency2|
    And Click on the element in the Dialog
      |saveButton|
    Then Success message should be displayed

  Scenario Outline: Edit Bank account

    And Click on the element in left nav
      |setUp        |
      | parameters  |
      |bank accounts |
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
      |Naim|USD145678|899667bb|


  Scenario: Delete Bank account
    And Click on the element in left nav
      |setUp        |
      | parameters  |
      |bank accounts |
    And Click on the element in the Dialog
      |deleteButton|
    And Click on the element in the Dialog
      |deleteDialogBtn|
    Then Success message should be displayed

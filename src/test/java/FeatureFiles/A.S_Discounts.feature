Feature:Parameters Discounts Functionalty

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

  Scenario Outline:Add discount to set up details of parameters

    And Click on the element in left nav
      | setupOne   |
      | parameters |
      | discounts  |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | description | <description> |
      | code        | <code>        |
      | priority    | <priority>    |
    And Click on the element in the Dialog
      | toggleBar  |
      | saveButton |
    Then Success message should be displayed
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | description | <description> |
      | code        | <code>        |
      | priority    | <priority>    |
    And Click on the element in the Dialog
      | toggleBar  |
      | saveButton |
    Then Already exist message should be displayed
    Examples:
      | description | code | priority |
      | al          | 123  | 5        |
      | ver         | 345  | 6        |


  Scenario Outline:Edit discount to set up details of parameters

    And Click on the element in left nav
      | setupOne   |
      | parameters |
      | discounts  |
    And User sending the keys in Dialog content
      | searchDescription | <srcDescription> |
    And Click on the element in the Dialog
      | searchButton |
    And Click on the element in the Dialog
      | editButton |
    And User sending the keys in Dialog content
      | description | <description> |
      | code        | <code>        |
      | priority    | <priority>    |
    And Click on the element in the Dialog
      | toggleBar  |
      | saveButton |
    Then Success message should be displayed
    Examples:
      | srcDescription | description | code | priority |
      | al             | ka          | 345  | 9        |
      | ver            | zim         | 567  | 8        |

  Scenario Outline:Delete discount to set up details of parameters

    And Click on the element in left nav
      | setupOne   |
      | parameters |
      | discounts  |
    And User delete description item  from Dialog
      | <description> |
    Then Success message should be displayed
    Examples:
      | description |
      | ka          |
      | zim         |
Feature:School  Departments Functionality


  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully
    And Navigate to Departments page


  Scenario: Create Departments
    When create  a departments
    Then Success message should be displayed


  Scenario: Delete school Departments
    When delete a school departments
    Then Success message should be displayed




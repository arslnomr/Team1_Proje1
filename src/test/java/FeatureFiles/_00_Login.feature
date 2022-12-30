Feature: Login feature

  Scenario:  Login with valid username and password

    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully

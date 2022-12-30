Feature: ApachePOI Education Subject Category Functionalty

  Background:
    Given Navigate to Mersys
    When Admin entered valid username and valid password and clicked Login Button
    Then Admin user should login successfully
    And Navigate to Subject Categories page

  Scenario: Create Subject Categories from excel
    And Admin User add different topic subject categories with ApachePOI
    And Admin User add same subject categories as ApachePOI


  Scenario: Edit Subject Categories from excel
    When Admin User edit subject categories with ApachePOI

  Scenario: Delete citizenship from excel
    When Admin User delete subject categories with ApachePOI
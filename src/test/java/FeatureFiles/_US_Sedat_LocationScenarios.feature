
Feature: Locations multi Functionality

Background:
  Given Navigate to Mersys
  When Admin entered valid username and valid password and clicked Login Button
  Then Admin user should login successfully
  And  Navigate to Location page

     Scenario:Create Location
     When create  a locations
     Then Success message should be displayed

    Scenario: Delete school locations
      When delete a school location
      Then Success message should be displayed

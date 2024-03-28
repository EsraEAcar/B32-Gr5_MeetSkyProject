@file
Feature: Files Module Functionality
  Agile Story:As a user, I should be able to upload a file, move or delete any selected file under the Files module

  Background: User logins and navigates to Files module
    Given the user is on the login page
    And the user logged in with username as "Employee135" and password as "Employee123"
    And the user navigates to "Files" module


  Scenario: User can upload a file
    Given User is on the Files page
    When User clicks Add icon
    Then User clicks upload file icon
    Then User uploads the file.
    Then User should see  uploaded file on the page.


  Scenario: User can create a new folder
    Given User is on the Files page
    When User clicks Add icon
    Then User clicks New Folder icon
    And User  writes "Wooden Spoon" on the window and enters
    Then User should see "Wooden Spoon" on the page.


  Scenario: User can delete any selected item from its three dots menu
    Given User is on the Files page
    When User clicks on first uploaded file's selectCheckBox
    Then User navigates to three dots menu and clicks on it
    Then User selects the delete option and clicks

  Scenario: User can see the total number of files and folders under the files list table
    Given User is on the Files page
    Then User sees the total number of files and folders under the files list table



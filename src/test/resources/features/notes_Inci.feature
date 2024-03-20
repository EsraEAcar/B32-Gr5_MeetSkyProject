@notes
Feature: Notes Module Functionality
  Agile Story: As a user, I should be able to create/delete any note and see the details of the note.


  #===============================Background==================================


  Background: User logins and navigates to Notes module
    Given the user is on the login page
    And the user logged in with username as "Employee125" and password as "Employee123"
    When the user clicks on the "Notes" module



 #===============================AC01=======================================
   Scenario: User can create a new note
     And the user clicks to "New note" button
     And the user types text in the page
     #Then note title should be same with first words of text


    #===============================AC02=======================================

  Scenario:User can add any note to the favorites

    #And the user navigates to threeDots button
    And the user click on the threeDots
    And the user click to "Add to favorites" tab

 #===============================AC02=======================================

  Scenario: User can see the number of letters and words that the note includes under the note title
  when clicked on the details of the note


    And the user clicks to "Files" module
    And the user clicks on the "Favorites" tab
    And the user should be able to see the note title
    Then the user clicks on the notes module
    And the user clicks the threeDots2 button
    And the user clicks the "Datails" tab
    Then the user should be able to see the text details

    #===============================AC02=======================================

  Scenario: User can delete any note

    And the user click on the threeDots
    Then the user clicks on the "Delete note" button




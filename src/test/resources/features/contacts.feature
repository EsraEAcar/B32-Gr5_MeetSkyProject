    @contacts
    Feature: Contacts Module Functionality

    Background: User is already logged in
      Given : User is already logged in with username as "Employee75" and password as "Employee123" and navigates to Contacts Page




    Scenario: user can creat new Contact
        When user click on creat contact
        And user enter the "Abeero" of the new contact
        And user enter name "Abeero" in the seacrh input
        Then The "Abeero" name should be created and displayed in the contact list


    Scenario: User can see all the contacts as a list inside the middle column and total number of the contacts near the “Not grouped” tab
          When user click on All contacts tab
          Then the user should see the same number in the side of Not grouped tab



    Scenario:User can delete Contact name he want
       When user search for the "Abeer "
       And select "Abeer" from the list
       And user click on delete from the menu
       Then "Select a contact on the list to begin" will appear after the contact deleted from the conatct list


Scenario: User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
  When user click on img button
  And user click Choose from Files button
  And select file from file folder and click Choose button
  Then user picture changed
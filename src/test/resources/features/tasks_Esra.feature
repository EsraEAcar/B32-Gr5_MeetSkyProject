@tasks
Feature: Tasks Module Functionality
  Agile Story: As a user, I should be able to create a new task list or a single task and add any task to completed and important tasks list.

#===============================Background==================================

  Background: User logins and navigates to Tasks module
    Given the user is on the login page
    When the user logged in with username as "Employee15" and password as "Employee123"
    And the user navigates to "Tasks" module


#===============================AC01=======================================

  Scenario: AC01==> User can create a new list
    Given user clicks on Add List Link
    When user enters a new list name
    And user clicks on save icon
    Then user sees the created new list in the all lists list

#===============================AC02=======================================


  Scenario: AC02==> User can create a new task
    Given user clicks on new created list name School
    When user clicks to Add a task to School Link
    And user enters a new task name and pushes enter
    Then user sees the created new task below



#===============================AC03=======================================


  Scenario: AC03==> User can add any task to the list of completed tasks
    Given user clicks on School list
    When user clicks on the checkbox next to task name Homeworks
    Then user sees on the left side Completed list
    And the counter next to it is showing the number



#===============================AC04=======================================

@wip
  Scenario: AC04==> User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
    When user chooses any task and clicks on the star icon next to it
    Then user sees that on the left side the new Important list appears
    And the counter next is showing the number



#===============================AC05=======================================


  Scenario: AC05==> User can see the number of all uncompleted tasks next to the Current tab







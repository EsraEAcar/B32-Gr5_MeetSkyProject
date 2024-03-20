@tasks
Feature: Tasks Module Functionality
  Agile Story: As a user, I should be able to create a new task list or a single task and add any task to completed and importants tasks list.


  Background: User logins and navigates to Tasks module
    Given the user is on the login page
    And the user logged in with username as "Employee15" and password as "Employee123"
    Then the user navigates to "Tasks" module


  @wip
  Scenario: User can create a new list of tasks
    Then click to Add List link
    And enter a New List name and push enter

  @wip
  Scenario: User can create a new task
    Then click to Add a task input box
    And enter a new task and push enter





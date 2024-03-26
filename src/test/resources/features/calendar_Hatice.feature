
@calendar
Feature: Calendar Module Functionality
  As a user,
  I want to be able to view the calendar in daily, weekly, and monthly formats,
  So that I can manage my events effectively.


  Background: User logins and navigates to Tasks module
    Given the user is on the login page
    And the user logged in with username as "Employee95" and password as "Employee123"



  Scenario: User can display daily calendar view
    Given User is on the Calendar page
    When User is on the Button
    When User selects the daily view
    Then User sees the events scheduled for the selected day



  Scenario: User can display daily calendar view
    Given User is on the Calendar page
    When User is on the Button
    When User selects the weekly view
    Then User sees the events scheduled for the selected week


  Scenario: View Monthly Calendar
    Given User is on the Calendar page
    When User is on the Button
    When User selects the monthly view
    Then User sees the events scheduled for the selected month

  Scenario: Create New Event
    Given User is on the Calendar page
    When User clicks New Event button
    When User clicks "Event Title" area
    When User select default "from" time beginning of the time
    When User select default "to" time ending of the event
    When User clicks the "Save" button
    Then User sees the saved event on the monthly calendar view


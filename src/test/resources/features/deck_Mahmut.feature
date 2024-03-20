@deck
Feature:US003- Deck Module functionality
  Agile Story: As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.


#===============================Background==================================

  Background: User logins and navigates to Deck module
    Given the user is on the login page
    When the user logged in with username as "Employee145" and password as "Employee123"
    When the user navigates to "Deck" module
    Then user clicks navigation button


#===============================AC01=======================================

  Scenario: AC01==> User can create a new board
    Given user clicks add board icon
    When user enters board name as SDET
    And user clicks confirm icon
    Then user sees the created new board in the all boards list


#===============================AC02=======================================

  Scenario: AC02==> User can create a new list of card/task under any board
    Given user selects and clicks SDET board
    When user clicks add list icon
    And user enters list name as Java
    And user clicks add list confirm icon
    Then user sees the created new list under the selected board


#===============================AC03=======================================

  Scenario:  AC03==> User can add a new card/task on any list on the current board
    Given user selects and clicks SDET board
    When  user clicks add card icon
    And user enters card name as String
    And user clicks add card confirm icon
    Then user sees the created new card


#===============================AC04=======================================

  Scenario: AC04==> User can assign any card/task to himself/herself by using the three dots on the related card
    Given user selects and clicks SDET board
    When user clicks three-dots icon of the card
    And user clicks assign to me selection
    Then user sees the user profile near the three-dots icon


 #===============================AC05=======================================

  Scenario: AC05==> User can edit/rename a board
    Given user clicks three-dots icon near School board
    When user selects edit board
    And user deletes the old name
    And user enters a new name as Work and click confirm icon
    Then user sees the  board name as Work instead of School

    #===============================AC06=======================================

  Scenario: AC06==> User can delete a board and undo the delete action
    Given user clicks three-dots icon near Personal board
    When user clicks delete board option
    And user clicks delete on the warning message
    And  user clicks undo button immediately
    Then user can see previously deleted board again




Feature: Send a direct message
  User story: As a user I need to login, and be able to send a direct message to another users
  @twil
  Scenario: Login as an Inventory manager
    Given user is on a discuss page of the application
    When user navigate to direct message field
    And user select another user
    And user send message
    Then message is displayed
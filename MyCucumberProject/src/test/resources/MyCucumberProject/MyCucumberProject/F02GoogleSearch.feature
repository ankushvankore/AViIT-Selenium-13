Feature: Validate Google Search

  Scenario: To validate search functionality on Google
    Given Launch Google
    When Enter keyword to search
    And Hit enter key
    Then Valid search should display

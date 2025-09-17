Feature: Google Title

  Scenario: To validate Google title
    Given Open Google
    When Read the title
    Then Title should be Google

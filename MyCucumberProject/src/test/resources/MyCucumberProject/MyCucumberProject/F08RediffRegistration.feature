Feature: Rediff Registration

  Scenario Outline: To validate registration process of Rediff
    Given Launch rediff registration page
    When I Enter fullName "<FullName>"
    When I enter rediffid "<RediffId>"
    When I enter "<Password>" and confirmPassword
    And Click on Check Availablity button
    Then Message should display

    Examples: 
      | FullName       | RediffId      | Password   |
      | Kajal Barne    | kajalbarne    | kajal@123  |
      | Ankush Vankore | ankushvankore | Ankush@123 |

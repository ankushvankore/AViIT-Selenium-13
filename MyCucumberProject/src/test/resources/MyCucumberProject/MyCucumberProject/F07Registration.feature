Feature: Registration Process

  Scenario: Validate Registration Process
    Given Launch the page
    When I Enter the data as follows
      | Kajal  | Barne   | kajal@gmail.com  | 9898989898 | Pune     |
      | Ankush | Vankore | ankush@gmail.com | 9890742718 | Kolhapur |
    Then registration should successful

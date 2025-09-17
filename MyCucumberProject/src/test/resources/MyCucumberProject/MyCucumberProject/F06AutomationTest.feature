Feature: Selenium - Automation Practice Form

  Scenario: Validate practice from with valid data
    When Enter valid name as "Ankush Vankore"
    When Enter valid Emailid as "ankushvankore@gmail.com"
    Then Test ok

  Scenario: Validate practice form with invalid data
    When Enter invalid name as "Kajal Barne"
    When Enter invalid Emailid as "kajalbarne@gmail.com"
    Then Test fail

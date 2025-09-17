Feature: Test Tricents Application

  Background: 
    Given Open Tricentis Application

  Scenario: Validate Automobile Test
    When Click on Automobile Link
    When Select Make as "Audi"
    When Enter Engine Performance as "1000"
    When Enter Date of Manufacture as "09/08/2025"
    Then Process should complete

  Scenario: Validate Truck Test
    When Click on Truck Link
    When Select No of Seats as "2"
    When Select Fuel type "Petrol"
    When Enter payload as "1000"
    Then Process should incomplete

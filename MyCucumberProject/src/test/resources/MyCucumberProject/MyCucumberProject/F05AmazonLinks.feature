@AllLinks
Feature: Amazon Links

  Background: 
    Given Launch "https://www.amazon.in/"

  @SellLink
  Scenario: To validate Sell Link
    When Click on Sell Link
    Then Sell page should display

  @BestSellersLink
  Scenario: To validate Best sellers Link
    When Click on Best Sellers Link
    Then Best Sellers page should display

  @MobileTest
  Scenario: To validate Mobiles Link
    When Click on Mobiles Link
    Then Mobiles page should display

  @ElectronicsTest
  Scenario: To validate Electronics Link
    When Click on Electronics Link
    Then Electronics page should display

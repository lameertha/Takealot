Feature: Login and Adding Watches functionality
  As a new user I want to adding the watches successfully
  Scenario: As a new User should adding the watches successfully
    Given I am on login page
    When I click on login link
    And I enter the email "lameertha11@gmail.com"
    And I enter the Password "Lamee1988"
    And I click on login Button
    And I searching link"Garmin Forerunner 45S Sports Watch Black"
    And I adding to The GarminSmart Watch in the cart
    And I searching link"Garmin QuickFit 22mm Silicone Watch Band - Amp Yellow"
    And I adding to TheGarminQuickFit band in the cart
    And I click on checkOutLink
    And I click on card summary
    Then I should get iteams added message "Items"
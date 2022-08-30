@tag
Feature: B Checkout some product to buy
@tag2
  Scenario: Add a product to cart
    Given user is on login page
    When user login in the app
    And user select a product and add to cart
    And user proceed to checkout
    Then user go to payment page
    And verify the selected product
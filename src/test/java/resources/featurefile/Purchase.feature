Feature: Search functionality
  As a user I want to purchase cheapest and costliest product from the sauce demo after sorting the products by Hight to Low filter.
  @Smoke
  Scenario: User navigates sauce demo page and complete the item purchase
    Given I am on saucedemo page
    When I login with credential username "standard_user" and password "secret_sauce"
    And I click on Login button
    And I filter the products by "Price (high to low)"
    And I select cheapest & costliest products and add to basket
    And I open shopping cart
    And I go to checkout
    And I enter details firstname "Ruby", lastName "Kapoor" and zipPostalCode "CF9 5OR"
    And I click on continue button
    And I click on finish button
    Then I should be able to see the thank you message at the end



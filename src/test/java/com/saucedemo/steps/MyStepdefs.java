package com.saucedemo.steps;

import com.saucedemo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
        System.out.println("I am on homepage");
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String userName, String passWord) {
        new HomePage().enterUsername(userName);
        new HomePage().enterpassword(passWord);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginLink();
    }

    @And("^I filter the products by \"([^\"]*)\"$")
    public void iFilterTheProductsBy(String option) {
        new InventoryPage().selectSortBy(option);

    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new InventoryPage().addFleeceInCart();
        new InventoryPage().addOnesieInCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new InventoryPage().clickOnCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CartPage().clickOnCheckout();
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String firstname, String lastname, String zipcode) {
        new CheckoutPage().enterfirstname(firstname);
        new CheckoutPage().enterlastname(lastname);
        new CheckoutPage().enterZipCode(zipcode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckoutPage().clickOnFinishButton();
    }

    @Then("^I should be able to see the thank you message at the end$")
    public void iShouldBeAbleToSeeTheThankYouMessageAtTheEnd() {

        String expectedMessage = "THANK YOU FOR YOUR ORDER";
        String actualMessage = new CheckoutCompletePage().verifyThankYouMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

}

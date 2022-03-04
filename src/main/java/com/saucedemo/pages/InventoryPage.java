package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InventoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(InventoryPage.class.getName());

    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']//option")
    List<WebElement> sortFilter;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement fleeceAddToCart;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement onesieAddTopCart;

    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartLink;


    public void selectSortBy(String highToLow) {
        for (WebElement sort : sortFilter) {
            if (sort.getText().trim().equalsIgnoreCase(highToLow)) {
                clickOnElement(sort);
                break;
            }
        }
        log.info("Select " + sortFilter.toString());
    }

    public void addFleeceInCart() {
        clickOnElement(fleeceAddToCart);
        log.info("Add fleece in cart" + fleeceAddToCart.toString());
    }

    public void addOnesieInCart() {
        clickOnElement(onesieAddTopCart);
        log.info("Add Onesie in cart" + onesieAddTopCart.toString());
    }

    public void clickOnCart() {
        clickOnElement(cartLink);
        log.info("Click on cart button" + cartLink.toString());
    }
}
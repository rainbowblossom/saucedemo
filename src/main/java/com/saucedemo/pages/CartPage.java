package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends Utility {

    private static final Logger log = LogManager.getLogger(CartPage.class.getName());

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy( xpath= "//button[@id='checkout']")
    WebElement checkOutButton;

    public void clickOnCheckout(){
        clickOnElement(checkOutButton);
        log.info( "Click on checkout button" + checkOutButton.toString());
    }
}

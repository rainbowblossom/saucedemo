package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutCompletePage.class.getName());

    public CheckoutCompletePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")
    WebElement thankYouMessage;

    public String verifyThankYouMessage(){
        log.info("Verify thank you for your order message" + thankYouMessage.toString());
        return thankYouMessage.getText();

    }
}

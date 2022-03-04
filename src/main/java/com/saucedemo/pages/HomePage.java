package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement LoginLink;

    public void enterUsername(String username){
        sendTextToElement(userName, username);
        log.info( "Enter username in the username field" + userName.toString());
    }
    public void enterpassword(String psword){
        sendTextToElement(password, psword);
        log.info( "Enter password in the password field" + password.toString());
    }
    public void clickOnLoginLink(){
        clickOnElement(LoginLink);
        log.info( "Click on the search button" + LoginLink.toString());
    }
}

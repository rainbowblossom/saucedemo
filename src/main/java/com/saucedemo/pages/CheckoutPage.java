package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy( xpath= "//input[@id='first-name']")
    WebElement firstName;

    @CacheLookup
    @FindBy( xpath= "//input[@id='last-name']")
    WebElement lastName;
    @CacheLookup
    @FindBy( xpath= "//input[@id='postal-code']")
    WebElement zipCode;

    @CacheLookup
    @FindBy( xpath= "//input[@id='continue']")
    WebElement continuebtn;

    @CacheLookup
    @FindBy( xpath= "//button[@id='finish']")
    WebElement finishbtn;


    public void enterfirstname(String firstnm){

        sendTextToElement(firstName, firstnm);
        log.info("Enter firstname" + firstName.toString());}

    public void enterlastname(String lastnm){
        sendTextToElement(lastName, lastnm);
        log.info("Enter lastname" + lastName.toString());}

    public void enterZipCode(String zipCd){
        sendTextToElement(zipCode, zipCd);
        log.info("Enter zipcode" + zipCode.toString());}

    public void clickOnContinueButton(){
        clickOnElement(continuebtn);
        log.info("Click on continue button" + continuebtn.toString());
    }
    public void clickOnFinishButton(){
        clickOnElement(finishbtn);
        log.info("Click on finish button" + finishbtn.toString());
    }

}
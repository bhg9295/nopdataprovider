package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {


    //@CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;


    public void clickOnLoginButton() {

        sleep(2000);
        clickOnElement(loginButton);

    }



    public void enterEmailId(String email) {

        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginLink() {

        sleep(2000);
        clickOnElement(loginLink);

    }


    public WebElement getWelcomeText() {
        return welcomeText;
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement getErrorMessage;

    public WebElement getGetErrorMessage() {
        return getErrorMessage;
    }

    public WebElement getLoginOutLink() {
        return loginOutLink;
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement loginOutLink;


    public WebElement getLoginLink() {
        return loginLink;
    }

    public void clickOnLogoutLink(){

    sleep(2000);

    clickOnElement(loginOutLink);

}


}

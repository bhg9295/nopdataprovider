package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement RegisterLInk;


    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;


    public WebElement getFirstNameError() {
        return FirstNameError;
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement FirstNameError;


    public WebElement getLastNameError() {
        return LastNameError;
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement LastNameError;

    public WebElement getEmailError() {
        return EmailError;
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement EmailError;


    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemale;


    public void clickOnGender(){
        sleep(2000);
        clickOnElement(genderFemale);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;


public void setFirstName(String name)
{
    sendTextToElement(firstName, name);

}

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    public void setLastName(String name)
    {
        sendTextToElement(lastName, name);

    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement day;

public void selectFromDropDownDay(String day)
{
    selectByVisibleTextFromDropDown(this.day,day);
}
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement month;


    public void selectFromDropDownMonth(String month)
    {
        selectByVisibleTextFromDropDown(this.month,month);
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement year;


    public void selectFromDropDownYear(String year)
    {
        selectByVisibleTextFromDropDown(this.year,year);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

public void setEmail(String email)
{

    sendTextToElement(this.email, email);

}


    public WebElement getPasswordRequired() {
        return passwordrequired;
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;


public void setPassword(String Password)

{
   sendTextToElement(this.password, Password);

}

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;


    public void setConfirmPasswordPassword1(String confirmPassword)

    {
        sendTextToElement(this.confirmPassword, confirmPassword);

    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;


    public void clickOnregister()

    {
        clickOnElement(registerButton);

    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordrequired;

    public WebElement getConfirmPasswordRequired() {
        return confirmPasswordrequired;
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordrequired;



    public void clickOnRegisterButton(){

        sleep(2000);
        clickOnElement(RegisterButton);

    }




    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement RegisterText;

    public WebElement getRegisterText() {
        return RegisterText;
    }


    public void clickOnRegisterLink(){
        sleep(2000);
        clickOnElement(RegisterLInk);

    }

   // @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyregistration;









}

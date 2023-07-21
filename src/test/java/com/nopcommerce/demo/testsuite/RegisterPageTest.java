package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    RegisterPage registerPage;


    @BeforeMethod
    public void inIT() {
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        sleep(2000);
        registerPage.clickOnRegisterLink();
        verifyText(registerPage.getRegisterText(), "Register");

    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        sleep(2000);
        registerPage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        verifyText(registerPage.getFirstNameError(), "First name  required.");
        verifyText(registerPage.getLastNameError(), "Last name required.");
        verifyText(registerPage.getEmailError(), "Email required.");
        verifyText(registerPage.getPasswordRequired(), "Password required.");
        verifyText(registerPage.getConfirmPasswordRequired(), "Password  required.");

    }

    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() {

        registerPage.clickOnRegisterLink();
        registerPage.clickOnGender();
        registerPage.setFirstName("Bhg");
        registerPage.setLastName("patel");
        registerPage.selectFromDropDownDay("26");
        registerPage.selectFromDropDownMonth("feb");
        registerPage.selectFromDropDownYear("1995");
        registerPage.setEmail("bhg123@gmail.com");
        registerPage.setPassword("bhg1234");
        registerPage.setConfirmPasswordPassword1("bhg1234");
        registerPage.clickOnregister();



    }


}

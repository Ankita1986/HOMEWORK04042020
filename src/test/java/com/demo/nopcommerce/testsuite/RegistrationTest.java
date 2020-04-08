package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegConfPage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import com.demo.nopcommerce.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class RegistrationTest extends TestBase {
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    RegConfPage regConfPage = new RegConfPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPage(){
        homePage.clickOnRegisterLink();
    }

    @Test
    public void verifyUserShouldRegisterSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.waitForVisiblityToSeeElement();
        registerPage.clickOnRadioBt();
        registerPage.waitForVisiblityToSeeElement();
        registerPage.enterFirstName();
        registerPage.waitForVisiblityToSeeElement();
        registerPage.enterLastName();
        registerPage.selectDayOfBirth();
        registerPage.selectMonthOfBirth();
        registerPage.selectYearOfBirth();
        registerPage.enterEmailId();
        registerPage.enterCompanyName();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.clickOnRegisterBt();
       // regConfPage.waitForVisiblityToseeElement();

        String expectedText = "Your registration completed";
        String actualText = regConfPage.registerTextCnf();
        Assert.assertEquals(expectedText, actualText);

    }
}

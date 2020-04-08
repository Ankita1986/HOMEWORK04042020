package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class RegisterPage extends Utility {


    By radioBt = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dateOfBirthDayDropDown = By.xpath("//select[@name='DateOfBirthDay']");
    By monthOfBirthDropDown = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearOfBirthDropDown = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyName = By.id("Company");
    By passwordField = By.id("Password");
    By conformPasswordField = By.id("ConfirmPassword");
    By registerBt = By.xpath("//input[@id='register-button']");



    public void clickOnRadioBt(){
        clickOnElement(radioBt);
    }
    public void enterFirstName(){
        sendTextToElement(firstNameField, "Taj");
    }
    public void enterLastName(){
        sendTextToElement(lastNameField, "Mahal");
    }
    public void selectDayOfBirth(){
        selectByVisibleTextForDropDownElement(dateOfBirthDayDropDown, "1");
    }
    public void selectMonthOfBirth(){
        selectByVisibleTextForDropDownElement(monthOfBirthDropDown, "July");
    }
    public void selectYearOfBirth(){
        selectByVisibleTextForDropDownElement(yearOfBirthDropDown, "1986");
    }
    public void enterEmailId(){
        enterRandomEmail(emailField);
    }


    public void enterCompanyName(){
        sendTextToElement(companyName, "Physio Care");
    }
    public void enterPassword(){
        sendTextToElement(passwordField, "Tajmahal06");
    }
    public void enterConfirmPassword(){
        sendTextToElement(conformPasswordField, "Tajmahal06");
    }
    public void clickOnRegisterBt(){
        clickOnElement(registerBt);
    }
    public void waitForVisiblityToSeeElement() {
        waitUntilVisibilityOfElementLocated(firstNameField, 50);
    }

}


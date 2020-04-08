package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class DeskTopPage extends Utility {
    By desktopText = By.xpath("//h1[contains(text(),'Desktops')]");
    By buildYourOwnComputer = By.xpath("//a[contains(text(),'Build your own computer')]");


    public String deskTopConfText(){
        return getTextFromElement(desktopText);


    }
    public void clickOnBuildYourOnComputer() {
        clickOnElement(buildYourOwnComputer);
    }
}


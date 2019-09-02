package com.Btrix.pages;

import com.Btrix.Utilities.BasePage;
import com.Btrix.Utilities.BrowserUtils;
import com.Btrix.Utilities.ConfigurationReader;
import com.Btrix.Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class            LoginPage extends BasePage {

    @FindBy (css="[class='login-inp'][name='USER_LOGIN']")
    @CacheLookup
    public WebElement loginBox;

    @FindBy (css="[class='login-inp'][name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy (css="[class='login-btn']")
    public WebElement loginButton;

    @FindBy(id="USER_REMEMBER")
    public WebElement RememberMe;

    @FindBy (className="[class='login-link-forgot-pass']")
    public WebElement ForgotPassword;



    public void login(String username){

           loginBox.sendKeys(ConfigurationReader.getProperty("helpdeskusername"));
           passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

           loginButton.click();
    }

    public void Title(){
        Driver.getDriver().getTitle();
    }

























    @Test
    public void loginPage(){
        Driver.getDriver().get("http://login1.nextbasecrm.com");
        BrowserUtils.waitPlease(3);
        loginBox.sendKeys("mustafa");
        passwordBox.sendKeys("asdasd");


    }

}

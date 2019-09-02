package com.Btrix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage{

    @FindBy (css="[class='login-inp'][name='USER_LOGIN']")
    @CacheLookup
    public WebElement loginBox;

    @FindBy (css="[class='login-inp'][name='USER_PASSWORD']")
    public WebElement passwordBox;


}

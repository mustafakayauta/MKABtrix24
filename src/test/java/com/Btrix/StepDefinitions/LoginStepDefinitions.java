package com.Btrix.StepDefinitions;


import com.Btrix.Utilities.BrowserUtils;
import com.Btrix.Utilities.ConfigurationReader;
import com.Btrix.Utilities.Driver;
import com.Btrix.Utilities.Pages;
import com.Btrix.pages.LoginPage;
import cucumber.api.java.en.*;

public class LoginStepDefinitions {
    Pages page=new Pages();

    @Given("user is on the landing login page")
    public void user_is_on_the_landing_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitPlease(2);
    }
    @Then("user login as a {string} user")
    public void user_login_as_a_user(String string) {
        page.loginPage().login(string);
    }
}

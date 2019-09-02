package com.Btrix.StepDefinitions;

import com.Btrix.Utilities.BrowserUtils;
import com.Btrix.Utilities.Driver;
import com.Btrix.Utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HomeStepDefinitions {
    Pages page=new Pages();

    @Then("Click on AddTask")
    public void click_on_AddTask() {


        WebElement taskButton=Driver.getDriver().findElement(By.xpath("//*[@id='bx_left_menu_menu_tasks']/a/span[1]"));
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(taskButton).build().perform();
        action.moveToElement(page.homePage().createTaskOnActivityStreams).click().build().perform();

        String expected="New task";
        Driver.getDriver().switchTo().frame(page.homePage().newTaskFrame);

        Assert.assertEquals(expected,page.homePage().newTaskTittle.getText());


    }

    @Then( "user logs out" )
    public void userLogsOut() {
        Driver.getDriver().close();
        BrowserUtils.waitFor(4);
    }
}

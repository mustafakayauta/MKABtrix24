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
public class HomePage extends BasePage {

    @FindBy(css = "[class= 'menu-item-plus-icon']")
   public WebElement createTaskOnActivityStreams;

    @FindBy(xpath = "//*[@id='bx_left_menu_menu_tasks']/a/span[1]")
    public WebElement tasksButton;

    @FindBy(xpath="//*[@class='pagetitle-item' and text()='New task']")
    public WebElement newTaskTittle;

    @FindBy(css="[class='ui-btn ui-btn-light-border ui-btn-themes ui-btn-dropdown']")
    public WebElement createTaskTemplate;

    @FindBy(css = "[id^='iframe_']")
    public WebElement newTaskFrame;

    @FindBy(css = "[data-bx-id='task-edit-title']")
    public WebElement thingsToDo;






}

package com.Btrix.StepDefinitions;

import com.Btrix.Utilities.BrowserUtils;
import com.Btrix.Utilities.Pages;
import cucumber.api.java.en.*;
import org.openqa.selenium.Keys;

public class NewTaskStepDefinitions {

        Pages page = new Pages();



    @Then("User able to write on thingsToDo box")
    public void user_able_to_write_on_thingsToDo_box() {
      page.newTaskPage().thingsTodoLabelLocator.sendKeys("HaciBaba");
      BrowserUtils.waitFor(3);
    }

    @Then("User able to upload a file")
    public void user_able_to_upload_a_file() {
page.newTaskPage().uploadFileOrImageLocator.click();
BrowserUtils.waitFor(2);
page.newTaskPage().subUploadFileOrImageLocator.click();
String path="D:\\CYBERTEK\\ONEMLI LINKLERRRR!!!!.txt";
page.newTaskPage().subUploadFileOrImageLocator.sendKeys(path, Keys.ENTER);

    }

    @Then("User able to fill the link and save")
    public void user_able_to_fill_the_link_and_save() {

    }

    @Then("add checklist in checklistbox and click on checkbutton")
    public void add_checklist_in_checklistbox_and_click_on_checkbutton() {

    }

    @Then("click on ADD Task \\(You can type control_enter)")
    public void click_on_ADD_Task_You_can_type_control_enter() {

    }




}

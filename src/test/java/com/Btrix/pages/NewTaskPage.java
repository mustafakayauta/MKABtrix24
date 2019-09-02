package com.Btrix.pages;

import com.Btrix.Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class NewTaskPage extends BasePage {
@FindBy(xpath = "(//*[@placeholder='Things to do'])[1]")
public WebElement thingsTodoLabelLocator;

    @FindBy(id = "bx-b-uploadfile-task-form-bitrix_tasks_task_default_1")
    public WebElement uploadFileOrImageLocator;

    @FindBy(className = "diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main")
    public WebElement subUploadFileOrImageLocator;

    @FindBy(id = "bx-b-link-task-form-bitrix_tasks_task_default_1")
    public WebElement addTextOrLinkLocator;

    @FindBy(id = "linkbitrix_tasks_task_default_1-href")
    public WebElement subAddTextOrLinkLocator;

    @FindBy(xpath = "(//*[@data-target='checklist'])[1]")
    public WebElement checklistAddLocator;

    @FindBy(className = "js-id-checklist-is-form-title task-checklist-field-add")
    public WebElement checklistLabelLocator;

    @FindBy(className = "js-id-checklist-is-form-submit block-edit tasks-btn-apply task-field-title-ok")
    public WebElement checklistCheckMarkLocator;



}

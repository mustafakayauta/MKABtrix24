

  Feature: As a user I should be able to create a task from activity stream.
  Background:
    Given user is on the landing login page
    Then  user login as a "helpdesk" user
    Then Click on AddTask

      @UploadFile,Image,Link,Checklist
    Scenario: Verify that user can upload a file and image or link or add checklist regarding to
      new task

        Then User able to write on thingsToDo box
        Then User able to upload a file
        Then User able to fill the link and save
        Then add checklist in checklistbox and click on checkbutton
        Then click on ADD Task (You can type control_enter)







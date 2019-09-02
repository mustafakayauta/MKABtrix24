package com.Btrix.Utilities;

import com.Btrix.pages.HomePage;
import com.Btrix.pages.LoginPage;
import com.Btrix.pages.NewTaskPage;
//import com.Btrix.pages.TaskPage;

public class Pages {

    private LoginPage loginPage;
    private HomePage homePage;
    private NewTaskPage newTaskPage;
    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public HomePage homePage(){
        if (homePage== null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public NewTaskPage newTaskPage(){
        if (newTaskPage== null) {
            newTaskPage = new NewTaskPage();
        }
        return newTaskPage;
    }
}
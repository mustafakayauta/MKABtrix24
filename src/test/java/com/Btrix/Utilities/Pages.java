package com.Btrix.Utilities;

import com.Btrix.pages.LoginPage;
//import com.Btrix.pages.TaskPage;

public class Pages {

    private LoginPage loginPage;
   // private TaskPage taskPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

   //public TaskPage taskPage(){
     //   if (taskPage == null) {
     //       taskPage = new TaskPage();
       // }
      //  return taskPage;
    //}
}
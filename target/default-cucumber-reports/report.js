$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\Resources\\Features\\login.feature");
formatter.feature({
  "name": "As a user I should be able to create a task from activity stream.",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the landing login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as a \"helpdesk\" user",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_login_as_a_user(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on AddTask",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefinitions.click_on_AddTask()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can upload a file and image or link or add checklist regarding to",
  "description": "      new task",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UploadFile,Image,Link,Checklist"
    }
  ]
});
formatter.step({
  "name": "User able to write on thingsToDo box",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTaskStepDefinitions.user_able_to_write_on_thingsToDo_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User able to upload a file",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTaskStepDefinitions.user_able_to_upload_a_file()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".diskuf\\-selector\\ wd\\-fa\\-add\\-file\\-light\\-cell\\ wd\\-fa\\-add\\-file\\-from\\-main\"}\n  (Session info: chrome\u003d76.0.3809.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6PMV6EC\u0027, ip: \u0027192.168.1.72\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\Riqu\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:55530}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ab1e2bcf62caf89a767911db8b19a95c\n*** Element info: {Using\u003dclass name, value\u003ddiskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.Btrix.StepDefinitions.NewTaskStepDefinitions.user_able_to_upload_a_file(NewTaskStepDefinitions.java:24)\r\n\tat ✽.User able to upload a file(src\\test\\Resources\\Features\\login.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User able to fill the link and save",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTaskStepDefinitions.user_able_to_fill_the_link_and_save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "add checklist in checklistbox and click on checkbutton",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTaskStepDefinitions.add_checklist_in_checklistbox_and_click_on_checkbutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on ADD Task (You can type control_enter)",
  "keyword": "Then "
});
formatter.match({
  "location": "NewTaskStepDefinitions.click_on_ADD_Task_You_can_type_control_enter()"
});
formatter.result({
  "status": "skipped"
});
});
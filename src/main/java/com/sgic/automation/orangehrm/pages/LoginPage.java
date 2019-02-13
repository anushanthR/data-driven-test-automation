package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class LoginPage extends PageBase {

  private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

  private static By hdrLogin = By.id("logInPanelHeading");
  private static By txtUserName = By.id("txtUsername");
  private static By txtPassword = By.id("txtPassword");
  private static By btnLogin = By.id("btnLogin");
  private static By alert = By.id("spanMessage");

  public static boolean isLoginPageDisplay() {

    return getDriver().findElement(hdrLogin).isDisplayed();
  }

  public static void setUserName(String userName) {

    getDriver().findElement(txtUserName).sendKeys(userName);
  }

  public static void serPassword(String password) {
    getDriver().findElement(txtPassword).sendKeys(password);
  }

  public static void clickLogin() {
    getDriver().findElement(btnLogin).click();
  }

  public static boolean isLoginAlertDisplay() {
    return getDriver().findElement(alert).isDisplayed();
  }

  public static void getLoginAlert() {
    getDriver().findElement(alert).getText();
  }


  public static void login(String userName, String password) {
    LoginPage.setUserName(userName);
    LoginPage.serPassword(password);
    LoginPage.clickLogin();
  }
}


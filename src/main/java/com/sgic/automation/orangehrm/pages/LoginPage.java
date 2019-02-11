package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
    private static By loginHeading=By.id("logInPanelHeading");
    private static By txtuserName=By.id("txtUsername");
    private static By txtpassword=By.id("txtPassword");
    private static By loginbtn=By.id("btnLogin");
    private static By alert =By.id("spanMessage");

    public static boolean isLoginPageDisplay(){

        return getDriver().findElement(loginHeading).isDisplayed();
    }
    public static void setUserName(String userName){

        getDriver().findElement(txtuserName).sendKeys(userName);
    }
    public static void serPassword(String password){
        getDriver().findElement(txtpassword).sendKeys(password);
    }
    public static void clickLogin(){
        getDriver().findElement(loginbtn).click();
    }
    public static boolean isLoginAlertDisplay(){
        return getDriver().findElement(alert).isDisplayed();
    }
    public static void getLoginAlert(){
        getDriver().findElement(alert).getText();
    }
    public static void login(){
        LoginPage.setUserName(Constants.OrgUserName);
        LoginPage.serPassword(Constants.OrgPassword);
        LoginPage.clickLogin();
    }
}

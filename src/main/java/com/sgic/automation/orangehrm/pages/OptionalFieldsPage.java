package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class OptionalFieldsPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PIMPage.class);

    private static By ObtionalFieldHeading=By.xpath("//*[@id=\"content\"]/div/div[1]/h1");
    private static By edit=By.id("btnSave");
    private static By save=By.id("btnSave");
    private static By select=By.id("configPim_chkShowSSN");
    private static By logoutDropdown=By.id("welcome");
    private static By logout=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");


    public static boolean isObtionlFieldDisplayes(){
        return getDriver().findElement(ObtionalFieldHeading).isDisplayed();
    }

    public static void clicEditBtn(){

        getDriver().findElement(edit).click();
    }
    public static void clickSaveBtn(){

        getDriver().findElement(save).click();
    }
    public static void selectOption(){

        getDriver().findElement(select).click();
    }
    public static void selectLogOut(){
        implicitWait(1);
        getDriver().findElement(logout).click();
    }
    public static void logoutButton(){

        getDriver().findElement(logoutDropdown).click();
    }
}

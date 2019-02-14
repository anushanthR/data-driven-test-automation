package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * @Author Jeyapriya
 */
public class TrackersPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By trackersHeading=By.xpath("//*[@id=\"search-results\"]/div[1]");
    private static By addbtn = By.id("btnAdd");
    private static By deletebtn = By.id("btnDelete");

    public static boolean isTrackersDisplayed(){
        return getDriver().findElement(trackersHeading).isDisplayed();
    }
    public static boolean isAddButtonDisplayed(){
        return getDriver().findElement(addbtn).isDisplayed();
    }
    public static void clickAddbtn(){
        getDriver().findElement(addbtn).click();
    }
}

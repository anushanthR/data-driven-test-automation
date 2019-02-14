package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * @Author Jeyapriya
 */
public class ManageReviewsPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By reviewHeading=By.xpath("//*[@id=\"leave-list-search\"]/a");
    private static By searchbtn = By.id("btnSearch");
    private static By addbtn = By.id("btnAdd");
    private static By deletebtn = By.id("btnDelete");

    public static boolean isReviewsPageDisplayed(){
        return getDriver().findElement(reviewHeading).isDisplayed();
    }
    public static boolean isAddButtonDisplayed(){
        return getDriver().findElement(addbtn).isDisplayed();
    }
    public static void clickAddbtn(){
        getDriver().findElement(addbtn).click();
    }
}

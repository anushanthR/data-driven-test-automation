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
    private static By btnSearch = By.id("btnSearch");
    private static By btnAdd = By.id("btnAdd");
    private static By btnDelete = By.id("btnDelete");
    private static By btnSelect=By.xpath("ohrmList_chkSelectAll");
    private static By result=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]");
    private static By txtSearchEmployeeName= By.id("performanceReview360SearchForm_employeeName");
    private static By txtSearchJobTitle= By.id("performanceReview360SearchForm_employeeName");


    public static boolean isReviewsPageDisplayed(){
        return getDriver().findElement(reviewHeading).isDisplayed();
    }
    public static boolean isAddButtonDisplayed(){
        return getDriver().findElement(btnAdd).isDisplayed();
    }
    public static void clickAddbtn(){
        getDriver().findElement(btnAdd).click();
    }
    public static void clickSelectBtn(){
        getDriver().findElement(btnSelect).click();
    }
    public static void clickDeleteBtn(){
        getDriver().findElement(btnDelete).click();
    }
    public static void searchPerformanceReviewByEmployeeName(){
        getDriver().findElement(txtSearchEmployeeName).sendKeys("John Smith");
        getDriver().findElement(btnSearch).click();
    }
    public static void searchPerformanceReviewByJobTitle(){
        getDriver().findElement(txtSearchJobTitle).sendKeys("CEO");
        getDriver().findElement(btnSearch).click();
    }
}

package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

/**
 * @Author Jeyapriya
 */
public class AddReviewPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By addPerformanceReviewPageheading = By.id("addPerformanceHeading");
    private static By txtemployeeName = By.id("saveReview360Form_employee");
    private static By txtsupervisorName = By.id("saveReview360Form_supervisorReviewer");
    private static By txtstartDate = By.id("saveReview360Form_workPeriodStartDate");
    private static By txtendDate = By.id("saveReview360Form_workPeriodEndDate");
    private static By txtdueDate = By.id("saveReview360Form_dueDate");
    private static By savebtn = By.xpath("//*[@id=\"saveBtn\"]");
    private static By cancelbtn = By.id("btnCancel");


    public static boolean isAddReviewDisplayes(){
        return getDriver().findElement(addPerformanceReviewPageheading).isDisplayed();
    }
    public static boolean isSavebtnisplayed(){
        return getDriver().findElement(savebtn).isDisplayed();

    }
    public static void setEmloyee(String employeeName){
        implicitWait(2);
        getDriver().findElement(txtemployeeName).sendKeys(employeeName,Keys.ENTER);

    }
    public static void setsupervisorName(String supervisorName){
        implicitWait(2);
        getDriver().findElement(txtsupervisorName).sendKeys(supervisorName);
        getDriver().findElement(txtsupervisorName).sendKeys(Keys.ENTER);

    }
    public static void setStartDate(String startDate){
        getDriver().findElement(txtstartDate).click();
        getDriver().findElement(txtstartDate).clear();
        getDriver().findElement(txtstartDate).sendKeys(startDate);
    }
    public static void setEndDate(String endDate){
        getDriver().findElement(txtendDate).clear();
        getDriver().findElement(txtendDate).sendKeys(endDate);
    }
    public static void setDueDate(String dueDate){
        getDriver().findElement(txtdueDate).clear();
        getDriver().findElement(txtdueDate).sendKeys(dueDate);
    }

    public static void clickSaveBtn()    {
        getDriver().findElement(savebtn).click();
        implicitWait(5);
    }

    public static void  addPerformanceReview(String employeeName,String supervisorName,
                                             String startDate,String endDate,String dueDate){
        AddReviewPage.setEmloyee(employeeName);
        AddReviewPage.setsupervisorName(supervisorName);
        AddReviewPage.setStartDate(startDate);
        AddReviewPage.setEndDate(endDate);
        AddReviewPage.setDueDate(dueDate);
    }
}

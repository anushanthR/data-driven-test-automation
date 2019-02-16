package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

/**
 * @Author Jeyapriya
 */
public class KPIsPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
    private static By KPIsheading=By.xpath("//*[@id=\"divFormContainer\"]/div[1]");
    private static By btnSearch = By.id("searchBtn");
    private static By btnAdd = By.id("btnAdd");
    private static By btnDelete = By.id("btnDelete");
    private static By btnSelect=By.id("ohrmList_chkSelectAll");
    private static By result=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]");
    private static By txtjobTitleForSearch=By.id("kpi360SearchForm_jobTitleCode");
    private static By txtEdit=By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a");

    public static boolean isKPIsPageDisplayed(){
        return getDriver().findElement(KPIsheading).isDisplayed();
    }
    public static boolean isAddButtonDisplayed(){
        return getDriver().findElement(btnAdd).isDisplayed();
    }
    public static void clickAddbtn(){
        getDriver().findElement(btnAdd).click();
    }
    public static void clickSelectButton(){
        driver.findElement(btnSelect).click();
    }
    public static void clickDeleteButton(){
        driver.findElement(btnDelete).click();
    }
    public static boolean isResultDisplayed(){
        return getDriver().findElement(result).isDisplayed();
    }
    public static void clicksearchButton(){
        getDriver().findElement(btnSearch).click();
    }
    public static void setJobTitleForSearch(){
        getDriver().findElement(txtjobTitleForSearch).sendKeys("CEO");
    }

    public static void searchKPIs(){
        KPIsPage.setJobTitleForSearch();
        KPIsPage.clicksearchButton();

    }
    public static void clickEditbtn(){
        getDriver().findElement(txtEdit).click();
    }


}

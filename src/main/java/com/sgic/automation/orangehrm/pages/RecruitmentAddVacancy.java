package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class RecruitmentAddVacancy extends PageBase {
    /**
     * RecruitmentVacancyAddButtonNavigation
     */
    private static By recruitmentButtonLink = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
    private static By recruitmentVacancyButtonLink = By.id("menu_recruitment_viewJobVacancy");
    private static By vacancyAddButton = By.id("btnAdd");
    private static By vacancyAddPageVerify = By.xpath("//*[@id=\"addJobVacancy\"]/div[1]/h1");
    /**
     * AddVacancyForm
     */
    private static By jobTitleDropdown = By.id("addJobVacancy_jobTitle");
    private static By vacancyName = By.id("addJobVacancy_name");
    private static By hiringManager = By.id("addJobVacancy_hiringManager");
    private static By positionNum = By.id("addJobVacancy_noOfPositions");
    private static By description = By.id("addJobVacancy_description");
    private static By addSaveBtn = By.id("btnSave");



    /**
     * @RECRUITMENT METHOD
     * RecruitmentButton
     * ClickVacancyButton
     * ClickAddVacancyButton
     */
    private static final Logger LOGGER = Logger.getLogger(RecruitmentAddVacancy.class);
    public static boolean isRecruitmentBtnDisplay(){return getDriver().findElement(recruitmentButtonLink).isDisplayed();}
    public static void recruitmentBtnClick(){getDriver().findElement(recruitmentButtonLink).click();}
    public static boolean isVancyBtnDisplay(){return getDriver().findElement(recruitmentVacancyButtonLink).isDisplayed();}
    public static void vacancyBtnClick(){getDriver().findElement(recruitmentVacancyButtonLink).click();}
    public static boolean isVacancyAddBtnVerify(){return getDriver().findElement(vacancyAddButton).isDisplayed();}
    public static void vacancyAddBtnClick(){getDriver().findElement(vacancyAddButton).click();}
    public static boolean isVacancyAddPageVerify(){return getDriver().findElement(vacancyAddPageVerify).isDisplayed();}

    /**
     * VacancyAddPage
     */
    public static boolean isJobTitleDropDownDisplayed() {
        return getDriver().findElement(jobTitleDropdown).isDisplayed();}
//    public static String getSelectedOption() { Select dropDownOption = new Select(getDriver().findElement(jobTitleDropdown));
//        return dropDownOption.getFirstSelectedOption().getText(); }
    public static void setDropDownOption(String jobTitle) { Select dropDownOption = new Select(getDriver().findElement(jobTitleDropdown));
        dropDownOption.selectByVisibleText(jobTitle);}
    public static void vacancyName(String VacancyName){getDriver().findElement(vacancyName).sendKeys(VacancyName);}
    public static void hiringManager(String HiringManager){getDriver().findElement(hiringManager).sendKeys(HiringManager);}
    public static void positionNumber(String PositionNum){getDriver().findElement(positionNum).sendKeys(PositionNum);}
    public static void description(String Description){getDriver().findElement(description).sendKeys(Description);}
    public static boolean isSaveBtnVisible(){return getDriver().findElement(addSaveBtn).isDisplayed();}
    public static void saveBtn(){getDriver().findElement(addSaveBtn).click();}
    //navigate back candidate//


}

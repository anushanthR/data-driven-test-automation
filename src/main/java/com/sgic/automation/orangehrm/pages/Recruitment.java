package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static com.sgic.automation.orangehrm.utils.Constants.*;
import static org.testng.Assert.assertEquals;

public class Recruitment extends PageBase {
    /**
     * RecruitmentVacancyButtonNavigation
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
     * AddCandidate
     */
    private static By candidateButton = By.id("menu_recruitment_viewCandidates");
    private static By candidatePage = By.xpath("//*[@id=\"srchCandidates\"]/a");
    private static By candidateJobTitle = By.id("candidateSearch_jobTitle");
    private static By candidateVacancy = By.id("candidateSearch_jobVacancy");
    private static By candidateHiringManager = By.id("candidateSearch_hiringManager");
    private static By candidateStatus = By.id("candidateSearch_status");
    private static By candidateCandidateName = By.id("candidateSearch_candidateName");
    private static By candidateKeyword = By.id("candidateSearch_keywords");
    private static By candidateDateOfApplicationFrom = By.id("candidateSearch_fromDate");
    private static By candidateDateOfApplicationTo = By.id("candidateSearch_toDate");



    /**
     * @RECRUITMENT METHOD
     * RecruitmentButton
     * ClickVacancyButton
     * ClickAddVacancyButton
     */
    private static final Logger LOGGER = Logger.getLogger(Recruitment.class);
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
    public static boolean isDropDownDisplayed() {
        return getDriver().findElement(jobTitleDropdown).isDisplayed();
    }
    public static String getSelectedOption() { Select dropDownOption = new Select(getDriver().findElement(jobTitleDropdown));
        return dropDownOption.getFirstSelectedOption().getText(); }
    public static void setDropDownOption(String option) { Select dropDownOption = new Select(getDriver().findElement(jobTitleDropdown));
        dropDownOption.selectByVisibleText(option);}
    public static void vacancyName(){getDriver().findElement(vacancyName).sendKeys("Manager");}
    public static void hiringManager(){getDriver().findElement(hiringManager).sendKeys("Robert Craig");}
    public static void positionNumber(){getDriver().findElement(positionNum).sendKeys("5");}
    public static void description(){getDriver().findElement(description).sendKeys("open");}
    public static boolean isSaveBtnVisible(){return getDriver().findElement(addSaveBtn).isDisplayed();}
    public static void saveBtn(){getDriver().findElement(addSaveBtn).click();}
    //navigate back candidate//

    /**
     * AddCandidate
     */
    public static boolean isCandidateBtnVerify(){return getDriver().findElement(candidateButton).isDisplayed();}
    public static void candidateBtnClick(){getDriver().findElement(candidateButton).click();}
    public static boolean isCandidatePageDisplay(){return getDriver().findElement(candidatePage).isDisplayed();}
    public static boolean isCandidateJobTitleDropDownDisplayed() {
        return getDriver().findElement(candidateJobTitle).isDisplayed();}
    public static String getCandidateJobTitleSelectedOption() { Select dropDownOption = new Select(getDriver().findElement(candidateJobTitle));
        return dropDownOption.getFirstSelectedOption().getText(); }
    public static void setCandidateJobTitleSelectedOption(String option) { Select dropDownOption = new Select(getDriver().findElement(candidateJobTitle));
        dropDownOption.selectByVisibleText(option);}

}

package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * @PreparedBy ThusyaG_RECRUITMENT SEARCH FORM
 */
public class RecruitmentSearchCandidate extends PageBase {
    /**
     * Search Candidate Elements
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
    private static By methodOfApplication = By.id("candidateSearch_modeOfApplication");

    /**
     * @return candidateButton
     * @return CandidatePageDisplay
     * @return CandidateJobTitleDropDownDisplay
     * @return CandidateVacancyDropDownDisplay
     * @return CandidateHiringManagerDropDownDisplay
     * @return CandidateStatusDropDownDisplay
     */
    public static boolean isCandidateBtnVerify(){return getDriver().findElement(candidateButton).isDisplayed();}
    public static void candidateBtnClick(){getDriver().findElement(candidateButton).click();}
    public static boolean isCandidatePageDisplay(){return getDriver().findElement(candidatePage).isDisplayed();}
    public static boolean isCandidateJobTitleDropDownDisplayed() { return getDriver().findElement(candidateJobTitle).isDisplayed();}
    public static void setCandidateJobTitleSelectedOption(String CanJobTitle) { Select dropDownOption = new Select(getDriver().findElement(candidateJobTitle));dropDownOption.selectByVisibleText(CanJobTitle);}
    public static boolean isCandidateVacancyDropDownDisplayed() { return getDriver().findElement(candidateVacancy).isDisplayed();}
    public static void setCandidateVacancySelectedOption(String CanVacancy) { Select dropDownOption = new Select(getDriver().findElement(candidateVacancy));dropDownOption.selectByVisibleText(CanVacancy);}
    public static boolean isCandidateHiringManagerDropDownDisplayed() { return getDriver().findElement(candidateHiringManager).isDisplayed();}
    public static void setCandidateHiringManagerSelectedOption(String CanHiringManager) { Select dropDownOption = new Select(getDriver().findElement(candidateHiringManager));dropDownOption.selectByVisibleText( CanHiringManager);}
    public static boolean isCandidateStatusDropDownDisplayed() { return getDriver().findElement(candidateStatus).isDisplayed();}
    public static void setCandidateStatusSelectedOption(String CanStatus) { Select dropDownOption = new Select(getDriver().findElement(candidateStatus));dropDownOption.selectByVisibleText(CanStatus);}

    public static void candidateName(String CanName){getDriver().findElement(candidateCandidateName).sendKeys(CanName);}
    public static void keywords(String CanKey){getDriver().findElement(candidateKeyword ).sendKeys(CanKey);}
    public static void applicationFromDate(String fromDate){getDriver().findElement(candidateDateOfApplicationFrom).sendKeys(fromDate);}
    public static void applicationToDate(String toDate){getDriver().findElement(candidateDateOfApplicationTo).sendKeys(toDate);}
    public static boolean isCandidateSMethodOfApplication() { return getDriver().findElement(methodOfApplication).isDisplayed();}
    public static void setCandidateSMethodOfApplicationSelectedOption(String CanMethodApplication) { Select dropDownOption = new Select(getDriver().findElement(methodOfApplication));dropDownOption.selectByVisibleText(CanMethodApplication);}
    /**
     * CANDIDATE SEARCH FORM
     * @param CanJobTitle
     * @param CanVacancy
     * @param CanHiringManager
     * @param CanStatus
     * @param CanName
     * @param CanKey
     * @param fromDate
     * @param toDate
     * @param CanMethodApplication
     */
    public static void RecruitmentCanSearchForm(String CanJobTitle,String CanVacancy,String CanHiringManager,String CanStatus,String CanName,String CanKey,String fromDate,String toDate,String CanMethodApplication){
        RecruitmentSearchCandidate.setCandidateJobTitleSelectedOption(CanJobTitle);
        RecruitmentSearchCandidate.setCandidateVacancySelectedOption(CanVacancy);
        RecruitmentSearchCandidate.setCandidateHiringManagerSelectedOption(CanHiringManager);
        RecruitmentSearchCandidate.setCandidateStatusSelectedOption(CanStatus);
        RecruitmentSearchCandidate.candidateName(CanName);
        RecruitmentSearchCandidate.keywords(CanKey);
        RecruitmentSearchCandidate.applicationFromDate(fromDate);
        RecruitmentSearchCandidate.applicationToDate(toDate);
        RecruitmentSearchCandidate.setCandidateSMethodOfApplicationSelectedOption(CanMethodApplication);
        implicitWait(10);
    }
}

package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

/**
 * PreparedBy ThusyaG_RECRUITMENT ADD CANDIDATE
 */
public class RecruitmentAddCandidate extends PageBase {
    /**
     * Add Candidate form Elements
     */
    private static final Logger LOGGER = Logger.getLogger(RecruitmentAddCandidate.class);

    private static By candidateAddBtn = By.xpath("//*[@id=\"btnAdd\"]");
    private static By candidatePageDisplay = By.id("addCandidateHeading");
    private static By FirstName = By.id("addCandidate_firstName");
    private static By MiddleName = By.id("addCandidate_middleName");
    private static By LastName = By.id("addCandidate_lastName");
    private static By Email = By.id("addCandidate_email");
    private static By ContactNum = By.id("addCandidate_contactNo");
    private static By JobVacancy = By.id("addCandidate_vacancy");
    private static By ResumeFileUpload = By.id("addCandidate_resume");
    private static By Keyword = By.id("addCandidate_keyWords");
    private static By Comment = By.id("addCandidate_comment");
    private static By DateOfApplication = By.id("addCandidate_appliedDate");
    private static By SaveBtn = By.id("btnSave");


    public static boolean addButtonDis(){return getDriver().findElement(candidateAddBtn).isDisplayed();}
    public static void AddButtonClick(){getDriver().findElement(candidateAddBtn).click();}
    public static void AddCandidatePage(){getDriver().findElement(candidatePageDisplay).isDisplayed();}
    public static void firstName(String Firstname){getDriver().findElement(FirstName).sendKeys(Firstname);}
    public static void middleName(String Middlename){getDriver().findElement(MiddleName).sendKeys(Middlename);}
    public static void lastName(String Lastname){getDriver().findElement(LastName).sendKeys(Lastname);}
    public static void setEmail(String Mail){getDriver().findElement(Email).sendKeys(Mail);}
    public static void setContactNum(String ContactNumber){getDriver().findElement(ContactNum).sendKeys(ContactNumber);}
    public static boolean jobVacancy() { return getDriver().findElement(JobVacancy).isDisplayed();}
    public static void setjobVacancySelectedOption(String jobVacancy) { Select dropDownOption = new Select(getDriver().findElement(JobVacancy));dropDownOption.selectByVisibleText(jobVacancy);}
    //UploadFile
    public static void uploadFile(String filename) {getDriver().findElement(ResumeFileUpload).sendKeys(PageBase.uploadFilepath+File.separator+ filename); }
    public static void setKeyword(String keyWord){getDriver().findElement(Keyword).sendKeys(keyWord);}
    public static void setComment(String comment){getDriver().findElement(Comment).sendKeys(comment);}
    public static void setDateOfApplication(String dateofApplication){getDriver().findElement(DateOfApplication).sendKeys(dateofApplication);}
    public static void setSaveBtn(){getDriver().findElement(SaveBtn).click();}

    /**
     * ADD CANDIDATE FORM METHOD
     * @param Firstname
     * @param Middlename
     * @param Lastname
     * @param Mail
     * @param ContactNumber
     * @param jobVacancy
     * @param keyWord
     * @param comment
     * @param dateofApplication
     */


    public static void AddCandidateForms(String Firstname,String Middlename,String Lastname,String Mail,String ContactNumber,String jobVacancy,String keyWord,String comment,String dateofApplication){
        LOGGER.info("Add candidate method display");
        RecruitmentAddCandidate.firstName(Firstname);
        RecruitmentAddCandidate.middleName(Middlename);
        RecruitmentAddCandidate.lastName(Lastname);
        RecruitmentAddCandidate.setEmail(Mail);
        RecruitmentAddCandidate.setContactNum(ContactNumber);
       // RecruitmentAddCandidate.jobVacancy();
        RecruitmentAddCandidate.setjobVacancySelectedOption(jobVacancy);
        RecruitmentAddCandidate.setKeyword(keyWord);
        RecruitmentAddCandidate.setComment(comment);
        RecruitmentAddCandidate.setDateOfApplication(dateofApplication);

    }
}

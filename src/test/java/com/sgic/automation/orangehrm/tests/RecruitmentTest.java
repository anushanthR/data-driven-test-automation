package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.Recruitment;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @PreparedBy ThusyaG
 */
public class RecruitmentTest extends TestBase {
    /**
     * Recruitment
     * Vacancy
     * AddVacancy
     */
    @Test(priority = 0,testName = "AddRecruitmentVacancy")
    public void addRecVacancy(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.setUserName(Constants.LOGIN_USER_NAME);
        LoginPage.serPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickLogin();
        softAssert.assertTrue(Recruitment.isRecruitmentBtnDisplay());
        Recruitment.recruitmentBtnClick();
        softAssert.assertTrue(Recruitment.isVancyBtnDisplay());
        Recruitment.vacancyBtnClick();
        Recruitment.isVacancyAddBtnVerify();
        Recruitment.vacancyAddBtnClick();

        softAssert.assertTrue(Recruitment.isVacancyAddPageVerify());
        softAssert.assertTrue(Recruitment.isDropDownDisplayed(), "DropDown is not Displayed");
        Recruitment.setDropDownOption(Constants.REC_OPTION_1);
        softAssert.assertEquals(Recruitment.getSelectedOption(), Constants.REC_OPTION_1);
        Recruitment.vacancyName();
        Recruitment.hiringManager();
        Recruitment.positionNumber();
        Recruitment.description();
        Recruitment.isSaveBtnVisible();
        Recruitment.saveBtn();
        softAssert.assertAll();
    }

    /**
     * AddCandidate
     */
    @Test(priority = 1,testName = "AddCandidate")
    public void addCandidates(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.setUserName(Constants.LOGIN_USER_NAME);
        LoginPage.serPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickLogin();
        softAssert.assertTrue(Recruitment.isRecruitmentBtnDisplay());
        Recruitment.recruitmentBtnClick();
        softAssert.assertTrue(Recruitment.isCandidateBtnVerify());
        Recruitment.candidateBtnClick();
        softAssert.assertTrue(Recruitment.isCandidatePageDisplay());
        softAssert.assertTrue(Recruitment.isCandidateJobTitleDropDownDisplayed(), "DropDown is not Displayed");
        Recruitment.setCandidateJobTitleSelectedOption(Constants.REC_OPTION_JOB_TITLE);
        softAssert.assertEquals(Recruitment.getCandidateJobTitleSelectedOption(), Constants.REC_OPTION_JOB_TITLE);


    }
}

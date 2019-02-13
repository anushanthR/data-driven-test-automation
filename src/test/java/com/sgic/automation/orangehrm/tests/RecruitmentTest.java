package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.RecruitmentAddCandidate;
import com.sgic.automation.orangehrm.pages.RecruitmentAddVacancy;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



/**
 * @PreparedBy ThusyaG
 */
public class RecruitmentTest extends TestBase {
    /**
     * RecruitmentAddVacancy
     * Vacancy
     * AddVacancy
     */
    @Test(priority = 0,dataProviderClass = RecruitmentData.class,dataProvider = "VacancyAdd",testName = "AddRecruitmentVacancy")
    public void addRecVacancy(String jobTitle,String VacancyName,String HiringManager,String PositionNum,String Description){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.setUserName(Constants.LOGIN_USER_NAME);
        LoginPage.serPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickLogin();
        softAssert.assertTrue(RecruitmentAddVacancy.isRecruitmentBtnDisplay(), "RecruitmentBtn is not Displayed");
        RecruitmentAddVacancy.recruitmentBtnClick();
        softAssert.assertTrue(RecruitmentAddVacancy.isVancyBtnDisplay());
        RecruitmentAddVacancy.vacancyBtnClick();
        RecruitmentAddVacancy.isVacancyAddBtnVerify();
        RecruitmentAddVacancy.vacancyAddBtnClick();

        softAssert.assertTrue(RecruitmentAddVacancy.isVacancyAddPageVerify());
        softAssert.assertTrue(RecruitmentAddVacancy.isJobTitleDropDownDisplayed(),"DropDown not Display");
        RecruitmentAddVacancy.setDropDownOption(jobTitle);
        RecruitmentAddVacancy.vacancyName(VacancyName);
        RecruitmentAddVacancy.hiringManager(HiringManager);
        RecruitmentAddVacancy.positionNumber(PositionNum);
        RecruitmentAddVacancy.isSaveBtnVisible();
        RecruitmentAddVacancy.saveBtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();
    }

    /**
     * AddCandidate
     */
    @Test(priority = 1,dataProviderClass = RecruitmentData.class,dataProvider = "CandidateAdd",testName = "AddRecruitmentCandidate")
    public void addCandidates(String CanJobTitle,String CanVacancy,String CanHiringManager,String CanStatus){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.setUserName(Constants.LOGIN_USER_NAME);
        LoginPage.serPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickLogin();
        softAssert.assertTrue(RecruitmentAddVacancy.isRecruitmentBtnDisplay());
        RecruitmentAddVacancy.recruitmentBtnClick();
        softAssert.assertTrue(RecruitmentAddCandidate.isCandidateBtnVerify());
        RecruitmentAddCandidate.candidateBtnClick();
        softAssert.assertTrue(RecruitmentAddCandidate.isCandidatePageDisplay());
        softAssert.assertTrue(RecruitmentAddCandidate.isCandidateJobTitleDropDownDisplayed(), "DropDown is not Displayed");
        RecruitmentAddCandidate.setCandidateJobTitleSelectedOption(CanJobTitle);
        RecruitmentAddCandidate.setCandidateVacancySelectedOption(CanVacancy);
        RecruitmentAddCandidate.setCandidateHiringManagerSelectedOption(CanHiringManager);
        RecruitmentAddCandidate.setCandidateStatusSelectedOption(CanStatus);


    }
}

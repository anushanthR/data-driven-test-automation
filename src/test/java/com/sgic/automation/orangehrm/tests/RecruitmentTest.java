package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


/**
 * @PreparedBy ThusyaG_
 *
 * RECRUITMENT PAGE_TESTS
 */
public class RecruitmentTest extends TestBase {

  /**
   * RECRUITMENT_ADD VACANCY
   */
  @Test(priority = 0, dataProviderClass = RecruitmentData.class, dataProvider = "VacancyAdd", testName = "AddRecruitmentVacancy")
  public void addRecVacancy(String jobTitle, String VacancyName, String HiringManager,
      String PositionNum, String Description) {

    //softAssert = new SoftAssert();
    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

    softAssert.assertTrue(RecruitmentAddVacancy.isRecruitmentBtnDisplay(),
        "RecruitmentBtn is not Displayed");
    RecruitmentAddVacancy.recruitmentBtnClick();
    softAssert.assertTrue(RecruitmentAddVacancy.isVancyBtnDisplay());
    RecruitmentAddVacancy.vacancyBtnClick();
    RecruitmentAddVacancy.isVacancyAddBtnVerify();
    RecruitmentAddVacancy.vacancyAddBtnClick();

    softAssert.assertTrue(RecruitmentAddVacancy.isVacancyAddPageVerify());
    softAssert
        .assertTrue(RecruitmentAddVacancy.isJobTitleDropDownDisplayed(), "DropDown not Display");
    RecruitmentAddVacancy
        .AddRecruitmentForm(jobTitle, VacancyName, HiringManager, PositionNum, Description);
    RecruitmentAddVacancy.isSaveBtnVisible();
    RecruitmentAddVacancy.saveBtn();
    //DashBoardPage.clickLogoutbtn();
    softAssert.assertAll();
  }
  /**
   * RECRUITMENT_ADD CANDIDATE
   */
  @Test(priority = 1, dataProviderClass = RecruitmentData.class, dataProvider = "CandidateAdd", testName = "AddRecruitmentCandidate")
  public void addCandidates(String Firstname, String Middlename, String Lastname, String Mail,
      String ContactNumber, String jobVacancy, String keyWord, String comment,
      String dateofApplication) {
    softAssert = new SoftAssert();
    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(RecruitmentAddVacancy.isRecruitmentBtnDisplay(),"Recruitment Page is not Displayed");
        RecruitmentAddVacancy.recruitmentBtnClick();
        softAssert.assertTrue(RecruitmentSearchCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
        RecruitmentSearchCandidate.candidateBtnClick();
        softAssert.assertTrue(RecruitmentSearchCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
        softAssert.assertTrue(RecruitmentAddCandidate.addButtonDis(),"Candidate AddBtn is not Verify");
        RecruitmentAddCandidate.AddButtonClick();
        RecruitmentAddCandidate.AddCandidatePage();
        RecruitmentAddCandidate.uploadFile("HRMcv.docx");
        softAssert.assertTrue(RecruitmentAddCandidate.jobVacancy());
        RecruitmentAddCandidate.AddCandidateForms(Firstname, Middlename, Lastname,Mail,ContactNumber,jobVacancy,keyWord,comment,dateofApplication);
        RecruitmentAddCandidate.setSaveBtn();
    }
    /**
     * RECRUITMENT_SEARCH CANDIDATE
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
//    @Test(priority = 2, dataProviderClass = RecruitmentData.class, dataProvider = "CandidateSearch", testName = "SearchRecruitmentCandidate")
//    public void searchCandidates(String CanJobTitle, String CanVacancy, String CanHiringManager, String CanStatus, String CanName, String CanKey, String fromDate, String toDate, String CanMethodApplication) {
//        softAssert = new SoftAssert();
//        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
//        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

  /**
   * RECRUITMENT_SEARCH CANDIDATE
   */
  @Test(priority = 2, dataProviderClass = RecruitmentData.class, dataProvider = "CandidateSearch", testName = "SearchRecruitmentCandidate")
  public void searchCandidates(String CanJobTitle, String CanVacancy, String CanHiringManager,
      String CanStatus, String CanName, String CanKey, String fromDate, String toDate,
      String CanMethodApplication) {
    softAssert = new SoftAssert();
    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);


    softAssert.assertTrue(RecruitmentAddVacancy.isRecruitmentBtnDisplay());
    RecruitmentAddVacancy.recruitmentBtnClick();
    softAssert.assertTrue(RecruitmentSearchCandidate.isCandidateBtnVerify());
    RecruitmentSearchCandidate.candidateBtnClick();
    softAssert.assertTrue(RecruitmentSearchCandidate.isCandidatePageDisplay());
    softAssert.assertTrue(RecruitmentSearchCandidate.isCandidateJobTitleDropDownDisplayed(),
        "DropDown is not Displayed");
    RecruitmentSearchCandidate
        .RecruitmentCanSearchForm(CanJobTitle, CanVacancy, CanHiringManager, CanStatus, CanName,
            CanKey, fromDate, toDate, CanMethodApplication);

  }


}
package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.RecruitmentData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;




/**
 * RECRUITMENT PAGE_TESTS
 * @author Thusya
 */
public class RecruitmentTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(RecruitmentTest.class);

    /**
     * RECRUITMENT_ADD VACANCY
     */
  @Test(priority = 0,groups = "REGRESSION", dataProviderClass = RecruitmentData.class, dataProvider = "AddVacancy", testName = "AddRecruitmentVacancy")
  public void addRecruitmentVacancyTest(String jobTitle, String VacancyName, String HiringManager,
                                    String PositionNum, String Description) {
      extentTest =extentReport.startTest("AddRecruitmentVacancy");
    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);


    softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
        "RecruitmentBtn is not Displayed");
    AddRecruitmentVacancy.recruitmentBtnClick();
      extentTest.log(LogStatus.PASS, "recruitment Button Click");
    softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
    AddRecruitmentVacancy.vacancyBtnClick();
      extentTest.log(LogStatus.PASS, "Vacancy Button Click");
    AddRecruitmentVacancy.isVacancyAddBtnVerify();
      extentTest.log(LogStatus.PASS, "Vacancy Add Button Verify");
    AddRecruitmentVacancy.vacancyAddBtnClick();
      extentTest.log(LogStatus.PASS, "Vacancy Add Button Click");
    softAssert.assertTrue(AddRecruitmentVacancy.isVacancyAddPageVerify());
    softAssert.assertTrue(AddRecruitmentVacancy.isJobTitleDropDownDisplayed(), "DropDown not Display");
      extentTest.log(LogStatus.PASS, "Vacancy Add Page Verify");
      extentTest.log(LogStatus.PASS, "jobtitle = " +jobTitle+"vacancy name = " + VacancyName+"hiringmanager = "+HiringManager+"position num = "+PositionNum+"description ="+Description);
    AddRecruitmentVacancy.AddRecruitmentVacancyForm(jobTitle, VacancyName, HiringManager, PositionNum, Description);
    AddRecruitmentVacancy.isSaveBtnVisible();
      extentTest.log(LogStatus.PASS, "Vacancy save Button verify");
    AddRecruitmentVacancy.saveBtn();
      extentTest.log(LogStatus.PASS, "Vacancy save button click");
      extentReport.endTest(extentTest);
    softAssert.assertAll();

  }
  /**
   * RECRUITMENT_ADD CANDIDATE
   */
  @Test(priority = 1, dataProviderClass = RecruitmentData.class, dataProvider = "AddCandidate", testName = "AddRecruitmentCandidate")
  public void addCandidates(String Firstname, String Middlename, String Lastname, String Mail,
      String ContactNumber, String jobVacancy, String keyWord, String comment,
      String dateofApplication) {
    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);
      extentTest.log(LogStatus.PASS, " Login worked");
    softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),"Recruitment Page is not Displayed");
    AddRecruitmentVacancy.recruitmentBtnClick();
      extentTest.log(LogStatus.PASS, " Recruitment button worked");
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
    SearchRecruitmentCandidate.candidateBtnClick();
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
    softAssert.assertTrue(AddRecruitmentCandidate.addButtonDis(),"Candidate AddBtn is not Verify");
    AddRecruitmentCandidate.AddButtonClick();
    AddRecruitmentCandidate.AddCandidatePage();
    AddRecruitmentCandidate.uploadFile("HRMcv.docx");
      extentTest.log(LogStatus.PASS, " Recruitment file upload");
    softAssert.assertTrue(AddRecruitmentCandidate.jobVacancy());
    AddRecruitmentCandidate.dateclear();
      extentTest.log(LogStatus.PASS, "FirstName = "+Firstname+"Middle Name = "+Middlename+"Last Name = "+Lastname);
    AddRecruitmentCandidate.AddCandidateForms(Firstname, Middlename, Lastname,Mail,ContactNumber,jobVacancy,keyWord,comment,dateofApplication);
    AddRecruitmentCandidate.setSaveBtn();
      extentReport.endTest(extentTest);
    //DashBoardPage.clickLogoutbtn();
    }
    /**
     * RECRUITMENT_SEARCH CANDIDATE test
     */

  @Test(priority = 2, dataProviderClass = RecruitmentData.class, dataProvider = "SearchCandidate", testName = "SearchRecruitmentCandidate")
  public void searchCandidates(String CanJobTitle, String CanVacancy, String CanHiringManager,
      String CanStatus, String CanName, String CanKey, String fromDate, String toDate,
      String CanMethodApplication) {

      extentTest =extentReport.startTest("Search Recruitment Candidate");

    softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
    LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

    softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay());
    AddRecruitmentVacancy.recruitmentBtnClick();
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify());
    SearchRecruitmentCandidate.candidateBtnClick();
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay());
    softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateJobTitleDropDownDisplayed(),
        "DropDown is not Displayed");
    SearchRecruitmentCandidate
        .RecruitmentCandidateSearchForm(CanJobTitle, CanVacancy, CanHiringManager, CanStatus, CanName,
            CanKey, fromDate, toDate, CanMethodApplication);
  }

  @Test(priority = 3, dataProviderClass = RecruitmentData.class, dataProvider = "SearchVacancy", testName = "SearchRecruitmentVacancy")
  public void searchRecruitmentVacancy(String SearchJobtitle,String SearchJobvacancy,String SearchhiringManager,String vacancySearch_Status){
      softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
      LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

      softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(), "RecruitmentBtn is not Displayed");
      AddRecruitmentVacancy.recruitmentBtnClick();
      softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
      AddRecruitmentVacancy.vacancyBtnClick();
      softAssert.assertTrue(SearchRecruitmentVacancy.VacancySearch_jobTitle_Display());
      softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_jobVacancy_Display());
      softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_hiringManager_Display());
      softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_Status());

      SearchRecruitmentVacancy.searchRecruitmentVacancyForm(SearchJobtitle,SearchJobvacancy,SearchhiringManager,vacancySearch_Status);
      softAssert.assertTrue(SearchRecruitmentVacancy.vacancySearch_button_verify());
      SearchRecruitmentVacancy.VacancySearch_button_Click();
  }
    @Test(priority = 6,  testName = "DeleteRecruitmentVacancy")
    public void deleteRecruitmentVacancy() {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);


        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
        AddRecruitmentVacancy.vacancyBtnClick();
        softAssert.assertTrue(DeleteRecruitmentVacancy.isRecruitmentdeleteCBoxDisplay());
        DeleteRecruitmentVacancy.recruitmentdeleteCBoxClick();
        softAssert.assertTrue(DeleteRecruitmentVacancy.isRecruitmentdeleteBtnDisplay());
        DeleteRecruitmentVacancy.recruitmentdeleteBtnClick();
       // softAssert.assertTrue(DeleteRecruitmentVacancy.setPopupHeading(),"delete alert not displayed");
        DeleteRecruitmentVacancy.setOkBtn();


        //DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }

    @Test(priority = 7,  testName = "DeleteCandidate")
    public void deleteCandidate() {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);


        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
        SearchRecruitmentCandidate.candidateBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
        softAssert.assertTrue(DeleteRecruitmentCandidate.isCandidatedeleteCBoxDisplay());
        DeleteRecruitmentCandidate.candidate_deleteCBoxClick();
        softAssert.assertTrue(DeleteRecruitmentCandidate.isCandidatedeleteBtnDisplay());
        DeleteRecruitmentCandidate.recruitmentdeleteBtnClick();
        // softAssert.assertTrue(DeleteRecruitmentVacancy.setPopupHeading(),"delete alert not displayed");
        softAssert.assertTrue(DeleteRecruitmentCandidate.okBtnVerify());
        DeleteRecruitmentCandidate.setOkBtn();
       // DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();
    }

    @Test(priority = 4, dataProviderClass = RecruitmentData.class, dataProvider = "EditVacancy", testName = "EditRecruitmentVacancy")
    public void editRecruitmentVacancy(String jobTitle, String VacancyName, String HiringManager,
                                             String PositionNum, String Description) {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),
                "RecruitmentBtn is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(AddRecruitmentVacancy.isVancyBtnDisplay());
        AddRecruitmentVacancy.vacancyBtnClick();
       // softAssert.assertTrue(EditRecruitmentVacancy.isVacancyEditPageVerify());
        softAssert.assertTrue(EditRecruitmentVacancy.isVacancyEditlinkVerify());
        EditRecruitmentVacancy.vacancyEditLinkClick();
        softAssert.assertTrue(EditRecruitmentVacancy.isVacancyEditBtnVerify());
        EditRecruitmentVacancy.vacancyEditBtnClick();
        softAssert.assertTrue(EditRecruitmentVacancy.isJobTitleDropDownDisplayed(), "DropDown not Display");
        EditRecruitmentVacancy.AddRecruitmentVacancyForm(jobTitle, VacancyName, HiringManager, PositionNum, Description);
        EditRecruitmentVacancy.isSaveBtnVisible();
        EditRecruitmentVacancy.saveBtn();
        //softAssert.assertTrue(EditRecruitmentVacancy.isAddDataVisible());
        //EditRecruitmentVacancy.isAddDataVisible();
        //DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }

    @Test(priority = 5, dataProviderClass = RecruitmentData.class, dataProvider = "EditCandidate", testName = "EditRecruitmentCandidate")
    public void editCandidates(String Firstname, String Middlename, String Lastname, String Mail,
                              String ContactNumber, String jobVacancy, String keyWord, String comment,
                              String dateofApplication) {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(AddRecruitmentVacancy.isRecruitmentBtnDisplay(),"Recruitment Page is not Displayed");
        AddRecruitmentVacancy.recruitmentBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidateBtnVerify(),"CandidateBtn is not Verify");
        SearchRecruitmentCandidate.candidateBtnClick();
        softAssert.assertTrue(SearchRecruitmentCandidate.isCandidatePageDisplay(),"Candidate Page is not Displayed");
        softAssert.assertTrue(EditRecruitmentCandidate.EditLinkLVerify());
        EditRecruitmentCandidate.setEditCandidateLink();
        EditRecruitmentCandidate.setEditCanBtn();

        AddRecruitmentCandidate.uploadFile("HRMcv.docx");
        softAssert.assertTrue(AddRecruitmentCandidate.jobVacancy());
        AddRecruitmentCandidate.dateclear();
        AddRecruitmentCandidate.AddCandidateForms(Firstname, Middlename, Lastname,Mail,ContactNumber,jobVacancy,keyWord,comment,dateofApplication);
        AddRecruitmentCandidate.setSaveBtn();
        //DashBoardPage.clickLogoutbtn();
    }
}
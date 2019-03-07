package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Orang_Hrm_Systems_TitlePage extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Orang_Hrm_Systems_TitlePage.class);

//    @Test(priority = 3, dataProvider = "JobTitleSave", dataProviderClass = JobTitleData.class)
//    public void SaveJobTitleTest(String JjobTitle,String JobDecription,String Notes) {
//        softAssert = new SoftAssert();
//        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
//        LOGGER.info("DashBoardPage is displayed");
//
//        AdminMenuPage.clickAdmin();
//        AdminMenuPage.clickJobMenu();
//        AdminMenuPage.clickJobTitle();
//        softAssert.assertTrue(Jtitle.isDisplayTitleHeader(), "Job Title is not Displayed");
//        extentTest=extentReport.startTest("TitleSave");
////
//        Jtitle.ClickAddButton();
//        PageBase.implicitWait(2);
//        softAssert.assertTrue(Jtitle.isDisplayAddJobTitleHeader(), "JobAdd  Title is not Displayed");
//        Jtitle.setJobTitle(JjobTitle);
//        Jtitle.setJobDescription(JobDecription);
//        Jtitle.setNote(Notes);
//        Jtitle.ClickButtonSave();
//        Jtitle.ClickCheckBox();
//        Jtitle.ClickDeleteButton();
//        Jtitle.ClickConForomOk();
//        extentTest.log(LogStatus.PASS, " OrangeHRM JobTitle Add Success: ");
//        extentReport.endTest(extentTest);
//        softAssert.assertAll();
//
//
//    }
    @Test(groups = "REGRESSION", priority = 2)
    public void SavePay_GradesTest() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest("Pay_Grades Page");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickJobMenu();
        AdminMenuPage.clickJPayGrades();
        softAssert.assertTrue(Pay_Grades.isDisplayTitleHeader(), "PayGrades Page Title is not Displayed");
        Pay_Grades.ClickAddButton();
        Pay_Grades.setname(Constants.OrgUserName);
        Pay_Grades.ClickButtonSave();
        extentTest.log(LogStatus.PASS, " OrangeHRM Pay_Grades Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();



    }
    @Test(groups = "REGRESSION", priority = 2)
    public void gEmployee_Satatus_Save() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest("Employee_Satatus_Save");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickJobMenu();
        AdminMenuPage.clickEmployeeStatus();
//        softAssert.assertTrue(Employment_Status.isDisplayEmployee_Status_Header(), "Employment_Status Page Title is not Displayed");
        Employment_Status.ClickAddButton();
        Employment_Status.setEmployment_Status(Constants.Employeename);
        Employment_Status.ClickButtonSave();

        extentTest.log(LogStatus.PASS, " OrangeHRM EmployeeStatus Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION", priority = 2)
    public void TestJobCategory() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add JobCategory");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickJobMenu();
        AdminMenuPage.clickJobCategories();
//        softAssert.assertTrue(Employment_Status.isDisplayEmployee_Status_Header(), "Employment_Status Page Title is not Displayed");
        JobCategory.ClickAddButton();
        JobCategory.setjobCategory_name(Constants.JobCatery);
        JobCategory.ClickButtonSave();
        JobCategory.ClickCheckBox();
        JobCategory.ClickDeleteButton();
        JobCategory.ClickConForomOk();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add Job Category Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION", priority = 2)
    public void TestsaveSkill() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add Skill");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuSkills();
        Skills.ClickAddButton();
        Skills.setjobCategory_name(Constants.Name);
        Skills.setDescription(Constants.Description);
        Skills.ClicksaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add Job Category Add Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION", priority = 2)
    public void TestsaveEducation() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add Education");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuEducation();
        Skills.ClickAddButton();
        Education.setname(Constants.Name);
        Education.ClickSaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add Education Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION", priority = 2)
    public void TestsaveLicense() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add License");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuLicenses();
        Add_License.ClickAddButton();
        Add_License.setname(Constants.Name);
        Add_License.ClickSaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add Languages Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION", priority = 8)
    public void TestMembership() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add Membership");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuMembership();
        Memberships.ClickAddButton();
        Memberships.setname(Constants.Name);
        Memberships.ClickSaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add ClickMenuMembership Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION", priority = 9)
    public void TestNationality() {
        softAssert = new SoftAssert();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest(" Add Membership");
        AdminMenuPage.clickAdmin();
        AdminMenuPage.clickMenuQualifications();
        AdminMenuPage.ClickMenuNationalities();
        Nationalities.ClickAddButton();
        Nationalities.setname(Constants.Nationality);
        Nationalities.ClickSaveButton();
        extentTest.log(LogStatus.PASS, " OrangeHRM Add CNationality Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();

    }

}

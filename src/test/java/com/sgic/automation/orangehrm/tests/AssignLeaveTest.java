package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.AssignLeaveData;
import com.sgic.automation.orangehrm.pages.AssignLeave;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class AssignLeaveTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AssignLeaveTest.class);

    @Test( priority = 15,groups = "REGRESSION",dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeaveFullDay",testName = "Assign New Full Day Leave")
    public void AssignFullDayLeave(String employeeName, String leaveType,String fromDate,String toDate,String specificDuration,String comment) {
        extentTest=extentReport.startTest("Assign Leave");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        AssignLeave.clickMenuAssignLeave();
        LOGGER.info("Assign Leave Menu Clicked");
        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
        AssignLeave.AssignFullDayLeaveData(employeeName,leaveType,fromDate,toDate,specificDuration,comment);

        LOGGER.info("Assign button is Clicked");
        //softAssert.assertTrue(AssignLeave.isConfirmationPopoupDisplayed(),"not displayed");
//        LOGGER.info("Assign Leave confirmation message Displyed");
//        AssignLeave.clickOkbtn();
//        LOGGER.info("Ok button Clicked");
        extentTest.log(LogStatus.PASS, "Leave has Sucessfully Assigned");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 16,groups = "REGRESSION",dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeaveHalfDay",testName = "Assign New Half Day Leave")
    public void AssignLeaveHalfDay(String employeeName, String leaveType,String fromDate,String toDate,String specificDuration,String specificTime,String comment) {
        extentTest=extentReport.startTest("Assign Leave");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        AssignLeave.clickMenuAssignLeave();
        LOGGER.info("Assign Leave Menu Clicked");
        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
        AssignLeave.AssignLeaveHalfDayData(employeeName,leaveType,fromDate,toDate,specificDuration,specificTime,comment);

        LOGGER.info("Assign button is Clicked");
//        softAssert.assertTrue(AssignLeave.isConfirmationPopoupDisplayed());
//        LOGGER.info("Assign Leave confirmation message Displyed");
//        AssignLeave.clickOkbtn();
//        LOGGER.info("Ok button Clicked");
        extentTest.log(LogStatus.PASS, "Leave has Sucessfully Assigned");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 17,groups = "REGRESSION",dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeaveSpecificTime",testName = "Assign New Leave for a Specific Time Period")
    public void AssignLeaveSpecificTime(String employeeName, String leaveType,String fromDate,String toDate,String specificDuration,String specifictimeFrom,String specifictimeTo,String comment) {
        extentTest=extentReport.startTest("Assign Leave");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        AssignLeave.clickMenuAssignLeave();
        LOGGER.info("Assign Leave Menu Clicked");
        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
        AssignLeave.AssignLeaveSpecificTimeData(employeeName,leaveType,fromDate,toDate,specificDuration,specifictimeFrom,specifictimeTo,comment);
      //  AssignLeave.clickAssignBtn();
        LOGGER.info("Assign button is Clicked");
//        softAssert.assertTrue(AssignLeave.isConfirmationPopoupDisplayed());
//        LOGGER.info("Assign Leave confirmation message Displyed");
//        AssignLeave.clickOkbtn();
//        LOGGER.info("Ok button Clicked");
        extentTest.log(LogStatus.PASS, "Leave has Sucessfully Assigned");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
//    @Test( priority = 18,groups = "REGRESSION",dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeaveFullDay",testName = "Assign New Leave Cancel")
//    public void AssignLeaveCancel(String employeeName, String leaveType,String fromDate,String toDate,String specificDuration,String comment) {
//        extentTest=extentReport.startTest("Assign Leave Cancel");
//        LOGGER.info("Login page is displayed");
//        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
//        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
//        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
//        LOGGER.info("DashBoardPage is displayed");
//        LeavePeriod.clickLeaveModule();
//        LOGGER.info("Leave Menu Clicked");
//        AssignLeave.clickMenuAssignLeave();
//        LOGGER.info("Assign Leave Menu Clicked");
//        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
//        AssignLeave.AssignFullDayLeaveData(employeeName,leaveType,fromDate,toDate,specificDuration,comment);
//        AssignLeave.clickAssignBtn();
//        LOGGER.info("Assign Button Clicked");
//        PageBase.implicitWait(3);
//        softAssert.assertTrue(AssignLeave.isConfirmationPopoupDisplayed(),"Assign Leave Confiramation message is not Displyed");
//        LOGGER.info("Confiramation Message is Verified");
//        AssignLeave.clickCancelbtn();
//        LOGGER.info("Cancel Button Clicked");
//        extentTest.log(LogStatus.PASS, "Leave Assigned has Sucessfully  Cancelled");
//        extentReport.endTest(extentTest);
//        softAssert.assertAll();
//    }
}

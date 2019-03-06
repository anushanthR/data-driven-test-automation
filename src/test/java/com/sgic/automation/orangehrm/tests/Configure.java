package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.*;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @Author Thanushan
 */
public class Configure extends TestBase{
    private static final Logger LOGGER = Logger.getLogger(Configure.class);

    //Edit Leave Period
    @Test( priority = 1,dataProviderClass = LeavePeriodData.class,dataProvider = "LeavePeriod",testName = "Leave Entitlements and Usage Report")
    public void leavePeriod(String leavePeriodStartMonth, String leavePeriodStartDate){
        extentTest=extentReport.startTest("Edit Leave Period");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Module Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickMenuLeavePeriod();
        softAssert.assertTrue(LeavePeriod.isLeavePeriodDisplay(),"Edit Leave Period not Displayed");
        LeavePeriod.clickBtnEdit();
        LeavePeriod.EditLeavePeriod(leavePeriodStartMonth,leavePeriodStartDate);
        LeavePeriod.clickbtnSave();
        extentTest.log(LogStatus.PASS, "Leave period Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    //Add New Leave type
    @Test( priority = 2,dataProviderClass = LeaveTypeData.class,dataProvider = "LeaveType",testName = "Leave Entitlements and Usage Report")
    public void addLeaveType(String LeaveTypeName){
        extentTest=extentReport.startTest("Add Leave Type");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LeaveTypes.clickMenuLeaveType();
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Add Leave Type");
        LeaveTypes.clickLeaveTypeBtnAdd();
        LeaveTypes.AddLeaveType(LeaveTypeName);
        LeaveTypes.clickLeaveTypeAddSave();
        extentTest.log(LogStatus.PASS, "Leave Type Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 3,testName = "Delete Leave Type")
    public void DeleteLeaveType(){
        extentTest=extentReport.startTest("Delete Leave Type");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LeaveTypes.clickMenuLeaveType();
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Delete Leave Type not Displayed");
        LeaveTypes.clickLeaveTypeCheckbox();
        LeaveTypes.clickLeaveTypeBtnDelete();
        softAssert.assertTrue(LeaveTypes.isleaveTypeDeleteConfirmationDisplay(),"Delete Leave Type Confirmation Popup");
        LeaveTypes.clickLeaveTypeDeleteConfirmationOk();
        extentTest.log(LogStatus.PASS, "Leave Type Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 4,testName = "Delete Leave Type Confirmation Cancel")
    public void DeleteLeaveTypeCancel(){
        extentTest=extentReport.startTest("Delete Leave Type Confirmation Cancel");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LeaveTypes.clickMenuLeaveType();
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Delete Leave Type");
        LeaveTypes.clickLeaveTypeCheckbox2();
        LeaveTypes.clickLeaveTypeBtnDelete();
        softAssert.assertTrue(LeaveTypes.isleaveTypeDeleteConfirmationDisplay(),"Delete Leave Type Confirmation popup ");
        LeaveTypes.clickLeaveTypeDeleteConfirmationCancel();
        extentTest.log(LogStatus.PASS, "Leave Type delete Sucessfully Cancelled");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 5,dataProviderClass = WorkWeekData.class,dataProvider = "WorkWeek",testName = "Edit Work Week")
    public void EditWorkWeek(String workWeekMonday,String workWeekTuesday,String workWeekWednesday,String workWeekThursday,String workWeekFriday,String workWeekSaturday,String workWeekSunday){
        extentTest=extentReport.startTest("Edit Work Week");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        WorkWeek.clickMenuEditWorkWeek();
        softAssert.assertTrue(WorkWeek.iseditWorkWeekHeaderDisplay(),"Edit Work Week page Not Displayed");
        WorkWeek.clickeditBtn();
        WorkWeek.WorkWeek(workWeekMonday,workWeekTuesday,workWeekWednesday,workWeekThursday,workWeekFriday,workWeekSaturday,workWeekSaturday);
        WorkWeek.clickSaveBtn();
        extentTest.log(LogStatus.PASS, "Work Wekk Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 6,dataProviderClass = HolidayData.class,dataProvider = "AddHoliday",testName = "Add Holiday")
    public void AddHoliday(String addHolidayName, String calenderDate,String addHolidayLength){
        extentTest=extentReport.startTest("Add New Holiday");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        Holidays.clickMenuHoliday();
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.clickBtnAdd();
        softAssert.assertTrue(Holidays.isAddHolidayHeaderDisplay(),"Add Holiday page not displayed");
        Holidays.AddHolidays(addHolidayName,calenderDate,addHolidayLength);
        Holidays.clickBtnSave();
        PageBase.staticWait(3);
        extentTest.log(LogStatus.PASS, "Holiday Sucessfully Added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 7,dataProviderClass = HolidayData.class,dataProvider = "SearchHoliday",testName = "Search Holiday")
    public void SearchHoliday(String calFromDate, String calToDate){
        extentTest=extentReport.startTest("Search Holiday Details");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        Holidays.clickMenuHoliday();
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.SearchHolidays(calFromDate,calToDate);
        Holidays.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Holiday Details Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 8,dataProviderClass = HolidayData.class,dataProvider = "SearchHoliday",testName = "Search Holiday")
    public void DeleteHoliday(String calFromDate, String calToDate){
        extentTest=extentReport.startTest("Delete Holiday");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        Holidays.clickMenuHoliday();
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.SearchHolidays(calFromDate,calToDate);
        Holidays.clickBtnSearch();
        Holidays.clickDeleteCheckBoxClick();
        Holidays.clickBtnDelete();
        Holidays.isDeleteHolidayConfirmationHeaderDisplay();
        Holidays.clickDeleteHolidayOk();
        extentTest.log(LogStatus.PASS, "Holiday detail is Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 9,dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeave",testName = "Assign New Leave")
    public void AssignLeave(String employeeName, String leaveType,String fromDate,String toDate,String duration,String comment) {
        extentTest=extentReport.startTest("Assign Leave");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        LeavePeriod.clickLeaveModule();
        AssignLeave.clickMenuAssignLeave();
        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
        AssignLeave.AssignLeaveData(employeeName,leaveType,fromDate,toDate,duration,comment);
        AssignLeave.clickAssignBtn();
        AssignLeave.isConfirmationPopoupDisplayed();
        AssignLeave.clickOkbtn();
        extentTest.log(LogStatus.PASS, "Leave has Sucessfully Assigned");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 10,dataProviderClass = AssignLeaveData.class,dataProvider = "AssignLeave",testName = "Assign New Leave Cancel")
    public void AssignLeaveCancel(String employeeName, String leaveType,String fromDate,String toDate,String duration,String comment) {
        extentTest=extentReport.startTest("Assign Leave Cancel");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        AssignLeave.clickMenuAssignLeave();
        softAssert.assertTrue(AssignLeave.isAssignLeaveHeaderDisplayed(), "Assign Leave Not Displayed");
        AssignLeave.AssignLeaveData(employeeName,leaveType,fromDate,toDate,duration,comment);
        AssignLeave.clickAssignBtn();
        PageBase.implicitWait(3);
        AssignLeave.isConfirmationPopoupDisplayed();
        AssignLeave.clickCancelbtn();
        extentTest.log(LogStatus.PASS, "Leave Assigned has Sucessfully  Cancelled");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}

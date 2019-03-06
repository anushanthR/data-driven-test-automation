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
    @Test( priority = 7,groups = "REGRESSION",dataProviderClass = LeavePeriodData.class,dataProvider = "LeavePeriod",testName = "Leave Entitlements and Usage Report")
    public void leavePeriod(String leavePeriodStartMonth, String leavePeriodStartDate){
        extentTest=extentReport.startTest("Edit Leave Period");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        LeavePeriod.clickMenuLeavePeriod();
        LOGGER.info("Leave Period Menu Clicked");
        softAssert.assertTrue(LeavePeriod.isLeavePeriodDisplay(),"Edit Leave Period not Displayed");
        LeavePeriod.clickBtnEdit();
        LOGGER.info("Edit Button Clicked");
        LeavePeriod.EditLeavePeriod(leavePeriodStartMonth,leavePeriodStartDate);
        LeavePeriod.clickbtnSave();
        LOGGER.info("Save Button Clicked");
        extentTest.log(LogStatus.PASS, "Leave period Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    //Add New Leave type
    @Test( priority = 8,groups = "REGRESSION",dataProviderClass = LeaveTypeData.class,dataProvider = "LeaveType",testName = "Leave Entitlements and Usage Report")
    public void addLeaveType(String LeaveTypeName){
        extentTest=extentReport.startTest("Add Leave Type");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        LeaveTypes.clickMenuLeaveType();
        LOGGER.info("Leave Type Menu Clicked");
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Add Leave Type");
        LeaveTypes.clickLeaveTypeBtnAdd();
        LOGGER.info("Add button Clicked");
        LeaveTypes.AddLeaveType(LeaveTypeName);
        LOGGER.info("Add Leave Type Name Entered");
        LeaveTypes.clickLeaveTypeAddSave();
        LOGGER.info("Save button Clicked");
        extentTest.log(LogStatus.PASS, "Leave Type Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 9,groups = "REGRESSION",testName = "Delete Leave Type")
    public void DeleteLeaveType(){
        extentTest=extentReport.startTest("Delete Leave Type");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        LeaveTypes.clickMenuLeaveType();
        LOGGER.info("Leave Type Menu Clicked");
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Delete Leave Type not Displayed");
        LeaveTypes.clickLeaveTypeCheckbox();
        LOGGER.info("Leave Type Checkbox Clicked");
        LeaveTypes.clickLeaveTypeBtnDelete();
        LOGGER.info("Leave Type Delete Button Clicked");
        softAssert.assertTrue(LeaveTypes.isleaveTypeDeleteConfirmationDisplay(),"Delete Leave Type Confirmation Popup");
        LeaveTypes.clickLeaveTypeDeleteConfirmationOk();
        LOGGER.info("Confirmation Ok Button Clicked");
        extentTest.log(LogStatus.PASS, "Leave Type Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test( priority = 10,groups = "REGRESSION",testName = "Delete Leave Type Confirmation Cancel")
    public void DeleteLeaveTypeCancel(){
        extentTest=extentReport.startTest("Delete Leave Type Confirmation Cancel");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        LeaveTypes.clickMenuLeaveType();
        LOGGER.info("Leave Type Menu Clicked");
        softAssert.assertTrue(LeaveTypes.isLeaveTypeHeaderDisplay(),"Delete Leave Type");
        LeaveTypes.clickLeaveTypeCheckbox2();
        LOGGER.info("Leave Type Checkbox Clicked");
        LeaveTypes.clickLeaveTypeBtnDelete();
        LOGGER.info("Leave Type Delete Button Clicked");
        softAssert.assertTrue(LeaveTypes.isleaveTypeDeleteConfirmationDisplay(),"Delete Leave Type Confirmation popup ");
        LeaveTypes.clickLeaveTypeDeleteConfirmationCancel();
        LOGGER.info("Delete Confiramation cancel button Clicked");
        extentTest.log(LogStatus.PASS, "Leave Type delete Sucessfully Cancelled");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority =11,groups = "REGRESSION",dataProviderClass = WorkWeekData.class,dataProvider = "WorkWeek",testName = "Edit Work Week")
    public void EditWorkWeek(String workWeekMonday,String workWeekTuesday,String workWeekWednesday,String workWeekThursday,String workWeekFriday,String workWeekSaturday,String workWeekSunday){
        extentTest=extentReport.startTest("Edit Work Week");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        WorkWeek.clickMenuEditWorkWeek();
        LOGGER.info("Edit work week Menu Clicked");
        softAssert.assertTrue(WorkWeek.iseditWorkWeekHeaderDisplay(),"Edit Work Week page Not Displayed");
        WorkWeek.clickeditBtn();
        LOGGER.info("Edit button Clicked");
        WorkWeek.WorkWeek(workWeekMonday,workWeekTuesday,workWeekWednesday,workWeekThursday,workWeekFriday,workWeekSaturday,workWeekSaturday);
        WorkWeek.clickSaveBtn();
        LOGGER.info("Save button Clicked");
        extentTest.log(LogStatus.PASS, "Work Wekk Sucessfully Edited");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 12,groups = "REGRESSION",dataProviderClass = HolidayData.class,dataProvider = "AddHoliday",testName = "Add Holiday")
    public void AddHoliday(String addHolidayName, String calenderDate,String addHolidayLength){
        extentTest=extentReport.startTest("Add New Holiday");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Module Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        Holidays.clickMenuHoliday();
        LOGGER.info("Holiday Menu Clicked");
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.clickBtnAdd();
        LOGGER.info("Add button Clicked");
        softAssert.assertTrue(Holidays.isAddHolidayHeaderDisplay(),"Add Holiday page not displayed");
        Holidays.AddHolidays(addHolidayName,calenderDate,addHolidayLength);
        Holidays.clickBtnSave();
        LOGGER.info("Save button Clicked");
        PageBase.staticWait(3);
        extentTest.log(LogStatus.PASS, "Holiday Sucessfully Added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 13,groups = "REGRESSION",dataProviderClass = HolidayData.class,dataProvider = "SearchHoliday",testName = "Search Holiday")
    public void SearchHoliday(String calFromDate, String calToDate){
        extentTest=extentReport.startTest("Search Holiday Details");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeavePeriod.clickLeaveModule();
        LOGGER.info("Leave Module Menu Clicked");
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Leave Configure Menu Clicked");
        Holidays.clickMenuHoliday();
        LOGGER.info("Leave Holiday Menu Clicked");
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.SearchHolidays(calFromDate,calToDate);
        Holidays.clickBtnSearch();
        LOGGER.info("Search Button Clicked");
        extentTest.log(LogStatus.PASS, "Holiday Details Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    @Test( priority = 14,groups = "REGRESSION",dataProviderClass = HolidayData.class,dataProvider = "SearchHoliday",testName = "Search Holiday")
    public void DeleteHoliday(String calFromDate, String calToDate){
        extentTest=extentReport.startTest("Delete Holiday");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");        LeavePeriod.clickLeaveModule();
        LeavePeriod.clickMenuConfigure();
        LOGGER.info("Configure Menu Clicked");
        Holidays.clickMenuHoliday();
        LOGGER.info("Holiday Menu Clicked");
        softAssert.assertTrue(Holidays.isholidayInformationHeaderDisplay(),"Holiday page not displyed");
        Holidays.SearchHolidays(calFromDate,calToDate);
        Holidays.clickBtnSearch();
        LOGGER.info("Search Button Clicked");
        Holidays.clickDeleteCheckBoxClick();
        LOGGER.info("Delete Check box Clicked");
        Holidays.clickBtnDelete();
        LOGGER.info("Delete Button Clicked");
        softAssert.assertTrue(Holidays.isDeleteHolidayConfirmationHeaderDisplay(),"Delete Holiday Confiramation message not displayed");
        LOGGER.info("Leave Type Menu Clicked");
        Holidays.clickDeleteHolidayOk();
        LOGGER.info("Ok button is Clicked");
        extentTest.log(LogStatus.PASS, "Holiday detail is Sucessfully Deleted");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }


}

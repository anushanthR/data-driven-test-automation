package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.DatePickerData;
import com.sgic.automation.orangehrm.TestData.PerformanceTestData;
import com.sgic.automation.orangehrm.pages.AttendanceRecordPage;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.TimePage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;


public class AttendanceRecordWithDatePickerTest extends TestBase {


    @Test(priority = 0,dataProviderClass = DatePickerData.class,dataProvider = "AttendanceRecord")
    public void attendanceRecordSelectDate(String employeeName){
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.isLoginPageDisplay();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(), "Dashboard Page is not Displayed");
        DashBoardPage.clickTime();
        softAssert.assertTrue(TimePage.isTimeDisplayed(), "Time Page is not Displayed");
        TimePage.clickAttendance();
        TimePage.clickAttendanceRecord();
        AttendanceRecordPage.isAttendanceRecordDisplayed();
        AttendanceRecordPage.viewAttendanceRecord(employeeName);
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();

        softAssert.assertAll();
    }
    @Test(priority = 1,dataProviderClass = DatePickerData.class,dataProvider = "AttendanceRecord")
    public void attendanceRecordSelectMonth(String employeeName){
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.isLoginPageDisplay();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(), "Dashboard Page is not Displayed");
        DashBoardPage.clickTime();
        softAssert.assertTrue(TimePage.isTimeDisplayed(), "Time Page is not Displayed");
        TimePage.clickAttendance();
        TimePage.clickAttendanceRecord();
        AttendanceRecordPage.isAttendanceRecordDisplayed();
        AttendanceRecordPage.viewAttendanceRecord1WithChangeMonth(employeeName);
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();

        softAssert.assertAll();
    }

    @Test(priority = 1,dataProviderClass = DatePickerData.class,dataProvider = "AttendanceRecord")
    public void attendanceRecordSelectYear(String employeeName){
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.isLoginPageDisplay();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(), "Dashboard Page is not Displayed");
        DashBoardPage.clickTime();
        softAssert.assertTrue(TimePage.isTimeDisplayed(), "Time Page is not Displayed");
        TimePage.clickAttendance();
        TimePage.clickAttendanceRecord();
        AttendanceRecordPage.isAttendanceRecordDisplayed();
        AttendanceRecordPage.viewAttendanceRecord1WithChangeYear(employeeName);
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();
    }

}

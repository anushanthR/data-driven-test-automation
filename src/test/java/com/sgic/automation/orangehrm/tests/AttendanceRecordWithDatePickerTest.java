package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.DatePickerData;
import com.sgic.automation.orangehrm.TestData.PerformanceTestData;
import com.sgic.automation.orangehrm.pages.AttendanceRecordPage;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.TimePage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;

/**
 *  @Author Jeyapriya
 */
public class AttendanceRecordWithDatePickerTest extends TestBase {


    @Test(groups = "REGRESSION",priority = 14,dataProviderClass = DatePickerData.class,dataProvider = "AttendanceRecord")
    public void attendanceRecordSelectDate(String employeeName){
        extentTest=extentReport.startTest("date picker test with select one data");
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
        extentTest.log(LogStatus.PASS,"view "+employeeName+" attendance record with select date ");
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test(groups = "REGRESSION",priority = 15,dataProviderClass = DatePickerData.class,dataProvider = "AttendanceRecord")
    public void attendanceRecordSelectMonth(String employeeName){
        extentTest=extentReport.startTest("date picker test with select one month");
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
        extentTest.log(LogStatus.PASS,"view  "+employeeName+"  attendance record  with select month ");
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test(groups = "REGRESSION",priority = 16,dataProviderClass = DatePickerData.class,dataProvider = "AttendanceRecord")
    public void attendanceRecordSelectYear(String employeeName){
        extentTest=extentReport.startTest("date picker test with select  year");
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
        extentTest.log(LogStatus.PASS,"view  "+employeeName+" attendance record with select year ");
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test(groups = "REGRESSION",priority = 18,dataProviderClass = DatePickerData.class,dataProvider = "AttendanceRecord")
    public void attendanceRecordSelectNextMonth(String employeeName){
        extentTest=extentReport.startTest("date picker test with select next month");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.isLoginPageDisplay();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(), "Dashboard Page is not Displayed");
        DashBoardPage.clickTime();
        softAssert.assertTrue(TimePage.isTimeDisplayed(), "Time Page is not Displayed");
        TimePage.clickAttendance();
        TimePage.clickAttendanceRecord();
        AttendanceRecordPage.isAttendanceRecordDisplayed();
        AttendanceRecordPage.viewAttendanceRecord1WithChangeNextMonth(employeeName);
        extentTest.log(LogStatus.PASS,"view "+employeeName+" attendance record with select next month ");
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    @Test(groups = "REGRESSION",priority = 19,dataProviderClass = DatePickerData.class,dataProvider = "AttendanceRecord")
    public void attendanceRecordSelectPreviousMonth(String employeeName){
        extentTest=extentReport.startTest("date picker test with select previous month");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.isLoginPageDisplay();
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(), "Dashboard Page is not Displayed");
        DashBoardPage.clickTime();
        softAssert.assertTrue(TimePage.isTimeDisplayed(), "Time Page is not Displayed");
        TimePage.clickAttendance();
        TimePage.clickAttendanceRecord();
        AttendanceRecordPage.isAttendanceRecordDisplayed();
        AttendanceRecordPage.viewAttendanceRecord1WithChangePreviousMonth(employeeName);
        extentTest.log(LogStatus.PASS,"view "+employeeName+" attendance record with select previous month ");
        softAssert.assertTrue(AttendanceRecordPage.isResultDisplay(),"result is not display");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

}

package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TimeTest extends TestBase {

    @Test(priority = 0, testName = "TimePageTest")
    public void TimePageTest() {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.timesheets_ButtonVerify());
        TimePage.timesheets_ButtonClick();
        softAssert.assertTrue(TimePage.employeeTimesheetsdropdownVerify());
        //TimePage.employeeTimesheetsdropdownClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceEmployeeRecorddsropdownVerify());
        //TimePage.attendanceEmployeeRecordsropdownClick();
        softAssert.assertTrue(TimePage.attendanceConfigurationdropdownVerify());
        // TimePage.attendanceConfigurationdropdownClick();
        softAssert.assertTrue(TimePage.time_ReportButtonVerify());
        TimePage.time_ReportButtonClick();
        softAssert.assertTrue(TimePage.reportProjectdropdownVerify());
        //TimePage.reportProjectdropdownClick();
        softAssert.assertTrue(TimePage.reportEmployeedropdownVerify());
        //TimePage.reportEmployeedropdownClick();
        softAssert.assertTrue(TimePage.reporyAttendanceSummeryReportdropdownVerify());
        //TimePage.reporyAttendanceSummeryReportdropdownClick();
        softAssert.assertTrue(TimePage.time_projectInfoButtonVerify());
        TimePage.time_projectInfoButtonClick();
        softAssert.assertTrue(TimePage.projectInfoCustomerInfodropdownVerify());
        //TimePage.projectInfoCustomerInfodropdownClick();
        softAssert.assertTrue(TimePage.projectInfodropdownVerify());
        //TimePage.projectInfodropdownClick();

    }

    @Test(priority = 1, testName = "TimePageTimesheetTest")
    public void TimePageTimesheetTest() {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.timesheets_ButtonVerify());
        TimePage.timesheets_ButtonClick();
        softAssert.assertTrue(TimePage.employeeTimesheetsdropdownVerify());
        TimePage.employeeTimesheetsdropdownClick();
        softAssert.assertTrue(TimeSheetPage.employeeNameVerify());
        TimeSheetPage.employeenameClear();
        TimeSheetPage.employeeName();
        softAssert.assertTrue(TimeSheetPage.viewButtonVerify());
        TimeSheetPage.viewButtonClick();
        softAssert.assertTrue(TimeSheetPage.addTimesheetButtonVerify());
        TimeSheetPage.addTimesheetButtonClick();
        softAssert.assertTrue(TimeSheetPage.addTimesheetDateVerify());
        TimeSheetPage.addTimesheetDateClear();
        TimeSheetPage.addTimesheetDate();
        TimeSheetPage.addTimesheetButtonClick();

    }

    @Test(priority = 2, testName = "TimePageTimesheetTest")
    public void TimePageAttendanceTest() {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceEmployeeRecorddsropdownVerify());
        TimePage.attendanceEmployeeRecordsropdownClick();
        softAssert.assertTrue(AttendanceEmployeeRecord.employeeNameVerify());
        AttendanceEmployeeRecord.employeenameClear();
        AttendanceEmployeeRecord.employeeName();
        softAssert.assertTrue(AttendanceEmployeeRecord.AttendanceEmployeeRecordDateVerify());
        AttendanceEmployeeRecord.AttendanceEmployeeRecordDateClear();
        AttendanceEmployeeRecord.AttendanceEmployeeRecordDate();
        AttendanceEmployeeRecord.viewButtonClick();
    }

    @Test(priority = 3, testName = "TimePageAttendanceCofigurationTest")
    public void TimePageAttendanceCofigurationTest() {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_attendanceButtonVerify());
        TimePage.time_attendanceButtonClick();
        softAssert.assertTrue(TimePage.attendanceConfigurationdropdownVerify());
        TimePage.attendanceConfigurationdropdownClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceEmployeeInOutVerify());
        AttendanceConfiguration.attendanceEmployeeInOutClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceEmployeeEditDeleteVerify());
        AttendanceConfiguration.attendanceEmployeeEditDeleteClick();
        softAssert.assertTrue(AttendanceConfiguration.attendanceSupervisorEditDeleteVerify());
        AttendanceConfiguration.attendanceSupervisorEditDeleteClick();
        softAssert.assertTrue(AttendanceConfiguration.saveBtnVerify());
        AttendanceConfiguration.saveBtnClick();
    }

    @Test(priority = 4, testName = "TimePageProjectReportTest")
    public void TimePageProjectReportTest() {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.LOGIN_PASSWORD);

        softAssert.assertTrue(TimePage.timeButtonVerify());
        TimePage.timeBtnClick();
        softAssert.assertTrue(TimePage.time_ReportButtonVerify());
        TimePage.time_ReportButtonClick();
        softAssert.assertTrue(TimePage.reportProjectdropdownVerify());
        TimePage.reportProjectdropdownClick();
        softAssert.assertTrue(ReportReportProject.ReportProjectnameVerify());
        ReportReportProject.ReportProjectnameWrite();
        softAssert.assertTrue(ReportReportProject.ReportFromDateVerify());
        ReportReportProject.ReportFromDateClear();
        ReportReportProject.ReportFromDate();
        softAssert.assertTrue(ReportReportProject.ReportToDateVerify());
        ReportReportProject.ReportToDateClear();
        ReportReportProject.ReportToDate();
        softAssert.assertTrue(ReportReportProject.ReportApproveVerify());
        ReportReportProject.ReportApproveClick();
        softAssert.assertTrue(ReportReportProject.ReportViewBtnVerify());
        ReportReportProject.ReportViewBtnClick();
    }
}
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
public class ViewAttandanceRecordWithSelectNextMonth extends TestBase {
    /**
     * testcase:view attendanceRecord (select one specific date with change to next month ))
     *
     */
    @Test(groups = "DATEPICKER",priority = 18,dataProviderClass = DatePickerData.class,
            dataProvider = "AttendanceRecord",
            testName = "view attendanceRecord(select one specific date with change to next month in date picker)")
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


}

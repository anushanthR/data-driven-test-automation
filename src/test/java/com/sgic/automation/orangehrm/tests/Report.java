package com.sgic.automation.orangehrm.tests;

/**
 * @Author Thanushan
 */
import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.ReportData;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.LeaveEntitlementsAndUsageReport;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Report extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Entitlement.class);


    //Leave Entitlements and Usage Report
    @Test(priority = 5,groups = "REGRESSION",dataProviderClass = ReportData.class, dataProvider = "UsageReport_1", testName = "Leave Entitlements and Usage Report")
    public void LeaveEntitlementsAndUsageReport1(String leaveBalance, String leaveType, String leavePeriod, String leaveJobTitle, String leaveBalanceLocation, String leaveBalanceSubUnit) {
        extentTest = extentReport.startTest("Leave Entitlements And Usage Report");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeaveEntitlementsAndUsageReport.clickMenuLeave();
        LeaveEntitlementsAndUsageReport.clickReports();
        LeaveEntitlementsAndUsageReport.clickmenuLeaveEntitlementsAndUsageReport();
        PageBase.staticWait(2);
        softAssert.assertTrue(LeaveEntitlementsAndUsageReport.isleaveEntitlementsAndUsageReportDisplay(), "Leave Entitlement and Usage Report");
        LeaveEntitlementsAndUsageReport1(leaveBalance, leaveType, leavePeriod, leaveJobTitle, leaveBalanceLocation, leaveBalanceSubUnit);
        LeaveEntitlementsAndUsageReport.clickleaveBalanceViewBtn();
        extentTest.log(LogStatus.PASS, "Leave Entitlement Usage Report Sucessfully Generated");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    //Leave Entitlements and Usage Report
    @Test(priority = 6,groups = "REGRESSION",dataProviderClass = ReportData.class, dataProvider = "UsageReport_1", testName = "Leave Entitlements and Usage Report")
    public void LeaveEntitlementsAndUsageReport2(String leaveBalance, String periodFrom, String employeeName) {
        extentTest = extentReport.startTest("Leave Entitlements And Usage Report");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeaveEntitlementsAndUsageReport.clickMenuLeave();
        LeaveEntitlementsAndUsageReport.clickReports();
        LeaveEntitlementsAndUsageReport.clickmenuLeaveEntitlementsAndUsageReport();
        softAssert.assertTrue(LeaveEntitlementsAndUsageReport.isleaveEntitlementsAndUsageReportDisplay(), "Leave Entitlement and Usage Report");
        LeaveEntitlementsAndUsageReport2(leaveBalance, periodFrom, employeeName);
        LeaveEntitlementsAndUsageReport.clickleaveBalanceViewBtn();
        extentTest.log(LogStatus.PASS, "Leave Entitlement Usage Report Sucessfully Generated");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}
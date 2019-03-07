package com.sgic.automation.orangehrm.tests.LeaveTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LeaveListData;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.LeaveEntitlementsAndUsageReport;
import com.sgic.automation.orangehrm.pages.LeaveListPage;
import com.sgic.automation.orangehrm.pages.LeavePeriod;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.tests.LeaveTest.SearchHoliday;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LeaveList extends TestBase {
        private static final Logger LOGGER = Logger.getLogger(LeaveList.class);

    @Test( priority = 0,dataProviderClass = LeaveListData.class,dataProvider = "LeaveList",testName = "Leave List")
    public void LeaveList(String calFromDate,String calToDate,String leaveList_txtEmployee_empName,String leaveList_cmbSubunit) {
        extentTest = extentReport.startTest("Leave List Search");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        LeaveListPage.clickLeaveMenu();
        LOGGER.info("Leave Menu clicked");
        LeaveListPage.clickLeaveListMenu();
        LOGGER.info("Leave List Menu clicked");
        softAssert.assertTrue(LeaveListPage.isLeaveListDisplay(),"Leave List page not Displayed");
        LOGGER.info("Leave List Page is Verified");
        LeaveListPage.LeaveListData(calFromDate,calToDate,leaveList_txtEmployee_empName,leaveList_cmbSubunit);
        LeaveListPage.clickLeaveListSearch();
        LOGGER.info("Leave List Search Button Clicked");
        softAssert.assertTrue(LeaveListPage.isResultTableDisplay(),"Search Result Table not displayed");
        LOGGER.info("Leave List Search Results table verified");
        softAssert.assertTrue(LeaveListPage.isSearchResultDisplay(),"Search Result not displayed");
        LOGGER.info("Leave List Search Results verified");
        extentTest.log(LogStatus.PASS, "Leave List Sucessfully Searched");
        LOGGER.info("Leave Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}

package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.EntitlementsData;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.AddLeaveEntitlement;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.SearchLeaveEntitlements;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.PageBase;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @Author Thanushan
 */
public class Entitlement extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(Entitlement.class);

    //Add Single Entitlement
    @Test(priority = 1,groups = "REGRESSION",dataProviderClass = EntitlementsData.class,dataProvider = "AddSingleEntitlements",testName = "Add Leave Single Entitlements")
    public void addLeaveSingleEntitlement(String txtEmpName, String LeaveType,String LeavePeriod,String txtEntitlement){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest=extentReport.startTest("Add Leave Single Entitlements");
        AddLeaveEntitlement.clickMenuLeave();
        LOGGER.info("Leave page is displayed");
        AddLeaveEntitlement.clickMenuEntitlements();
        AddLeaveEntitlement.clickAddEntitlements();
        LOGGER.info("Add Leave Entitlement page is displayed");
        softAssert.assertTrue(AddLeaveEntitlement.isAddLeaveEntitlementHeaderDisplay(),"Add Leave Entitlements not displayed");
        PageBase.staticWait(5);
        AddLeaveEntitlement.AddSingleEntitlementsData(txtEmpName,LeaveType,LeavePeriod,txtEntitlement);
        AddLeaveEntitlement.clickBtnSave();
        LOGGER.info("Add Leave Entitlement is Saved");
        extentTest.log(LogStatus.PASS, "Leave Single Entitlement Sucessfully Added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }

    //Add Leave Multiple Entitlement
    @Test( priority = 2,groups = "REGRESSION",dataProviderClass = EntitlementsData.class,dataProvider = "AddMultipeEntitlements",testName = "Add Leave Multiple Entitlements")
    public void addLeaveMultipleEntitlement(String filtersLocation,String filtersSubunit, String LeaveType,String LeavePeriod,String txtEntitlement){
        extentTest=extentReport.startTest("Add Leave Multiple Entitlements");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        AddLeaveEntitlement.clickMenuLeave();
        LOGGER.info("Leave page is displayed");
        AddLeaveEntitlement.clickMenuEntitlements();
        LOGGER.info("Leave Entitlements Menu clicked");
        AddLeaveEntitlement.clickAddEntitlements();
        LOGGER.info("Add Entitlements Menu clicked");
        softAssert.assertTrue(AddLeaveEntitlement.isAddLeaveEntitlementHeaderDisplay(), "Add Leave Multiple Entitlement");
        AddLeaveEntitlement.AddMultipleEntitlementsData(filtersLocation,filtersSubunit,LeaveType,LeavePeriod,txtEntitlement);
        AddLeaveEntitlement.clickBtnSave();
        LOGGER.info("Add Entitlements Saved");
        extentTest.log(LogStatus.PASS, "Leave Multiple Entitlement Sucessfully Added");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    // Search Entitlement
    @Test( priority = 3,groups = "REGRESSION",dataProviderClass = EntitlementsData.class,dataProvider = "SearchEntitlements",testName = "Search Leave Entitlements")
    public void searchLeaveEntitlement(String employeeName,String leaveType, String leavePeriod) {
        extentTest=extentReport.startTest("Search Leave Entitlements");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("Login Sucessfully");
        LOGGER.info("DashBoardPage is displayed");
        AddLeaveEntitlement.clickMenuLeave();
        LOGGER.info("Leave Menu Clicked");
        AddLeaveEntitlement.clickMenuEntitlements();
        LOGGER.info("Entitlements Menu clicked");
        SearchLeaveEntitlements.clickViewLeaveEntitlements();
        LOGGER.info("View Entitlements Menu clicked");
        softAssert.assertTrue(SearchLeaveEntitlements.isSearchLeaveEntitlementHeaderDisplay(),"Add Leave Search Entitlement");
        SearchLeaveEntitlements.SearchEntitlementsData(employeeName,leaveType,leavePeriod);
        SearchLeaveEntitlements.clickBtnSearch();
        LOGGER.info("Leave Entitlements search button clicked");
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Searched");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
    //Delete Leave Entitlements
    @Test( priority = 4,groups = "REGRESSION",dataProviderClass = EntitlementsData.class,dataProvider = "SearchEntitlements",testName = "Delete Leave Entitlements")
    public void deleteLeaveEntitlement(String employeeName,String leaveType, String leavePeriod){
        extentTest=extentReport.startTest("Delete Leave Entitlement");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        AddLeaveEntitlement.clickMenuLeave();
        LOGGER.info("Leave Menu Clicked");
        AddLeaveEntitlement.clickMenuEntitlements();
        LOGGER.info("Entitlements Menu clicked");
        SearchLeaveEntitlements.clickViewLeaveEntitlements();
        LOGGER.info("View Entitlements Menu clicked");
        softAssert.assertTrue(SearchLeaveEntitlements.isSearchLeaveEntitlementHeaderDisplay(),"Delete Leave Entitlement");
        SearchLeaveEntitlements.SearchEntitlementsData(employeeName,leaveType,leavePeriod);
        SearchLeaveEntitlements.clickBtnSearch();
        LOGGER.info("Leave Entitlements search button clicked");
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Searched");
        PageBase.staticWait(5);
        softAssert.assertTrue(SearchLeaveEntitlements.isentitlementListHeaderDisplay(),"Entilement List not Displayed");
        LOGGER.info(" Search Leave Entitlements Results Header Verified");
        SearchLeaveEntitlements.clickCheckBox();
        LOGGER.info("Checkbox is clicked");
        PageBase.staticWait(1);
        SearchLeaveEntitlements.isPopupModelDisplay();
        LOGGER.info("Poup model verified");
        PageBase.staticWait(1);
        SearchLeaveEntitlements.clickBtnOk();
        LOGGER.info("Popup Ok Button Clicked");
        extentTest.log(LogStatus.PASS, "Leave Entitlement Sucessfully Deleted");
        LOGGER.info("Leave Entitlements Sucessfully Deleted ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}

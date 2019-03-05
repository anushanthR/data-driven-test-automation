//package com.sgic.automation.orangehrm.tests;
//
//import com.sgic.automation.orangehrm.pages.DemoLogin;
//import com.sgic.automation.orangehrm.utils.TestBase;
//
//public class LeaveList extends TestBase {
//
//    @Test( priority = 0,dataProviderClass = LeaveListData.class,dataProvider = "LeaveList",testName = "Leave List")
//    public void LeaveList(String calFromDate,String calToDate,String leaveList_txtEmployee_empName,String leaveList_cmbSubunit) {
//        extentTest=extentReport.startTest("Leave List");
//        DemoLogin.Demologin(Constants.USERNAME,Constants.PASSWORD);
//
//        LeavePeriod.clickLeaveModule();
//        LeaveList.super;
//        LeaveList.clickLeaveListMenu();
//        softAssert.assertTrue(LeaveList.isLeaveListDisplay(), "Leave List Page Not Displayed");
//        LeaveList(calFromDate,calToDate,leaveList_txtEmployee_empName,leaveList_cmbSubunit);
//        PageBase.implicitWait(3);
//        LeaveList.clickLeaveListPastEmployee();
//        LeaveList.clickLeaveListSearch();
//        extentTest.log(LogStatus.PASS, "Leave List Sucessfully Searched");
//        extentReport.endTest(extentTest);
//        softAssert.assertAll();
//    }
//}

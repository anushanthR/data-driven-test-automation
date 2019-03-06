//package com.sgic.automation.orangehrm.tests;
//
///**
// * @Author Thanushan
// */
//import com.relevantcodes.extentreports.LogStatus;
//import com.sgic.automation.orangehrm.TestData.*;
//import com.sgic.automation.orangehrm.pages.*;
//import com.sgic.automation.orangehrm.utils.Constants;
//import com.sgic.automation.orangehrm.utils.PageBase;
//import com.sgic.automation.orangehrm.utils.TestBase;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//import sun.plugin2.message.Message;
//
///**
// * data_driven_test_automation
// * Thanushan 11/02/2019
// */
//public class Leave extends TestBase {
//
//    private static final Logger LOGGER = Logger.getLogger(LoginDemo.class);
//    //Valid Login
//    @Test( priority = 0,dataProviderClass = LoginDemo.class,dataProvider = "loginValid")
//    public void loginValid(String username,String password ) {
//        extentTest=extentReport.startTest("Valid Login");
//        LOGGER.info("Login page is displayed");
//        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
//        LOGGER.info("Login with  "+"UserName: "+ username+" , Pasword: "+password);
//        LoginPage.login(username,password);
//        LOGGER.info("DashBoardPage is displayed");
//        extentTest.log(LogStatus.PASS, "Login Sucessfully");
//        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
//        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
//        DashBoardPage.clickWelcomeAdminbtn();
//        LOGGER.info("logout success");
//        DashBoardPage.clickLogoutbtn();
//        extentReport.endTest(extentTest);
//        softAssert.assertAll();
//    }
//    //Invalid Login
//    @Test( priority = 1,dataProviderClass = LoginDemo.class,dataProvider = "Invalid_Login")
//    public void loginInValid(String userName, String password,String alertMSg) {
//        extentTest=extentReport.startTest("Invalid Login");
//        LOGGER.info("Login page is displayed");
//        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
//        LOGGER.info("Login with  " + "UserName: " + userName + " , Pasword: " + password);
//        LoginPage.login(userName, password);
//        LOGGER.info(alertMSg);
//        extentTest.log(LogStatus.PASS, "Invalid Login Verification Sucessfully");
//        softAssert.assertEquals(LoginPage.getLoginAlert(), alertMSg, "Alert Message Not Displayed");
//        extentReport.endTest(extentTest);
//        softAssert.assertAll();
//    }
//}
//

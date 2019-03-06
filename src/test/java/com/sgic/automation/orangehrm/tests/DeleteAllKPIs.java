package com.sgic.automation.orangehrm.tests;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.KPIsPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
/**test for performance functionality
 * @Author Jeyapriya
 */
public class DeleteAllKPIs extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(DeleteAllKPIs.class);
    /**
     * testcase:delete all KeyPerformanceIndicators
     */
    @Test( groups = "PERFORMANCE",priority = 4,testName = "delete all KeyPerformanceIndicators")
    public void deleteAllKIPs( ) {
        extentTest=extentReport.startTest("Delete KPIs");
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        extentTest.log(LogStatus.PASS, "Login page is displayed");
        LOGGER.info("Login with  "+"UserName: "+ Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        extentTest.log(LogStatus.PASS, "Login success");
        LOGGER.info("DashBoardPage is displayed");
        extentTest.log(LogStatus.PASS, "Dashboard page is displayed");        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        DashBoardPage.clickKPIs();
        LOGGER.info("KPIs page is displayed");
        extentTest.log(LogStatus.PASS, "KPIs page is displayed");
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        KPIsPage.clickSelectButton();
        KPIsPage.clickDeleteButton();
        KPIsPage.clickAlertOk();
        extentTest.log(LogStatus.PASS, "delete KPIs ");
        LOGGER.info("Delete KPI ");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        LOGGER.info("logout success");
        extentTest.log(LogStatus.PASS, "logout success");
        extentReport.endTest(extentTest);
        softAssert.assertAll();
    }
}

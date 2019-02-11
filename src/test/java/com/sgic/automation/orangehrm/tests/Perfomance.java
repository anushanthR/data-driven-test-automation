package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * data_driven_test_automation
 * jeyapriya 11/02/2019
 */
public class Perfomance extends TestBase {
    /**
     * Verify KPIs add
     */
    @Test( priority = 0)
    public void addKIPs(String username, String password) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");

        LoginPage.login(username,password);
        //softAssert.assertTrue(LoginPage.isLoginAlertDisplay(),"Alert is not Displayed");
        softAssert.assertTrue(PerformancePage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        PerformancePage.clickPerfomance();
        softAssert.assertTrue(PerformancePage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        PerformancePage.clickConfigure();
        softAssert.assertTrue(PerformancePage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        PerformancePage.clickKPIs();
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        softAssert.assertTrue(KPIsPage.isAddButtonDisplayed(),"add button  is not Displayed");
        KPIsPage.clickAddbtn();
        softAssert.assertTrue(KPIAsddPage.isAddKIPsPageDisplayes(),"KPIs add page  is not Displayed");
        KPIAsddPage.setJobTitle(Constants.JobTitle);
        KPIAsddPage.setKPIs(Constants.KPI);
        KPIAsddPage.setMinRating(Constants.MinRating);
        KPIAsddPage.setMaxRating(Constants.MaxRating);
        KPIAsddPage.clickMakeDefoult();
        KPIAsddPage.clickSaveBtn();
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();

        softAssert.assertAll();
    }
}

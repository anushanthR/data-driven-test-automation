package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * data_driven_test_automation
 * jeyapriya 11/02/2019
 */
public class Perfomance extends TestBase {
    /**
     * Verify KPIs add
     *
     */

//    @DataProvider(name = "OrangeHrmLogin")
//    public Object[][] orangeHrmKPIs() {
//
//        ExcelDataConfig exConfig = new ExcelDataConfig("test\\resources\\inputDatas\\OrangeHrm.xlsx");
//        int rows = exConfig.getRowCount(0);
//
//        Object[][] data = new Object[rows][2];
//        for (int i = 1; i < rows; i++) {
//            data[i][0] = exConfig.getData("Sheet1", i, 0);
//            data[i][1] = exConfig.getData("Sheet1", i, 1);
//        }
//        return data;
//    }
//
//    @Test( priority = 0,dataProvider = "OrangeHrmLogin")
//    public void addKIPs() {
//        softAssert = new SoftAssert();
//        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
//
//        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
//=== ====
//    @Test( priority = 0)
//    public void addKIPs(String username, String password) {
//        softAssert = new SoftAssert();
//        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
//
//        LoginPage.login(username,password);
//>>>>>>> 793f2a016c30d32af1a78d4a834aca625187f8f5
//        //softAssert.assertTrue(LoginPage.isLoginAlertDisplay(),"Alert is not Displayed");
//        softAssert.assertTrue(PerformancePage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
//        PerformancePage.clickPerfomance();
//        softAssert.assertTrue(PerformancePage.isConfigureBtnDisplay(),"Configure button is not Displayed");
//        PerformancePage.clickConfigure();
//        softAssert.assertTrue(PerformancePage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
//        PerformancePage.clickKPIs();
//        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
//        softAssert.assertTrue(KPIsPage.isAddButtonDisplayed(),"add button  is not Displayed");
//        KPIsPage.clickAddbtn();
//        softAssert.assertTrue(KPIAsddPage.isAddKIPsPageDisplayes(),"KPIs add page  is not Displayed");
//        KPIAsddPage.addKPIs(Constants.JobTitle,Constants.KPI,Constants.MinRating,Constants.MaxRating);
//        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
//        DashBoardPage.clickWelcomeAdminbtn();
//        DashBoardPage.clickLogoutbtn();
//        softAssert.assertAll();
//    }
}

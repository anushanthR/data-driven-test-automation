package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.KPIsData;

import com.sgic.automation.orangehrm.TestData.PerformanceReviewData;
import com.sgic.automation.orangehrm.TestData.TrackerData;
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
    @Test( priority = 0,dataProviderClass = KPIsData.class,dataProvider = "KPIAdd")
    public void addKIPs(String jobTitle,String KPI,String minRating,String maxRating ) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");

        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
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
        KPIAsddPage.addKPIs(jobTitle,KPI,minRating,maxRating);
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();
    }

    @Test(priority = 1,dataProviderClass = TrackerData.class,dataProvider = "TrackerAdd")
    public  void addTrackers(String trackerName,String employeeName,String reviewers){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");

        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        //softAssert.assertTrue(LoginPage.isLoginAlertDisplay(),"Alert is not Displayed");
        softAssert.assertTrue(PerformancePage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        PerformancePage.clickPerfomance();
        softAssert.assertTrue(PerformancePage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        PerformancePage.clickConfigure();
        PerformancePage.clickTrackersbtn();
        softAssert.assertTrue(TrackersPage.isTrackersDisplayed() ,"Trackers page  is not Displayed");
        TrackersPage.clickAddbtn();
        softAssert.assertTrue(AddTrackersPage.isAddTrackersDisplayes() ,"Add Trackers page  is not Displayed");
        AddTrackersPage.addTrackers( trackerName, employeeName, reviewers);

        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }

    @Test(priority = 2,dataProviderClass = PerformanceReviewData.class,dataProvider = "PerformanceReviewAdd")
    public  void addReview(String employeeName,String supervisorName,
                           String startDate,String endDate,String dueDate){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");

        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        softAssert.assertTrue(PerformancePage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        PerformancePage.clickPerfomance();
        PerformancePage.clickManageReviewbtn();
        PerformancePage.clickManageReviewsbtn();
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        TrackersPage.clickAddbtn();
        softAssert.assertTrue(AddReviewPage.isAddReviewDisplayes() ,"Add review page  is not Displayed");
        AddReviewPage.addPerformanceReview(employeeName,supervisorName,startDate,endDate,dueDate);

        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }
}

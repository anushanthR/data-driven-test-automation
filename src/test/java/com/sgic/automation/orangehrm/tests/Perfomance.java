package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.PerformanceTestData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
/**
 * @Author Jeyapriya
 */
public class Perfomance extends TestBase {
    /**
     *
     * @param jobTitle :IT Manager
     * @param KPI:jjjj
     * @param minRating:1
     * @param maxRating:2
     */
    @Test( priority = 0,dataProviderClass = PerformanceTestData.class,dataProvider = "addKPIs")
    public void addKIPs(String jobTitle,String KPI,String minRating,String maxRating ) {
       softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        DashBoardPage.clickKPIs();
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        softAssert.assertTrue(KPIsPage.isAddButtonDisplayed(),"add button  is not Displayed");
        KPIsPage.clickAddbtn();
        softAssert.assertTrue(KPIAsddPage.isAddKIPsPageDisplayes(),"KPIs add page  is not Displayed");
        KPIAsddPage.addKPIs(jobTitle,KPI,minRating,maxRating);
        softAssert.assertTrue(KPIsPage.isResultDisplayed(),"KPIs add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();

        softAssert.assertAll();
    }
    @Test( priority = 2,dataProviderClass = PerformanceTestData.class,dataProvider = "addKPIs")
    public void deleteAllKIPs( ) {
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        DashBoardPage.clickKPIs();
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        KPIsPage.clickSelectButton();
        KPIsPage.clickDeleteButton();
        softAssert.assertTrue(KPIsPage.isResultDisplayed(),"KPIs add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();
    }

    /**
     *
     * @param trackerName:Jasmine Morgan
     * @param employeeName:John Smith
     * @param reviewers:Hannah Flores
     */
    @Test(priority = 3,dataProviderClass = PerformanceTestData.class,dataProvider = "addTracker")
    public  void addTrackers(String trackerName,String employeeName,String reviewers){
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        //softAssert.assertTrue(LoginPage.isLoginAlertDisplay(),"Alert is not Displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        DashBoardPage.clickTrackersbtn();
        softAssert.assertTrue(TrackersPage.isTrackersDisplayed() ,"Trackers page  is not Displayed");
        TrackersPage.clickAddbtn();
        softAssert.assertTrue(AddTrackersPage.isAddTrackersDisplayes() ,"Add Trackers page  is not Displayed");
        AddTrackersPage.addTrackers( trackerName, employeeName, reviewers);
        softAssert.assertTrue(TrackersPage.isResultDisplayed(),"Trackers add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }
    @Test(priority = 4,dataProviderClass = PerformanceTestData.class,dataProvider = "addTracker")
    public  void deleteAllTrackers(){
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        //softAssert.assertTrue(LoginPage.isLoginAlertDisplay(),"Alert is not Displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        DashBoardPage.clickTrackersbtn();
        softAssert.assertTrue(TrackersPage.isTrackersDisplayed() ,"Trackers page  is not Displayed");
        TrackersPage.clickselectBtn();
        TrackersPage.clickDeleteBtn();
        softAssert.assertTrue(TrackersPage.isResultDisplayed(),"Trackers add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }

    /**
     *
     * @param employeeName:Linda Anderson
     * @param supervisorName:John Smith
     * @param startDate:2018-02-02
     * @param endDate:2019-01-01
     * @param dueDate:2018-12-12
     */
    @Test(priority = 5,dataProviderClass = PerformanceTestData.class,dataProvider = "addPerfomanceReview")
    public  void addReview(String employeeName,String supervisorName,
                           String startDate,String endDate,String dueDate){
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        ManageReviewsPage.clickAddbtn();
        softAssert.assertTrue(AddReviewPage.isAddReviewDisplayes() ,"Add review page  is not Displayed");
        AddReviewPage.addPerformanceReview(employeeName,supervisorName,startDate,endDate,dueDate);
        softAssert.assertTrue(AddReviewPage.isSavebtnSisplayed(),"save button not found");
        AddReviewPage.clickSaveBtn();
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }

    /**
     *
     */
    @Test(priority = 6,dataProviderClass = PerformanceTestData.class,dataProvider = "addPerfomanceReview")
    public  void deleteReview(){
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        ManageReviewsPage.clickSelectBtn();
        ManageReviewsPage.clickDeleteBtn();
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }


}

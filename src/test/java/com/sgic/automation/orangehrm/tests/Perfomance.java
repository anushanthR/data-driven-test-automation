package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.PerformanceTestData;
import com.sgic.automation.orangehrm.pages.*;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
/**
 * @Author Jeyapriya
 */
public class Perfomance extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Perfomance.class);
    /**
     *
     * @param jobTitle :IT Manager
     * @param KPI:jjjj
     * @param minRating:1
     * @param maxRating:2
     */
    @Test( groups = "REGRESSION",priority = 1,dataProviderClass = PerformanceTestData.class,dataProvider = "addKPIs")
    public void addKIPs(String jobTitle,String KPI,String minRating,String maxRating ) {
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+" , Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        DashBoardPage.clickKPIs();
        LOGGER.info("KPIs page is Displayed");
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        KPIsPage.clickAddbtn();
        LOGGER.info("AddKPIs page is displayed");
        softAssert.assertTrue(KPIAsddPage.isAddKIPsPageDisplayes(),"KPIs add page  is not Displayed");
        LOGGER.info("add KPIs with "+"job title: "+jobTitle+" KPI: "+KPI+" MinimumRating: "+minRating+" MaximumRating: "+maxRating);
        KPIAsddPage.addKPIs(jobTitle,KPI,minRating,maxRating);
        softAssert.assertTrue(KPIsPage.isResultDisplayed(),"KPIs add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();

        softAssert.assertAll();
    }

    @Test(groups = "REGRESSION", priority = 2)
    public void searchKIPs( ) {
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        DashBoardPage.clickKPIs();
        LOGGER.info("KPIs page is displayed");
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        LOGGER.info("search a KPI with particular job title  ");
        KPIsPage.searchKPIs();
        softAssert.assertTrue(KPIsPage.isResultDisplayed(),"KPIs search result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();
    }
    @Test( groups = "REGRESSION",priority = 3,dataProviderClass = PerformanceTestData.class,dataProvider = "editKPIs")
    public void editKIPs(String jobTitle,String KPI,String minRating,String maxRating ) {
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        DashBoardPage.clickKPIs();
        LOGGER.info("KPIs page is displayed");
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        KPIsPage.clickEditbtn();
        LOGGER.info("edit KPIs page is displayed");
        softAssert.assertTrue(KPIAsddPage.isAddKIPsPageDisplayes(),"KPIs add page  is not Displayed");
        LOGGER.info("edit KPI change the job title to :"+jobTitle+", change the KPI to "+KPI+", change the minrating to "+
                minRating+", change the maxrating to  "+maxRating);
        KPIAsddPage.addKPIs(jobTitle,KPI,minRating,maxRating);
        softAssert.assertTrue(KPIsPage.isResultDisplayed(),"KPIs add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();

        softAssert.assertAll();
    }
    @Test( groups = "REGRESSION",priority = 4)
    public void deleteAllKIPs( ) {
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isKPIsBtnDisplay(),"KPIs button is not Displayed");
        DashBoardPage.clickKPIs();
        LOGGER.info("KPIs page is displayed");
        softAssert.assertTrue(KPIsPage.isKPIsPageDisplayed(),"KPIs page is not  Displayed");
        KPIsPage.clickSelectButton();
        KPIsPage.clickDeleteButton();
        KPIsPage.clickAlertOk();
        LOGGER.info("Delete KPI ");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();
    }

    /**
     *
     * @param trackerName:Jasmine Morgan
     * @param employeeName:John Smith
     * @param reviewers:Hannah Flores
     */
    @Test(groups = "REGRESSION",priority = 5,dataProviderClass = PerformanceTestData.class,dataProvider = "addTracker")
    public  void addTrackers(String trackerName,String employeeName,String reviewers){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        softAssert.assertTrue(DashBoardPage.isTrackerBtnDisplay(),"Tracker button is not Displayed");
        DashBoardPage.clickTrackersbtn();
        LOGGER.info("Trackers page is displayed");
        softAssert.assertTrue(TrackersPage.isTrackersDisplayed() ,"Trackers page  is not Displayed");
        TrackersPage.clickAddbtn();
        LOGGER.info("Add Trackers page is displayed");
        softAssert.assertTrue(AddTrackersPage.isAddTrackersDisplayes() ,"Add Trackers page  is not Displayed");
        LOGGER.info("Add Trackers with tracker name: "+trackerName+", employee name: "+employeeName + ", reviewers: "+reviewers);
        AddTrackersPage.addTrackers( trackerName, employeeName, reviewers);
        softAssert.assertTrue(TrackersPage.isResultDisplayed(),"Trackers add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }


    /**
     *
     * @param trackerName
     * @param employeeName
     * @param reviewers
     */
    @Test(groups = "REGRESSION",priority = 6,dataProviderClass = PerformanceTestData.class,dataProvider = "editTracker")
    public  void editTrackers(String trackerName,String employeeName,String reviewers){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        DashBoardPage.clickTrackersbtn();
        LOGGER.info("Trackers page is displayed");
        softAssert.assertTrue(TrackersPage.isTrackersDisplayed() ,"Trackers page  is not Displayed");
        TrackersPage.clickToEdit();
        LOGGER.info("edit tracker page is displayed");
        softAssert.assertTrue(AddTrackersPage.isAddTrackersDisplayes() ,"Add Trackers page  is not Displayed");
        LOGGER.info("edit Trackers with tracker name change to: "+trackerName+", employee namechange to: "+employeeName +
                ", reviewers change to: "+reviewers);
        AddTrackersPage.addTrackers( trackerName, employeeName, reviewers);
        softAssert.assertTrue(TrackersPage.isResultDisplayed(),"Trackers add result  is not Displayed");
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION",priority = 7)
    public  void deleteAllTrackers(){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        softAssert.assertTrue(DashBoardPage.isConfigureBtnDisplay(),"Configure button is not Displayed");
        DashBoardPage.clickConfigure();
        DashBoardPage.clickTrackersbtn();
        softAssert.assertTrue(TrackersPage.isTrackersDisplayed() ,"Trackers page  is not Displayed");
        LOGGER.info("select all trackers details");
        TrackersPage.clickselectBtn();
        LOGGER.info("delete all tracker details");
        TrackersPage.clickDeleteBtn();
        TrackersPage.clickAlertOk();
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
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
    @Test(groups = "REGRESSION",priority = 8,dataProviderClass = PerformanceTestData.class,dataProvider = "addPerformanceReview")
    public  void addPerformanceReview(String employeeName,String supervisorName,
                           String startDate,String endDate,String dueDate){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        LOGGER.info("ManageReviews Page is displayed");
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        ManageReviewsPage.clickAddbtn();
        LOGGER.info("Add ManageReviews Page is displayed");
        softAssert.assertTrue(AddPerformanceReviewPage.isAddReviewDisplayes() ,"Add review page  is not Displayed");
        LOGGER.info("add ManageReviews with employeeName: "+employeeName+", supervisorName: "+supervisorName+", startDate: "+
                startDate+", endDate "+endDate+", dueDate :"+dueDate);
        AddPerformanceReviewPage.addPerformanceReview(employeeName,supervisorName,startDate,endDate,dueDate);
        softAssert.assertTrue(AddPerformanceReviewPage.isSavebtnisplayed(),"save button not found");
        AddPerformanceReviewPage.clickSaveBtn();
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }

    /**
     *
     */

    @Test(groups = "REGRESSION",priority = 9)
    public  void searchPerformanceReviewWithEmployeeName(){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        LOGGER.info("Manage review page is displayed");
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        LOGGER.info("search manage review by employee name");
        ManageReviewsPage.searchPerformanceReviewByEmployeeName();
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION",priority = 10)
    public  void searchPerformanceReviewWithJobTitle(){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        LOGGER.info(" manage review page is display");
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        LOGGER.info("search manage review by jobTitle");
        ManageReviewsPage.searchPerformanceReviewByJobTitle();
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION",priority = 11,dataProviderClass = PerformanceTestData.class,dataProvider = "editPerformanceReview")
    public  void editPerformanceReview(String startDate,String endDate,String dueDate){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        LOGGER.info(" manage review page is display");
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        ManageReviewsPage.clickEditButton();
        LOGGER.info("edit ManageReviews with startDate change to: "+
                startDate+", endDate change to "+endDate+", dueDate change to:"+dueDate);
        EditPerformanceReviewPage.editPerformanceReview(startDate,endDate,dueDate);
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }
    @Test(groups = "REGRESSION",priority = 12)
    public  void deletePerformanceReview(){
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  "+"UserName: "+Constants.OrgUserName+"  Pasword: "+Constants.OrgPassword);
        LoginPage.login(Constants.OrgUserName, Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(),"Dashboard page is not displayed");
        softAssert.assertTrue(DashBoardPage.isPerfomanceBtnDisplay(),"Perfomance button is not Displayed");
        DashBoardPage.clickPerfomance();
        DashBoardPage.clickManageReviewbtn();
        DashBoardPage.clickManageReviewsbtn();
        LOGGER.info("Manage review page is displayed");
        softAssert.assertTrue(ManageReviewsPage.isReviewsPageDisplayed() ,"ManageReviewsPage   is not Displayed");
        LOGGER.info("select all trackers details");
        ManageReviewsPage.clickSelectBtn();
        LOGGER.info("delete all trackers details");
        ManageReviewsPage.clickDeleteBtn();
        ManageReviewsPage.clickAlertOk();
        softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed() ,"Welcom admin button  is not Displayed");
        DashBoardPage.clickWelcomeAdminbtn();
        LOGGER.info("logout success");
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();

    }
}

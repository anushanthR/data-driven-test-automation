package com.sgic.automation.orangehrm.utils;

import static com.sgic.automation.orangehrm.utils.PageBase.driver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class TestBase extends PageBase {

    public static ExtentReports extentReport = new ExtentReports(System.getProperty("user.dir") + "/src/test/resources/reports/ExtentReportResults.html");
    public static ExtentTest extentTest;
    public SoftAssert softAssert;
    private static String screenShotFolderPath = System.getProperty("user.dir") + "/src/test/resources/screenshots/";



    private static final Logger LOGGER = Logger.getLogger(TestBase.class);

    @BeforeTest
    public void beforeTest() {

        System.out.println("Test Running " + this.getClass().toString());
    }

    @BeforeMethod
    public void loadBrowser() {
        LOGGER.info("Initiate Browser");
        try {
            PageBase.initiateDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        LOGGER.info("Browser Initiated");
    }

    @BeforeMethod
    public void beforeMethod() {
        softAssert = new SoftAssert();
    }

    @BeforeMethod
    public void nameBefore(Method method) {

        LOGGER.info("Test name: " + method.getName());
    }




//    @AfterMethod
//    public void afterMethod(Method method, ITestResult result) {
//        LOGGER.info("Executed test case name:" + method.getName() + " Execution Results : " + result.toString());
//    }

    //report generation
    @AfterMethod(alwaysRun=true)
    public void endTest(ITestResult result){

        if(!result.isSuccess()){

            extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(getFilePath()));
            extentReport.endTest(extentTest);

        }
        LOGGER.info("Closing Browser");
        PageBase.closeDriver();
        LOGGER.info("Browser Closed");
        extentReport.flush();
    }
    @AfterSuite
    public void cleanUp() {
        extentReport.flush();

    }

    //screen shot
    public static String getFilePath() {

        String filename = Functions.getTimeStamp("yyyy-MM-dd_HH-mm-ss")+".jpg";
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File file = new File(screenShotFolderPath + filename);
        try {
            FileUtils.copyFile(screenshotFile, file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return file.getAbsolutePath();
    }

}

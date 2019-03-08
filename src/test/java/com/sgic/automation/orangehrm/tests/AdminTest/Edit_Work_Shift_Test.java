package com.sgic.automation.orangehrm.tests.AdminTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.WorkShiftData;
import com.sgic.automation.orangehrm.pages.AdminMenuPage;
import com.sgic.automation.orangehrm.pages.Edit_Work_Shift;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Edit_Work_Shift_Test  extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(Add_Work_Shift_Test.class);
    @Test(groups = "REGRESSION", priority = 15, dataProviderClass = WorkShiftData.class, dataProvider = "Edit_Shift")
    public void Edit_Work_Shift(String name,String ftime,String ttime,String aemployee) {
        softAssert = new SoftAssert();
        extentTest=extentReport.startTest("Edit Work Shift Test Page");
        LoginPage.login(Constants.OrgUserName,Constants.OrgPassword);
        LOGGER.info("DashBoardPage is displayed");
        extentTest.log(LogStatus.PASS, " DashBoardPage is displayed Success: ");
        AdminMenuPage.clickAdmin();
        extentTest.log(LogStatus.PASS, " DashBoardPage is displayed Success: ");
        AdminMenuPage.clickJobMenu();
        extentTest.log(LogStatus.PASS, " click Job Menu : ");
        AdminMenuPage.clickWorkShift();
        extentTest.log(LogStatus.PASS, " click Work Shift Menu : ");
        Edit_Work_Shift.Edit_Work_Shift(name,ftime,ttime,aemployee);
        extentTest.log(LogStatus.PASS, " OrangeHRM Add Work Shift Success: ");
        extentReport.endTest(extentTest);
        softAssert.assertAll();


    }
}

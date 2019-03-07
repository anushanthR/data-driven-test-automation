package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.TestData.PIMData;
import com.sgic.automation.orangehrm.pages.CustomFields;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeleteCustomFieldTest extends TestBase {
  private static final Logger LOGGER = Logger.getLogger(DeleteCustomFieldTest.class);


  @Test(priority = 0, dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void deleteCustomField(String username, String password) {
    softAssert = new SoftAssert();
    extentTest = extentReport.startTest("OrangeHRMLogin");
    LOGGER.info("login with username: " + username + " password: " + password);
    LoginPage.login(username, password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    PIMPage.clickConfiguration();
    CustomFields.clickCustomField();

    softAssert.assertTrue(CustomFields.isDeleteCustomFieldDisplay(), "CustomField page is not displayed");
    CustomFields.clickSelectOne();
    CustomFields.clickDeleteBtn();
    CustomFields.clickOkBtn();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();
  }
}

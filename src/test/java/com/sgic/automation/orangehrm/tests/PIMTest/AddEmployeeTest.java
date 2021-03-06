package com.sgic.automation.orangehrm.tests.PIMTest;

import com.relevantcodes.extentreports.LogStatus;
import com.sgic.automation.orangehrm.TestData.LoginData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.EmployeeListPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.tests.PIMPageTest;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddEmployeeTest extends TestBase {

  private static final Logger LOGGER = Logger.getLogger(AddEmployeeTest.class);

  @Test(priority = 17, groups = "REGRESSION", dataProvider = "OrangeHRMLogin", dataProviderClass = LoginData.class)
  public void addEmployee(String username, String password) throws InterruptedException {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);
    extentTest = extentReport.startTest("Create user ");
    extentTest.log(LogStatus.PASS, "username = " + username + " password =" + password);
    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");
    EmployeeListPage.clickEmployeeList();
    EmployeeListPage.clickAddBtn();
    EmployeeListPage.typeFirstName("Jeni");
    EmployeeListPage.typeMiddleName("Nisha");
    EmployeeListPage.typeLastName("Jenisha");
    // EmployeeListPage.typeEmployeeId(22);
    EmployeeListPage.photoUpload("profile-blank-female.png");
    EmployeeListPage.clickCreateLogin();
    EmployeeListPage.typeUserName("jenishaa");
    EmployeeListPage.typePassword("jenisha123");
    EmployeeListPage.confirmPassword("jenisha123");
    EmployeeListPage.setDropDownOption("Disabled");
    softAssert.assertEquals(EmployeeListPage.getSelectedOption(), "Disabled",
        "DropDown value is incorrect");
    EmployeeListPage.clicSaveBtn();
    //softAssert.assertTrue(EmployeeListPage.isUserDisplayed(), "User not created");
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    extentReport.endTest(extentTest);
    softAssert.assertAll();

  }


}

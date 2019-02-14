package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.pages.CustomFields;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.OptionalFieldsPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.pages.ReportingMethodPage;
import com.sgic.automation.orangehrm.pages.TerminationReasonPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PIMPageTest extends TestBase {


  private static final Logger LOGGER = Logger.getLogger(PIMPageTest.class);

  /**
   * @Author Jenisha Edit optional field
   */

  @Test(priority = 0, dataProvider = "OrangeHRMLogin")
  public void optionalField(String username, String password) {
    softAssert = new SoftAssert();

    LOGGER.info("login with username: " + username + " password: " + password);
    LoginPage.login(username, password);
    LOGGER.info("login success with username: " + username + " password: " + password);

    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    PIMPage.clickOptionalField();

    softAssert
        .assertTrue(OptionalFieldsPage.isOptionlFieldDisplayes(), "OptionalField is not displayed");

    OptionalFieldsPage.clicEditBtn();
    OptionalFieldsPage.selectOption();
    OptionalFieldsPage.clickSaveBtn();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    softAssert.assertAll();

  }
    /*
    Add Custom field
     */

  @Test(priority = 1, dataProvider = "OrangeHRMLogin")
  public void customFields(String username, String password) {
    softAssert = new SoftAssert();

    LoginPage.login(username, password);

    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    CustomFields.clickCustomField();

    softAssert.assertTrue(CustomFields.isCustomFieldDisplay(), "CustomField page is not displayed");

    CustomFields.setFieldName("xyz");

    // softAssert.assertEquals(CustomFields.getScreenSelectedOption(), "Personal Details", "DropDown value is incorrect");
    CustomFields.setScreenDropDownOption("Personal Details");

    //softAssert.assertEquals(CustomFields.getTypeSelectedOption(), "Drop Down", "DropDown value is incorrect");
    CustomFields.setTypeDropDownOption("Drop Down");
    CustomFields.clickSave();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    softAssert.assertAll();

  }

  @Test(priority = 2, dataProvider = "OrangeHRMLogin")
  public void reportingMethod(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);

    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    ReportingMethodPage.reportingMethodPage();
    softAssert.assertTrue(ReportingMethodPage.isReportingMethodDisplayed(),
        "Reporting method page is not displayed");
    ReportingMethodPage.addReportingMethodName();
    ReportingMethodPage.setReportingMethodName("bbb");
    ReportingMethodPage.saveReportingMethodName();
//        ReportingMethodPage.setReportingMethodName("abc");
//        ReportingMethodPage.cancelReportingMethodName();

    ReportingMethodPage.selectReportingMethodName();
    ReportingMethodPage.deleteReportingMethodName();
    ReportingMethodPage.clickReportingMethodName();
    ReportingMethodPage.clearReportingMethodName();
    ReportingMethodPage.editReportingMethodName();
    ReportingMethodPage.saveAndEditReportingMethodName();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    softAssert.assertAll();


  }

  @Test(priority = 3, dataProvider = "OrangeHRMLogin")
  public void terminationReasonPage(String username, String password) {
    softAssert = new SoftAssert();
    LoginPage.login(username, password);

    PIMPage.clickPIM();
    softAssert.assertTrue(PIMPage.isPIMPageDisplay(), "PIM page is not displayed");

    PIMPage.clickConfiguration();
    // ReportingMethodPage.reportingMethodPage();
    TerminationReasonPage.terminationReasonPage();
    // softAssert.assertTrue(TerminationReasonPage.isTerminationReasonDisplayed(), "Termination reason is not displayed");
    TerminationReasonPage.addTerminationReasonName();
    TerminationReasonPage.setTerminationReasonName("bbbbb");
    TerminationReasonPage.saveTerminationReasonName();
    TerminationReasonPage.selectTerminationReasonName();
    TerminationReasonPage.deleteTerminationReasonName();
    TerminationReasonPage.clickTerminationReasonName();
    TerminationReasonPage.clearTerminationReasonName();
    TerminationReasonPage.editTerminationReasonName();
    TerminationReasonPage.saveAndEditTerminationReasonName();
    DashBoardPage.clickWelcomeAdminbtn();
    DashBoardPage.clickLogoutbtn();
    softAssert.assertAll();
  }


  @DataProvider(name = "OrangeHRMLogin")
  public Object[][] orangeHRM() {
    //String sheetName="LeaveTesting";
    ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\excel.xlsx");
    int rows = exConfig.getRowCount("Sheet1");

    Object[][] data = new Object[rows][2];
    for (int i = 1; i < rows; i++) {
      data[i][0] = exConfig.getData("Sheet1", i, 0);
      data[i][1] = exConfig.getData("Sheet1", i, 1);
//=======
//        ReportingMethodPage.selectReportingMethodName();
//        ReportingMethodPage.deleteReportingMethodName();
//        ReportingMethodPage.clickReportingMethodName();
//        ReportingMethodPage.clearReportingMethodName();
//        ReportingMethodPage.editReportingMethodName();
//        ReportingMethodPage.saveAndEditReportingMethodName();
//        DashBoardPage.clickWelcomeAdminbtn();
//        DashBoardPage.clickLogoutbtn();
//        softAssert.assertAll();
//
//
//    }
//    @Test(priority = 3, dataProvider ="OrangeHRMLogin" )
//    public void terminationReasonPage(String username, String password){
//        softAssert = new SoftAssert();
//        LoginPage.login(username, password);
//
//        PIMPage.clickPIM();
//        softAssert.assertTrue(PIMPage.isPIMPageDisplay(),"PIM page is not displayed");
//
//        PIMPage.clickConfiguration();
//       // ReportingMethodPage.reportingMethodPage();
//        TerminationReasonPage.terminationReasonPage();
//       // softAssert.assertTrue(TerminationReasonPage.isTerminationReasonDisplayed(), "Termination reason is not displayed");
//        TerminationReasonPage.addTerminationReasonName();
//        TerminationReasonPage.setTerminationReasonName("bbbbb");
//        TerminationReasonPage.saveTerminationReasonName();
//        TerminationReasonPage.selectTerminationReasonName();
//        TerminationReasonPage.deleteTerminationReasonName();
//        TerminationReasonPage.clickTerminationReasonName();
//        TerminationReasonPage.clearTerminationReasonName();
//        TerminationReasonPage.editTerminationReasonName();
//        TerminationReasonPage.saveAndEditTerminationReasonName();
//        DashBoardPage.clickWelcomeAdminbtn();
//        DashBoardPage.clickLogoutbtn();
//        softAssert.assertAll();
//
//
//    }
//
//
//
//    @DataProvider(name = "OrangeHRMLogin")
//    public Object[][] orangeHRM() {
//        //String sheetName="LeaveTesting";
//        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\excel.xlsx");
//        int rows = exConfig.getRowCount("Sheet1");
//
//        Object[][] data = new Object[rows][2];
//        for (int i = 1; i < rows; i++) {
//            data[i][0] = exConfig.getData("Sheet1", i, 0);
//            data[i][1] = exConfig.getData("Sheet1", i, 1);
//        }
//        return data;
//>>>>>>> 94517346699bb4841781410e9688a5ccf938afec
    }
    return data;
  }
}
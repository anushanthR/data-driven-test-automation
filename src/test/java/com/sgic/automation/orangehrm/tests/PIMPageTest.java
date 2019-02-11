package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.pages.CustomFields;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.OptionalFieldsPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PIMPageTest extends TestBase {

    /*
    * @Author Jenisha
    * Edit optional field
    */
    @Test(priority =0, dataProvider = "OrangeHRMLogin")
    public void optionalField(String username, String password){
        softAssert = new SoftAssert();

        LoginPage.login(username, password);

        PIMPage.clickPIM();
        softAssert.assertTrue(PIMPage.isPIMPageDisplay(),"PIM page is not displayed");

        PIMPage.clickConfiguration();
        PIMPage.clickOptionalField();

        softAssert.assertTrue(OptionalFieldsPage.isObtionlFieldDisplayes(),"OptionalField is not displayed");

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

    @Test(priority = 1,dataProvider = "OrangeHRMLogin")
    public void customFields(String username, String password){
        softAssert = new SoftAssert();
        LoginPage.login(username, password);

        PIMPage.clickPIM();
        softAssert.assertTrue(PIMPage.isPIMPageDisplay(),"PIM page is not displayed");

        PIMPage.clickConfiguration();
        CustomFields.clickCustomField();

        softAssert.assertTrue(CustomFields.isCustomFieldDisplay(),"CustomField page is not displayed");

        CustomFields.setFieldName("xyz");
        CustomFields.setScreenDropDownOption("Personal Details");
        CustomFields.setTypeDropDownOption("Drop Down");
        CustomFields.clickSave();
        DashBoardPage.clickWelcomeAdminbtn();
        DashBoardPage.clickLogoutbtn();
        softAssert.assertAll();


    }

    @DataProvider(name = "OrangeHRMLogin")
    public Object[][] orangeHRM() {
        //String sheetName="LeaveTesting";
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\excel.xlsx");
        int rows = exConfig.getRowCount(0);

        Object[][] data = new Object[rows][2];
        for (int i = 1; i < rows; i++) {
            data[i][0] = exConfig.getData("Sheet1", i, 0);
            data[i][1] = exConfig.getData("Sheet1", i, 1);
        }
        return data;
    }
}

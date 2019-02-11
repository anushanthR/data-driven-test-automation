package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.pages.OptionalFieldsPage;
import com.sgic.automation.orangehrm.pages.PIMPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PIMPageTest extends TestBase {
    @Test(priority =0)
    public void optionalField(){
        softAssert = new SoftAssert();
        LoginPage.setUserName(Constants.OrgUserName);
        LoginPage.serPassword(Constants.OrgPassword);
        LoginPage.clickLogin();

        PIMPage.clickPIM();
        softAssert.assertTrue(PIMPage.isPIMPageDisplay(),"PIM page is not displayed");

        PIMPage.clickConfiguration();
        PIMPage.clickOptionalField();

        softAssert.assertTrue(OptionalFieldsPage.isObtionlFieldDisplayes(),"OptionalField is not displayed");

        OptionalFieldsPage.clicEditBtn();
        OptionalFieldsPage.selectOption();
        OptionalFieldsPage.clickSaveBtn();
        OptionalFieldsPage.logoutButton();
        OptionalFieldsPage.selectLogOut();
        softAssert.assertAll();



//    @Test(priority = 1)








    }
}

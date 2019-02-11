package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.testng.annotations.Test;


public class tests extends TestBase {

//    @Test(groups = "REGRESSION", priority = 1)
//    public void testLogin() {
//      Login.setUserName(Constants.OrgUserName);
//      Login.setPassword(Constants.OrgPassword);
//        Login.clickLoginButton();
//       // PageBase.staticWait(10);
//    }

//        @Test(groups = "REGRESSION", priority = 7)
//    public void testVerifyLogin(String username, String password) {
//
//        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
//        HomePage.clickLink(Constants.LOGIN_LINK);
//        Login.setUserName(username);
//        Login.setPassword(password);
//        Login.clickSubmit();
//        softAssert.assertTrue(Login.isLoginDisplayed(), "Login Page is not Displayed");
//        softAssert.assertTrue(Login.isLogoutAlertDisplayed(), "Login Page Alert is not Displayed");
//        softAssert.assertTrue(Login.getLogoutAlertMessage().contains(Constants.LOGIN_INVALID_MSG),
//                "Invlaid Message");
//        softAssert.assertAll();
//    }
}

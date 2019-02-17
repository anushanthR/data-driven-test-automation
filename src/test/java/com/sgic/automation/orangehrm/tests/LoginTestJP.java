package com.sgic.automation.orangehrm.tests;

import com.sgic.automation.orangehrm.TestData.LoginJPData;
import com.sgic.automation.orangehrm.pages.DashBoardPage;
import com.sgic.automation.orangehrm.pages.LoginPage;
import com.sgic.automation.orangehrm.utils.Constants;
import com.sgic.automation.orangehrm.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * @author:jeyapriya
 */
public class LoginTestJP extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LoginTestJP.class);


    @Test( priority = 0,dataProviderClass = LoginJPData.class,dataProvider = "loginValid")
    public void login(String username,String password ,String status,String alertMSg) {
        LOGGER.info("Login page is displayed");
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "Login Page is not Displayed");
        LOGGER.info("Login with  " + "UserName: " + username + " , Pasword: " + password);
        LoginPage.login(username, password);
        LOGGER.info(status);
        if(status.equals("valid")) {
            softAssert.assertTrue(DashBoardPage.isDashboardDisplayed(), "Dashboard page is not displayed");
            LOGGER.info("DashboardPage is displayed");
            softAssert.assertTrue(DashBoardPage.isWelcomeAdminbtnDisplayed(), "Welcom admin button  is not Displayed");
            DashBoardPage.clickWelcomeAdminbtn();
            LOGGER.info("logout success");
            DashBoardPage.clickLogoutbtn();
        }
        else {

            LOGGER.info(alertMSg);
            softAssert.assertEquals(LoginPage.getLoginAlert(), alertMSg,
                    "alert msg is not displayed");
        }
        softAssert.assertAll();
    }


}

package com.sgic.automation.orangehrm.utils;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test1 {
    private static final Logger LOGGER = Logger.getLogger(Test1.class);
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
    @Test
    public void a(){


    }


    @AfterMethod
    public void closeBrowser() {
        LOGGER.info("Closing Browser");
        PageBase.closeDriver();
        LOGGER.info("Browser Closed");
    }

}

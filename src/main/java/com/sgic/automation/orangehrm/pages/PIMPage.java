package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
/*
@Author Jenisha
 */
public class PIMPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(PIMPage.class);

    private static By PIM=By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
    private static By PIMdashboard=By.xpath("//*[@id=\"employee-information\"]/a");
    private static By configuration=By.id("menu_pim_Configuration");
    private static By optionalFeild=By.id("menu_pim_configurePim");

    public static void clickPIM(){

        getDriver().findElement(PIM).click();
    }
    public static boolean isPIMPageDisplay(){

        return getDriver().findElement(PIMdashboard).isDisplayed();
    }
    public static void clickConfiguration(){

        getDriver().findElement(configuration).click();
    }
    public static void clickOptionalField(){

        getDriver().findElement(optionalFeild).click();
    }


}

package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * @Author Jenisha
 */

public class CustomFields extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(CustomFields.class);
  private static By customFieldHeading=By.xpath("//*[@id=\"heading\"]");
  private static By customField=By.id("menu_pim_listCustomFields");
  private static By fieldName=By.id("customField_name");
  private static By screen =By.id("customField_screen");
  private static By type =By.id("customField_type");
  private static By save =By.id("btnSave");

  /*
  Click custom field
   */
  public static void clickCustomField(){

    getDriver().findElement(customField).click();
  }

  /*
  verify custom field
   */
  public static boolean isCustomFieldDisplay(){

    return getDriver().findElement(customFieldHeading).isDisplayed();
  }
  /*
  Type field name method
   */
  public static void setFieldName(String name) {
    getDriver().findElement(fieldName).sendKeys(name);
  }

  /*
  Screen drop down method
   */
  public static boolean isScreenDropDownDisplayed() {
    return getDriver().findElement(screen).isDisplayed();
  }

  public static String getScreenSelectedOption() {
    Select screenDropDownOption = new Select(getDriver().findElement(screen));
    return screenDropDownOption.getFirstSelectedOption().getText();
  }

  public static void setScreenDropDownOption(String option) {
    Select screenDropDownOption = new Select(getDriver().findElement(screen));
    screenDropDownOption.selectByVisibleText(option);
  }

// Type dropdown method
  public static boolean isTypeDropDownDisplayed() {
    return getDriver().findElement(type).isDisplayed();
  }

  public static String getTypeSelectedOption() {
    Select screenDropDownOption = new Select(getDriver().findElement(type));
    return screenDropDownOption.getFirstSelectedOption().getText();
  }

  public static void setTypeDropDownOption(String option) {
    Select screenDropDownOption = new Select(getDriver().findElement(type));
    screenDropDownOption.selectByVisibleText(option);
  }
  /*
  Save Details
   */
  public static void clickSave(){

    getDriver().findElement(save).click();
  }







}

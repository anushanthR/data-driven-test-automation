package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class TerminationReasonPage extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
  private static By terminationReason=By.id("menu_pim_viewTerminationReasons");
  private static By terminationReasonHeading=By.xpath("//*[@id=\"recordsListDiv\"]/div[1]/h1");
  private static By addTerminationReason=By.id("btnAdd");
  private static By terminationReasonName=By.xpath("//*[@id=\"terminationReason_name\"]");
  //private static By terminationReasonName=By.id("terminationReason_name");
  private static By saveBtn=By.id("btnSave");

  private static By cancelBtn=By.id("btnCancel");

  private static By selectForDelete=By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[2]/td[1]/input");

  private static By deleteBtn=By.id("btnDel");
  private static By selectOneTerminationReason=By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[3]/td[2]/a");

  private static By editTerminationReason=By.xpath("//*[@id=\"terminationReason_name\"]");
  private static By saveBtnForEdit=By.id("btnSave");
  private static By cancelBtnForEdit=By.id("btnCancel");

  public static void terminationReasonPage(){

    getDriver().findElement(terminationReason).click();
  }
  public static boolean isTerminationReasonDisplayed(){
    return getDriver().findElement(terminationReasonHeading).isDisplayed();
  }

  public static void addTerminationReasonName(){

    getDriver().findElement(addTerminationReason).click();
  }

  public static void setTerminationReasonName(String reason) {

    getDriver().findElement(terminationReasonName).sendKeys(reason);
  }

  public static void saveTerminationReasonName(){

    getDriver().findElement(saveBtn).click();
  }
  public static void cancelTerminationReasonName(){

    getDriver().findElement(cancelBtn).click();
  }
  public static void selectTerminationReasonName(){

    getDriver().findElement(selectForDelete).click();
  }
  public static void deleteTerminationReasonName(){

    getDriver().findElement(deleteBtn).click();
  }
  public static void clickTerminationReasonName(){

    getDriver().findElement(selectOneTerminationReason).click();
  }
  public static void clearTerminationReasonName(){

    getDriver().findElement(editTerminationReason).clear();
  }
  public static void editTerminationReasonName(){

    getDriver().findElement(editTerminationReason).click();
  }
  public static void saveAndEditTerminationReasonName(){

    getDriver().findElement(saveBtnForEdit).click();
  }
  public static void clickCancelTerminationReasonName(){

    getDriver().findElement(cancelBtnForEdit).click();
  }





}

package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
/*
@Author Jenisha
verify data import page functions
 */
public class DataImportPage extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(PerformancePage.class);
  private static By dataImport=By.id("menu_admin_pimCsvImport");
  private static By dataImportHeading=By.id("pimCsvImportHeading");
  private static By chooseFile=By.id("pimCsvImport_csvFile");
  private static By download=By.xpath("//*[@id=\"frmPimCsvImport\"]/fieldset/ul/li[7]/a");
  private static By upload=By.id("btnSave");

  public static void dataImportPage(){

    getDriver().findElement(dataImport).click();
  }
  public static boolean isDataImportDisplayed(){
    return getDriver().findElement(dataImportHeading).isDisplayed();
  }


  public static void clickDownload(){

    getDriver().findElement(download).click();
  }
  public static void clickUpload(){

    getDriver().findElement(upload).click();
  }




}

package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;

public class AttendanceRecordPage extends PageBase {
    private static By hdrAttendanceRecord=By.xpath("//*[@id=\"content\"]/div[1]/div[1]");
    private static By txtEmployeeName=By.id("attendance_employeeName_empName");
    private static By txtDate=By.id("attendance_date");
    private static By btnView=By.id("btView");

    public static boolean isAttendanceDisplayed(){
        return getDriver().findElement(hdrAttendanceRecord).isDisplayed();
    }
    public static void setEmployeeName(String employeeName){
        getDriver().findElement(txtEmployeeName).sendKeys(employeeName);
    }
    public static void setDate(String date){
        getDriver().findElement(txtDate).sendKeys(date);
    }
    public static void clickView(){
        getDriver().findElement(btnView).click();
    }
}

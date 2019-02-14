package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.openqa.selenium.By;

public class TimePage extends PageBase {
    private static By hdrTime=By.xpath("//*[@id=\"content\"]/div[1]/div[1]");
    private static By btnAttendance=By.id("menu_attendance_Attendance");
    private static By btnAttendanceRecord=By.id("menu_attendance_viewAttendanceRecord");

    public static boolean isTimeDisplayed(){
        return getDriver().findElement(hdrTime).isDisplayed();
    }
    public static void clickAttendance(){
        getDriver().findElement(btnAttendance).click();
    }
    public static void clickAttendanceRecord(){
        getDriver().findElement(btnAttendanceRecord).click();
    }
}

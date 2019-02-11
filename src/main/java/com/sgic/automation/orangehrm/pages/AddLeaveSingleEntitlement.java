package com.sgic.automation.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.sgic.automation.orangehrm.utils.PageBase.getDriver;

public class AddLeaveSingleEntitlement {

    private static By menuLeave = By.id("menu_leave_viewLeaveModule");
    private static By menuEntitlements = By.id("menu_leave_Entitlements");
    private static By menuAddEntitlements = By.id("menu_leave_addLeaveEntitlement");
    private static By txtEmpName = By.id("entitlements_employee_empName");
    private static By ddLeaveType = By.id("entitlements_leave_type");
    private static By ddLeavePeriod = By.id("period");
    private static By txtEntitlement  = By.id("entitlements_entitlement");

    public static void clickMenuLeave() {
        getDriver().findElement(menuLeave).click();
    }

    public static void clickMenuEntitlements() {
        getDriver().findElement(menuEntitlements).click();
    }

    public static void clickAddEntitlements() {
        getDriver().findElement(menuAddEntitlements).click();
    }
    public static void setTxtEmpName( String entitlements_employee_empName ) {
        getDriver().findElement(txtEmpName).sendKeys(entitlements_employee_empName);

    }
    public static void setLeaveType(String leaveType) {
        Select dropDownOption = new Select(getDriver().findElement(ddLeaveType));
        dropDownOption.selectByVisibleText(leaveType);
    }
    public static void setLeavePeriod(String leavePeriod) {
        Select dropDownOption = new Select(getDriver().findElement(ddLeaveType));
        dropDownOption.selectByVisibleText(leavePeriod);
    }
    public static void setTxtEntitlement( String entitlements_entitlement ) {
        getDriver().findElement(ddLeaveType).sendKeys(entitlements_entitlement);
    }

}

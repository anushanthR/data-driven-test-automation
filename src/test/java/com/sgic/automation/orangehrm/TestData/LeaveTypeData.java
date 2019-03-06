package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class LeaveTypeData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(LeavePeriodData.class);

    public LeaveTypeData() {
        super
                ("src\\test\\resources\\ExcelSheet\\Leave.xlsx");
    }

        @DataProvider(name = "LeaveType")
        public Object[][] LeaveType() {

        int rows = getRowCount("Add_Leave_Type");
        int col = getColumnCount("Add_Leave_Type");

        LOGGER.info("row = " + rows + " columns = " + col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Add_Leave_Type", i, j);
            }
        }
        return data;
    }
}

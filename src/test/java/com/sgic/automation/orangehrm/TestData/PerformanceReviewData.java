package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.testng.annotations.DataProvider;

public class PerformanceReviewData {
    @DataProvider
    public Object[][] PerformanceReviewAdd() {
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");
        int rows = exConfig.getRowCount(2);

        Object[][] data = new Object[1][5];
        for (int i = 1; i < rows; i++) {
            data[0][0] = exConfig.getData("Trackers", i, 0);
            data[0][1] = exConfig.getData("Trackers", i, 1);
            data[0][2] = exConfig.getData("Trackers", i, 2);
            data[0][3] = exConfig.getData("Trackers", i, 3);
            data[0][4] = exConfig.getData("Trackers", i, 4);
        }
        return data;
    }

}

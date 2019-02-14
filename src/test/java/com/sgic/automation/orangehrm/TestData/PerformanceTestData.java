package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class PerformanceTestData extends ExcelDataConfig{
    private static final Logger LOGGER = Logger.getLogger(PerformanceTestData.class);
    public PerformanceTestData() {super
        ("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");

    }
    @DataProvider(name = "addKPIs")
    public Object[][] addKPIs() {

        int rows = getRowCount(0);
        int col = getColumnCount(0);

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("KPI", i, j);
            }
        }
        return data;
    }
    @DataProvider(name = "addTracker")
    public Object[][] addTracker() {

        int rows = getRowCount(1);
        int col = getColumnCount(1);

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Trackers", i, j);
            }
        }
        return data;
    }
    @DataProvider(name = "addPerfomanceReview")
    public Object[][] addPerfomanceReview() {

        int rows = getRowCount(1);
        int col = getColumnCount(1);

        LOGGER.info("row = "+ rows + " columns = "+ col);

        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("PerfomanceReview", i, j);
            }
        }
        return data;
    }

}

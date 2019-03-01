package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.testng.annotations.DataProvider;

public class KPIsData {
<<<<<<< HEAD
//    @DataProvider
//    public Object[][] KPIAdd() {
//        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");
//        int rows = exConfig.getRowCount(0);
=======

//    @DataProvider
//    public Object[][] KPIAdd() {
//        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");
//        int rows = exConfig.getRowCount(1);
>>>>>>> 8d6ef7fff6f7535d24a57cb7dcda65b42184b6c9
//
//        Object[][] data = new Object[1][4];
//        for (int i = 1; i < rows; i++) {
//            data[0][0] = exConfig.getData("KPI", i, 0);
//            data[0][1] = exConfig.getData("KPI", i, 1);
//            data[0][2] = exConfig.getData("KPI", i, 2);
//            data[0][3] = exConfig.getData("KPI", i, 3);
//
//        }
//        return data;
//    }
<<<<<<< HEAD
=======

    @DataProvider
    public Object[][] KPIAdd() {
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\OrangeHrm.xlsx");
        int rows = exConfig.getRowCount("KPI");

        Object[][] data = new Object[1][4];
        for (int i = 1; i < rows; i++) {
            data[0][0] = exConfig.getData("KPI", i, 0);
            data[0][1] = exConfig.getData("KPI", i, 1);
            data[0][2] = exConfig.getData("KPI", i, 2);
            data[0][3] = exConfig.getData("KPI", i, 3);

        }
        return data;
    }

>>>>>>> 8d6ef7fff6f7535d24a57cb7dcda65b42184b6c9
}

package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.tests.RecruitmentTest;
import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.testng.annotations.DataProvider;

public class RecruitmentData  {
    @DataProvider
    public Object[][] VacancyAdd() {
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
        int rows = exConfig.getRowCount(1);

        Object[][] data = new Object[1][5];
        for (int i = 1; i < rows; i++) {
            data[0][0] = exConfig.getData("AddVacancy", i, 0);
            data[0][1] = exConfig.getData("AddVacancy", i, 1);
            data[0][2] = exConfig.getData("AddVacancy", i, 2);
            data[0][3] = exConfig.getData("AddVacancy", i, 3);
            data[0][4] = exConfig.getData("AddVacancy", i, 4);
        }
        return data;
    }

    @DataProvider
    public Object[][] CandidateAdd() {
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
        int rows = exConfig.getRowCount(0);

        Object[][] data = new Object[1][4];
        for (int i = 1; i < rows; i++) {
            data[0][0] = exConfig.getData("AddCandidate", i, 0);
            data[0][1] = exConfig.getData("AddCandidate", i, 1);
            data[0][2] = exConfig.getData("AddCandidate", i, 2);
            data[0][3] = exConfig.getData("AddCandidate", i, 3);
            //data[0][4] = exConfig.getData("AddCandidate", i, 4);
        }
        return data;
    }

}

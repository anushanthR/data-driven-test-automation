package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.tests.RecruitmentTest;
import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.testng.annotations.DataProvider;

public class RecruitmentData  {
    @DataProvider
    public Object[][] VacancyAdd() {
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
        int rows = exConfig.getRowCount(0);

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
    public Object[][] CandidateSearch() {
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
        int rows = exConfig.getRowCount(2);

        Object[][] data = new Object[1][9];
        for (int i = 1; i < rows; i++) {
            data[0][0] = exConfig.getData("SearchCandidate", i, 0);
            data[0][1] = exConfig.getData("SearchCandidate", i, 1);
            data[0][2] = exConfig.getData("SearchCandidate", i, 2);
            data[0][3] = exConfig.getData("SearchCandidate", i, 3);
            data[0][4] = exConfig.getData("SearchCandidate", i, 4);
            data[0][5] = exConfig.getData("SearchCandidate", i, 5);
            data[0][6] = exConfig.getData("SearchCandidate", i, 6);
            data[0][7] = exConfig.getData("SearchCandidate", i, 7);
            data[0][8] = exConfig.getData("SearchCandidate", i, 8);
        }
        return data;
    }

    @DataProvider
    public Object[][] CandidateAdd() {
        ExcelDataConfig exConfig = new ExcelDataConfig("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
        int rows = exConfig.getRowCount(2);

        Object[][] data = new Object[1][9];
        for (int i = 1; i < rows; i++) {
            data[0][0] = exConfig.getData("AddCandidate", i, 0);
            data[0][1] = exConfig.getData("AddCandidate", i, 1);
            data[0][2] = exConfig.getData("AddCandidate", i, 2);
            data[0][3] = exConfig.getData("AddCandidate", i, 3);
            data[0][4] = exConfig.getData("AddCandidate", i, 4);
            data[0][5] = exConfig.getData("AddCandidate", i, 5);
            data[0][6] = exConfig.getData("AddCandidate", i, 6);
            data[0][7] = exConfig.getData("AddCandidate", i, 7);
            data[0][8] = exConfig.getData("AddCandidate", i, 8);
        }
        return data;
    }

}

package com.sgic.automation.orangehrm.TestData;

import com.sgic.automation.orangehrm.tests.RecruitmentTest;
import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class RecruitmentData extends ExcelDataConfig {

  private static final Logger LOGGER = Logger.getLogger(RecruitmentData.class);

  public RecruitmentData() {
    super("src\\test\\resources\\ExcelSheet\\Recruitment.xlsx");
  }

  @DataProvider
  public Object[][] VacancyAdd() {

    int rows = getRowCount("AddVacancy");
    int col = getColumnCount("AddVacancy");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("AddVacancy", i, j);
      }
    }
    return data;
  }


  @DataProvider()
  public Object[][] CandidateAdd() {

    int rows = getRowCount("AddCandidate");
    int col = getColumnCount("AddCandidate");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("AddCandidate", i, j);
      }
    }
    return data;
  }


  @DataProvider
  public Object[][] CandidateSearch() {
    int rows = getRowCount("SearchCandidate");
    int col = getColumnCount("SearchCandidate");

    LOGGER.info("row = " + rows + " columns = " + col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("SearchCandidate", i, j);
      }
    }
    return data;

  }
}
package com.sgic.automation.orangehrm.pages;

import com.sgic.automation.orangehrm.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class EmployeeListPage extends PageBase {
  private static final Logger LOGGER = Logger.getLogger(EmployeeListPage.class);
  private static By employeeList=By.id("menu_pim_viewEmployeeList");
  private static By employeeListHeading=By.xpath("//*[@id=\"employee-information\"]/a");
  private static By searchByName=By.id("empsearch_employee_name_empName");
  private static By searchById=By.id("empsearch_id");
  private static By searchByEmploymentStatus=By.id("empsearch_employee_status");
  private static By searchByInclude=By.id("empsearch_termination");
  private static By searchBySupervisorName=By.id("empsearch_supervisor_name");
  private static By searchByJobTitle=By.id("empsearch_job_title");
  private static By searchBySubUnit=By.id("empsearch_sub_unit");
  private static By searchBtn=By.id("searchBtn");
  private static By resetBtn=By.id("resetBtn");
  private static By addBtn=By.id("");
  private static By firstName=By.id("firstName");
  private static By middleName=By.id("middleName");
  private static By lastName=By.id("lastName");
  private static By employeeId=By.id("employeeId");
  private static By photograph=By.id("photofile");
  private static By createLogin=By.id("chkLogin");
  private static By userName=By.id("user_name");
  private static By password=By.id("user_password");
  private static By confirmPassword=By.id("re_password");
  private static By status=By.id("status");
  private static By saveBtn=By.id("btnSave");
  private static By select=By.id("ohrmList_chkSelectRecord_37");
  private static By deleteBtn=By.id("btnDelete");
  private static By okBtnForDelete=By.id("dialogDeleteBtn");


}

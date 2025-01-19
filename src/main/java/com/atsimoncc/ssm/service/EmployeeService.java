package com.atsimoncc.ssm.service;

import com.atsimoncc.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * ClassName: EmployeeService
 * Package: com.atsimoncc.ssm.service
 * Description:
 */
public interface EmployeeService {
    /**
     * 查詢所有員工資料
     * */
    List<Employee> getAllEmployee();
    /**
     * 獲取員工的分頁資料
     * */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}

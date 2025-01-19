package com.atsimoncc.ssm.mapper;

import com.atsimoncc.ssm.pojo.Employee;

import java.util.List;

/**
 * ClassName: EmployeeMapper
 * Package: com.atsimoncc.ssm.mapper
 * Description:
 */
public interface EmployeeMapper {
    /**
     * 查詢所有員工資料
     * */
    List<Employee> getAllEmployee();
}

package com.atsimoncc.ssm.service.impl;

import com.atsimoncc.ssm.mapper.EmployeeMapper;
import com.atsimoncc.ssm.pojo.Employee;
import com.atsimoncc.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: EmployeeServiceImpl
 * Package: com.atsimoncc.ssm.service.impl
 * Description:
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper; // 因為 Spring 設定檔案有設定這個 bean: org.mybatis.spring.mapper.MapperScannerConfigurer

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        // 開啟分頁功能(本身是一個攔截器的功能)
        PageHelper.startPage(pageNum, 4);
        // 查詢所有的員工資訊
        List<Employee> list = employeeMapper.getAllEmployee();
        // 取得分頁相關數據
        PageInfo<Employee> page = new PageInfo<>(list, 5);
        return page;
    }
}

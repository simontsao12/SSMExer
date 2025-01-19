package com.atsimoncc.ssm.controller;

import com.atsimoncc.ssm.pojo.Employee;
import com.atsimoncc.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ClassName: EmployeeController
 * Package: com.atsimoncc.controller
 * Description:
 * 查詢所有的員工資訊 --> /employee --> get
 * 查詢員工的分頁資訊 --> /employee/page/1 --> get
 * 根據id查詢員工資訊 --> /employee/1 --> get
 * 跳到新增頁面 --> /to/add --> get
 * 新增員工資訊 --> /employee --> post
 * 修改員工資訊 --> /employee --> put
 * 刪除員工資料 --> /employee/1 --> delete
 *
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        // 取得員工的分頁信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        // 將分頁資料分享到請求域中
        model.addAttribute("page", page);
        // 跳到 employee_list.html
        return "employee_list";
    }

    // 下面取得所有員工(不帶分頁)已失效，因為 employee_list.html 使用的是 request.page 而非 request.list
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        // 查詢所有的員工資訊
        List<Employee> list = employeeService.getAllEmployee();
        // 將員工資訊在請求域中共享
        model.addAttribute("list", list);
        // 跳到 employee_list.html
        return "employee_list_all";
    }
}

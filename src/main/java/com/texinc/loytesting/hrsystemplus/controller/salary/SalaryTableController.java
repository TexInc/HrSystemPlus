package com.texinc.loytesting.hrsystemplus.controller.salary;

import com.texinc.loytesting.hrsystemplus.bean.Department;
import com.texinc.loytesting.hrsystemplus.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/13 4:04 PM
 */
@RestController
@RequestMapping("/salary/table")
public class SalaryTableController {
    @Autowired
    DepartmentService departmentService;
    @RequestMapping("/deps")
    public List<Department> departments() {
        return departmentService.getAllDeps();
    }
}

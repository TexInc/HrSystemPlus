package com.texinc.loytesting.hrsystemplus.service.impl;

import com.texinc.loytesting.hrsystemplus.bean.Department;
import com.texinc.loytesting.hrsystemplus.mapper.DepartmentMapper;
import com.texinc.loytesting.hrsystemplus.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 5:03 PM
 */
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    public int addDep(Department department) {
        department.setEnabled(true);
        departmentMapper.addDep(department);
        return department.getResult();
    }

    public int deleteDep(Long did) {
        Department department = new Department();
        department.setId(did);
        departmentMapper.deleteDep(department);
        return department.getResult();
    }

    public List<Department> getDepByPid(Long pid) {
        return departmentMapper.getDepByPid(pid);
    }

    public List<Department> getAllDeps() {
        return departmentMapper.getAllDeps();
    }
}

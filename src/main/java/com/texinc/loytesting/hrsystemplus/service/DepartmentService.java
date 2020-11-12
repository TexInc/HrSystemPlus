package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 5:01 PM
 */
public interface DepartmentService {
    public int addDep(Department department);

    public int deleteDep(Long did);

    public List<Department> getDepByPid(Long pid);

    public List<Department> getAllDeps();
}

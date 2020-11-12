package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.Salary;
import com.texinc.loytesting.hrsystemplus.mapper.SalaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:39 PM
 */
@Service
@Transactional
public class SalaryService {
    @Autowired
    SalaryMapper salaryMapper;
    public int addSalary(Salary salary) {
        return salaryMapper.addSalary(salary);
    }

    public List<Salary> getAllSalary() {
        return salaryMapper.getAllSalary();
    }

    public int updateSalary(Salary salary) {
        return salaryMapper.updateSalary(salary);
    }

    public int deleteSalary(String ids) {
        String[] split = ids.split(",");
        return salaryMapper.deleteSalary(split);
    }

    public int updateEmpSalary(Integer sid, Long eid) {
        salaryMapper.deleteSalaryByEid(eid);
        return salaryMapper.addSidAndEid(sid,eid);
    }
}

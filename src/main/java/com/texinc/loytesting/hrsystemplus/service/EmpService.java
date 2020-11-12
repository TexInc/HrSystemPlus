package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.bean.Employee;
import com.texinc.loytesting.hrsystemplus.bean.Nation;
import com.texinc.loytesting.hrsystemplus.bean.PoliticsStatus;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 4:05 PM
 */
public interface EmpService {
    public List<Nation> getAllNations();

    public List<PoliticsStatus> getAllPolitics();

    public int addEmp(Employee employee);

    public Long getMaxWorkID();

    public List<Employee> getEmployeeByPage(Integer page, Integer size, String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope);

    public Long getCountByKeywords(String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope);

    public int updateEmp(Employee employee);

    public boolean deleteEmpById(String ids);

    public List<Employee> getAllEmployees();

    public int addEmps(List<Employee> emps);

    public List<Employee> getEmployeeByPageShort(Integer page, Integer size);
}

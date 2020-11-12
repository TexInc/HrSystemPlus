package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:06 PM
 */
@Mapper
public interface SalaryMapper {
    int addSalary(@Param("salary") Salary salary);

    List<Salary> getAllSalary();

    int updateSalary(@Param("salary") Salary salary);

    int deleteSalary(@Param("ids") String[] ids);

    int deleteSalaryByEid(@Param("eid") Long eid);

    int addSidAndEid(@Param("sid") Integer sid, @Param("eid") Long eid);
}

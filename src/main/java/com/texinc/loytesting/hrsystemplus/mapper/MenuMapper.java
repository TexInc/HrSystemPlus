package com.texinc.loytesting.hrsystemplus.mapper;

import com.texinc.loytesting.hrsystemplus.bean.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:05 PM
 */
@Mapper
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}

package com.texinc.loytesting.hrsystemplus.service;

import com.texinc.loytesting.hrsystemplus.mapper.MenuRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author i@loyio.me
 * @date 2020/11/12 7:35 PM
 */
@Service
@Transactional
public class MenuRoleService {
    @Autowired
    MenuRoleMapper menuRoleMapper;

    public int updateMenuRole(Long rid, Long[] mids) {
        menuRoleMapper.deleteMenuByRid(rid);
        if (mids.length == 0) {
            return 0;
        }
        return menuRoleMapper.addMenu(rid, mids);
    }
}

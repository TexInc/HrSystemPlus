package com.texinc.loytesting.hrsystemplus.controller;

import com.texinc.loytesting.hrsystemplus.bean.Hr;
import com.texinc.loytesting.hrsystemplus.bean.Menu;
import com.texinc.loytesting.hrsystemplus.common.HrUtils;
import com.texinc.loytesting.hrsystemplus.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/13 4:09 PM
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    MenuService menuService;
    @RequestMapping("/sysmenu")
    public List<Menu> sysmenu() {
        return menuService.getMenusByHrId();
    }

    @RequestMapping("/hr")
    public Hr currentUser() {
        return HrUtils.getCurrentHr();
    }
}

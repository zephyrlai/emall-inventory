package cn.zephyr.module.controller;

import cn.zephyr.module.entity.SysUser;
import cn.zephyr.module.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-24 15:11
 */
@RestController
@RequestMapping("user")
public class UserContorller {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/{id}")
    public SysUser queryById(@PathVariable Integer id){
        return sysUserService.queryById(id);
    }

}

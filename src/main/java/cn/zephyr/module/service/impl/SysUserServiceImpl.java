package cn.zephyr.module.service.impl;

import cn.zephyr.module.dao.SysUserMapper;
import cn.zephyr.module.entity.SysUser;
import cn.zephyr.module.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-24 15:25
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser queryById(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}

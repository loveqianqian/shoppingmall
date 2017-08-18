package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.RequireRepository;
import com.zhiboer.mall.dao.RoleRepository;
import com.zhiboer.mall.model.Role;
import com.zhiboer.mall.service.RoleService;
import com.zhiboer.mall.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role addOne(Role role) {
        role.setId(CommonUtil.generateId());
        role.setCreateTime(new Date());
        role.setUpdateTime(new Date());
        roleRepository.insertOne(role);
        return role;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.selectAll();
    }

    @Override
    public List<Role> findByLike(Role role) {
        return roleRepository.selectByLike(role);
    }

    @Override
    public void removeById(String id) {
        roleRepository.deleteById(id);
    }

    @Override
    public void modifyById(Role role) {
        role.setUpdateTime(new Date());
        roleRepository.updateById(role);
    }
}

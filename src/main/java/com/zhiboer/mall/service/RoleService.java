package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Role;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface RoleService {

    /**
     * 添加一条数据
     * @return
     */
    Role addOne(Role role);

    /**
     * 查询全部数据
     * @return
     */
    List<Role> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Role> findByLike(Role role);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Role role);
}

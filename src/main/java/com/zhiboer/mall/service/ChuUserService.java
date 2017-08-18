package com.zhiboer.mall.service;

import com.zhiboer.mall.model.ChuUser;

import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
public interface ChuUserService {

    /**
     * 添加一条数据
     * @param chuUser
     * @return
     */
    ChuUser addOne(ChuUser chuUser);

    /**
     * 查询全部数据
     * @return
     */
    List<ChuUser> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<ChuUser> findByLike(ChuUser chuUser);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     * @param chuUser
     */
    void modifyById(ChuUser chuUser);
}

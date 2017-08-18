package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Warehouse;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface WarehouseService {

    /**
     * 添加一条数据
     * @return
     */
    Warehouse addOne(Warehouse warehouse);

    /**
     * 查询全部数据
     * @return
     */
    List<Warehouse> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Warehouse> findByLike(Warehouse warehouse);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Warehouse warehouse);
}

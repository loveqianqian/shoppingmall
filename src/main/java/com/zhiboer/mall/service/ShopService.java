package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Shop;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface ShopService {

    /**
     * 添加一条数据
     * @return
     */
    Shop addOne(Shop shop);

    /**
     * 查询全部数据
     * @return
     */
    List<Shop> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Shop> findByLike(Shop shop);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Shop shop);
}

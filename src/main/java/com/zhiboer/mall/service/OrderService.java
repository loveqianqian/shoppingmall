package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Order;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface OrderService {

    /**
     * 添加一条数据
     * @return
     */
    Order addOne(Order order);

    /**
     * 查询全部数据
     * @return
     */
    List<Order> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Order> findByLike(Order order);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Order order);
}

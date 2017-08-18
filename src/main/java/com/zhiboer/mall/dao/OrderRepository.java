package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface OrderRepository {

    void insertOne(Order order);

    List<Order> selectAll();

    List<Order> selectByLike(Order order);

    void deleteById(String id);

    void updateById(Order order);
}

package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.GoodsRepository;
import com.zhiboer.mall.dao.OrderRepository;
import com.zhiboer.mall.model.Order;
import com.zhiboer.mall.service.OrderService;
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
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order addOne(Order order) {
        order.setId(CommonUtil.generateId());
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());
        orderRepository.insertOne(order);
        return order;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.selectAll();
    }

    @Override
    public List<Order> findByLike(Order order) {
        return orderRepository.selectByLike(order);
    }

    @Override
    public void removeById(String id) {
        orderRepository.deleteById(id);
    }

    @Override
    public void modifyById(Order order) {
        orderRepository.updateById(order);
    }
}

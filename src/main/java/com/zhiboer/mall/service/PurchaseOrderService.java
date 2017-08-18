package com.zhiboer.mall.service;

import com.zhiboer.mall.model.PurchaseOrder;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface PurchaseOrderService {

    /**
     * 添加一条数据
     * @return
     */
    PurchaseOrder addOne(PurchaseOrder purchaseOrder);

    /**
     * 查询全部数据
     * @return
     */
    List<PurchaseOrder> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<PurchaseOrder> findByLike(PurchaseOrder purchaseOrder);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(PurchaseOrder purchaseOrder);
}

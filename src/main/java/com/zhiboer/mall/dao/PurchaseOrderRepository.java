package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Provider;
import com.zhiboer.mall.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
@Repository
public interface PurchaseOrderRepository {

    void insertOne(PurchaseOrder purchaseOrder);

    List<PurchaseOrder> selectAll();

    List<PurchaseOrder> selectByLike(PurchaseOrder purchaseOrder);

    void deleteById(String id);

    void updateById(PurchaseOrder purchaseOrder);
}

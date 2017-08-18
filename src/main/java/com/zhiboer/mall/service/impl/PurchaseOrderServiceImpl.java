package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.ProviderRepository;
import com.zhiboer.mall.dao.PurchaseOrderRepository;
import com.zhiboer.mall.model.PurchaseOrder;
import com.zhiboer.mall.service.PurchaseOrderService;
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
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Override
    public PurchaseOrder addOne(PurchaseOrder purchaseOrder) {
        purchaseOrder.setId(CommonUtil.generateId());
        purchaseOrder.setCreateTime(new Date());
        purchaseOrder.setUpdateTime(new Date());
        purchaseOrderRepository.insertOne(purchaseOrder);
        return purchaseOrder;
    }

    @Override
    public List<PurchaseOrder> findAll() {
        return purchaseOrderRepository.selectAll();
    }

    @Override
    public List<PurchaseOrder> findByLike(PurchaseOrder purchaseOrder) {
        return purchaseOrderRepository.selectByLike(purchaseOrder);
    }

    @Override
    public void removeById(String id) {
        purchaseOrderRepository.deleteById(id);
    }

    @Override
    public void modifyById(PurchaseOrder purchaseOrder) {
        purchaseOrderRepository.updateById(purchaseOrder);
    }
}

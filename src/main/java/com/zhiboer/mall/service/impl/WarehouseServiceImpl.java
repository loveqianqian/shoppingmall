package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.WarehouseGoodsRepository;
import com.zhiboer.mall.dao.WarehouseRepository;
import com.zhiboer.mall.model.Warehouse;
import com.zhiboer.mall.service.WarehouseService;
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
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public Warehouse addOne(Warehouse warehouse) {
        warehouse.setId(CommonUtil.generateId());
        warehouse.setCreateTime(new Date());
        warehouse.setUpdateTime(new Date());
        warehouseRepository.insertOne(warehouse);
        return warehouse;
    }

    @Override
    public List<Warehouse> findAll() {
        return warehouseRepository.selectAll();
    }

    @Override
    public List<Warehouse> findByLike(Warehouse warehouse) {
        return warehouseRepository.selectByLike(warehouse);
    }

    @Override
    public void removeById(String id) {
        warehouseRepository.deleteById(id);
    }

    @Override
    public void modifyById(Warehouse warehouse) {
        warehouseRepository.updateById(warehouse);
    }
}

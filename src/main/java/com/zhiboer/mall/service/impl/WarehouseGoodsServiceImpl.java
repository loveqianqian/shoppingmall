package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.StatisticsRepository;
import com.zhiboer.mall.dao.WarehouseGoodsRepository;
import com.zhiboer.mall.dao.WarehouseRepository;
import com.zhiboer.mall.dto.GoodsDto;
import com.zhiboer.mall.model.WarehouseGoods;
import com.zhiboer.mall.service.WarehouseGoodsService;
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
public class WarehouseGoodsServiceImpl implements WarehouseGoodsService {

    @Autowired
    private WarehouseGoodsRepository warehouseGoodsRepository;

    @Override
    public WarehouseGoods addOne(WarehouseGoods warehouseGoods) {
        warehouseGoods.setId(CommonUtil.generateId());
        warehouseGoods.setCreateTime(new Date());
        warehouseGoods.setUpdateTime(new Date());
        warehouseGoodsRepository.insertOne(warehouseGoods);
        return warehouseGoods;
    }

    @Override
    public List<WarehouseGoods> findAll() {
        return warehouseGoodsRepository.selectAll();
    }

    @Override
    public List<WarehouseGoods> findByLike(GoodsDto goodsDto) {
        return warehouseGoodsRepository.selectByLike(goodsDto);
    }

    @Override
    public void removeById(String id) {
        warehouseGoodsRepository.deleteById(id);
    }

    @Override
    public void modifyById(WarehouseGoods warehouseGoods) {
        warehouseGoodsRepository.updateById(warehouseGoods);
    }
}

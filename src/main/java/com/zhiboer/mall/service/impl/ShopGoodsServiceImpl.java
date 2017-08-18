package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.ShopGoodsRepository;
import com.zhiboer.mall.dto.GoodsDto;
import com.zhiboer.mall.model.ShopGoods;
import com.zhiboer.mall.service.ShopGoodsService;
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
public class ShopGoodsServiceImpl implements ShopGoodsService {

    @Autowired
    private ShopGoodsRepository shopGoodsRepository;

    @Override
    public ShopGoods addOne(ShopGoods shopGoods) {
        shopGoods.setId(CommonUtil.generateId());
        shopGoods.setCreateTime(new Date());
        shopGoods.setUpdateTime(new Date());
        shopGoodsRepository.insertOne(shopGoods);
        return shopGoods;
    }

    @Override
    public boolean addBatch(List<ShopGoods> shopGoods) {
        shopGoodsRepository.insertBatch(shopGoods);
        return true;
    }

    @Override
    public List<ShopGoods> findAll() {
        return shopGoodsRepository.selectAll();
    }

    @Override
    public List<ShopGoods> findByLike(GoodsDto goodsDto) {
        return shopGoodsRepository.selectByLike(goodsDto);
    }

    @Override
    public void removeById(String id) {
        shopGoodsRepository.deleteById(id);
    }

    @Override
    public void modifyById(ShopGoods shopGoods) {
        shopGoodsRepository.updateById(shopGoods);
    }
}

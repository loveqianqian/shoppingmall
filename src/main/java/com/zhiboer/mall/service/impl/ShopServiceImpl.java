package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.ShopGoodsRepository;
import com.zhiboer.mall.dao.ShopRepository;
import com.zhiboer.mall.model.Shop;
import com.zhiboer.mall.service.ShopService;
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
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public Shop addOne(Shop shop) {
        shop.setId(CommonUtil.generateId());
        shop.setCreateTime(new Date());
        shop.setUpdateTime(new Date());
        shopRepository.insertOne(shop);
        return shop;
    }

    @Override
    public List<Shop> findAll() {
        return shopRepository.selectAll();
    }

    @Override
    public List<Shop> findByLike(Shop shop) {
        return shopRepository.selectByLike(shop);
    }

    @Override
    public void removeById(String id) {
        shopRepository.deleteById(id);
    }

    @Override
    public void modifyById(Shop shop) {
        shopRepository.updateById(shop);
    }
}

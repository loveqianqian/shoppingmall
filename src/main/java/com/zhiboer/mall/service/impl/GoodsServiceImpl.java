package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.GoodsOutputRepository;
import com.zhiboer.mall.dao.GoodsRepository;
import com.zhiboer.mall.model.Goods;
import com.zhiboer.mall.service.GoodsService;
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
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public Goods addOne(Goods goods) {
        goods.setId(CommonUtil.generateId());
        goods.setCreateTime(new Date());
        goods.setUpdateTime(new Date());
        goodsRepository.insertOne(goods);
        return goods;
    }

    @Override
    public List<Goods> findAll() {
        return goodsRepository.selectAll();
    }

    @Override
    public List<Goods> findByLike(Goods goods) {
        return goodsRepository.selectByLike(goods);
    }

    @Override
    public void removeById(String id) {
        goodsRepository.deleteById(id);
    }

    @Override
    public void modifyById(Goods goods) {
        goodsRepository.updateById(goods);
    }
}

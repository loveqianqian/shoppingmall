package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.GoodsInputRepository;
import com.zhiboer.mall.dao.GoodsOutputRepository;
import com.zhiboer.mall.model.GoodsOutput;
import com.zhiboer.mall.service.GoodsOutputService;
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
public class GoodsOutputServiceImpl implements GoodsOutputService {

    @Autowired
    private GoodsOutputRepository goodsOutputRepository;

    @Override
    public GoodsOutput addOne(GoodsOutput goodsOutput) {
        goodsOutput.setId(CommonUtil.generateId());
        goodsOutput.setCreateTime(new Date());
        goodsOutput.setUpdateTime(new Date());
        goodsOutputRepository.insertOne(goodsOutput);
        return goodsOutput;
    }

    @Override
    public List<GoodsOutput> findAll() {
        return goodsOutputRepository.selectAll();
    }

    @Override
    public List<GoodsOutput> findByLike(GoodsOutput goodsOutput) {
        return goodsOutputRepository.selectByLike(goodsOutput);
    }

    @Override
    public void removeById(String id) {
        goodsOutputRepository.deleteById(id);
    }

    @Override
    public void modifyById(GoodsOutput goodsOutput) {
        goodsOutputRepository.updateById(goodsOutput);
    }
}

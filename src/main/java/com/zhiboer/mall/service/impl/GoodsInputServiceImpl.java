package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.GoodsInputRepository;
import com.zhiboer.mall.model.GoodsInput;
import com.zhiboer.mall.service.GoodsInputService;
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
public class GoodsInputServiceImpl implements GoodsInputService {

    @Autowired
    private GoodsInputRepository goodsInputRepository;

    @Override
    public GoodsInput addOne(GoodsInput goodsInput) {
        goodsInput.setId(CommonUtil.generateId());
        goodsInput.setCreateTime(new Date());
        goodsInput.setUpdateTime(new Date());
        goodsInputRepository.insertOne(goodsInput);
        return goodsInput;
    }

    @Override
    public List<GoodsInput> findAll() {
        return goodsInputRepository.selectAll();
    }

    @Override
    public List<GoodsInput> findByLike(GoodsInput goodsInput) {
        return goodsInputRepository.selectByLike(goodsInput);
    }

    @Override
    public void removeById(String id) {
        goodsInputRepository.deleteById(id);
    }

    @Override
    public void modifyById(GoodsInput goodsInput) {
        goodsInputRepository.updateById(goodsInput);
    }
}

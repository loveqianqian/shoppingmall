package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.ClassifyRepository;
import com.zhiboer.mall.model.Classify;
import com.zhiboer.mall.service.ClassifyService;
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
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyRepository classifyRepository;

    @Override
    public Classify addOne(Classify classify) {

        classify.setId(CommonUtil.generateId());
        classify.setCreateTime(new Date());
        classify.setUpdateTime(new Date());
        classifyRepository.insertOne(classify);
        return classify;
    }

    @Override
    public List<Classify> findAll() {
        return classifyRepository.selectAll();
    }

    @Override
    public List<Classify> findByLike(Classify classify) {
        return classifyRepository.selectByLike(classify);
    }

    @Override
    public void removeById(String id) {
        classifyRepository.deleteById(id);
    }

    @Override
    public void modifyById(Classify classify) {
        classifyRepository.updateById(classify);
    }
}

package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.ClassifyRepository;
import com.zhiboer.mall.dao.FinanceRepository;
import com.zhiboer.mall.model.Finance;
import com.zhiboer.mall.service.FinanceService;
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
public class FinanceServiceImpl implements FinanceService {

    @Autowired
    private FinanceRepository financeRepository;

    @Override
    public Finance addOne(Finance finance) {
        finance.setId(CommonUtil.generateId());
        finance.setCreateTime(new Date());
        finance.setUpdateTime(new Date());
        financeRepository.insertOne(finance);
        return finance;
    }

    @Override
    public List<Finance> findAll() {
        return financeRepository.selectAll();
    }

    @Override
    public List<Finance> findByLike(Finance finance) {
        return financeRepository.selectByLike(finance);
    }

    @Override
    public void removeById(String id) {
        financeRepository.deleteById(id);
    }

    @Override
    public void modifyById(Finance finance) {
        financeRepository.updateById(finance);
    }
}

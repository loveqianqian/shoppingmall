package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.ShopRepository;
import com.zhiboer.mall.dao.StatisticsRepository;
import com.zhiboer.mall.model.Statistics;
import com.zhiboer.mall.service.StatisticsService;
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
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private StatisticsRepository statisticsRepository;

    @Override
    public Statistics addOne(Statistics statistics) {
        statistics.setId(CommonUtil.generateId());
        statistics.setCreateTime(new Date());
        statistics.setUpdateTime(new Date());
        statisticsRepository.insertOne(statistics);
        return statistics;
    }

    @Override
    public List<Statistics> findAll() {
        return statisticsRepository.selectAll();
    }

    @Override
    public List<Statistics> findByLike(Statistics statistics) {
        return statisticsRepository.selectByLike(statistics);
    }

    @Override
    public void removeById(String id) {
        statisticsRepository.deleteById(id);
    }

    @Override
    public void modifyById(Statistics statistics) {
        statisticsRepository.updateById(statistics);
    }
}

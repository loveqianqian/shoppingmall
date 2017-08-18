package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Statistics;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface StatisticsService {

    /**
     * 添加一条数据
     * @return
     */
    Statistics addOne(Statistics statistics);

    /**
     * 查询全部数据
     * @return
     */
    List<Statistics> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Statistics> findByLike(Statistics statistics);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Statistics statistics);
}

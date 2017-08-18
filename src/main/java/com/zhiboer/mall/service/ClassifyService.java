package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Classify;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface ClassifyService {

    /**
     * 添加一条数据
     * @param classify
     * @return
     */
    Classify addOne(Classify classify);

    /**
     * 查询全部数据
     * @return
     */
    List<Classify> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Classify> findByLike(Classify classify);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     * @param classify
     */
    void modifyById(Classify classify);
}

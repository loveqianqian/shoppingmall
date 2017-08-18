package com.zhiboer.mall.service;

import com.zhiboer.mall.model.GoodsOutput;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface GoodsOutputService {

    /**
     * 添加一条数据
     * @return
     */
    GoodsOutput addOne(GoodsOutput goodsOutput);

    /**
     * 查询全部数据
     * @return
     */
    List<GoodsOutput> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<GoodsOutput> findByLike(GoodsOutput goodsOutput);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(GoodsOutput goodsOutput);
}

package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Goods;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface GoodsService {

    /**
     * 添加一条数据
     * @return
     */
    Goods addOne(Goods goods);

    /**
     * 查询全部数据
     * @return
     */
    List<Goods> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Goods> findByLike(Goods goods);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Goods goods);
}

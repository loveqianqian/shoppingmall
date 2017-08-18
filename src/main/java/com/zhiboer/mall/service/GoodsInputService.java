package com.zhiboer.mall.service;

import com.zhiboer.mall.model.GoodsInput;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface GoodsInputService {

    /**
     * 添加一条数据
     * @return
     */
    GoodsInput addOne(GoodsInput goodsInput);

    /**
     * 查询全部数据
     * @return
     */
    List<GoodsInput> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<GoodsInput> findByLike(GoodsInput goodsInput);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(GoodsInput goodsInput);
}

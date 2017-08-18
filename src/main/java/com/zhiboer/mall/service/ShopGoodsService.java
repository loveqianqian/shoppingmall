package com.zhiboer.mall.service;

import com.zhiboer.mall.dto.GoodsDto;
import com.zhiboer.mall.dto.RequireDto;
import com.zhiboer.mall.model.Shop;
import com.zhiboer.mall.model.ShopGoods;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface ShopGoodsService {

    /**
     * 添加一条数据
     * @return
     */
    ShopGoods addOne(ShopGoods shopGoods);
    /**
     * 批量添加
     * @return
     */
    boolean addBatch(List<ShopGoods> shopGoods);

    /**
     * 查询全部数据
     * @return
     */
    List<ShopGoods> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<ShopGoods> findByLike(GoodsDto goodsDto);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(ShopGoods shopGoods);
}

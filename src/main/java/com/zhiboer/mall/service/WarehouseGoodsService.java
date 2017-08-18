package com.zhiboer.mall.service;

import com.zhiboer.mall.dto.GoodsDto;
import com.zhiboer.mall.model.WarehouseGoods;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface WarehouseGoodsService {

    /**
     * 添加一条数据
     * @return
     */
    WarehouseGoods addOne(WarehouseGoods warehouseGoods);

    /**
     * 查询全部数据
     * @return
     */
    List<WarehouseGoods> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<WarehouseGoods> findByLike(GoodsDto goodsDto);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(WarehouseGoods warehouseGoods);
}

package com.zhiboer.mall.dao;

import com.zhiboer.mall.dto.GoodsDto;
import com.zhiboer.mall.model.Statistics;
import com.zhiboer.mall.model.WarehouseGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface WarehouseGoodsRepository {

    void insertOne(WarehouseGoods warehouseGoods);

    List<WarehouseGoods> selectAll();

    List<WarehouseGoods> selectByLike(GoodsDto goodsDto);

    void deleteById(String id);

    void updateById(WarehouseGoods warehouseGoods);
}

package com.zhiboer.mall.dao;

import com.zhiboer.mall.dto.GoodsDto;
import com.zhiboer.mall.model.ShopGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface ShopGoodsRepository {

    void insertOne(ShopGoods shopGoods);

    boolean insertBatch(List<ShopGoods> shopGoods);

    List<ShopGoods> selectAll();

    List<ShopGoods> selectByLike(GoodsDto goodsDto);

    void deleteById(String id);

    void updateById(ShopGoods shopGoods);
}

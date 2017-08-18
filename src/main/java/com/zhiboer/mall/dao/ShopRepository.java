package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Shop;
import com.zhiboer.mall.model.ShopGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
@Repository
public interface ShopRepository {

    void insertOne(Shop shop);

    List<Shop> selectAll();

    List<Shop> selectByLike(Shop shop);

    void deleteById(String id);

    void updateById(Shop shop);
}

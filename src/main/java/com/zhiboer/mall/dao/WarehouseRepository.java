package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Warehouse;
import com.zhiboer.mall.model.WarehouseGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
@Repository
public interface WarehouseRepository {

    void insertOne(Warehouse warehouse);

    List<Warehouse> selectAll();

    List<Warehouse> selectByLike(Warehouse warehouse);

    void deleteById(String id);

    void updateById(Warehouse warehouse);
}

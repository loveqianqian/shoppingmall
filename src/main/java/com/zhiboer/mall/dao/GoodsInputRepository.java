package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.GoodsInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface GoodsInputRepository {

    void insertOne(GoodsInput goodsInput);

    List<GoodsInput> selectAll();

    List<GoodsInput> selectByLike(GoodsInput goodsInput);

    void deleteById(String id);

    void updateById(GoodsInput goodsInput);
}

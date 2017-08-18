package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
@Repository
public interface GoodsRepository {

    void insertOne(Goods goods);

    List<Goods> selectAll();

    List<Goods> selectByLike(Goods goods);

    void deleteById(String id);

    void updateById(Goods goods);
}

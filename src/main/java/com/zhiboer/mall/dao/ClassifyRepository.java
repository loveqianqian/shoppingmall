package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.ChuUser;
import com.zhiboer.mall.model.Classify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface ClassifyRepository{

    void insertOne(Classify classify);

    List<Classify> selectAll();

    List<Classify> selectByLike(Classify classify);

    void deleteById(String id);

    void updateById(Classify classify);
}

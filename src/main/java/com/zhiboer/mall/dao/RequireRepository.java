package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Require;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface RequireRepository {

    void insertOne(Require require);

    void insertBatch(List<Require> requires);

    List<Require> selectAll();

    List<Require> selectByLike(Require require);

    void deleteById(String id);

    void updateById(Require require);
}

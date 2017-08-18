package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface StatisticsRepository {

    void insertOne(Statistics statistics);

    List<Statistics> selectAll();

    List<Statistics> selectByLike(Statistics statistics);

    void deleteById(String id);

    void updateById(Statistics statistics);
}

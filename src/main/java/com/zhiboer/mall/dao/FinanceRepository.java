package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/8/8.
 */
@Repository
public interface FinanceRepository {

    void insertOne(Finance finance);

    List<Finance> selectAll();

    List<Finance> selectByLike(Finance finance);

    void deleteById(String id);

    void updateById(Finance finance);
}

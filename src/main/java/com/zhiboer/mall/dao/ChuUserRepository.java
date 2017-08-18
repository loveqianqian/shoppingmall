package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.ChuUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
@Repository
public interface ChuUserRepository {

    void insertOne(ChuUser chuUser);

    List<ChuUser> selectAll();

    List<ChuUser> selectByLike(ChuUser chuUser);

    void deleteById(String id);

    void updateById(ChuUser chuUser);
}

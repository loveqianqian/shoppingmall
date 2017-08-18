package com.zhiboer.mall.dao;

import com.zhiboer.mall.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
@Repository
public interface ProviderRepository {

    void insertOne(Provider provider);

    List<Provider> selectAll();

    List<Provider> selectByLike(Provider provider);

    void deleteById(String id);

    void updateById(Provider provider);
}

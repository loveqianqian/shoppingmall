package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Provider;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface ProviderService {

    /**
     * 添加一条数据
     * @return
     */
    Provider addOne(Provider provider);

    /**
     * 查询全部数据
     * @return
     */
    List<Provider> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Provider> findByLike(Provider provider);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Provider provider);
}

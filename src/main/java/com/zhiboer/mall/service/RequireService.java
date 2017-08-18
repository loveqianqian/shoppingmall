package com.zhiboer.mall.service;

import com.zhiboer.mall.dto.RequireDto;
import com.zhiboer.mall.model.Require;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface RequireService {

    /**
     * 添加一条数据
     * @return
     */
    Require addOne(Require require);
    /**
     * 批量添加
     * @return
     */
    boolean addBatch(RequireDto dto);
    /**
     * 查询全部数据
     * @return
     */
    List<Require> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Require> findByLike(Require require);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Require require);
}

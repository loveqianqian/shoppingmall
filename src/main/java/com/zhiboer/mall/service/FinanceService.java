package com.zhiboer.mall.service;

import com.zhiboer.mall.model.Finance;

import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
public interface FinanceService {

    /**
     * 添加一条数据
     * @return
     */
    Finance addOne(Finance finance);

    /**
     * 查询全部数据
     * @return
     */
    List<Finance> findAll();

    /**
     * 查询匹配数据
     * @return
     */
    List<Finance> findByLike(Finance finance);

    /**
     * 根据id删除一条数据
     * @param id
     */
    void removeById(String id);

    /**
     * 根据id修改数据
     */
    void modifyById(Finance finance);
}

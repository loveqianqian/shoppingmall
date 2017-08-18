package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.ChuUserRepository;
import com.zhiboer.mall.model.ChuUser;
import com.zhiboer.mall.service.ChuUserService;
import com.zhiboer.mall.utils.CommonUtil;
import com.zhiboer.mall.utils.EmptyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by yao on 2017/7/17.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ChuUserServiceImpl implements ChuUserService {

    @Autowired
    private ChuUserRepository chuUserRepository;

    @Override
    public ChuUser addOne(ChuUser chuUser) {
        //添加一个新的
        chuUser.setId(CommonUtil.generateId());
        chuUser.setCreateTime(new Date());
        chuUser.setUpdateTime(new Date());
        chuUserRepository.insertOne(chuUser);
        return chuUser;
    }

    @Override
    public List<ChuUser> findAll() {
        return chuUserRepository.selectAll();
    }

    @Override
    public List<ChuUser> findByLike(ChuUser chuUser) {
        return chuUserRepository.selectByLike(chuUser);
    }

    @Override
    public void removeById(String id) {
        chuUserRepository.deleteById(id);
    }

    @Override
    public void modifyById(ChuUser chuUser) {
        chuUser.setUpdateTime(new Date());
        chuUserRepository.updateById(chuUser);
    }
}

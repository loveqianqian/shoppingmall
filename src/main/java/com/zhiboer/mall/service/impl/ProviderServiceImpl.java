package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.OrderRepository;
import com.zhiboer.mall.dao.ProviderRepository;
import com.zhiboer.mall.model.Provider;
import com.zhiboer.mall.service.ProviderService;
import com.zhiboer.mall.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    @Override
    public Provider addOne(Provider provider) {
        provider.setId(CommonUtil.generateId());
        provider.setCreateTime(new Date());
        provider.setUpdateTime(new Date());
        providerRepository.insertOne(provider);
        return provider;
    }

    @Override
    public List<Provider> findAll() {
        return providerRepository.selectAll();
    }

    @Override
    public List<Provider> findByLike(Provider provider) {
        return providerRepository.selectByLike(provider);
    }

    @Override
    public void removeById(String id) {
        providerRepository.deleteById(id);
    }

    @Override
    public void modifyById(Provider provider) {
        providerRepository.updateById(provider);
    }
}

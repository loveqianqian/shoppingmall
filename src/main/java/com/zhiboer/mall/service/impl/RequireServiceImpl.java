package com.zhiboer.mall.service.impl;

import com.zhiboer.mall.dao.PurchaseOrderRepository;
import com.zhiboer.mall.dao.RequireRepository;
import com.zhiboer.mall.dao.ShopGoodsRepository;
import com.zhiboer.mall.dto.RequireDto;
import com.zhiboer.mall.model.Require;
import com.zhiboer.mall.model.ShopGoods;
import com.zhiboer.mall.service.RequireService;
import com.zhiboer.mall.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yao on 2017/8/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RequireServiceImpl implements RequireService {

    @Autowired
    private RequireRepository requireRepository;
    @Autowired
    private ShopGoodsRepository shopGoodsRepository;

    @Override
    public Require addOne(Require require) {
        require.setId(CommonUtil.generateId());
        require.setCreateTime(new Date());
        require.setUpdateTime(new Date());
        requireRepository.insertOne(require);
        return require;
    }

    @Override
    public boolean addBatch(RequireDto dto) {
        List<Integer> addCounts = dto.getAddCounts();
        List<ShopGoods> shopGoods = dto.getShopGoodsList();
        String address = dto.getAddress();
        String shopName = dto.getShopName();
        String contactUser = dto.getContactUser();
        String contactWay = dto.getContactWay();
        String state = dto.getState();
        String orderCode = dto.getOrderCode();

        List<Require> requires = new ArrayList<>();
        Require require = null;
        for (int i=0; i<shopGoods.size(); i++) {
            require = new Require();
            require.setAddress(address);
            require.setContactUser(contactUser);
            require.setContactWay(contactWay);
            require.setShopName(shopName);
            require.setState(state);
            require.setCount(addCounts.get(i));
            require.setGoodsInfo(shopGoods.get(i).getGoodsName());
            require.setOrderCode(orderCode);
            require.setId(CommonUtil.generateId());
            require.setCreateTime(new Date());
            require.setUpdateTime(new Date());
            require.setCreateUser(dto.getCreateUser());
            require.setUpdateUser(dto.getUpdateUser());

            shopGoods.get(i).setCreateTime(new Date());
            shopGoods.get(i).setCreateUser(dto.getCreateUser());
            shopGoods.get(i).setUpdateTime(new Date());
            shopGoods.get(i).setUpdateUser(dto.getUpdateUser());
            shopGoods.get(i).setId(CommonUtil.generateId());
            shopGoods.get(i).setStock(addCounts.get(i));


            requires.add(require);
        }

        requireRepository.insertBatch(requires);
        shopGoodsRepository.insertBatch(shopGoods);

        return true;
    }

    @Override
    public List<Require> findAll() {
        return requireRepository.selectAll();
    }

    @Override
    public List<Require> findByLike(Require require) {
        return requireRepository.selectByLike(require);
    }

    @Override
    public void removeById(String id) {
        requireRepository.deleteById(id);
    }

    @Override
    public void modifyById(Require require) {
        requireRepository.updateById(require);
    }
}

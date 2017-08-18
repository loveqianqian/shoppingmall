package com.zhiboer.mall.dto;

import com.zhiboer.mall.model.ShopGoods;

import java.util.List;

/**
 * Created by yao on 2017/8/18.
 */
public class RequireDto {
    /**
     * 便利店名
     */
    private String shopName;
    /**
     * 地址
     */
    private String address;
    /**
     * 联系方式
     */
    private String contactWay;
    /**
     * 联系人
     */
    private String contactUser;
    /**
     * 商品列表
     */
    private List<ShopGoods> shopGoodsList;
    /**
     * 商品数量
     */
    private List<Integer> addCounts;
    /**
     * 状态
     */
    private String state;
    /**
     * 订单号
     */
    private String orderCode;
    /**
     * 创建者
     */
    private String createUser;
    /**
     * 修改者
     */
    private String updateUser;

    public List<ShopGoods> getShopGoodsList() {
        return shopGoodsList;
    }

    public void setShopGoodsList(List<ShopGoods> shopGoodsList) {
        this.shopGoodsList = shopGoodsList;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getContactUser() {
        return contactUser;
    }

    public void setContactUser(String contactUser) {
        this.contactUser = contactUser;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Integer> getAddCounts() {
        return addCounts;
    }

    public void setAddCounts(List<Integer> addCounts) {
        this.addCounts = addCounts;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}

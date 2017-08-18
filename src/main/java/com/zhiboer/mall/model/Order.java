package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/8/7.
 */
@Entity
@Table(name = "t_order")
public class Order {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 编码
     */
    @Column(name = "code")
    private String code;
    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;
    /**
     * 商品数量
     */
    @Column(name = "goods_count")
    private Integer goodsCount;
    /**
     * 便利店名
     */
    @Column(name = "shop_name")
    private String shopName;
    /**
     * 地址
     */
    @Column(name = "address")
    private String address;
    /**
     * 联系人
     */
    @Column(name = "contract_user")
    private String contractUser;
    /**
     * 金额
     */
    @Column(name = "money_count")
    private Double moneyCount;
    /**
     * 状态
     */
    @Column(name = "state")
    private String state;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    /**
     * 创建者
     */
    @Column(name = "create_user")
    private String createUser;
    /**
     * 修改时间
     */
    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    /**
     * 修改者
     */
    @Column(name = "update_user")
    private String updateUser;

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
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

    public String getContractUser() {
        return contractUser;
    }

    public void setContractUser(String contractUser) {
        this.contractUser = contractUser;
    }

    public Double getMoneyCount() {
        return moneyCount;
    }

    public void setMoneyCount(Double moneyCount) {
        this.moneyCount = moneyCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}

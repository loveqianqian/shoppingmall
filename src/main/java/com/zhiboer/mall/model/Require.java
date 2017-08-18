package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/8/8.
 */
@Entity
@Table(name = "t_require")
public class Require {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 订单编号
     */
    @Column(name = "order_code")
    private String orderCode;
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
     * 联系方式
     */
    @Column(name = "contact_way")
    private String contactWay;
    /**
     * 联系人
     */
    @Column(name = "contact_user")
    private String contactUser;
    /**
     * 商品信息
     */
    @Column(name = "goods_info")
    private String goodsInfo;
    /**
     * 类目
     */
    @Column(name = "kind")
    private String kind;
    /**
     * 数量
     */
    @Column(name = "count")
    private Integer count;
    /**
     * 联系人
     */
    @Column(name = "money")
    private Double money;
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

    public Require() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
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

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
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

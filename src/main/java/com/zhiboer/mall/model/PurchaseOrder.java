package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/7/17.
 */
@Entity
@Table(name = "t_purchase_order")
public class PurchaseOrder {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 采购单号
     */
    @Column(name = "order_code")
    private String orderCode;
    /**
     * 供货商id
     */
    @Column(name = "provider_id")
    private String providerId;
    /**
     * 采购金额
     */
    @Column(name = "price", precision = 2)
    private Integer price;
    /**
     * 制单人
     */
    @Column(name = "make_order_user")
    private String makeOrderUser;
    /**
     * 采购员
     */
    @Column(name = "purchase_user")
    private String purchaseUser;
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

    public PurchaseOrder() {
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

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getMakeOrderUser() {
        return makeOrderUser;
    }

    public void setMakeOrderUser(String makeOrderUser) {
        this.makeOrderUser = makeOrderUser;
    }

    public String getPurchaseUser() {
        return purchaseUser;
    }

    public void setPurchaseUser(String purchaseUser) {
        this.purchaseUser = purchaseUser;
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

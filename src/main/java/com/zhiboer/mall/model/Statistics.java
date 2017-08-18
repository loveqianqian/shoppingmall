package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/8/8.
 */
@Entity
@Table(name = "t_statistics")
public class Statistics {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 便利店编码
     */
    @Column(name = "shop_code")
    private String shopCode;
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
     * 采购价
     */
    @Column(name = "purchase_price")
    private Double purchasePrice;
    /**
     * 配送价
     */
    @Column(name = "send_price")
    private Double sendPrice;
    /**
     * 零售价
     */
    @Column(name = "sell_price")
    private Double sellPrice;
    /**
     * 利润
     */
    @Column(name = "profit")
    private Double profit;
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

    public Statistics() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
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

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getSendPrice() {
        return sendPrice;
    }

    public void setSendPrice(Double sendPrice) {
        this.sendPrice = sendPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
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

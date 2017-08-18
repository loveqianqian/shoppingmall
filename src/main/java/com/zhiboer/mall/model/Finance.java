package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/8/7.
 */
@Entity
@Table(name = "t_finance")
public class Finance {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 店铺ID
     */
    @Column(name = "shop_id")
    private String shopId;
    /**
     * 店铺名
     */
    @Column(name = "shop_name")
    private String shopName;
    /**
     * 商品数量
     */
    @Column(name = "goods_count")
    private Integer goodsCount;
    /**
     * 进货总额
     */
    @Column(name = "import_fee")
    private Double importFee;
    /**
     * 销售总额
     */
    @Column(name = "sell_fee")
    private Double sellFee;
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

    public Finance() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Double getImportFee() {
        return importFee;
    }

    public void setImportFee(Double importFee) {
        this.importFee = importFee;
    }

    public Double getSellFee() {
        return sellFee;
    }

    public void setSellFee(Double sellFee) {
        this.sellFee = sellFee;
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

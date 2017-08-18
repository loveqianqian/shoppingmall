package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/8/8.
 */
@Entity
@Table(name = "t_shop_goods")
public class ShopGoods {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 商品编码
     */
    @Column(name = "goods_code")
    private String goodsCode;
    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;
    /**
     * 商品规格
     */
    @Column(name = "goods_scale")
    private String goodsScale;
    /**
     * 单位
     */
    @Column(name = "unit")
    private String unit;
    /**
     * 市场价
     */
    @Column(name = "sell_price")
    private Double sellPrice;
    /**
     * 库存
     */
    @Column(name = "stock")
    private Integer stock;
    /**
     * 预警库存
     */
    @Column(name = "limit_stock")
    private Integer limitStock;
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

    public ShopGoods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsScale() {
        return goodsScale;
    }

    public void setGoodsScale(String goodsScale) {
        this.goodsScale = goodsScale;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLimitStock() {
        return limitStock;
    }

    public void setLimitStock(Integer limitStock) {
        this.limitStock = limitStock;
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

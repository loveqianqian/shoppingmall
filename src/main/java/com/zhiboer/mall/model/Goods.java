package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/7/17.
 */
@Entity
@Table(name = "t_goods")
public class Goods {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 商品名
     */
    @Column(name = "name")
    private String name;
    /**
     * 商品种类
     */
    @Column(name = "kind")
    private String kind;
    /**
     * 商品编码
     */
    @Column(name = "code")
    private String code;
    /**
     * 品牌
     */
    @Column(name = "brand")
    private String brand;
    /**
     * 供货商id
     */
    @Column(name = "provider_id")
    private String providerId;
    /**
     * 包装规格
     */
    @Column(name = "package_standard")
    private String packageStandard;
    /**
     * 库存
     */
    @Column(name = "stock")
    private String stock;
    /**
     * 采购价
     */
    @Column(name = "import_price", precision = 2)
    private Integer importPrice;
    /**
     * 配送价
     */
    @Column(name = "send_price", precision = 2)
    private Integer sendPrice;
    /**
     * 零售价
     */
    @Column(name = "sell_price", precision = 2)
    private Integer sellPrice;
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
    /**
     * 状态
     */
    @Column(name = "state")
    private String state;

    public Goods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getPackageStandard() {
        return packageStandard;
    }

    public void setPackageStandard(String packageStandard) {
        this.packageStandard = packageStandard;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Integer getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(Integer importPrice) {
        this.importPrice = importPrice;
    }

    public Integer getSendPrice() {
        return sendPrice;
    }

    public void setSendPrice(Integer sendPrice) {
        this.sendPrice = sendPrice;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/8/7.
 */
@Entity
@Table(name = "t_goods_output")
public class GoodsOutput {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 订单号
     */
    @Column(name = "order_code")
    private String orderCode;
    /**
     * 所属仓库
     */
    @Column(name = "warehouse_id")
    private String warehouseId;
    /**
     * 制单人
     */
    @Column(name = "make_user")
    private String makeUser;
    /**
     * 联系方式
     */
    @Column(name = "contact_way")
    private String contractWay;
    /**
     * 出库时间
     */
    @Column(name = "output_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date outputTime;
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

    public GoodsOutput() {
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

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getMakeUser() {
        return makeUser;
    }

    public void setMakeUser(String makeUser) {
        this.makeUser = makeUser;
    }

    public String getContractWay() {
        return contractWay;
    }

    public void setContractWay(String contractWay) {
        this.contractWay = contractWay;
    }

    public Date getInputTime() {
        return outputTime;
    }

    public void setInputTime(Date outputTime) {
        this.outputTime = outputTime;
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

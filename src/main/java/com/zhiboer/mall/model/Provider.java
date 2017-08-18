package com.zhiboer.mall.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by yao on 2017/7/17.
 */
@Entity
@Table(name = "t_provider")
public class Provider {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     * 供货商名
     */
    @Column(name = "code")
    private String code;
    /**
     * 供货商名
     */
    @Column(name = "name")
    private String name;
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
     * 配送范围
     */
    @Column(name = "dispatch_scope")
    private String dispatchScope;
    /**
     * 供货商地址
     */
    @Column(name = "address")
    private String address;
    /**
     * 业务员
     */
    @Column(name = "saleman")
    private String saleman;
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

    public Provider() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDispatchScope() {
        return dispatchScope;
    }

    public void setDispatchScope(String dispatchScope) {
        this.dispatchScope = dispatchScope;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSaleman() {
        return saleman;
    }

    public void setSaleman(String saleman) {
        this.saleman = saleman;
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

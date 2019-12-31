package com.example.demo.testDemo.springMVC.entity;

import java.util.Date;

public class WsUrRole {
    private Integer wsUrRoleId;

    private Integer parentId;

    private String name;

    private String code;

    private Integer rank;

    private Integer LEVEL;

    private Byte adminType;

    private Integer mainUserId;

    private Date createTime;

    private Integer version;

    public Integer getWsUrRoleId() {
        return wsUrRoleId;
    }

    public void setWsUrRoleId(Integer wsUrRoleId) {
        this.wsUrRoleId = wsUrRoleId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(Integer LEVEL) {
        this.LEVEL = LEVEL;
    }

    public Byte getAdminType() {
        return adminType;
    }

    public void setAdminType(Byte adminType) {
        this.adminType = adminType;
    }

    public Integer getMainUserId() {
        return mainUserId;
    }

    public void setMainUserId(Integer mainUserId) {
        this.mainUserId = mainUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
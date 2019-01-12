package com.atguigu.atcrowdfunding.bean;

/**
 * @Author Elvis Chen
 * @Date 2019/1/11 17:48
 * @Version 1.0
 **/
public class RolePermission {

    private Integer id;

    private Integer roleid;

    private Integer permissionid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }
}

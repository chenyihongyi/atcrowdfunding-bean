package com.atguigu.atcrowdfunding.bean;

/**
 * @Author Elvis Chen
 * @Date 2019/1/11 18:59
 * @Version 1.0
 **/
public class MemberAddress {

    private Integer id;

    private Integer memberid;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

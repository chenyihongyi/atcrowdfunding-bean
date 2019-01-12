package com.atguigu.atcrowdfunding.bean;

/**
 * @Author Elvis Chen
 * @Date 2019/1/11 18:57
 * @Version 1.0
 **/
public class MemberCert {

    private Integer id;

    private Integer memberid;

    private Integer certid;

    private String icopath;

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

    public Integer getCertid() {
        return certid;
    }

    public void setCertid(Integer certid) {
        this.certid = certid;
    }

    public String getIcopath() {
        return icopath;
    }

    public void setIcopath(String icopath) {
        this.icopath = icopath;
    }
}

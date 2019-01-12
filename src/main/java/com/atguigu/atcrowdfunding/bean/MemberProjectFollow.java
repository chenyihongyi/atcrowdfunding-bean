package com.atguigu.atcrowdfunding.bean;

/**
 * @Author Elvis Chen
 * @Date 2019/1/11 18:55
 * @Version 1.0
 **/
public class MemberProjectFollow {

    private Integer id;

    private Integer projectid;

    private Integer memberid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }
}

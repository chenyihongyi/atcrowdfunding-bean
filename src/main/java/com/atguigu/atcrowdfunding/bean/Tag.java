package com.atguigu.atcrowdfunding.bean;

/**
 * @Author Elvis Chen
 * @Date 2019/1/11 17:46
 * @Version 1.0
 **/
public class Tag {

    private Integer id;

    private Integer pid;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.guigu.instructional.po;

public class AttAttendancetype {
    private Integer typeid;

    private String typename;

    private Integer typecategory;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTypecategory() {
        return typecategory;
    }

    public void setTypecategory(Integer typecategory) {
        this.typecategory = typecategory;
    }
}
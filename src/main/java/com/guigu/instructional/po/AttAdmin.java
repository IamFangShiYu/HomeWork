package com.guigu.instructional.po;

public class AttAdmin {
    private Integer adminid;

    private String adminaccount;

    private String adminpwd;

    private Integer adminstate;

    private Integer adminright;

    private String adminname;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount == null ? null : adminaccount.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    public Integer getAdminstate() {
        return adminstate;
    }

    public void setAdminstate(Integer adminstate) {
        this.adminstate = adminstate;
    }

    public Integer getAdminright() {
        return adminright;
    }

    public void setAdminright(Integer adminright) {
        this.adminright = adminright;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }
}
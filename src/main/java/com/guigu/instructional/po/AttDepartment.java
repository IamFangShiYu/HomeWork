package com.guigu.instructional.po;

public class AttDepartment {
    private Integer departmentid;

    private String departmentname;

    private String starttimeam;

    private String endtimeam;

    private String starttimepm;

    private String endtimepm;

    private Integer weektype;

    private Integer parentid;

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getStarttimeam() {
        return starttimeam;
    }

    public void setStarttimeam(String starttimeam) {
        this.starttimeam = starttimeam == null ? null : starttimeam.trim();
    }

    public String getEndtimeam() {
        return endtimeam;
    }

    public void setEndtimeam(String endtimeam) {
        this.endtimeam = endtimeam == null ? null : endtimeam.trim();
    }

    public String getStarttimepm() {
        return starttimepm;
    }

    public void setStarttimepm(String starttimepm) {
        this.starttimepm = starttimepm == null ? null : starttimepm.trim();
    }

    public String getEndtimepm() {
        return endtimepm;
    }

    public void setEndtimepm(String endtimepm) {
        this.endtimepm = endtimepm == null ? null : endtimepm.trim();
    }

    public Integer getWeektype() {
        return weektype;
    }

    public void setWeektype(Integer weektype) {
        this.weektype = weektype;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
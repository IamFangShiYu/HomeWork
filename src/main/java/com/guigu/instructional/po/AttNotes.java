package com.guigu.instructional.po;

import java.util.Date;

public class AttNotes {
    private Integer noteid;

    private Integer departmentid;

    private Integer employeeid;

    private Integer notetype;

    private Integer adminid;

    private Integer operatorid;

    private String employeesids;

    private String cause;

    private Date fillintime;

    private String directorsign;

    private String administrationsign;

    private String presidentsign;

    private Date startdate;

    private String starttime;

    private Date enddate;

    private String endtime;

    private String overtimesids;

    private String vehicle;

    private String projectname;

    private String notememo;

    private Integer isverify;

    public Integer getNoteid() {
        return noteid;
    }

    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getNotetype() {
        return notetype;
    }

    public void setNotetype(Integer notetype) {
        this.notetype = notetype;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public String getEmployeesids() {
        return employeesids;
    }

    public void setEmployeesids(String employeesids) {
        this.employeesids = employeesids == null ? null : employeesids.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public Date getFillintime() {
        return fillintime;
    }

    public void setFillintime(Date fillintime) {
        this.fillintime = fillintime;
    }

    public String getDirectorsign() {
        return directorsign;
    }

    public void setDirectorsign(String directorsign) {
        this.directorsign = directorsign == null ? null : directorsign.trim();
    }

    public String getAdministrationsign() {
        return administrationsign;
    }

    public void setAdministrationsign(String administrationsign) {
        this.administrationsign = administrationsign == null ? null : administrationsign.trim();
    }

    public String getPresidentsign() {
        return presidentsign;
    }

    public void setPresidentsign(String presidentsign) {
        this.presidentsign = presidentsign == null ? null : presidentsign.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getOvertimesids() {
        return overtimesids;
    }

    public void setOvertimesids(String overtimesids) {
        this.overtimesids = overtimesids == null ? null : overtimesids.trim();
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle == null ? null : vehicle.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getNotememo() {
        return notememo;
    }

    public void setNotememo(String notememo) {
        this.notememo = notememo == null ? null : notememo.trim();
    }

    public Integer getIsverify() {
        return isverify;
    }

    public void setIsverify(Integer isverify) {
        this.isverify = isverify;
    }
}
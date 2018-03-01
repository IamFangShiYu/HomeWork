package com.guigu.instructional.po;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class AttOvertimerecord {
    private Integer overtimeid;

    @NotNull(message="{employeeid.isNULL}")
    private Integer employeeid;

    @NotNull(message="{operatorid.isNULL}")
    private Integer operatorid;

    private Integer noteid;

    @NotNull(message="{overtimedate.isNULL}")
    private Date overtimedate;

    @NotNull(message="{overtimeflag.isNULL}")
    private Integer overtimeflag;

    @NotNull(message="{overtimestate.isNULL}")
    private Integer overtimestate;

    private Integer isverify;

    private String overtimememo;

    public Integer getOvertimeid() {
        return overtimeid;
    }

    public void setOvertimeid(Integer overtimeid) {
        this.overtimeid = overtimeid;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public Integer getNoteid() {
        return noteid;
    }

    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    public Date getOvertimedate() {
        return overtimedate;
    }

    public void setOvertimedate(Date overtimedate) {
        this.overtimedate = overtimedate;
    }

    public Integer getOvertimeflag() {
        return overtimeflag;
    }

    public void setOvertimeflag(Integer overtimeflag) {
        this.overtimeflag = overtimeflag;
    }

    public Integer getOvertimestate() {
        return overtimestate;
    }

    public void setOvertimestate(Integer overtimestate) {
        this.overtimestate = overtimestate;
    }

    public Integer getIsverify() {
        return isverify;
    }

    public void setIsverify(Integer isverify) {
        this.isverify = isverify;
    }

    public String getOvertimememo() {
        return overtimememo;
    }

    public void setOvertimememo(String overtimememo) {
        this.overtimememo = overtimememo == null ? null : overtimememo.trim();
    }
}
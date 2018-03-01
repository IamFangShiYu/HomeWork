package com.guigu.instructional.po;

public class AttEmployees {
    private Integer employeeid;

    private Integer department;

    private Integer position;

    private String employeename;

    private Integer employeegender;

    private String cardnumber;

    private Integer employeestate;

    private String employeememo;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public Integer getEmployeegender() {
        return employeegender;
    }

    public void setEmployeegender(Integer employeegender) {
        this.employeegender = employeegender;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public Integer getEmployeestate() {
        return employeestate;
    }

    public void setEmployeestate(Integer employeestate) {
        this.employeestate = employeestate;
    }

    public String getEmployeememo() {
        return employeememo;
    }

    public void setEmployeememo(String employeememo) {
        this.employeememo = employeememo == null ? null : employeememo.trim();
    }
}
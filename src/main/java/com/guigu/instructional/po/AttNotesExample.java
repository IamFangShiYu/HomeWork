package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttNotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttNotesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNoteidIsNull() {
            addCriterion("NoteID is null");
            return (Criteria) this;
        }

        public Criteria andNoteidIsNotNull() {
            addCriterion("NoteID is not null");
            return (Criteria) this;
        }

        public Criteria andNoteidEqualTo(Integer value) {
            addCriterion("NoteID =", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotEqualTo(Integer value) {
            addCriterion("NoteID <>", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThan(Integer value) {
            addCriterion("NoteID >", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoteID >=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThan(Integer value) {
            addCriterion("NoteID <", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidLessThanOrEqualTo(Integer value) {
            addCriterion("NoteID <=", value, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidIn(List<Integer> values) {
            addCriterion("NoteID in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotIn(List<Integer> values) {
            addCriterion("NoteID not in", values, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidBetween(Integer value1, Integer value2) {
            addCriterion("NoteID between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andNoteidNotBetween(Integer value1, Integer value2) {
            addCriterion("NoteID not between", value1, value2, "noteid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("DepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("DepartmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("DepartmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("DepartmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DepartmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("DepartmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("DepartmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("DepartmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("DepartmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("EmployeeID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("EmployeeID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(Integer value) {
            addCriterion("EmployeeID =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(Integer value) {
            addCriterion("EmployeeID <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(Integer value) {
            addCriterion("EmployeeID >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmployeeID >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(Integer value) {
            addCriterion("EmployeeID <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(Integer value) {
            addCriterion("EmployeeID <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<Integer> values) {
            addCriterion("EmployeeID in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<Integer> values) {
            addCriterion("EmployeeID not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(Integer value1, Integer value2) {
            addCriterion("EmployeeID between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(Integer value1, Integer value2) {
            addCriterion("EmployeeID not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andNotetypeIsNull() {
            addCriterion("NoteType is null");
            return (Criteria) this;
        }

        public Criteria andNotetypeIsNotNull() {
            addCriterion("NoteType is not null");
            return (Criteria) this;
        }

        public Criteria andNotetypeEqualTo(Integer value) {
            addCriterion("NoteType =", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeNotEqualTo(Integer value) {
            addCriterion("NoteType <>", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeGreaterThan(Integer value) {
            addCriterion("NoteType >", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoteType >=", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeLessThan(Integer value) {
            addCriterion("NoteType <", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeLessThanOrEqualTo(Integer value) {
            addCriterion("NoteType <=", value, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeIn(List<Integer> values) {
            addCriterion("NoteType in", values, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeNotIn(List<Integer> values) {
            addCriterion("NoteType not in", values, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeBetween(Integer value1, Integer value2) {
            addCriterion("NoteType between", value1, value2, "notetype");
            return (Criteria) this;
        }

        public Criteria andNotetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("NoteType not between", value1, value2, "notetype");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("AdminID is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("AdminID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("AdminID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("AdminID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("AdminID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("AdminID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("AdminID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("AdminID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("AdminID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("AdminID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminID not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("OperatorID is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("OperatorID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(Integer value) {
            addCriterion("OperatorID =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(Integer value) {
            addCriterion("OperatorID <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(Integer value) {
            addCriterion("OperatorID >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperatorID >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(Integer value) {
            addCriterion("OperatorID <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(Integer value) {
            addCriterion("OperatorID <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<Integer> values) {
            addCriterion("OperatorID in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<Integer> values) {
            addCriterion("OperatorID not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(Integer value1, Integer value2) {
            addCriterion("OperatorID between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("OperatorID not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsIsNull() {
            addCriterion("EmployeesIDs is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsIsNotNull() {
            addCriterion("EmployeesIDs is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsEqualTo(String value) {
            addCriterion("EmployeesIDs =", value, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsNotEqualTo(String value) {
            addCriterion("EmployeesIDs <>", value, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsGreaterThan(String value) {
            addCriterion("EmployeesIDs >", value, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeesIDs >=", value, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsLessThan(String value) {
            addCriterion("EmployeesIDs <", value, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsLessThanOrEqualTo(String value) {
            addCriterion("EmployeesIDs <=", value, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsLike(String value) {
            addCriterion("EmployeesIDs like", value, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsNotLike(String value) {
            addCriterion("EmployeesIDs not like", value, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsIn(List<String> values) {
            addCriterion("EmployeesIDs in", values, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsNotIn(List<String> values) {
            addCriterion("EmployeesIDs not in", values, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsBetween(String value1, String value2) {
            addCriterion("EmployeesIDs between", value1, value2, "employeesids");
            return (Criteria) this;
        }

        public Criteria andEmployeesidsNotBetween(String value1, String value2) {
            addCriterion("EmployeesIDs not between", value1, value2, "employeesids");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("Cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("Cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("Cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("Cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("Cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("Cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("Cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("Cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("Cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("Cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("Cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("Cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("Cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("Cause not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andFillintimeIsNull() {
            addCriterion("FillInTime is null");
            return (Criteria) this;
        }

        public Criteria andFillintimeIsNotNull() {
            addCriterion("FillInTime is not null");
            return (Criteria) this;
        }

        public Criteria andFillintimeEqualTo(Date value) {
            addCriterion("FillInTime =", value, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeNotEqualTo(Date value) {
            addCriterion("FillInTime <>", value, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeGreaterThan(Date value) {
            addCriterion("FillInTime >", value, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FillInTime >=", value, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeLessThan(Date value) {
            addCriterion("FillInTime <", value, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeLessThanOrEqualTo(Date value) {
            addCriterion("FillInTime <=", value, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeIn(List<Date> values) {
            addCriterion("FillInTime in", values, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeNotIn(List<Date> values) {
            addCriterion("FillInTime not in", values, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeBetween(Date value1, Date value2) {
            addCriterion("FillInTime between", value1, value2, "fillintime");
            return (Criteria) this;
        }

        public Criteria andFillintimeNotBetween(Date value1, Date value2) {
            addCriterion("FillInTime not between", value1, value2, "fillintime");
            return (Criteria) this;
        }

        public Criteria andDirectorsignIsNull() {
            addCriterion("DirectorSign is null");
            return (Criteria) this;
        }

        public Criteria andDirectorsignIsNotNull() {
            addCriterion("DirectorSign is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorsignEqualTo(String value) {
            addCriterion("DirectorSign =", value, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignNotEqualTo(String value) {
            addCriterion("DirectorSign <>", value, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignGreaterThan(String value) {
            addCriterion("DirectorSign >", value, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignGreaterThanOrEqualTo(String value) {
            addCriterion("DirectorSign >=", value, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignLessThan(String value) {
            addCriterion("DirectorSign <", value, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignLessThanOrEqualTo(String value) {
            addCriterion("DirectorSign <=", value, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignLike(String value) {
            addCriterion("DirectorSign like", value, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignNotLike(String value) {
            addCriterion("DirectorSign not like", value, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignIn(List<String> values) {
            addCriterion("DirectorSign in", values, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignNotIn(List<String> values) {
            addCriterion("DirectorSign not in", values, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignBetween(String value1, String value2) {
            addCriterion("DirectorSign between", value1, value2, "directorsign");
            return (Criteria) this;
        }

        public Criteria andDirectorsignNotBetween(String value1, String value2) {
            addCriterion("DirectorSign not between", value1, value2, "directorsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignIsNull() {
            addCriterion("AdministrationSign is null");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignIsNotNull() {
            addCriterion("AdministrationSign is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignEqualTo(String value) {
            addCriterion("AdministrationSign =", value, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignNotEqualTo(String value) {
            addCriterion("AdministrationSign <>", value, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignGreaterThan(String value) {
            addCriterion("AdministrationSign >", value, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignGreaterThanOrEqualTo(String value) {
            addCriterion("AdministrationSign >=", value, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignLessThan(String value) {
            addCriterion("AdministrationSign <", value, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignLessThanOrEqualTo(String value) {
            addCriterion("AdministrationSign <=", value, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignLike(String value) {
            addCriterion("AdministrationSign like", value, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignNotLike(String value) {
            addCriterion("AdministrationSign not like", value, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignIn(List<String> values) {
            addCriterion("AdministrationSign in", values, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignNotIn(List<String> values) {
            addCriterion("AdministrationSign not in", values, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignBetween(String value1, String value2) {
            addCriterion("AdministrationSign between", value1, value2, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andAdministrationsignNotBetween(String value1, String value2) {
            addCriterion("AdministrationSign not between", value1, value2, "administrationsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignIsNull() {
            addCriterion("PresidentSign is null");
            return (Criteria) this;
        }

        public Criteria andPresidentsignIsNotNull() {
            addCriterion("PresidentSign is not null");
            return (Criteria) this;
        }

        public Criteria andPresidentsignEqualTo(String value) {
            addCriterion("PresidentSign =", value, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignNotEqualTo(String value) {
            addCriterion("PresidentSign <>", value, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignGreaterThan(String value) {
            addCriterion("PresidentSign >", value, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignGreaterThanOrEqualTo(String value) {
            addCriterion("PresidentSign >=", value, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignLessThan(String value) {
            addCriterion("PresidentSign <", value, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignLessThanOrEqualTo(String value) {
            addCriterion("PresidentSign <=", value, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignLike(String value) {
            addCriterion("PresidentSign like", value, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignNotLike(String value) {
            addCriterion("PresidentSign not like", value, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignIn(List<String> values) {
            addCriterion("PresidentSign in", values, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignNotIn(List<String> values) {
            addCriterion("PresidentSign not in", values, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignBetween(String value1, String value2) {
            addCriterion("PresidentSign between", value1, value2, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andPresidentsignNotBetween(String value1, String value2) {
            addCriterion("PresidentSign not between", value1, value2, "presidentsign");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("StartTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("StartTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("EndTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("EndTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsIsNull() {
            addCriterion("OvertimesIDs is null");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsIsNotNull() {
            addCriterion("OvertimesIDs is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsEqualTo(String value) {
            addCriterion("OvertimesIDs =", value, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsNotEqualTo(String value) {
            addCriterion("OvertimesIDs <>", value, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsGreaterThan(String value) {
            addCriterion("OvertimesIDs >", value, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsGreaterThanOrEqualTo(String value) {
            addCriterion("OvertimesIDs >=", value, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsLessThan(String value) {
            addCriterion("OvertimesIDs <", value, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsLessThanOrEqualTo(String value) {
            addCriterion("OvertimesIDs <=", value, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsLike(String value) {
            addCriterion("OvertimesIDs like", value, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsNotLike(String value) {
            addCriterion("OvertimesIDs not like", value, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsIn(List<String> values) {
            addCriterion("OvertimesIDs in", values, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsNotIn(List<String> values) {
            addCriterion("OvertimesIDs not in", values, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsBetween(String value1, String value2) {
            addCriterion("OvertimesIDs between", value1, value2, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andOvertimesidsNotBetween(String value1, String value2) {
            addCriterion("OvertimesIDs not between", value1, value2, "overtimesids");
            return (Criteria) this;
        }

        public Criteria andVehicleIsNull() {
            addCriterion("Vehicle is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIsNotNull() {
            addCriterion("Vehicle is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleEqualTo(String value) {
            addCriterion("Vehicle =", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleNotEqualTo(String value) {
            addCriterion("Vehicle <>", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleGreaterThan(String value) {
            addCriterion("Vehicle >", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleGreaterThanOrEqualTo(String value) {
            addCriterion("Vehicle >=", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleLessThan(String value) {
            addCriterion("Vehicle <", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleLessThanOrEqualTo(String value) {
            addCriterion("Vehicle <=", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleLike(String value) {
            addCriterion("Vehicle like", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleNotLike(String value) {
            addCriterion("Vehicle not like", value, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleIn(List<String> values) {
            addCriterion("Vehicle in", values, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleNotIn(List<String> values) {
            addCriterion("Vehicle not in", values, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleBetween(String value1, String value2) {
            addCriterion("Vehicle between", value1, value2, "vehicle");
            return (Criteria) this;
        }

        public Criteria andVehicleNotBetween(String value1, String value2) {
            addCriterion("Vehicle not between", value1, value2, "vehicle");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("ProjectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("ProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("ProjectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("ProjectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("ProjectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("ProjectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ProjectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("ProjectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("ProjectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("ProjectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("ProjectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("ProjectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("ProjectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andNotememoIsNull() {
            addCriterion("NoteMemo is null");
            return (Criteria) this;
        }

        public Criteria andNotememoIsNotNull() {
            addCriterion("NoteMemo is not null");
            return (Criteria) this;
        }

        public Criteria andNotememoEqualTo(String value) {
            addCriterion("NoteMemo =", value, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoNotEqualTo(String value) {
            addCriterion("NoteMemo <>", value, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoGreaterThan(String value) {
            addCriterion("NoteMemo >", value, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoGreaterThanOrEqualTo(String value) {
            addCriterion("NoteMemo >=", value, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoLessThan(String value) {
            addCriterion("NoteMemo <", value, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoLessThanOrEqualTo(String value) {
            addCriterion("NoteMemo <=", value, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoLike(String value) {
            addCriterion("NoteMemo like", value, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoNotLike(String value) {
            addCriterion("NoteMemo not like", value, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoIn(List<String> values) {
            addCriterion("NoteMemo in", values, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoNotIn(List<String> values) {
            addCriterion("NoteMemo not in", values, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoBetween(String value1, String value2) {
            addCriterion("NoteMemo between", value1, value2, "notememo");
            return (Criteria) this;
        }

        public Criteria andNotememoNotBetween(String value1, String value2) {
            addCriterion("NoteMemo not between", value1, value2, "notememo");
            return (Criteria) this;
        }

        public Criteria andIsverifyIsNull() {
            addCriterion("IsVerify is null");
            return (Criteria) this;
        }

        public Criteria andIsverifyIsNotNull() {
            addCriterion("IsVerify is not null");
            return (Criteria) this;
        }

        public Criteria andIsverifyEqualTo(Integer value) {
            addCriterion("IsVerify =", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotEqualTo(Integer value) {
            addCriterion("IsVerify <>", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyGreaterThan(Integer value) {
            addCriterion("IsVerify >", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsVerify >=", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyLessThan(Integer value) {
            addCriterion("IsVerify <", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyLessThanOrEqualTo(Integer value) {
            addCriterion("IsVerify <=", value, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyIn(List<Integer> values) {
            addCriterion("IsVerify in", values, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotIn(List<Integer> values) {
            addCriterion("IsVerify not in", values, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyBetween(Integer value1, Integer value2) {
            addCriterion("IsVerify between", value1, value2, "isverify");
            return (Criteria) this;
        }

        public Criteria andIsverifyNotBetween(Integer value1, Integer value2) {
            addCriterion("IsVerify not between", value1, value2, "isverify");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
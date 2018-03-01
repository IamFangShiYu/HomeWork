package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.List;

public class AttEmployeesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttEmployeesExample() {
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

        public Criteria andDepartmentIsNull() {
            addCriterion("Department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("Department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Integer value) {
            addCriterion("Department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Integer value) {
            addCriterion("Department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Integer value) {
            addCriterion("Department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("Department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Integer value) {
            addCriterion("Department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("Department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Integer> values) {
            addCriterion("Department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Integer> values) {
            addCriterion("Department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("Department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("Department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNull() {
            addCriterion("EmployeeName is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIsNotNull() {
            addCriterion("EmployeeName is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenameEqualTo(String value) {
            addCriterion("EmployeeName =", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotEqualTo(String value) {
            addCriterion("EmployeeName <>", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThan(String value) {
            addCriterion("EmployeeName >", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeName >=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThan(String value) {
            addCriterion("EmployeeName <", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLessThanOrEqualTo(String value) {
            addCriterion("EmployeeName <=", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameLike(String value) {
            addCriterion("EmployeeName like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotLike(String value) {
            addCriterion("EmployeeName not like", value, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameIn(List<String> values) {
            addCriterion("EmployeeName in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotIn(List<String> values) {
            addCriterion("EmployeeName not in", values, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameBetween(String value1, String value2) {
            addCriterion("EmployeeName between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeenameNotBetween(String value1, String value2) {
            addCriterion("EmployeeName not between", value1, value2, "employeename");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderIsNull() {
            addCriterion("EmployeeGender is null");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderIsNotNull() {
            addCriterion("EmployeeGender is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderEqualTo(Integer value) {
            addCriterion("EmployeeGender =", value, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderNotEqualTo(Integer value) {
            addCriterion("EmployeeGender <>", value, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderGreaterThan(Integer value) {
            addCriterion("EmployeeGender >", value, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmployeeGender >=", value, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderLessThan(Integer value) {
            addCriterion("EmployeeGender <", value, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderLessThanOrEqualTo(Integer value) {
            addCriterion("EmployeeGender <=", value, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderIn(List<Integer> values) {
            addCriterion("EmployeeGender in", values, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderNotIn(List<Integer> values) {
            addCriterion("EmployeeGender not in", values, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderBetween(Integer value1, Integer value2) {
            addCriterion("EmployeeGender between", value1, value2, "employeegender");
            return (Criteria) this;
        }

        public Criteria andEmployeegenderNotBetween(Integer value1, Integer value2) {
            addCriterion("EmployeeGender not between", value1, value2, "employeegender");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("CardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("CardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("CardNumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("CardNumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("CardNumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CardNumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("CardNumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("CardNumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("CardNumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("CardNumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("CardNumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("CardNumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("CardNumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("CardNumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeestateIsNull() {
            addCriterion("EmployeeState is null");
            return (Criteria) this;
        }

        public Criteria andEmployeestateIsNotNull() {
            addCriterion("EmployeeState is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeestateEqualTo(Integer value) {
            addCriterion("EmployeeState =", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateNotEqualTo(Integer value) {
            addCriterion("EmployeeState <>", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateGreaterThan(Integer value) {
            addCriterion("EmployeeState >", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmployeeState >=", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateLessThan(Integer value) {
            addCriterion("EmployeeState <", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateLessThanOrEqualTo(Integer value) {
            addCriterion("EmployeeState <=", value, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateIn(List<Integer> values) {
            addCriterion("EmployeeState in", values, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateNotIn(List<Integer> values) {
            addCriterion("EmployeeState not in", values, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateBetween(Integer value1, Integer value2) {
            addCriterion("EmployeeState between", value1, value2, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeestateNotBetween(Integer value1, Integer value2) {
            addCriterion("EmployeeState not between", value1, value2, "employeestate");
            return (Criteria) this;
        }

        public Criteria andEmployeememoIsNull() {
            addCriterion("EmployeeMemo is null");
            return (Criteria) this;
        }

        public Criteria andEmployeememoIsNotNull() {
            addCriterion("EmployeeMemo is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeememoEqualTo(String value) {
            addCriterion("EmployeeMemo =", value, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoNotEqualTo(String value) {
            addCriterion("EmployeeMemo <>", value, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoGreaterThan(String value) {
            addCriterion("EmployeeMemo >", value, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoGreaterThanOrEqualTo(String value) {
            addCriterion("EmployeeMemo >=", value, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoLessThan(String value) {
            addCriterion("EmployeeMemo <", value, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoLessThanOrEqualTo(String value) {
            addCriterion("EmployeeMemo <=", value, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoLike(String value) {
            addCriterion("EmployeeMemo like", value, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoNotLike(String value) {
            addCriterion("EmployeeMemo not like", value, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoIn(List<String> values) {
            addCriterion("EmployeeMemo in", values, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoNotIn(List<String> values) {
            addCriterion("EmployeeMemo not in", values, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoBetween(String value1, String value2) {
            addCriterion("EmployeeMemo between", value1, value2, "employeememo");
            return (Criteria) this;
        }

        public Criteria andEmployeememoNotBetween(String value1, String value2) {
            addCriterion("EmployeeMemo not between", value1, value2, "employeememo");
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
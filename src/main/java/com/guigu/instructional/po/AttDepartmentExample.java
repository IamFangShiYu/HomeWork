package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.List;

public class AttDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttDepartmentExample() {
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

        public Criteria andDepartmentnameIsNull() {
            addCriterion("DepartmentName is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("DepartmentName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("DepartmentName =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("DepartmentName <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("DepartmentName >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("DepartmentName >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("DepartmentName <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("DepartmentName <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("DepartmentName like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("DepartmentName not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("DepartmentName in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("DepartmentName not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("DepartmentName between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("DepartmentName not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andStarttimeamIsNull() {
            addCriterion("StartTimeAM is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeamIsNotNull() {
            addCriterion("StartTimeAM is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeamEqualTo(String value) {
            addCriterion("StartTimeAM =", value, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamNotEqualTo(String value) {
            addCriterion("StartTimeAM <>", value, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamGreaterThan(String value) {
            addCriterion("StartTimeAM >", value, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamGreaterThanOrEqualTo(String value) {
            addCriterion("StartTimeAM >=", value, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamLessThan(String value) {
            addCriterion("StartTimeAM <", value, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamLessThanOrEqualTo(String value) {
            addCriterion("StartTimeAM <=", value, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamLike(String value) {
            addCriterion("StartTimeAM like", value, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamNotLike(String value) {
            addCriterion("StartTimeAM not like", value, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamIn(List<String> values) {
            addCriterion("StartTimeAM in", values, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamNotIn(List<String> values) {
            addCriterion("StartTimeAM not in", values, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamBetween(String value1, String value2) {
            addCriterion("StartTimeAM between", value1, value2, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimeamNotBetween(String value1, String value2) {
            addCriterion("StartTimeAM not between", value1, value2, "starttimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamIsNull() {
            addCriterion("EndTimeAM is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeamIsNotNull() {
            addCriterion("EndTimeAM is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeamEqualTo(String value) {
            addCriterion("EndTimeAM =", value, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamNotEqualTo(String value) {
            addCriterion("EndTimeAM <>", value, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamGreaterThan(String value) {
            addCriterion("EndTimeAM >", value, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamGreaterThanOrEqualTo(String value) {
            addCriterion("EndTimeAM >=", value, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamLessThan(String value) {
            addCriterion("EndTimeAM <", value, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamLessThanOrEqualTo(String value) {
            addCriterion("EndTimeAM <=", value, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamLike(String value) {
            addCriterion("EndTimeAM like", value, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamNotLike(String value) {
            addCriterion("EndTimeAM not like", value, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamIn(List<String> values) {
            addCriterion("EndTimeAM in", values, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamNotIn(List<String> values) {
            addCriterion("EndTimeAM not in", values, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamBetween(String value1, String value2) {
            addCriterion("EndTimeAM between", value1, value2, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andEndtimeamNotBetween(String value1, String value2) {
            addCriterion("EndTimeAM not between", value1, value2, "endtimeam");
            return (Criteria) this;
        }

        public Criteria andStarttimepmIsNull() {
            addCriterion("StartTimePM is null");
            return (Criteria) this;
        }

        public Criteria andStarttimepmIsNotNull() {
            addCriterion("StartTimePM is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimepmEqualTo(String value) {
            addCriterion("StartTimePM =", value, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmNotEqualTo(String value) {
            addCriterion("StartTimePM <>", value, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmGreaterThan(String value) {
            addCriterion("StartTimePM >", value, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmGreaterThanOrEqualTo(String value) {
            addCriterion("StartTimePM >=", value, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmLessThan(String value) {
            addCriterion("StartTimePM <", value, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmLessThanOrEqualTo(String value) {
            addCriterion("StartTimePM <=", value, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmLike(String value) {
            addCriterion("StartTimePM like", value, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmNotLike(String value) {
            addCriterion("StartTimePM not like", value, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmIn(List<String> values) {
            addCriterion("StartTimePM in", values, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmNotIn(List<String> values) {
            addCriterion("StartTimePM not in", values, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmBetween(String value1, String value2) {
            addCriterion("StartTimePM between", value1, value2, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andStarttimepmNotBetween(String value1, String value2) {
            addCriterion("StartTimePM not between", value1, value2, "starttimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmIsNull() {
            addCriterion("EndTimePM is null");
            return (Criteria) this;
        }

        public Criteria andEndtimepmIsNotNull() {
            addCriterion("EndTimePM is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimepmEqualTo(String value) {
            addCriterion("EndTimePM =", value, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmNotEqualTo(String value) {
            addCriterion("EndTimePM <>", value, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmGreaterThan(String value) {
            addCriterion("EndTimePM >", value, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmGreaterThanOrEqualTo(String value) {
            addCriterion("EndTimePM >=", value, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmLessThan(String value) {
            addCriterion("EndTimePM <", value, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmLessThanOrEqualTo(String value) {
            addCriterion("EndTimePM <=", value, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmLike(String value) {
            addCriterion("EndTimePM like", value, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmNotLike(String value) {
            addCriterion("EndTimePM not like", value, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmIn(List<String> values) {
            addCriterion("EndTimePM in", values, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmNotIn(List<String> values) {
            addCriterion("EndTimePM not in", values, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmBetween(String value1, String value2) {
            addCriterion("EndTimePM between", value1, value2, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andEndtimepmNotBetween(String value1, String value2) {
            addCriterion("EndTimePM not between", value1, value2, "endtimepm");
            return (Criteria) this;
        }

        public Criteria andWeektypeIsNull() {
            addCriterion("WeekType is null");
            return (Criteria) this;
        }

        public Criteria andWeektypeIsNotNull() {
            addCriterion("WeekType is not null");
            return (Criteria) this;
        }

        public Criteria andWeektypeEqualTo(Integer value) {
            addCriterion("WeekType =", value, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeNotEqualTo(Integer value) {
            addCriterion("WeekType <>", value, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeGreaterThan(Integer value) {
            addCriterion("WeekType >", value, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WeekType >=", value, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeLessThan(Integer value) {
            addCriterion("WeekType <", value, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeLessThanOrEqualTo(Integer value) {
            addCriterion("WeekType <=", value, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeIn(List<Integer> values) {
            addCriterion("WeekType in", values, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeNotIn(List<Integer> values) {
            addCriterion("WeekType not in", values, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeBetween(Integer value1, Integer value2) {
            addCriterion("WeekType between", value1, value2, "weektype");
            return (Criteria) this;
        }

        public Criteria andWeektypeNotBetween(Integer value1, Integer value2) {
            addCriterion("WeekType not between", value1, value2, "weektype");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
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
package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttOvertimerecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttOvertimerecordExample() {
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

        public Criteria andOvertimeidIsNull() {
            addCriterion("OvertimeID is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeidIsNotNull() {
            addCriterion("OvertimeID is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeidEqualTo(Integer value) {
            addCriterion("OvertimeID =", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidNotEqualTo(Integer value) {
            addCriterion("OvertimeID <>", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidGreaterThan(Integer value) {
            addCriterion("OvertimeID >", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OvertimeID >=", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidLessThan(Integer value) {
            addCriterion("OvertimeID <", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidLessThanOrEqualTo(Integer value) {
            addCriterion("OvertimeID <=", value, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidIn(List<Integer> values) {
            addCriterion("OvertimeID in", values, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidNotIn(List<Integer> values) {
            addCriterion("OvertimeID not in", values, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidBetween(Integer value1, Integer value2) {
            addCriterion("OvertimeID between", value1, value2, "overtimeid");
            return (Criteria) this;
        }

        public Criteria andOvertimeidNotBetween(Integer value1, Integer value2) {
            addCriterion("OvertimeID not between", value1, value2, "overtimeid");
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

        public Criteria andOvertimedateIsNull() {
            addCriterion("OvertimeDate is null");
            return (Criteria) this;
        }

        public Criteria andOvertimedateIsNotNull() {
            addCriterion("OvertimeDate is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimedateEqualTo(Date value) {
            addCriterion("OvertimeDate =", value, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateNotEqualTo(Date value) {
            addCriterion("OvertimeDate <>", value, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateGreaterThan(Date value) {
            addCriterion("OvertimeDate >", value, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateGreaterThanOrEqualTo(Date value) {
            addCriterion("OvertimeDate >=", value, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateLessThan(Date value) {
            addCriterion("OvertimeDate <", value, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateLessThanOrEqualTo(Date value) {
            addCriterion("OvertimeDate <=", value, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateIn(List<Date> values) {
            addCriterion("OvertimeDate in", values, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateNotIn(List<Date> values) {
            addCriterion("OvertimeDate not in", values, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateBetween(Date value1, Date value2) {
            addCriterion("OvertimeDate between", value1, value2, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimedateNotBetween(Date value1, Date value2) {
            addCriterion("OvertimeDate not between", value1, value2, "overtimedate");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagIsNull() {
            addCriterion("OvertimeFlag is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagIsNotNull() {
            addCriterion("OvertimeFlag is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagEqualTo(Integer value) {
            addCriterion("OvertimeFlag =", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagNotEqualTo(Integer value) {
            addCriterion("OvertimeFlag <>", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagGreaterThan(Integer value) {
            addCriterion("OvertimeFlag >", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("OvertimeFlag >=", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagLessThan(Integer value) {
            addCriterion("OvertimeFlag <", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagLessThanOrEqualTo(Integer value) {
            addCriterion("OvertimeFlag <=", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagIn(List<Integer> values) {
            addCriterion("OvertimeFlag in", values, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagNotIn(List<Integer> values) {
            addCriterion("OvertimeFlag not in", values, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagBetween(Integer value1, Integer value2) {
            addCriterion("OvertimeFlag between", value1, value2, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagNotBetween(Integer value1, Integer value2) {
            addCriterion("OvertimeFlag not between", value1, value2, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimestateIsNull() {
            addCriterion("OvertimeState is null");
            return (Criteria) this;
        }

        public Criteria andOvertimestateIsNotNull() {
            addCriterion("OvertimeState is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimestateEqualTo(Integer value) {
            addCriterion("OvertimeState =", value, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateNotEqualTo(Integer value) {
            addCriterion("OvertimeState <>", value, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateGreaterThan(Integer value) {
            addCriterion("OvertimeState >", value, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OvertimeState >=", value, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateLessThan(Integer value) {
            addCriterion("OvertimeState <", value, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateLessThanOrEqualTo(Integer value) {
            addCriterion("OvertimeState <=", value, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateIn(List<Integer> values) {
            addCriterion("OvertimeState in", values, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateNotIn(List<Integer> values) {
            addCriterion("OvertimeState not in", values, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateBetween(Integer value1, Integer value2) {
            addCriterion("OvertimeState between", value1, value2, "overtimestate");
            return (Criteria) this;
        }

        public Criteria andOvertimestateNotBetween(Integer value1, Integer value2) {
            addCriterion("OvertimeState not between", value1, value2, "overtimestate");
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

        public Criteria andOvertimememoIsNull() {
            addCriterion("OvertimeMemo is null");
            return (Criteria) this;
        }

        public Criteria andOvertimememoIsNotNull() {
            addCriterion("OvertimeMemo is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimememoEqualTo(String value) {
            addCriterion("OvertimeMemo =", value, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoNotEqualTo(String value) {
            addCriterion("OvertimeMemo <>", value, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoGreaterThan(String value) {
            addCriterion("OvertimeMemo >", value, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoGreaterThanOrEqualTo(String value) {
            addCriterion("OvertimeMemo >=", value, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoLessThan(String value) {
            addCriterion("OvertimeMemo <", value, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoLessThanOrEqualTo(String value) {
            addCriterion("OvertimeMemo <=", value, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoLike(String value) {
            addCriterion("OvertimeMemo like", value, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoNotLike(String value) {
            addCriterion("OvertimeMemo not like", value, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoIn(List<String> values) {
            addCriterion("OvertimeMemo in", values, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoNotIn(List<String> values) {
            addCriterion("OvertimeMemo not in", values, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoBetween(String value1, String value2) {
            addCriterion("OvertimeMemo between", value1, value2, "overtimememo");
            return (Criteria) this;
        }

        public Criteria andOvertimememoNotBetween(String value1, String value2) {
            addCriterion("OvertimeMemo not between", value1, value2, "overtimememo");
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
package com.guigu.instructional.po;

import java.util.ArrayList;
import java.util.List;

public class AttAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttAdminExample() {
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

        public Criteria andAdminaccountIsNull() {
            addCriterion("AdminAccount is null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNotNull() {
            addCriterion("AdminAccount is not null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountEqualTo(String value) {
            addCriterion("AdminAccount =", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotEqualTo(String value) {
            addCriterion("AdminAccount <>", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThan(String value) {
            addCriterion("AdminAccount >", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThanOrEqualTo(String value) {
            addCriterion("AdminAccount >=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThan(String value) {
            addCriterion("AdminAccount <", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThanOrEqualTo(String value) {
            addCriterion("AdminAccount <=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLike(String value) {
            addCriterion("AdminAccount like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotLike(String value) {
            addCriterion("AdminAccount not like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIn(List<String> values) {
            addCriterion("AdminAccount in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotIn(List<String> values) {
            addCriterion("AdminAccount not in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountBetween(String value1, String value2) {
            addCriterion("AdminAccount between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotBetween(String value1, String value2) {
            addCriterion("AdminAccount not between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIsNull() {
            addCriterion("AdminPwd is null");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIsNotNull() {
            addCriterion("AdminPwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpwdEqualTo(String value) {
            addCriterion("AdminPwd =", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotEqualTo(String value) {
            addCriterion("AdminPwd <>", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdGreaterThan(String value) {
            addCriterion("AdminPwd >", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdGreaterThanOrEqualTo(String value) {
            addCriterion("AdminPwd >=", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLessThan(String value) {
            addCriterion("AdminPwd <", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLessThanOrEqualTo(String value) {
            addCriterion("AdminPwd <=", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLike(String value) {
            addCriterion("AdminPwd like", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotLike(String value) {
            addCriterion("AdminPwd not like", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIn(List<String> values) {
            addCriterion("AdminPwd in", values, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotIn(List<String> values) {
            addCriterion("AdminPwd not in", values, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdBetween(String value1, String value2) {
            addCriterion("AdminPwd between", value1, value2, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotBetween(String value1, String value2) {
            addCriterion("AdminPwd not between", value1, value2, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminstateIsNull() {
            addCriterion("AdminState is null");
            return (Criteria) this;
        }

        public Criteria andAdminstateIsNotNull() {
            addCriterion("AdminState is not null");
            return (Criteria) this;
        }

        public Criteria andAdminstateEqualTo(Integer value) {
            addCriterion("AdminState =", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotEqualTo(Integer value) {
            addCriterion("AdminState <>", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateGreaterThan(Integer value) {
            addCriterion("AdminState >", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminState >=", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLessThan(Integer value) {
            addCriterion("AdminState <", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateLessThanOrEqualTo(Integer value) {
            addCriterion("AdminState <=", value, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateIn(List<Integer> values) {
            addCriterion("AdminState in", values, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotIn(List<Integer> values) {
            addCriterion("AdminState not in", values, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateBetween(Integer value1, Integer value2) {
            addCriterion("AdminState between", value1, value2, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminstateNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminState not between", value1, value2, "adminstate");
            return (Criteria) this;
        }

        public Criteria andAdminrightIsNull() {
            addCriterion("AdminRight is null");
            return (Criteria) this;
        }

        public Criteria andAdminrightIsNotNull() {
            addCriterion("AdminRight is not null");
            return (Criteria) this;
        }

        public Criteria andAdminrightEqualTo(Integer value) {
            addCriterion("AdminRight =", value, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightNotEqualTo(Integer value) {
            addCriterion("AdminRight <>", value, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightGreaterThan(Integer value) {
            addCriterion("AdminRight >", value, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminRight >=", value, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightLessThan(Integer value) {
            addCriterion("AdminRight <", value, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightLessThanOrEqualTo(Integer value) {
            addCriterion("AdminRight <=", value, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightIn(List<Integer> values) {
            addCriterion("AdminRight in", values, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightNotIn(List<Integer> values) {
            addCriterion("AdminRight not in", values, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightBetween(Integer value1, Integer value2) {
            addCriterion("AdminRight between", value1, value2, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminrightNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminRight not between", value1, value2, "adminright");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("AdminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("AdminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("AdminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("AdminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("AdminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("AdminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("AdminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("AdminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("AdminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("AdminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("AdminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("AdminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("AdminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("AdminName not between", value1, value2, "adminname");
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
package com.wxnutrition.admin.pojo;

import java.util.ArrayList;
import java.util.List;

public class LabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabelExample() {
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

        public Criteria andLabelIdIsNull() {
            addCriterion("label_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("label_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(String value) {
            addCriterion("label_id =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(String value) {
            addCriterion("label_id <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(String value) {
            addCriterion("label_id >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(String value) {
            addCriterion("label_id >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(String value) {
            addCriterion("label_id <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(String value) {
            addCriterion("label_id <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLike(String value) {
            addCriterion("label_id like", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotLike(String value) {
            addCriterion("label_id not like", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<String> values) {
            addCriterion("label_id in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<String> values) {
            addCriterion("label_id not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(String value1, String value2) {
            addCriterion("label_id between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(String value1, String value2) {
            addCriterion("label_id not between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNull() {
            addCriterion("label_name is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNotNull() {
            addCriterion("label_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameEqualTo(String value) {
            addCriterion("label_name =", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotEqualTo(String value) {
            addCriterion("label_name <>", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThan(String value) {
            addCriterion("label_name >", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("label_name >=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThan(String value) {
            addCriterion("label_name <", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThanOrEqualTo(String value) {
            addCriterion("label_name <=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLike(String value) {
            addCriterion("label_name like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotLike(String value) {
            addCriterion("label_name not like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameIn(List<String> values) {
            addCriterion("label_name in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotIn(List<String> values) {
            addCriterion("label_name not in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameBetween(String value1, String value2) {
            addCriterion("label_name between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotBetween(String value1, String value2) {
            addCriterion("label_name not between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelStatusIsNull() {
            addCriterion("label_status is null");
            return (Criteria) this;
        }

        public Criteria andLabelStatusIsNotNull() {
            addCriterion("label_status is not null");
            return (Criteria) this;
        }

        public Criteria andLabelStatusEqualTo(Integer value) {
            addCriterion("label_status =", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusNotEqualTo(Integer value) {
            addCriterion("label_status <>", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusGreaterThan(Integer value) {
            addCriterion("label_status >", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_status >=", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusLessThan(Integer value) {
            addCriterion("label_status <", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("label_status <=", value, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusIn(List<Integer> values) {
            addCriterion("label_status in", values, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusNotIn(List<Integer> values) {
            addCriterion("label_status not in", values, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusBetween(Integer value1, Integer value2) {
            addCriterion("label_status between", value1, value2, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("label_status not between", value1, value2, "labelStatus");
            return (Criteria) this;
        }

        public Criteria andLabelDescIsNull() {
            addCriterion("label_desc is null");
            return (Criteria) this;
        }

        public Criteria andLabelDescIsNotNull() {
            addCriterion("label_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLabelDescEqualTo(String value) {
            addCriterion("label_desc =", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescNotEqualTo(String value) {
            addCriterion("label_desc <>", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescGreaterThan(String value) {
            addCriterion("label_desc >", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescGreaterThanOrEqualTo(String value) {
            addCriterion("label_desc >=", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescLessThan(String value) {
            addCriterion("label_desc <", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescLessThanOrEqualTo(String value) {
            addCriterion("label_desc <=", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescLike(String value) {
            addCriterion("label_desc like", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescNotLike(String value) {
            addCriterion("label_desc not like", value, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescIn(List<String> values) {
            addCriterion("label_desc in", values, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescNotIn(List<String> values) {
            addCriterion("label_desc not in", values, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescBetween(String value1, String value2) {
            addCriterion("label_desc between", value1, value2, "labelDesc");
            return (Criteria) this;
        }

        public Criteria andLabelDescNotBetween(String value1, String value2) {
            addCriterion("label_desc not between", value1, value2, "labelDesc");
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
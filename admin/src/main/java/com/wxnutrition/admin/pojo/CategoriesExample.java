package com.wxnutrition.admin.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoriesExample() {
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

        public Criteria andCategoriesIdIsNull() {
            addCriterion("categories_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdIsNotNull() {
            addCriterion("categories_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdEqualTo(String value) {
            addCriterion("categories_id =", value, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdNotEqualTo(String value) {
            addCriterion("categories_id <>", value, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdGreaterThan(String value) {
            addCriterion("categories_id >", value, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdGreaterThanOrEqualTo(String value) {
            addCriterion("categories_id >=", value, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdLessThan(String value) {
            addCriterion("categories_id <", value, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdLessThanOrEqualTo(String value) {
            addCriterion("categories_id <=", value, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdLike(String value) {
            addCriterion("categories_id like", value, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdNotLike(String value) {
            addCriterion("categories_id not like", value, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdIn(List<String> values) {
            addCriterion("categories_id in", values, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdNotIn(List<String> values) {
            addCriterion("categories_id not in", values, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdBetween(String value1, String value2) {
            addCriterion("categories_id between", value1, value2, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesIdNotBetween(String value1, String value2) {
            addCriterion("categories_id not between", value1, value2, "categoriesId");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameIsNull() {
            addCriterion("categories_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameIsNotNull() {
            addCriterion("categories_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameEqualTo(String value) {
            addCriterion("categories_name =", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameNotEqualTo(String value) {
            addCriterion("categories_name <>", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameGreaterThan(String value) {
            addCriterion("categories_name >", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("categories_name >=", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameLessThan(String value) {
            addCriterion("categories_name <", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameLessThanOrEqualTo(String value) {
            addCriterion("categories_name <=", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameLike(String value) {
            addCriterion("categories_name like", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameNotLike(String value) {
            addCriterion("categories_name not like", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameIn(List<String> values) {
            addCriterion("categories_name in", values, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameNotIn(List<String> values) {
            addCriterion("categories_name not in", values, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameBetween(String value1, String value2) {
            addCriterion("categories_name between", value1, value2, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameNotBetween(String value1, String value2) {
            addCriterion("categories_name not between", value1, value2, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescIsNull() {
            addCriterion("categories_desc is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescIsNotNull() {
            addCriterion("categories_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescEqualTo(String value) {
            addCriterion("categories_desc =", value, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescNotEqualTo(String value) {
            addCriterion("categories_desc <>", value, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescGreaterThan(String value) {
            addCriterion("categories_desc >", value, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescGreaterThanOrEqualTo(String value) {
            addCriterion("categories_desc >=", value, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescLessThan(String value) {
            addCriterion("categories_desc <", value, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescLessThanOrEqualTo(String value) {
            addCriterion("categories_desc <=", value, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescLike(String value) {
            addCriterion("categories_desc like", value, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescNotLike(String value) {
            addCriterion("categories_desc not like", value, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescIn(List<String> values) {
            addCriterion("categories_desc in", values, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescNotIn(List<String> values) {
            addCriterion("categories_desc not in", values, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescBetween(String value1, String value2) {
            addCriterion("categories_desc between", value1, value2, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescNotBetween(String value1, String value2) {
            addCriterion("categories_desc not between", value1, value2, "categoriesDesc");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusIsNull() {
            addCriterion("categories_status is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusIsNotNull() {
            addCriterion("categories_status is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusEqualTo(Integer value) {
            addCriterion("categories_status =", value, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusNotEqualTo(Integer value) {
            addCriterion("categories_status <>", value, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusGreaterThan(Integer value) {
            addCriterion("categories_status >", value, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("categories_status >=", value, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusLessThan(Integer value) {
            addCriterion("categories_status <", value, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusLessThanOrEqualTo(Integer value) {
            addCriterion("categories_status <=", value, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusIn(List<Integer> values) {
            addCriterion("categories_status in", values, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusNotIn(List<Integer> values) {
            addCriterion("categories_status not in", values, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusBetween(Integer value1, Integer value2) {
            addCriterion("categories_status between", value1, value2, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andCategoriesStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("categories_status not between", value1, value2, "categoriesStatus");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdIsNull() {
            addCriterion("parent_categories_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdIsNotNull() {
            addCriterion("parent_categories_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdEqualTo(String value) {
            addCriterion("parent_categories_id =", value, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdNotEqualTo(String value) {
            addCriterion("parent_categories_id <>", value, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdGreaterThan(String value) {
            addCriterion("parent_categories_id >", value, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_categories_id >=", value, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdLessThan(String value) {
            addCriterion("parent_categories_id <", value, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdLessThanOrEqualTo(String value) {
            addCriterion("parent_categories_id <=", value, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdLike(String value) {
            addCriterion("parent_categories_id like", value, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdNotLike(String value) {
            addCriterion("parent_categories_id not like", value, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdIn(List<String> values) {
            addCriterion("parent_categories_id in", values, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdNotIn(List<String> values) {
            addCriterion("parent_categories_id not in", values, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdBetween(String value1, String value2) {
            addCriterion("parent_categories_id between", value1, value2, "parentCategoriesId");
            return (Criteria) this;
        }

        public Criteria andParentCategoriesIdNotBetween(String value1, String value2) {
            addCriterion("parent_categories_id not between", value1, value2, "parentCategoriesId");
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
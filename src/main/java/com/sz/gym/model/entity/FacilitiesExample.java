package com.sz.gym.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacilitiesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public FacilitiesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameIsNull() {
            addCriterion("facilities_name is null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameIsNotNull() {
            addCriterion("facilities_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameEqualTo(String value) {
            addCriterion("facilities_name =", value, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameNotEqualTo(String value) {
            addCriterion("facilities_name <>", value, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameGreaterThan(String value) {
            addCriterion("facilities_name >", value, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameGreaterThanOrEqualTo(String value) {
            addCriterion("facilities_name >=", value, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameLessThan(String value) {
            addCriterion("facilities_name <", value, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameLessThanOrEqualTo(String value) {
            addCriterion("facilities_name <=", value, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameLike(String value) {
            addCriterion("facilities_name like", value, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameNotLike(String value) {
            addCriterion("facilities_name not like", value, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameIn(List<String> values) {
            addCriterion("facilities_name in", values, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameNotIn(List<String> values) {
            addCriterion("facilities_name not in", values, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameBetween(String value1, String value2) {
            addCriterion("facilities_name between", value1, value2, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andFacilitiesNameNotBetween(String value1, String value2) {
            addCriterion("facilities_name not between", value1, value2, "facilitiesName");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIsNull() {
            addCriterion("discription is null");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIsNotNull() {
            addCriterion("discription is not null");
            return (Criteria) this;
        }

        public Criteria andDiscriptionEqualTo(String value) {
            addCriterion("discription =", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotEqualTo(String value) {
            addCriterion("discription <>", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionGreaterThan(String value) {
            addCriterion("discription >", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("discription >=", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLessThan(String value) {
            addCriterion("discription <", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLessThanOrEqualTo(String value) {
            addCriterion("discription <=", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionLike(String value) {
            addCriterion("discription like", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotLike(String value) {
            addCriterion("discription not like", value, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionIn(List<String> values) {
            addCriterion("discription in", values, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotIn(List<String> values) {
            addCriterion("discription not in", values, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionBetween(String value1, String value2) {
            addCriterion("discription between", value1, value2, "discription");
            return (Criteria) this;
        }

        public Criteria andDiscriptionNotBetween(String value1, String value2) {
            addCriterion("discription not between", value1, value2, "discription");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusIsNull() {
            addCriterion("facilities_Status is null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusIsNotNull() {
            addCriterion("facilities_Status is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusEqualTo(String value) {
            addCriterion("facilities_Status =", value, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusNotEqualTo(String value) {
            addCriterion("facilities_Status <>", value, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusGreaterThan(String value) {
            addCriterion("facilities_Status >", value, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusGreaterThanOrEqualTo(String value) {
            addCriterion("facilities_Status >=", value, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusLessThan(String value) {
            addCriterion("facilities_Status <", value, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusLessThanOrEqualTo(String value) {
            addCriterion("facilities_Status <=", value, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusLike(String value) {
            addCriterion("facilities_Status like", value, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusNotLike(String value) {
            addCriterion("facilities_Status not like", value, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusIn(List<String> values) {
            addCriterion("facilities_Status in", values, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusNotIn(List<String> values) {
            addCriterion("facilities_Status not in", values, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusBetween(String value1, String value2) {
            addCriterion("facilities_Status between", value1, value2, "facilitiesStatus");
            return (Criteria) this;
        }

        public Criteria andFacilitiesStatusNotBetween(String value1, String value2) {
            addCriterion("facilities_Status not between", value1, value2, "facilitiesStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table facilities
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 13 17:04:02 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table facilities
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
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
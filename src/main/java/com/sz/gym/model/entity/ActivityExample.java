package com.sz.gym.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public ActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
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
     * This method corresponds to the database table activity
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
     * This method corresponds to the database table activity
     *
     * @mbggenerated Fri Mar 13 17:04:02 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
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
     * This class corresponds to the database table activity
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionIsNull() {
            addCriterion("activity_description is null");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionIsNotNull() {
            addCriterion("activity_description is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionEqualTo(String value) {
            addCriterion("activity_description =", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionNotEqualTo(String value) {
            addCriterion("activity_description <>", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionGreaterThan(String value) {
            addCriterion("activity_description >", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("activity_description >=", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionLessThan(String value) {
            addCriterion("activity_description <", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionLessThanOrEqualTo(String value) {
            addCriterion("activity_description <=", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionLike(String value) {
            addCriterion("activity_description like", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionNotLike(String value) {
            addCriterion("activity_description not like", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionIn(List<String> values) {
            addCriterion("activity_description in", values, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionNotIn(List<String> values) {
            addCriterion("activity_description not in", values, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionBetween(String value1, String value2) {
            addCriterion("activity_description between", value1, value2, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionNotBetween(String value1, String value2) {
            addCriterion("activity_description not between", value1, value2, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityUserIsNull() {
            addCriterion("activity_user is null");
            return (Criteria) this;
        }

        public Criteria andActivityUserIsNotNull() {
            addCriterion("activity_user is not null");
            return (Criteria) this;
        }

        public Criteria andActivityUserEqualTo(String value) {
            addCriterion("activity_user =", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserNotEqualTo(String value) {
            addCriterion("activity_user <>", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserGreaterThan(String value) {
            addCriterion("activity_user >", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserGreaterThanOrEqualTo(String value) {
            addCriterion("activity_user >=", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserLessThan(String value) {
            addCriterion("activity_user <", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserLessThanOrEqualTo(String value) {
            addCriterion("activity_user <=", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserLike(String value) {
            addCriterion("activity_user like", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserNotLike(String value) {
            addCriterion("activity_user not like", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserIn(List<String> values) {
            addCriterion("activity_user in", values, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserNotIn(List<String> values) {
            addCriterion("activity_user not in", values, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserBetween(String value1, String value2) {
            addCriterion("activity_user between", value1, value2, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserNotBetween(String value1, String value2) {
            addCriterion("activity_user not between", value1, value2, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeIsNull() {
            addCriterion("activity_residueTime is null");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeIsNotNull() {
            addCriterion("activity_residueTime is not null");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeEqualTo(Integer value) {
            addCriterion("activity_residueTime =", value, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeNotEqualTo(Integer value) {
            addCriterion("activity_residueTime <>", value, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeGreaterThan(Integer value) {
            addCriterion("activity_residueTime >", value, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_residueTime >=", value, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeLessThan(Integer value) {
            addCriterion("activity_residueTime <", value, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeLessThanOrEqualTo(Integer value) {
            addCriterion("activity_residueTime <=", value, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeIn(List<Integer> values) {
            addCriterion("activity_residueTime in", values, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeNotIn(List<Integer> values) {
            addCriterion("activity_residueTime not in", values, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeBetween(Integer value1, Integer value2) {
            addCriterion("activity_residueTime between", value1, value2, "activityResiduetime");
            return (Criteria) this;
        }

        public Criteria andActivityResiduetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_residueTime not between", value1, value2, "activityResiduetime");
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

        public Criteria andActivityStatusIsNull() {
            addCriterion("activity_status is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("activity_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(String value) {
            addCriterion("activity_status =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(String value) {
            addCriterion("activity_status <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(String value) {
            addCriterion("activity_status >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(String value) {
            addCriterion("activity_status >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(String value) {
            addCriterion("activity_status <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(String value) {
            addCriterion("activity_status <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLike(String value) {
            addCriterion("activity_status like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotLike(String value) {
            addCriterion("activity_status not like", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<String> values) {
            addCriterion("activity_status in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<String> values) {
            addCriterion("activity_status not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(String value1, String value2) {
            addCriterion("activity_status between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(String value1, String value2) {
            addCriterion("activity_status not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table activity
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
     * This class corresponds to the database table activity
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
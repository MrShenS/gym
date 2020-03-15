package com.sz.gym.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinanceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public FinanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
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
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
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

        public Criteria andFinanceIdIsNull() {
            addCriterion("finance_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceIdIsNotNull() {
            addCriterion("finance_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceIdEqualTo(Integer value) {
            addCriterion("finance_id =", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotEqualTo(Integer value) {
            addCriterion("finance_id <>", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdGreaterThan(Integer value) {
            addCriterion("finance_id >", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_id >=", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLessThan(Integer value) {
            addCriterion("finance_id <", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("finance_id <=", value, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdIn(List<Integer> values) {
            addCriterion("finance_id in", values, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotIn(List<Integer> values) {
            addCriterion("finance_id not in", values, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdBetween(Integer value1, Integer value2) {
            addCriterion("finance_id between", value1, value2, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_id not between", value1, value2, "financeId");
            return (Criteria) this;
        }

        public Criteria andFinanceNameIsNull() {
            addCriterion("finance_name is null");
            return (Criteria) this;
        }

        public Criteria andFinanceNameIsNotNull() {
            addCriterion("finance_name is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceNameEqualTo(String value) {
            addCriterion("finance_name =", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameNotEqualTo(String value) {
            addCriterion("finance_name <>", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameGreaterThan(String value) {
            addCriterion("finance_name >", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("finance_name >=", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameLessThan(String value) {
            addCriterion("finance_name <", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameLessThanOrEqualTo(String value) {
            addCriterion("finance_name <=", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameLike(String value) {
            addCriterion("finance_name like", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameNotLike(String value) {
            addCriterion("finance_name not like", value, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameIn(List<String> values) {
            addCriterion("finance_name in", values, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameNotIn(List<String> values) {
            addCriterion("finance_name not in", values, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameBetween(String value1, String value2) {
            addCriterion("finance_name between", value1, value2, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceNameNotBetween(String value1, String value2) {
            addCriterion("finance_name not between", value1, value2, "financeName");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionIsNull() {
            addCriterion("finance_description is null");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionIsNotNull() {
            addCriterion("finance_description is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionEqualTo(String value) {
            addCriterion("finance_description =", value, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionNotEqualTo(String value) {
            addCriterion("finance_description <>", value, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionGreaterThan(String value) {
            addCriterion("finance_description >", value, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("finance_description >=", value, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionLessThan(String value) {
            addCriterion("finance_description <", value, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionLessThanOrEqualTo(String value) {
            addCriterion("finance_description <=", value, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionLike(String value) {
            addCriterion("finance_description like", value, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionNotLike(String value) {
            addCriterion("finance_description not like", value, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionIn(List<String> values) {
            addCriterion("finance_description in", values, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionNotIn(List<String> values) {
            addCriterion("finance_description not in", values, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionBetween(String value1, String value2) {
            addCriterion("finance_description between", value1, value2, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceDescriptionNotBetween(String value1, String value2) {
            addCriterion("finance_description not between", value1, value2, "financeDescription");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIsNull() {
            addCriterion("finance_type is null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIsNotNull() {
            addCriterion("finance_type is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeEqualTo(String value) {
            addCriterion("finance_type =", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotEqualTo(String value) {
            addCriterion("finance_type <>", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThan(String value) {
            addCriterion("finance_type >", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("finance_type >=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThan(String value) {
            addCriterion("finance_type <", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThanOrEqualTo(String value) {
            addCriterion("finance_type <=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLike(String value) {
            addCriterion("finance_type like", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotLike(String value) {
            addCriterion("finance_type not like", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIn(List<String> values) {
            addCriterion("finance_type in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotIn(List<String> values) {
            addCriterion("finance_type not in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeBetween(String value1, String value2) {
            addCriterion("finance_type between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotBetween(String value1, String value2) {
            addCriterion("finance_type not between", value1, value2, "financeType");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyIsNull() {
            addCriterion("finance_reclassify is null");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyIsNotNull() {
            addCriterion("finance_reclassify is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyEqualTo(String value) {
            addCriterion("finance_reclassify =", value, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyNotEqualTo(String value) {
            addCriterion("finance_reclassify <>", value, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyGreaterThan(String value) {
            addCriterion("finance_reclassify >", value, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("finance_reclassify >=", value, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyLessThan(String value) {
            addCriterion("finance_reclassify <", value, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyLessThanOrEqualTo(String value) {
            addCriterion("finance_reclassify <=", value, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyLike(String value) {
            addCriterion("finance_reclassify like", value, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyNotLike(String value) {
            addCriterion("finance_reclassify not like", value, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyIn(List<String> values) {
            addCriterion("finance_reclassify in", values, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyNotIn(List<String> values) {
            addCriterion("finance_reclassify not in", values, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyBetween(String value1, String value2) {
            addCriterion("finance_reclassify between", value1, value2, "financeReclassify");
            return (Criteria) this;
        }

        public Criteria andFinanceReclassifyNotBetween(String value1, String value2) {
            addCriterion("finance_reclassify not between", value1, value2, "financeReclassify");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table finance
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 15 19:02:21 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table finance
     *
     * @mbggenerated Sun Mar 15 19:02:21 CST 2020
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
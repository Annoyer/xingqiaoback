package model;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andDemandIdIsNull() {
            addCriterion("demand_id is null");
            return (Criteria) this;
        }

        public Criteria andDemandIdIsNotNull() {
            addCriterion("demand_id is not null");
            return (Criteria) this;
        }

        public Criteria andDemandIdEqualTo(Integer value) {
            addCriterion("demand_id =", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotEqualTo(Integer value) {
            addCriterion("demand_id <>", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdGreaterThan(Integer value) {
            addCriterion("demand_id >", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_id >=", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdLessThan(Integer value) {
            addCriterion("demand_id <", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdLessThanOrEqualTo(Integer value) {
            addCriterion("demand_id <=", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdIn(List<Integer> values) {
            addCriterion("demand_id in", values, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotIn(List<Integer> values) {
            addCriterion("demand_id not in", values, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdBetween(Integer value1, Integer value2) {
            addCriterion("demand_id between", value1, value2, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_id not between", value1, value2, "demandId");
            return (Criteria) this;
        }

        public Criteria andRecoverObIsNull() {
            addCriterion("recover_ob is null");
            return (Criteria) this;
        }

        public Criteria andRecoverObIsNotNull() {
            addCriterion("recover_ob is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverObEqualTo(String value) {
            addCriterion("recover_ob =", value, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObNotEqualTo(String value) {
            addCriterion("recover_ob <>", value, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObGreaterThan(String value) {
            addCriterion("recover_ob >", value, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObGreaterThanOrEqualTo(String value) {
            addCriterion("recover_ob >=", value, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObLessThan(String value) {
            addCriterion("recover_ob <", value, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObLessThanOrEqualTo(String value) {
            addCriterion("recover_ob <=", value, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObLike(String value) {
            addCriterion("recover_ob like", value, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObNotLike(String value) {
            addCriterion("recover_ob not like", value, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObIn(List<String> values) {
            addCriterion("recover_ob in", values, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObNotIn(List<String> values) {
            addCriterion("recover_ob not in", values, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObBetween(String value1, String value2) {
            addCriterion("recover_ob between", value1, value2, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andRecoverObNotBetween(String value1, String value2) {
            addCriterion("recover_ob not between", value1, value2, "recoverOb");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andStatusPIsNull() {
            addCriterion("status_p is null");
            return (Criteria) this;
        }

        public Criteria andStatusPIsNotNull() {
            addCriterion("status_p is not null");
            return (Criteria) this;
        }

        public Criteria andStatusPEqualTo(Integer value) {
            addCriterion("status_p =", value, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPNotEqualTo(Integer value) {
            addCriterion("status_p <>", value, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPGreaterThan(Integer value) {
            addCriterion("status_p >", value, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_p >=", value, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPLessThan(Integer value) {
            addCriterion("status_p <", value, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPLessThanOrEqualTo(Integer value) {
            addCriterion("status_p <=", value, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPIn(List<Integer> values) {
            addCriterion("status_p in", values, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPNotIn(List<Integer> values) {
            addCriterion("status_p not in", values, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPBetween(Integer value1, Integer value2) {
            addCriterion("status_p between", value1, value2, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusPNotBetween(Integer value1, Integer value2) {
            addCriterion("status_p not between", value1, value2, "statusP");
            return (Criteria) this;
        }

        public Criteria andStatusTIsNull() {
            addCriterion("status_t is null");
            return (Criteria) this;
        }

        public Criteria andStatusTIsNotNull() {
            addCriterion("status_t is not null");
            return (Criteria) this;
        }

        public Criteria andStatusTEqualTo(Integer value) {
            addCriterion("status_t =", value, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTNotEqualTo(Integer value) {
            addCriterion("status_t <>", value, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTGreaterThan(Integer value) {
            addCriterion("status_t >", value, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_t >=", value, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTLessThan(Integer value) {
            addCriterion("status_t <", value, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTLessThanOrEqualTo(Integer value) {
            addCriterion("status_t <=", value, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTIn(List<Integer> values) {
            addCriterion("status_t in", values, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTNotIn(List<Integer> values) {
            addCriterion("status_t not in", values, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTBetween(Integer value1, Integer value2) {
            addCriterion("status_t between", value1, value2, "statusT");
            return (Criteria) this;
        }

        public Criteria andStatusTNotBetween(Integer value1, Integer value2) {
            addCriterion("status_t not between", value1, value2, "statusT");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNull() {
            addCriterion("s_time is null");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNotNull() {
            addCriterion("s_time is not null");
            return (Criteria) this;
        }

        public Criteria andSTimeEqualTo(String value) {
            addCriterion("s_time =", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotEqualTo(String value) {
            addCriterion("s_time <>", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThan(String value) {
            addCriterion("s_time >", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThanOrEqualTo(String value) {
            addCriterion("s_time >=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThan(String value) {
            addCriterion("s_time <", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThanOrEqualTo(String value) {
            addCriterion("s_time <=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLike(String value) {
            addCriterion("s_time like", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotLike(String value) {
            addCriterion("s_time not like", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeIn(List<String> values) {
            addCriterion("s_time in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotIn(List<String> values) {
            addCriterion("s_time not in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeBetween(String value1, String value2) {
            addCriterion("s_time between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotBetween(String value1, String value2) {
            addCriterion("s_time not between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andETimeIsNull() {
            addCriterion("e_time is null");
            return (Criteria) this;
        }

        public Criteria andETimeIsNotNull() {
            addCriterion("e_time is not null");
            return (Criteria) this;
        }

        public Criteria andETimeEqualTo(String value) {
            addCriterion("e_time =", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotEqualTo(String value) {
            addCriterion("e_time <>", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThan(String value) {
            addCriterion("e_time >", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThanOrEqualTo(String value) {
            addCriterion("e_time >=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThan(String value) {
            addCriterion("e_time <", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThanOrEqualTo(String value) {
            addCriterion("e_time <=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLike(String value) {
            addCriterion("e_time like", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotLike(String value) {
            addCriterion("e_time not like", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeIn(List<String> values) {
            addCriterion("e_time in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotIn(List<String> values) {
            addCriterion("e_time not in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeBetween(String value1, String value2) {
            addCriterion("e_time between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotBetween(String value1, String value2) {
            addCriterion("e_time not between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("isdeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("isdeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Boolean value) {
            addCriterion("isdeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Boolean value) {
            addCriterion("isdeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Boolean value) {
            addCriterion("isdeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Boolean value) {
            addCriterion("isdeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("isdeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Boolean> values) {
            addCriterion("isdeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Boolean> values) {
            addCriterion("isdeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("isdeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPreferentialIsNull() {
            addCriterion("preferential is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialIsNotNull() {
            addCriterion("preferential is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialEqualTo(Integer value) {
            addCriterion("preferential =", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotEqualTo(Integer value) {
            addCriterion("preferential <>", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialGreaterThan(Integer value) {
            addCriterion("preferential >", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialGreaterThanOrEqualTo(Integer value) {
            addCriterion("preferential >=", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialLessThan(Integer value) {
            addCriterion("preferential <", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialLessThanOrEqualTo(Integer value) {
            addCriterion("preferential <=", value, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialIn(List<Integer> values) {
            addCriterion("preferential in", values, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotIn(List<Integer> values) {
            addCriterion("preferential not in", values, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialBetween(Integer value1, Integer value2) {
            addCriterion("preferential between", value1, value2, "preferential");
            return (Criteria) this;
        }

        public Criteria andPreferentialNotBetween(Integer value1, Integer value2) {
            addCriterion("preferential not between", value1, value2, "preferential");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andRealpayIsNull() {
            addCriterion("realpay is null");
            return (Criteria) this;
        }

        public Criteria andRealpayIsNotNull() {
            addCriterion("realpay is not null");
            return (Criteria) this;
        }

        public Criteria andRealpayEqualTo(Double value) {
            addCriterion("realpay =", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayNotEqualTo(Double value) {
            addCriterion("realpay <>", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayGreaterThan(Double value) {
            addCriterion("realpay >", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayGreaterThanOrEqualTo(Double value) {
            addCriterion("realpay >=", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayLessThan(Double value) {
            addCriterion("realpay <", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayLessThanOrEqualTo(Double value) {
            addCriterion("realpay <=", value, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayIn(List<Double> values) {
            addCriterion("realpay in", values, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayNotIn(List<Double> values) {
            addCriterion("realpay not in", values, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayBetween(Double value1, Double value2) {
            addCriterion("realpay between", value1, value2, "realpay");
            return (Criteria) this;
        }

        public Criteria andRealpayNotBetween(Double value1, Double value2) {
            addCriterion("realpay not between", value1, value2, "realpay");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andWayIsNull() {
            addCriterion("way is null");
            return (Criteria) this;
        }

        public Criteria andWayIsNotNull() {
            addCriterion("way is not null");
            return (Criteria) this;
        }

        public Criteria andWayEqualTo(String value) {
            addCriterion("way =", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotEqualTo(String value) {
            addCriterion("way <>", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThan(String value) {
            addCriterion("way >", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayGreaterThanOrEqualTo(String value) {
            addCriterion("way >=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThan(String value) {
            addCriterion("way <", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLessThanOrEqualTo(String value) {
            addCriterion("way <=", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayLike(String value) {
            addCriterion("way like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotLike(String value) {
            addCriterion("way not like", value, "way");
            return (Criteria) this;
        }

        public Criteria andWayIn(List<String> values) {
            addCriterion("way in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotIn(List<String> values) {
            addCriterion("way not in", values, "way");
            return (Criteria) this;
        }

        public Criteria andWayBetween(String value1, String value2) {
            addCriterion("way between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andWayNotBetween(String value1, String value2) {
            addCriterion("way not between", value1, value2, "way");
            return (Criteria) this;
        }

        public Criteria andTotalpayIsNull() {
            addCriterion("totalpay is null");
            return (Criteria) this;
        }

        public Criteria andTotalpayIsNotNull() {
            addCriterion("totalpay is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpayEqualTo(Double value) {
            addCriterion("totalpay =", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayNotEqualTo(Double value) {
            addCriterion("totalpay <>", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayGreaterThan(Double value) {
            addCriterion("totalpay >", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayGreaterThanOrEqualTo(Double value) {
            addCriterion("totalpay >=", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayLessThan(Double value) {
            addCriterion("totalpay <", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayLessThanOrEqualTo(Double value) {
            addCriterion("totalpay <=", value, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayIn(List<Double> values) {
            addCriterion("totalpay in", values, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayNotIn(List<Double> values) {
            addCriterion("totalpay not in", values, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayBetween(Double value1, Double value2) {
            addCriterion("totalpay between", value1, value2, "totalpay");
            return (Criteria) this;
        }

        public Criteria andTotalpayNotBetween(Double value1, Double value2) {
            addCriterion("totalpay not between", value1, value2, "totalpay");
            return (Criteria) this;
        }

        public Criteria andCompleteIsNull() {
            addCriterion("complete is null");
            return (Criteria) this;
        }

        public Criteria andCompleteIsNotNull() {
            addCriterion("complete is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteEqualTo(Integer value) {
            addCriterion("complete =", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotEqualTo(Integer value) {
            addCriterion("complete <>", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteGreaterThan(Integer value) {
            addCriterion("complete >", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("complete >=", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLessThan(Integer value) {
            addCriterion("complete <", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLessThanOrEqualTo(Integer value) {
            addCriterion("complete <=", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteIn(List<Integer> values) {
            addCriterion("complete in", values, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotIn(List<Integer> values) {
            addCriterion("complete not in", values, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteBetween(Integer value1, Integer value2) {
            addCriterion("complete between", value1, value2, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("complete not between", value1, value2, "complete");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Integer value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Integer value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Integer value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Integer value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Integer value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Integer> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Integer> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Integer value1, Integer value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
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
package model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherIsNull() {
            addCriterion("abstractTeacher is null");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherIsNotNull() {
            addCriterion("abstractTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherEqualTo(String value) {
            addCriterion("abstractTeacher =", value, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherNotEqualTo(String value) {
            addCriterion("abstractTeacher <>", value, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherGreaterThan(String value) {
            addCriterion("abstractTeacher >", value, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherGreaterThanOrEqualTo(String value) {
            addCriterion("abstractTeacher >=", value, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherLessThan(String value) {
            addCriterion("abstractTeacher <", value, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherLessThanOrEqualTo(String value) {
            addCriterion("abstractTeacher <=", value, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherLike(String value) {
            addCriterion("abstractTeacher like", value, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherNotLike(String value) {
            addCriterion("abstractTeacher not like", value, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherIn(List<String> values) {
            addCriterion("abstractTeacher in", values, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherNotIn(List<String> values) {
            addCriterion("abstractTeacher not in", values, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherBetween(String value1, String value2) {
            addCriterion("abstractTeacher between", value1, value2, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andAbstractteacherNotBetween(String value1, String value2) {
            addCriterion("abstractTeacher not between", value1, value2, "abstractteacher");
            return (Criteria) this;
        }

        public Criteria andPriceTIsNull() {
            addCriterion("price_t is null");
            return (Criteria) this;
        }

        public Criteria andPriceTIsNotNull() {
            addCriterion("price_t is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTEqualTo(Integer value) {
            addCriterion("price_t =", value, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTNotEqualTo(Integer value) {
            addCriterion("price_t <>", value, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTGreaterThan(Integer value) {
            addCriterion("price_t >", value, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_t >=", value, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTLessThan(Integer value) {
            addCriterion("price_t <", value, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTLessThanOrEqualTo(Integer value) {
            addCriterion("price_t <=", value, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTIn(List<Integer> values) {
            addCriterion("price_t in", values, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTNotIn(List<Integer> values) {
            addCriterion("price_t not in", values, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTBetween(Integer value1, Integer value2) {
            addCriterion("price_t between", value1, value2, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceTNotBetween(Integer value1, Integer value2) {
            addCriterion("price_t not between", value1, value2, "priceT");
            return (Criteria) this;
        }

        public Criteria andPriceSIsNull() {
            addCriterion("price_s is null");
            return (Criteria) this;
        }

        public Criteria andPriceSIsNotNull() {
            addCriterion("price_s is not null");
            return (Criteria) this;
        }

        public Criteria andPriceSEqualTo(Integer value) {
            addCriterion("price_s =", value, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSNotEqualTo(Integer value) {
            addCriterion("price_s <>", value, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSGreaterThan(Integer value) {
            addCriterion("price_s >", value, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_s >=", value, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSLessThan(Integer value) {
            addCriterion("price_s <", value, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSLessThanOrEqualTo(Integer value) {
            addCriterion("price_s <=", value, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSIn(List<Integer> values) {
            addCriterion("price_s in", values, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSNotIn(List<Integer> values) {
            addCriterion("price_s not in", values, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSBetween(Integer value1, Integer value2) {
            addCriterion("price_s between", value1, value2, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceSNotBetween(Integer value1, Integer value2) {
            addCriterion("price_s not between", value1, value2, "priceS");
            return (Criteria) this;
        }

        public Criteria andPriceOIsNull() {
            addCriterion("price_o is null");
            return (Criteria) this;
        }

        public Criteria andPriceOIsNotNull() {
            addCriterion("price_o is not null");
            return (Criteria) this;
        }

        public Criteria andPriceOEqualTo(Integer value) {
            addCriterion("price_o =", value, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceONotEqualTo(Integer value) {
            addCriterion("price_o <>", value, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceOGreaterThan(Integer value) {
            addCriterion("price_o >", value, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceOGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_o >=", value, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceOLessThan(Integer value) {
            addCriterion("price_o <", value, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceOLessThanOrEqualTo(Integer value) {
            addCriterion("price_o <=", value, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceOIn(List<Integer> values) {
            addCriterion("price_o in", values, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceONotIn(List<Integer> values) {
            addCriterion("price_o not in", values, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceOBetween(Integer value1, Integer value2) {
            addCriterion("price_o between", value1, value2, "priceO");
            return (Criteria) this;
        }

        public Criteria andPriceONotBetween(Integer value1, Integer value2) {
            addCriterion("price_o not between", value1, value2, "priceO");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeIsNull() {
            addCriterion("experience_age is null");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeIsNotNull() {
            addCriterion("experience_age is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeEqualTo(Integer value) {
            addCriterion("experience_age =", value, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeNotEqualTo(Integer value) {
            addCriterion("experience_age <>", value, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeGreaterThan(Integer value) {
            addCriterion("experience_age >", value, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_age >=", value, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeLessThan(Integer value) {
            addCriterion("experience_age <", value, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeLessThanOrEqualTo(Integer value) {
            addCriterion("experience_age <=", value, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeIn(List<Integer> values) {
            addCriterion("experience_age in", values, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeNotIn(List<Integer> values) {
            addCriterion("experience_age not in", values, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeBetween(Integer value1, Integer value2) {
            addCriterion("experience_age between", value1, value2, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andExperienceAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_age not between", value1, value2, "experienceAge");
            return (Criteria) this;
        }

        public Criteria andPriceMinIsNull() {
            addCriterion("price_min is null");
            return (Criteria) this;
        }

        public Criteria andPriceMinIsNotNull() {
            addCriterion("price_min is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMinEqualTo(Integer value) {
            addCriterion("price_min =", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotEqualTo(Integer value) {
            addCriterion("price_min <>", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinGreaterThan(Integer value) {
            addCriterion("price_min >", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_min >=", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinLessThan(Integer value) {
            addCriterion("price_min <", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinLessThanOrEqualTo(Integer value) {
            addCriterion("price_min <=", value, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinIn(List<Integer> values) {
            addCriterion("price_min in", values, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotIn(List<Integer> values) {
            addCriterion("price_min not in", values, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinBetween(Integer value1, Integer value2) {
            addCriterion("price_min between", value1, value2, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMinNotBetween(Integer value1, Integer value2) {
            addCriterion("price_min not between", value1, value2, "priceMin");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIsNull() {
            addCriterion("price_max is null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIsNotNull() {
            addCriterion("price_max is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMaxEqualTo(Integer value) {
            addCriterion("price_max =", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotEqualTo(Integer value) {
            addCriterion("price_max <>", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxGreaterThan(Integer value) {
            addCriterion("price_max >", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_max >=", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLessThan(Integer value) {
            addCriterion("price_max <", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxLessThanOrEqualTo(Integer value) {
            addCriterion("price_max <=", value, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxIn(List<Integer> values) {
            addCriterion("price_max in", values, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotIn(List<Integer> values) {
            addCriterion("price_max not in", values, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxBetween(Integer value1, Integer value2) {
            addCriterion("price_max between", value1, value2, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("price_max not between", value1, value2, "priceMax");
            return (Criteria) this;
        }

        public Criteria andPriceMidIsNull() {
            addCriterion("price_mid is null");
            return (Criteria) this;
        }

        public Criteria andPriceMidIsNotNull() {
            addCriterion("price_mid is not null");
            return (Criteria) this;
        }

        public Criteria andPriceMidEqualTo(Integer value) {
            addCriterion("price_mid =", value, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidNotEqualTo(Integer value) {
            addCriterion("price_mid <>", value, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidGreaterThan(Integer value) {
            addCriterion("price_mid >", value, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_mid >=", value, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidLessThan(Integer value) {
            addCriterion("price_mid <", value, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidLessThanOrEqualTo(Integer value) {
            addCriterion("price_mid <=", value, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidIn(List<Integer> values) {
            addCriterion("price_mid in", values, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidNotIn(List<Integer> values) {
            addCriterion("price_mid not in", values, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidBetween(Integer value1, Integer value2) {
            addCriterion("price_mid between", value1, value2, "priceMid");
            return (Criteria) this;
        }

        public Criteria andPriceMidNotBetween(Integer value1, Integer value2) {
            addCriterion("price_mid not between", value1, value2, "priceMid");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNull() {
            addCriterion("is_pass is null");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNotNull() {
            addCriterion("is_pass is not null");
            return (Criteria) this;
        }

        public Criteria andIsPassEqualTo(Integer value) {
            addCriterion("is_pass =", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotEqualTo(Integer value) {
            addCriterion("is_pass <>", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThan(Integer value) {
            addCriterion("is_pass >", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pass >=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThan(Integer value) {
            addCriterion("is_pass <", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThanOrEqualTo(Integer value) {
            addCriterion("is_pass <=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassIn(List<Integer> values) {
            addCriterion("is_pass in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotIn(List<Integer> values) {
            addCriterion("is_pass not in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassBetween(Integer value1, Integer value2) {
            addCriterion("is_pass between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pass not between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontIsNull() {
            addCriterion("pid_url_front is null");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontIsNotNull() {
            addCriterion("pid_url_front is not null");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontEqualTo(String value) {
            addCriterion("pid_url_front =", value, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontNotEqualTo(String value) {
            addCriterion("pid_url_front <>", value, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontGreaterThan(String value) {
            addCriterion("pid_url_front >", value, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontGreaterThanOrEqualTo(String value) {
            addCriterion("pid_url_front >=", value, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontLessThan(String value) {
            addCriterion("pid_url_front <", value, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontLessThanOrEqualTo(String value) {
            addCriterion("pid_url_front <=", value, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontLike(String value) {
            addCriterion("pid_url_front like", value, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontNotLike(String value) {
            addCriterion("pid_url_front not like", value, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontIn(List<String> values) {
            addCriterion("pid_url_front in", values, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontNotIn(List<String> values) {
            addCriterion("pid_url_front not in", values, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontBetween(String value1, String value2) {
            addCriterion("pid_url_front between", value1, value2, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlFrontNotBetween(String value1, String value2) {
            addCriterion("pid_url_front not between", value1, value2, "pidUrlFront");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackIsNull() {
            addCriterion("pid_url_back is null");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackIsNotNull() {
            addCriterion("pid_url_back is not null");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackEqualTo(String value) {
            addCriterion("pid_url_back =", value, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackNotEqualTo(String value) {
            addCriterion("pid_url_back <>", value, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackGreaterThan(String value) {
            addCriterion("pid_url_back >", value, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackGreaterThanOrEqualTo(String value) {
            addCriterion("pid_url_back >=", value, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackLessThan(String value) {
            addCriterion("pid_url_back <", value, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackLessThanOrEqualTo(String value) {
            addCriterion("pid_url_back <=", value, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackLike(String value) {
            addCriterion("pid_url_back like", value, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackNotLike(String value) {
            addCriterion("pid_url_back not like", value, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackIn(List<String> values) {
            addCriterion("pid_url_back in", values, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackNotIn(List<String> values) {
            addCriterion("pid_url_back not in", values, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackBetween(String value1, String value2) {
            addCriterion("pid_url_back between", value1, value2, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andPidUrlBackNotBetween(String value1, String value2) {
            addCriterion("pid_url_back not between", value1, value2, "pidUrlBack");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIsNull() {
            addCriterion("detailAddress is null");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIsNotNull() {
            addCriterion("detailAddress is not null");
            return (Criteria) this;
        }

        public Criteria andDetailaddressEqualTo(String value) {
            addCriterion("detailAddress =", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotEqualTo(String value) {
            addCriterion("detailAddress <>", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressGreaterThan(String value) {
            addCriterion("detailAddress >", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailAddress >=", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLessThan(String value) {
            addCriterion("detailAddress <", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLessThanOrEqualTo(String value) {
            addCriterion("detailAddress <=", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressLike(String value) {
            addCriterion("detailAddress like", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotLike(String value) {
            addCriterion("detailAddress not like", value, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressIn(List<String> values) {
            addCriterion("detailAddress in", values, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotIn(List<String> values) {
            addCriterion("detailAddress not in", values, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressBetween(String value1, String value2) {
            addCriterion("detailAddress between", value1, value2, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andDetailaddressNotBetween(String value1, String value2) {
            addCriterion("detailAddress not between", value1, value2, "detailaddress");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlIsNull() {
            addCriterion("people_pid_url is null");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlIsNotNull() {
            addCriterion("people_pid_url is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlEqualTo(String value) {
            addCriterion("people_pid_url =", value, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlNotEqualTo(String value) {
            addCriterion("people_pid_url <>", value, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlGreaterThan(String value) {
            addCriterion("people_pid_url >", value, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlGreaterThanOrEqualTo(String value) {
            addCriterion("people_pid_url >=", value, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlLessThan(String value) {
            addCriterion("people_pid_url <", value, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlLessThanOrEqualTo(String value) {
            addCriterion("people_pid_url <=", value, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlLike(String value) {
            addCriterion("people_pid_url like", value, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlNotLike(String value) {
            addCriterion("people_pid_url not like", value, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlIn(List<String> values) {
            addCriterion("people_pid_url in", values, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlNotIn(List<String> values) {
            addCriterion("people_pid_url not in", values, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlBetween(String value1, String value2) {
            addCriterion("people_pid_url between", value1, value2, "peoplePidUrl");
            return (Criteria) this;
        }

        public Criteria andPeoplePidUrlNotBetween(String value1, String value2) {
            addCriterion("people_pid_url not between", value1, value2, "peoplePidUrl");
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
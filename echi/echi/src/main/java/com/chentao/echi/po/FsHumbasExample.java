package com.chentao.echi.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FsHumbasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FsHumbasExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andHumbasNoIsNull() {
            addCriterion("HUMBAS_NO is null");
            return (Criteria) this;
        }

        public Criteria andHumbasNoIsNotNull() {
            addCriterion("HUMBAS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andHumbasNoEqualTo(String value) {
            addCriterion("HUMBAS_NO =", value, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoNotEqualTo(String value) {
            addCriterion("HUMBAS_NO <>", value, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoGreaterThan(String value) {
            addCriterion("HUMBAS_NO >", value, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoGreaterThanOrEqualTo(String value) {
            addCriterion("HUMBAS_NO >=", value, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoLessThan(String value) {
            addCriterion("HUMBAS_NO <", value, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoLessThanOrEqualTo(String value) {
            addCriterion("HUMBAS_NO <=", value, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoLike(String value) {
            addCriterion("HUMBAS_NO like", value, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoNotLike(String value) {
            addCriterion("HUMBAS_NO not like", value, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoIn(List<String> values) {
            addCriterion("HUMBAS_NO in", values, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoNotIn(List<String> values) {
            addCriterion("HUMBAS_NO not in", values, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoBetween(String value1, String value2) {
            addCriterion("HUMBAS_NO between", value1, value2, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andHumbasNoNotBetween(String value1, String value2) {
            addCriterion("HUMBAS_NO not between", value1, value2, "humbasNo");
            return (Criteria) this;
        }

        public Criteria andRegNoIsNull() {
            addCriterion("REG_NO is null");
            return (Criteria) this;
        }

        public Criteria andRegNoIsNotNull() {
            addCriterion("REG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRegNoEqualTo(String value) {
            addCriterion("REG_NO =", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotEqualTo(String value) {
            addCriterion("REG_NO <>", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThan(String value) {
            addCriterion("REG_NO >", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("REG_NO >=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThan(String value) {
            addCriterion("REG_NO <", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThanOrEqualTo(String value) {
            addCriterion("REG_NO <=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLike(String value) {
            addCriterion("REG_NO like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotLike(String value) {
            addCriterion("REG_NO not like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoIn(List<String> values) {
            addCriterion("REG_NO in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotIn(List<String> values) {
            addCriterion("REG_NO not in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoBetween(String value1, String value2) {
            addCriterion("REG_NO between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotBetween(String value1, String value2) {
            addCriterion("REG_NO not between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNull() {
            addCriterion("EMP_NO is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("EMP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("EMP_NO =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("EMP_NO <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("EMP_NO >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NO >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("EMP_NO <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("EMP_NO <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("EMP_NO like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("EMP_NO not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("EMP_NO in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("EMP_NO not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("EMP_NO between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("EMP_NO not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(Short value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(Short value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(Short value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(Short value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(Short value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<Short> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<Short> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(Short value1, Short value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(Short value1, Short value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("NATIONALITY =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("NATIONALITY <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("NATIONALITY >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONALITY >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("NATIONALITY <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("NATIONALITY <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("NATIONALITY like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("NATIONALITY not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("NATIONALITY in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("NATIONALITY not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("NATIONALITY between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("NATIONALITY not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andRegiTypeIsNull() {
            addCriterion("REGI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRegiTypeIsNotNull() {
            addCriterion("REGI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRegiTypeEqualTo(Short value) {
            addCriterion("REGI_TYPE =", value, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeNotEqualTo(Short value) {
            addCriterion("REGI_TYPE <>", value, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeGreaterThan(Short value) {
            addCriterion("REGI_TYPE >", value, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("REGI_TYPE >=", value, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeLessThan(Short value) {
            addCriterion("REGI_TYPE <", value, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeLessThanOrEqualTo(Short value) {
            addCriterion("REGI_TYPE <=", value, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeIn(List<Short> values) {
            addCriterion("REGI_TYPE in", values, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeNotIn(List<Short> values) {
            addCriterion("REGI_TYPE not in", values, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeBetween(Short value1, Short value2) {
            addCriterion("REGI_TYPE between", value1, value2, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiTypeNotBetween(Short value1, Short value2) {
            addCriterion("REGI_TYPE not between", value1, value2, "regiType");
            return (Criteria) this;
        }

        public Criteria andRegiAreaIsNull() {
            addCriterion("REGI_AREA is null");
            return (Criteria) this;
        }

        public Criteria andRegiAreaIsNotNull() {
            addCriterion("REGI_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andRegiAreaEqualTo(String value) {
            addCriterion("REGI_AREA =", value, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaNotEqualTo(String value) {
            addCriterion("REGI_AREA <>", value, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaGreaterThan(String value) {
            addCriterion("REGI_AREA >", value, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaGreaterThanOrEqualTo(String value) {
            addCriterion("REGI_AREA >=", value, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaLessThan(String value) {
            addCriterion("REGI_AREA <", value, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaLessThanOrEqualTo(String value) {
            addCriterion("REGI_AREA <=", value, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaLike(String value) {
            addCriterion("REGI_AREA like", value, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaNotLike(String value) {
            addCriterion("REGI_AREA not like", value, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaIn(List<String> values) {
            addCriterion("REGI_AREA in", values, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaNotIn(List<String> values) {
            addCriterion("REGI_AREA not in", values, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaBetween(String value1, String value2) {
            addCriterion("REGI_AREA between", value1, value2, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAreaNotBetween(String value1, String value2) {
            addCriterion("REGI_AREA not between", value1, value2, "regiArea");
            return (Criteria) this;
        }

        public Criteria andRegiAddrIsNull() {
            addCriterion("REGI_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andRegiAddrIsNotNull() {
            addCriterion("REGI_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andRegiAddrEqualTo(String value) {
            addCriterion("REGI_ADDR =", value, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrNotEqualTo(String value) {
            addCriterion("REGI_ADDR <>", value, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrGreaterThan(String value) {
            addCriterion("REGI_ADDR >", value, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrGreaterThanOrEqualTo(String value) {
            addCriterion("REGI_ADDR >=", value, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrLessThan(String value) {
            addCriterion("REGI_ADDR <", value, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrLessThanOrEqualTo(String value) {
            addCriterion("REGI_ADDR <=", value, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrLike(String value) {
            addCriterion("REGI_ADDR like", value, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrNotLike(String value) {
            addCriterion("REGI_ADDR not like", value, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrIn(List<String> values) {
            addCriterion("REGI_ADDR in", values, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrNotIn(List<String> values) {
            addCriterion("REGI_ADDR not in", values, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrBetween(String value1, String value2) {
            addCriterion("REGI_ADDR between", value1, value2, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andRegiAddrNotBetween(String value1, String value2) {
            addCriterion("REGI_ADDR not between", value1, value2, "regiAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrIsNull() {
            addCriterion("SH_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andShAddrIsNotNull() {
            addCriterion("SH_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andShAddrEqualTo(String value) {
            addCriterion("SH_ADDR =", value, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrNotEqualTo(String value) {
            addCriterion("SH_ADDR <>", value, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrGreaterThan(String value) {
            addCriterion("SH_ADDR >", value, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrGreaterThanOrEqualTo(String value) {
            addCriterion("SH_ADDR >=", value, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrLessThan(String value) {
            addCriterion("SH_ADDR <", value, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrLessThanOrEqualTo(String value) {
            addCriterion("SH_ADDR <=", value, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrLike(String value) {
            addCriterion("SH_ADDR like", value, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrNotLike(String value) {
            addCriterion("SH_ADDR not like", value, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrIn(List<String> values) {
            addCriterion("SH_ADDR in", values, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrNotIn(List<String> values) {
            addCriterion("SH_ADDR not in", values, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrBetween(String value1, String value2) {
            addCriterion("SH_ADDR between", value1, value2, "shAddr");
            return (Criteria) this;
        }

        public Criteria andShAddrNotBetween(String value1, String value2) {
            addCriterion("SH_ADDR not between", value1, value2, "shAddr");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("ZIP is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("ZIP =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("ZIP <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("ZIP >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("ZIP <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("ZIP <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("ZIP like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("ZIP not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("ZIP in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("ZIP not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("ZIP between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("ZIP not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompaAddrIsNull() {
            addCriterion("COMPA_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCompaAddrIsNotNull() {
            addCriterion("COMPA_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCompaAddrEqualTo(String value) {
            addCriterion("COMPA_ADDR =", value, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrNotEqualTo(String value) {
            addCriterion("COMPA_ADDR <>", value, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrGreaterThan(String value) {
            addCriterion("COMPA_ADDR >", value, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrGreaterThanOrEqualTo(String value) {
            addCriterion("COMPA_ADDR >=", value, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrLessThan(String value) {
            addCriterion("COMPA_ADDR <", value, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrLessThanOrEqualTo(String value) {
            addCriterion("COMPA_ADDR <=", value, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrLike(String value) {
            addCriterion("COMPA_ADDR like", value, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrNotLike(String value) {
            addCriterion("COMPA_ADDR not like", value, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrIn(List<String> values) {
            addCriterion("COMPA_ADDR in", values, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrNotIn(List<String> values) {
            addCriterion("COMPA_ADDR not in", values, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrBetween(String value1, String value2) {
            addCriterion("COMPA_ADDR between", value1, value2, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andCompaAddrNotBetween(String value1, String value2) {
            addCriterion("COMPA_ADDR not between", value1, value2, "compaAddr");
            return (Criteria) this;
        }

        public Criteria andOPhoneIsNull() {
            addCriterion("O_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andOPhoneIsNotNull() {
            addCriterion("O_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOPhoneEqualTo(String value) {
            addCriterion("O_PHONE =", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneNotEqualTo(String value) {
            addCriterion("O_PHONE <>", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneGreaterThan(String value) {
            addCriterion("O_PHONE >", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("O_PHONE >=", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneLessThan(String value) {
            addCriterion("O_PHONE <", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneLessThanOrEqualTo(String value) {
            addCriterion("O_PHONE <=", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneLike(String value) {
            addCriterion("O_PHONE like", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneNotLike(String value) {
            addCriterion("O_PHONE not like", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneIn(List<String> values) {
            addCriterion("O_PHONE in", values, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneNotIn(List<String> values) {
            addCriterion("O_PHONE not in", values, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneBetween(String value1, String value2) {
            addCriterion("O_PHONE between", value1, value2, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneNotBetween(String value1, String value2) {
            addCriterion("O_PHONE not between", value1, value2, "oPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneIsNull() {
            addCriterion("H_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andHPhoneIsNotNull() {
            addCriterion("H_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andHPhoneEqualTo(String value) {
            addCriterion("H_PHONE =", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneNotEqualTo(String value) {
            addCriterion("H_PHONE <>", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneGreaterThan(String value) {
            addCriterion("H_PHONE >", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("H_PHONE >=", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneLessThan(String value) {
            addCriterion("H_PHONE <", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneLessThanOrEqualTo(String value) {
            addCriterion("H_PHONE <=", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneLike(String value) {
            addCriterion("H_PHONE like", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneNotLike(String value) {
            addCriterion("H_PHONE not like", value, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneIn(List<String> values) {
            addCriterion("H_PHONE in", values, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneNotIn(List<String> values) {
            addCriterion("H_PHONE not in", values, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneBetween(String value1, String value2) {
            addCriterion("H_PHONE between", value1, value2, "hPhone");
            return (Criteria) this;
        }

        public Criteria andHPhoneNotBetween(String value1, String value2) {
            addCriterion("H_PHONE not between", value1, value2, "hPhone");
            return (Criteria) this;
        }

        public Criteria andBpIsNull() {
            addCriterion("BP is null");
            return (Criteria) this;
        }

        public Criteria andBpIsNotNull() {
            addCriterion("BP is not null");
            return (Criteria) this;
        }

        public Criteria andBpEqualTo(String value) {
            addCriterion("BP =", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotEqualTo(String value) {
            addCriterion("BP <>", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpGreaterThan(String value) {
            addCriterion("BP >", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpGreaterThanOrEqualTo(String value) {
            addCriterion("BP >=", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpLessThan(String value) {
            addCriterion("BP <", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpLessThanOrEqualTo(String value) {
            addCriterion("BP <=", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpLike(String value) {
            addCriterion("BP like", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotLike(String value) {
            addCriterion("BP not like", value, "bp");
            return (Criteria) this;
        }

        public Criteria andBpIn(List<String> values) {
            addCriterion("BP in", values, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotIn(List<String> values) {
            addCriterion("BP not in", values, "bp");
            return (Criteria) this;
        }

        public Criteria andBpBetween(String value1, String value2) {
            addCriterion("BP between", value1, value2, "bp");
            return (Criteria) this;
        }

        public Criteria andBpNotBetween(String value1, String value2) {
            addCriterion("BP not between", value1, value2, "bp");
            return (Criteria) this;
        }

        public Criteria andMpIsNull() {
            addCriterion("MP is null");
            return (Criteria) this;
        }

        public Criteria andMpIsNotNull() {
            addCriterion("MP is not null");
            return (Criteria) this;
        }

        public Criteria andMpEqualTo(String value) {
            addCriterion("MP =", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotEqualTo(String value) {
            addCriterion("MP <>", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThan(String value) {
            addCriterion("MP >", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThanOrEqualTo(String value) {
            addCriterion("MP >=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThan(String value) {
            addCriterion("MP <", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThanOrEqualTo(String value) {
            addCriterion("MP <=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLike(String value) {
            addCriterion("MP like", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotLike(String value) {
            addCriterion("MP not like", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpIn(List<String> values) {
            addCriterion("MP in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotIn(List<String> values) {
            addCriterion("MP not in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpBetween(String value1, String value2) {
            addCriterion("MP between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotBetween(String value1, String value2) {
            addCriterion("MP not between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andEmContactIsNull() {
            addCriterion("EM_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andEmContactIsNotNull() {
            addCriterion("EM_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andEmContactEqualTo(String value) {
            addCriterion("EM_CONTACT =", value, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactNotEqualTo(String value) {
            addCriterion("EM_CONTACT <>", value, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactGreaterThan(String value) {
            addCriterion("EM_CONTACT >", value, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactGreaterThanOrEqualTo(String value) {
            addCriterion("EM_CONTACT >=", value, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactLessThan(String value) {
            addCriterion("EM_CONTACT <", value, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactLessThanOrEqualTo(String value) {
            addCriterion("EM_CONTACT <=", value, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactLike(String value) {
            addCriterion("EM_CONTACT like", value, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactNotLike(String value) {
            addCriterion("EM_CONTACT not like", value, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactIn(List<String> values) {
            addCriterion("EM_CONTACT in", values, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactNotIn(List<String> values) {
            addCriterion("EM_CONTACT not in", values, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactBetween(String value1, String value2) {
            addCriterion("EM_CONTACT between", value1, value2, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmContactNotBetween(String value1, String value2) {
            addCriterion("EM_CONTACT not between", value1, value2, "emContact");
            return (Criteria) this;
        }

        public Criteria andEmPhoneIsNull() {
            addCriterion("EM_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmPhoneIsNotNull() {
            addCriterion("EM_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmPhoneEqualTo(String value) {
            addCriterion("EM_PHONE =", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneNotEqualTo(String value) {
            addCriterion("EM_PHONE <>", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneGreaterThan(String value) {
            addCriterion("EM_PHONE >", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("EM_PHONE >=", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneLessThan(String value) {
            addCriterion("EM_PHONE <", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneLessThanOrEqualTo(String value) {
            addCriterion("EM_PHONE <=", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneLike(String value) {
            addCriterion("EM_PHONE like", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneNotLike(String value) {
            addCriterion("EM_PHONE not like", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneIn(List<String> values) {
            addCriterion("EM_PHONE in", values, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneNotIn(List<String> values) {
            addCriterion("EM_PHONE not in", values, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneBetween(String value1, String value2) {
            addCriterion("EM_PHONE between", value1, value2, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneNotBetween(String value1, String value2) {
            addCriterion("EM_PHONE not between", value1, value2, "emPhone");
            return (Criteria) this;
        }

        public Criteria andFescoIsNull() {
            addCriterion("FESCO is null");
            return (Criteria) this;
        }

        public Criteria andFescoIsNotNull() {
            addCriterion("FESCO is not null");
            return (Criteria) this;
        }

        public Criteria andFescoEqualTo(Short value) {
            addCriterion("FESCO =", value, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoNotEqualTo(Short value) {
            addCriterion("FESCO <>", value, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoGreaterThan(Short value) {
            addCriterion("FESCO >", value, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoGreaterThanOrEqualTo(Short value) {
            addCriterion("FESCO >=", value, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoLessThan(Short value) {
            addCriterion("FESCO <", value, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoLessThanOrEqualTo(Short value) {
            addCriterion("FESCO <=", value, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoIn(List<Short> values) {
            addCriterion("FESCO in", values, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoNotIn(List<Short> values) {
            addCriterion("FESCO not in", values, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoBetween(Short value1, Short value2) {
            addCriterion("FESCO between", value1, value2, "fesco");
            return (Criteria) this;
        }

        public Criteria andFescoNotBetween(Short value1, Short value2) {
            addCriterion("FESCO not between", value1, value2, "fesco");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("UPDATER is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("UPDATER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("UPDATER =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("UPDATER <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("UPDATER >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("UPDATER <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("UPDATER <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("UPDATER like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("UPDATER not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("UPDATER in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("UPDATER not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("UPDATER between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("UPDATER not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("COMMUNITY is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("COMMUNITY is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("COMMUNITY =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("COMMUNITY <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("COMMUNITY >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUNITY >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("COMMUNITY <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("COMMUNITY <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("COMMUNITY like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("COMMUNITY not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("COMMUNITY in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("COMMUNITY not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("COMMUNITY between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("COMMUNITY not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andRoadNumIsNull() {
            addCriterion("ROAD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRoadNumIsNotNull() {
            addCriterion("ROAD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRoadNumEqualTo(String value) {
            addCriterion("ROAD_NUM =", value, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumNotEqualTo(String value) {
            addCriterion("ROAD_NUM <>", value, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumGreaterThan(String value) {
            addCriterion("ROAD_NUM >", value, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumGreaterThanOrEqualTo(String value) {
            addCriterion("ROAD_NUM >=", value, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumLessThan(String value) {
            addCriterion("ROAD_NUM <", value, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumLessThanOrEqualTo(String value) {
            addCriterion("ROAD_NUM <=", value, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumLike(String value) {
            addCriterion("ROAD_NUM like", value, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumNotLike(String value) {
            addCriterion("ROAD_NUM not like", value, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumIn(List<String> values) {
            addCriterion("ROAD_NUM in", values, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumNotIn(List<String> values) {
            addCriterion("ROAD_NUM not in", values, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumBetween(String value1, String value2) {
            addCriterion("ROAD_NUM between", value1, value2, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoadNumNotBetween(String value1, String value2) {
            addCriterion("ROAD_NUM not between", value1, value2, "roadNum");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("ROOM is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("ROOM is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("ROOM =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("ROOM <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("ROOM >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("ROOM <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("ROOM <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("ROOM like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("ROOM not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("ROOM in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("ROOM not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("ROOM between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("ROOM not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andBornPlaceIsNull() {
            addCriterion("BORN_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andBornPlaceIsNotNull() {
            addCriterion("BORN_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andBornPlaceEqualTo(String value) {
            addCriterion("BORN_PLACE =", value, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceNotEqualTo(String value) {
            addCriterion("BORN_PLACE <>", value, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceGreaterThan(String value) {
            addCriterion("BORN_PLACE >", value, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("BORN_PLACE >=", value, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceLessThan(String value) {
            addCriterion("BORN_PLACE <", value, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceLessThanOrEqualTo(String value) {
            addCriterion("BORN_PLACE <=", value, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceLike(String value) {
            addCriterion("BORN_PLACE like", value, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceNotLike(String value) {
            addCriterion("BORN_PLACE not like", value, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceIn(List<String> values) {
            addCriterion("BORN_PLACE in", values, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceNotIn(List<String> values) {
            addCriterion("BORN_PLACE not in", values, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceBetween(String value1, String value2) {
            addCriterion("BORN_PLACE between", value1, value2, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andBornPlaceNotBetween(String value1, String value2) {
            addCriterion("BORN_PLACE not between", value1, value2, "bornPlace");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoIsNull() {
            addCriterion("PM_EMP_NO is null");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoIsNotNull() {
            addCriterion("PM_EMP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoEqualTo(String value) {
            addCriterion("PM_EMP_NO =", value, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoNotEqualTo(String value) {
            addCriterion("PM_EMP_NO <>", value, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoGreaterThan(String value) {
            addCriterion("PM_EMP_NO >", value, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("PM_EMP_NO >=", value, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoLessThan(String value) {
            addCriterion("PM_EMP_NO <", value, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoLessThanOrEqualTo(String value) {
            addCriterion("PM_EMP_NO <=", value, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoLike(String value) {
            addCriterion("PM_EMP_NO like", value, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoNotLike(String value) {
            addCriterion("PM_EMP_NO not like", value, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoIn(List<String> values) {
            addCriterion("PM_EMP_NO in", values, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoNotIn(List<String> values) {
            addCriterion("PM_EMP_NO not in", values, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoBetween(String value1, String value2) {
            addCriterion("PM_EMP_NO between", value1, value2, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andPmEmpNoNotBetween(String value1, String value2) {
            addCriterion("PM_EMP_NO not between", value1, value2, "pmEmpNo");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalIsNull() {
            addCriterion("FIRST_CLASS_HOSPITAL is null");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalIsNotNull() {
            addCriterion("FIRST_CLASS_HOSPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalEqualTo(String value) {
            addCriterion("FIRST_CLASS_HOSPITAL =", value, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalNotEqualTo(String value) {
            addCriterion("FIRST_CLASS_HOSPITAL <>", value, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalGreaterThan(String value) {
            addCriterion("FIRST_CLASS_HOSPITAL >", value, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_CLASS_HOSPITAL >=", value, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalLessThan(String value) {
            addCriterion("FIRST_CLASS_HOSPITAL <", value, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalLessThanOrEqualTo(String value) {
            addCriterion("FIRST_CLASS_HOSPITAL <=", value, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalLike(String value) {
            addCriterion("FIRST_CLASS_HOSPITAL like", value, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalNotLike(String value) {
            addCriterion("FIRST_CLASS_HOSPITAL not like", value, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalIn(List<String> values) {
            addCriterion("FIRST_CLASS_HOSPITAL in", values, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalNotIn(List<String> values) {
            addCriterion("FIRST_CLASS_HOSPITAL not in", values, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalBetween(String value1, String value2) {
            addCriterion("FIRST_CLASS_HOSPITAL between", value1, value2, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andFirstClassHospitalNotBetween(String value1, String value2) {
            addCriterion("FIRST_CLASS_HOSPITAL not between", value1, value2, "firstClassHospital");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("NAME_EN =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("NAME_EN <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("NAME_EN >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("NAME_EN <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("NAME_EN like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("NAME_EN not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("NAME_EN in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("NAME_EN not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("NAME_EN between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("NAME_EN not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameSpellIsNull() {
            addCriterion("NAME_SPELL is null");
            return (Criteria) this;
        }

        public Criteria andNameSpellIsNotNull() {
            addCriterion("NAME_SPELL is not null");
            return (Criteria) this;
        }

        public Criteria andNameSpellEqualTo(String value) {
            addCriterion("NAME_SPELL =", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellNotEqualTo(String value) {
            addCriterion("NAME_SPELL <>", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellGreaterThan(String value) {
            addCriterion("NAME_SPELL >", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_SPELL >=", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellLessThan(String value) {
            addCriterion("NAME_SPELL <", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellLessThanOrEqualTo(String value) {
            addCriterion("NAME_SPELL <=", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellLike(String value) {
            addCriterion("NAME_SPELL like", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellNotLike(String value) {
            addCriterion("NAME_SPELL not like", value, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellIn(List<String> values) {
            addCriterion("NAME_SPELL in", values, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellNotIn(List<String> values) {
            addCriterion("NAME_SPELL not in", values, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellBetween(String value1, String value2) {
            addCriterion("NAME_SPELL between", value1, value2, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andNameSpellNotBetween(String value1, String value2) {
            addCriterion("NAME_SPELL not between", value1, value2, "nameSpell");
            return (Criteria) this;
        }

        public Criteria andRegiZipIsNull() {
            addCriterion("REGI_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andRegiZipIsNotNull() {
            addCriterion("REGI_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andRegiZipEqualTo(String value) {
            addCriterion("REGI_ZIP =", value, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipNotEqualTo(String value) {
            addCriterion("REGI_ZIP <>", value, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipGreaterThan(String value) {
            addCriterion("REGI_ZIP >", value, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipGreaterThanOrEqualTo(String value) {
            addCriterion("REGI_ZIP >=", value, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipLessThan(String value) {
            addCriterion("REGI_ZIP <", value, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipLessThanOrEqualTo(String value) {
            addCriterion("REGI_ZIP <=", value, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipLike(String value) {
            addCriterion("REGI_ZIP like", value, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipNotLike(String value) {
            addCriterion("REGI_ZIP not like", value, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipIn(List<String> values) {
            addCriterion("REGI_ZIP in", values, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipNotIn(List<String> values) {
            addCriterion("REGI_ZIP not in", values, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipBetween(String value1, String value2) {
            addCriterion("REGI_ZIP between", value1, value2, "regiZip");
            return (Criteria) this;
        }

        public Criteria andRegiZipNotBetween(String value1, String value2) {
            addCriterion("REGI_ZIP not between", value1, value2, "regiZip");
            return (Criteria) this;
        }

        public Criteria andSocialAddrIsNull() {
            addCriterion("SOCIAL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andSocialAddrIsNotNull() {
            addCriterion("SOCIAL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andSocialAddrEqualTo(String value) {
            addCriterion("SOCIAL_ADDR =", value, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrNotEqualTo(String value) {
            addCriterion("SOCIAL_ADDR <>", value, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrGreaterThan(String value) {
            addCriterion("SOCIAL_ADDR >", value, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIAL_ADDR >=", value, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrLessThan(String value) {
            addCriterion("SOCIAL_ADDR <", value, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrLessThanOrEqualTo(String value) {
            addCriterion("SOCIAL_ADDR <=", value, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrLike(String value) {
            addCriterion("SOCIAL_ADDR like", value, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrNotLike(String value) {
            addCriterion("SOCIAL_ADDR not like", value, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrIn(List<String> values) {
            addCriterion("SOCIAL_ADDR in", values, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrNotIn(List<String> values) {
            addCriterion("SOCIAL_ADDR not in", values, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrBetween(String value1, String value2) {
            addCriterion("SOCIAL_ADDR between", value1, value2, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andSocialAddrNotBetween(String value1, String value2) {
            addCriterion("SOCIAL_ADDR not between", value1, value2, "socialAddr");
            return (Criteria) this;
        }

        public Criteria andWorkCityIsNull() {
            addCriterion("WORK_CITY is null");
            return (Criteria) this;
        }

        public Criteria andWorkCityIsNotNull() {
            addCriterion("WORK_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andWorkCityEqualTo(String value) {
            addCriterion("WORK_CITY =", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityNotEqualTo(String value) {
            addCriterion("WORK_CITY <>", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityGreaterThan(String value) {
            addCriterion("WORK_CITY >", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_CITY >=", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityLessThan(String value) {
            addCriterion("WORK_CITY <", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityLessThanOrEqualTo(String value) {
            addCriterion("WORK_CITY <=", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityLike(String value) {
            addCriterion("WORK_CITY like", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityNotLike(String value) {
            addCriterion("WORK_CITY not like", value, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityIn(List<String> values) {
            addCriterion("WORK_CITY in", values, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityNotIn(List<String> values) {
            addCriterion("WORK_CITY not in", values, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityBetween(String value1, String value2) {
            addCriterion("WORK_CITY between", value1, value2, "workCity");
            return (Criteria) this;
        }

        public Criteria andWorkCityNotBetween(String value1, String value2) {
            addCriterion("WORK_CITY not between", value1, value2, "workCity");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrIsNull() {
            addCriterion("MEDICAL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrIsNotNull() {
            addCriterion("MEDICAL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrEqualTo(String value) {
            addCriterion("MEDICAL_ADDR =", value, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrNotEqualTo(String value) {
            addCriterion("MEDICAL_ADDR <>", value, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrGreaterThan(String value) {
            addCriterion("MEDICAL_ADDR >", value, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrGreaterThanOrEqualTo(String value) {
            addCriterion("MEDICAL_ADDR >=", value, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrLessThan(String value) {
            addCriterion("MEDICAL_ADDR <", value, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrLessThanOrEqualTo(String value) {
            addCriterion("MEDICAL_ADDR <=", value, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrLike(String value) {
            addCriterion("MEDICAL_ADDR like", value, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrNotLike(String value) {
            addCriterion("MEDICAL_ADDR not like", value, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrIn(List<String> values) {
            addCriterion("MEDICAL_ADDR in", values, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrNotIn(List<String> values) {
            addCriterion("MEDICAL_ADDR not in", values, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrBetween(String value1, String value2) {
            addCriterion("MEDICAL_ADDR between", value1, value2, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andMedicalAddrNotBetween(String value1, String value2) {
            addCriterion("MEDICAL_ADDR not between", value1, value2, "medicalAddr");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andMarryIsNull() {
            addCriterion("MARRY is null");
            return (Criteria) this;
        }

        public Criteria andMarryIsNotNull() {
            addCriterion("MARRY is not null");
            return (Criteria) this;
        }

        public Criteria andMarryEqualTo(String value) {
            addCriterion("MARRY =", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotEqualTo(String value) {
            addCriterion("MARRY <>", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThan(String value) {
            addCriterion("MARRY >", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThanOrEqualTo(String value) {
            addCriterion("MARRY >=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThan(String value) {
            addCriterion("MARRY <", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThanOrEqualTo(String value) {
            addCriterion("MARRY <=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLike(String value) {
            addCriterion("MARRY like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotLike(String value) {
            addCriterion("MARRY not like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryIn(List<String> values) {
            addCriterion("MARRY in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotIn(List<String> values) {
            addCriterion("MARRY not in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryBetween(String value1, String value2) {
            addCriterion("MARRY between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotBetween(String value1, String value2) {
            addCriterion("MARRY not between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andPartyIsNull() {
            addCriterion("PARTY is null");
            return (Criteria) this;
        }

        public Criteria andPartyIsNotNull() {
            addCriterion("PARTY is not null");
            return (Criteria) this;
        }

        public Criteria andPartyEqualTo(String value) {
            addCriterion("PARTY =", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotEqualTo(String value) {
            addCriterion("PARTY <>", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThan(String value) {
            addCriterion("PARTY >", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThanOrEqualTo(String value) {
            addCriterion("PARTY >=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThan(String value) {
            addCriterion("PARTY <", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThanOrEqualTo(String value) {
            addCriterion("PARTY <=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLike(String value) {
            addCriterion("PARTY like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotLike(String value) {
            addCriterion("PARTY not like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyIn(List<String> values) {
            addCriterion("PARTY in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotIn(List<String> values) {
            addCriterion("PARTY not in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyBetween(String value1, String value2) {
            addCriterion("PARTY between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotBetween(String value1, String value2) {
            addCriterion("PARTY not between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andRegiCityIsNull() {
            addCriterion("REGI_CITY is null");
            return (Criteria) this;
        }

        public Criteria andRegiCityIsNotNull() {
            addCriterion("REGI_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andRegiCityEqualTo(String value) {
            addCriterion("REGI_CITY =", value, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityNotEqualTo(String value) {
            addCriterion("REGI_CITY <>", value, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityGreaterThan(String value) {
            addCriterion("REGI_CITY >", value, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityGreaterThanOrEqualTo(String value) {
            addCriterion("REGI_CITY >=", value, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityLessThan(String value) {
            addCriterion("REGI_CITY <", value, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityLessThanOrEqualTo(String value) {
            addCriterion("REGI_CITY <=", value, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityLike(String value) {
            addCriterion("REGI_CITY like", value, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityNotLike(String value) {
            addCriterion("REGI_CITY not like", value, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityIn(List<String> values) {
            addCriterion("REGI_CITY in", values, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityNotIn(List<String> values) {
            addCriterion("REGI_CITY not in", values, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityBetween(String value1, String value2) {
            addCriterion("REGI_CITY between", value1, value2, "regiCity");
            return (Criteria) this;
        }

        public Criteria andRegiCityNotBetween(String value1, String value2) {
            addCriterion("REGI_CITY not between", value1, value2, "regiCity");
            return (Criteria) this;
        }

        public Criteria andShAreaIsNull() {
            addCriterion("SH_AREA is null");
            return (Criteria) this;
        }

        public Criteria andShAreaIsNotNull() {
            addCriterion("SH_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andShAreaEqualTo(String value) {
            addCriterion("SH_AREA =", value, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaNotEqualTo(String value) {
            addCriterion("SH_AREA <>", value, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaGreaterThan(String value) {
            addCriterion("SH_AREA >", value, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaGreaterThanOrEqualTo(String value) {
            addCriterion("SH_AREA >=", value, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaLessThan(String value) {
            addCriterion("SH_AREA <", value, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaLessThanOrEqualTo(String value) {
            addCriterion("SH_AREA <=", value, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaLike(String value) {
            addCriterion("SH_AREA like", value, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaNotLike(String value) {
            addCriterion("SH_AREA not like", value, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaIn(List<String> values) {
            addCriterion("SH_AREA in", values, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaNotIn(List<String> values) {
            addCriterion("SH_AREA not in", values, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaBetween(String value1, String value2) {
            addCriterion("SH_AREA between", value1, value2, "shArea");
            return (Criteria) this;
        }

        public Criteria andShAreaNotBetween(String value1, String value2) {
            addCriterion("SH_AREA not between", value1, value2, "shArea");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeIsNull() {
            addCriterion("TAX_ADDR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeIsNotNull() {
            addCriterion("TAX_ADDR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeEqualTo(String value) {
            addCriterion("TAX_ADDR_TYPE =", value, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeNotEqualTo(String value) {
            addCriterion("TAX_ADDR_TYPE <>", value, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeGreaterThan(String value) {
            addCriterion("TAX_ADDR_TYPE >", value, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ADDR_TYPE >=", value, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeLessThan(String value) {
            addCriterion("TAX_ADDR_TYPE <", value, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeLessThanOrEqualTo(String value) {
            addCriterion("TAX_ADDR_TYPE <=", value, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeLike(String value) {
            addCriterion("TAX_ADDR_TYPE like", value, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeNotLike(String value) {
            addCriterion("TAX_ADDR_TYPE not like", value, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeIn(List<String> values) {
            addCriterion("TAX_ADDR_TYPE in", values, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeNotIn(List<String> values) {
            addCriterion("TAX_ADDR_TYPE not in", values, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeBetween(String value1, String value2) {
            addCriterion("TAX_ADDR_TYPE between", value1, value2, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrTypeNotBetween(String value1, String value2) {
            addCriterion("TAX_ADDR_TYPE not between", value1, value2, "taxAddrType");
            return (Criteria) this;
        }

        public Criteria andTaxAddrIsNull() {
            addCriterion("TAX_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andTaxAddrIsNotNull() {
            addCriterion("TAX_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAddrEqualTo(String value) {
            addCriterion("TAX_ADDR =", value, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrNotEqualTo(String value) {
            addCriterion("TAX_ADDR <>", value, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrGreaterThan(String value) {
            addCriterion("TAX_ADDR >", value, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ADDR >=", value, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrLessThan(String value) {
            addCriterion("TAX_ADDR <", value, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrLessThanOrEqualTo(String value) {
            addCriterion("TAX_ADDR <=", value, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrLike(String value) {
            addCriterion("TAX_ADDR like", value, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrNotLike(String value) {
            addCriterion("TAX_ADDR not like", value, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrIn(List<String> values) {
            addCriterion("TAX_ADDR in", values, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrNotIn(List<String> values) {
            addCriterion("TAX_ADDR not in", values, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrBetween(String value1, String value2) {
            addCriterion("TAX_ADDR between", value1, value2, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxAddrNotBetween(String value1, String value2) {
            addCriterion("TAX_ADDR not between", value1, value2, "taxAddr");
            return (Criteria) this;
        }

        public Criteria andTaxZipIsNull() {
            addCriterion("TAX_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andTaxZipIsNotNull() {
            addCriterion("TAX_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andTaxZipEqualTo(String value) {
            addCriterion("TAX_ZIP =", value, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipNotEqualTo(String value) {
            addCriterion("TAX_ZIP <>", value, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipGreaterThan(String value) {
            addCriterion("TAX_ZIP >", value, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ZIP >=", value, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipLessThan(String value) {
            addCriterion("TAX_ZIP <", value, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipLessThanOrEqualTo(String value) {
            addCriterion("TAX_ZIP <=", value, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipLike(String value) {
            addCriterion("TAX_ZIP like", value, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipNotLike(String value) {
            addCriterion("TAX_ZIP not like", value, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipIn(List<String> values) {
            addCriterion("TAX_ZIP in", values, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipNotIn(List<String> values) {
            addCriterion("TAX_ZIP not in", values, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipBetween(String value1, String value2) {
            addCriterion("TAX_ZIP between", value1, value2, "taxZip");
            return (Criteria) this;
        }

        public Criteria andTaxZipNotBetween(String value1, String value2) {
            addCriterion("TAX_ZIP not between", value1, value2, "taxZip");
            return (Criteria) this;
        }

        public Criteria andSecondEmailIsNull() {
            addCriterion("SECOND_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andSecondEmailIsNotNull() {
            addCriterion("SECOND_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andSecondEmailEqualTo(String value) {
            addCriterion("SECOND_EMAIL =", value, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailNotEqualTo(String value) {
            addCriterion("SECOND_EMAIL <>", value, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailGreaterThan(String value) {
            addCriterion("SECOND_EMAIL >", value, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_EMAIL >=", value, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailLessThan(String value) {
            addCriterion("SECOND_EMAIL <", value, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailLessThanOrEqualTo(String value) {
            addCriterion("SECOND_EMAIL <=", value, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailLike(String value) {
            addCriterion("SECOND_EMAIL like", value, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailNotLike(String value) {
            addCriterion("SECOND_EMAIL not like", value, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailIn(List<String> values) {
            addCriterion("SECOND_EMAIL in", values, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailNotIn(List<String> values) {
            addCriterion("SECOND_EMAIL not in", values, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailBetween(String value1, String value2) {
            addCriterion("SECOND_EMAIL between", value1, value2, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andSecondEmailNotBetween(String value1, String value2) {
            addCriterion("SECOND_EMAIL not between", value1, value2, "secondEmail");
            return (Criteria) this;
        }

        public Criteria andAssignStatusIsNull() {
            addCriterion("ASSIGN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAssignStatusIsNotNull() {
            addCriterion("ASSIGN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAssignStatusEqualTo(String value) {
            addCriterion("ASSIGN_STATUS =", value, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusNotEqualTo(String value) {
            addCriterion("ASSIGN_STATUS <>", value, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusGreaterThan(String value) {
            addCriterion("ASSIGN_STATUS >", value, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGN_STATUS >=", value, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusLessThan(String value) {
            addCriterion("ASSIGN_STATUS <", value, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusLessThanOrEqualTo(String value) {
            addCriterion("ASSIGN_STATUS <=", value, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusLike(String value) {
            addCriterion("ASSIGN_STATUS like", value, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusNotLike(String value) {
            addCriterion("ASSIGN_STATUS not like", value, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusIn(List<String> values) {
            addCriterion("ASSIGN_STATUS in", values, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusNotIn(List<String> values) {
            addCriterion("ASSIGN_STATUS not in", values, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusBetween(String value1, String value2) {
            addCriterion("ASSIGN_STATUS between", value1, value2, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andAssignStatusNotBetween(String value1, String value2) {
            addCriterion("ASSIGN_STATUS not between", value1, value2, "assignStatus");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeIsNull() {
            addCriterion("KINGDEE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeIsNotNull() {
            addCriterion("KINGDEE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeEqualTo(String value) {
            addCriterion("KINGDEE_CODE =", value, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeNotEqualTo(String value) {
            addCriterion("KINGDEE_CODE <>", value, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeGreaterThan(String value) {
            addCriterion("KINGDEE_CODE >", value, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("KINGDEE_CODE >=", value, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeLessThan(String value) {
            addCriterion("KINGDEE_CODE <", value, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeLessThanOrEqualTo(String value) {
            addCriterion("KINGDEE_CODE <=", value, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeLike(String value) {
            addCriterion("KINGDEE_CODE like", value, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeNotLike(String value) {
            addCriterion("KINGDEE_CODE not like", value, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeIn(List<String> values) {
            addCriterion("KINGDEE_CODE in", values, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeNotIn(List<String> values) {
            addCriterion("KINGDEE_CODE not in", values, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeBetween(String value1, String value2) {
            addCriterion("KINGDEE_CODE between", value1, value2, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andKingdeeCodeNotBetween(String value1, String value2) {
            addCriterion("KINGDEE_CODE not between", value1, value2, "kingdeeCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeIsNull() {
            addCriterion("SFSC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSfscCodeIsNotNull() {
            addCriterion("SFSC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSfscCodeEqualTo(String value) {
            addCriterion("SFSC_CODE =", value, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeNotEqualTo(String value) {
            addCriterion("SFSC_CODE <>", value, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeGreaterThan(String value) {
            addCriterion("SFSC_CODE >", value, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SFSC_CODE >=", value, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeLessThan(String value) {
            addCriterion("SFSC_CODE <", value, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeLessThanOrEqualTo(String value) {
            addCriterion("SFSC_CODE <=", value, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeLike(String value) {
            addCriterion("SFSC_CODE like", value, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeNotLike(String value) {
            addCriterion("SFSC_CODE not like", value, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeIn(List<String> values) {
            addCriterion("SFSC_CODE in", values, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeNotIn(List<String> values) {
            addCriterion("SFSC_CODE not in", values, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeBetween(String value1, String value2) {
            addCriterion("SFSC_CODE between", value1, value2, "sfscCode");
            return (Criteria) this;
        }

        public Criteria andSfscCodeNotBetween(String value1, String value2) {
            addCriterion("SFSC_CODE not between", value1, value2, "sfscCode");
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
package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class DoubanFilmEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoubanFilmEntityExample() {
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

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMoviePicIsNull() {
            addCriterion("movie_pic is null");
            return (Criteria) this;
        }

        public Criteria andMoviePicIsNotNull() {
            addCriterion("movie_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMoviePicEqualTo(String value) {
            addCriterion("movie_pic =", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicNotEqualTo(String value) {
            addCriterion("movie_pic <>", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicGreaterThan(String value) {
            addCriterion("movie_pic >", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicGreaterThanOrEqualTo(String value) {
            addCriterion("movie_pic >=", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicLessThan(String value) {
            addCriterion("movie_pic <", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicLessThanOrEqualTo(String value) {
            addCriterion("movie_pic <=", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicLike(String value) {
            addCriterion("movie_pic like", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicNotLike(String value) {
            addCriterion("movie_pic not like", value, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicIn(List<String> values) {
            addCriterion("movie_pic in", values, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicNotIn(List<String> values) {
            addCriterion("movie_pic not in", values, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicBetween(String value1, String value2) {
            addCriterion("movie_pic between", value1, value2, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMoviePicNotBetween(String value1, String value2) {
            addCriterion("movie_pic not between", value1, value2, "moviePic");
            return (Criteria) this;
        }

        public Criteria andMovieActorsIsNull() {
            addCriterion("movie_actors is null");
            return (Criteria) this;
        }

        public Criteria andMovieActorsIsNotNull() {
            addCriterion("movie_actors is not null");
            return (Criteria) this;
        }

        public Criteria andMovieActorsEqualTo(String value) {
            addCriterion("movie_actors =", value, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsNotEqualTo(String value) {
            addCriterion("movie_actors <>", value, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsGreaterThan(String value) {
            addCriterion("movie_actors >", value, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsGreaterThanOrEqualTo(String value) {
            addCriterion("movie_actors >=", value, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsLessThan(String value) {
            addCriterion("movie_actors <", value, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsLessThanOrEqualTo(String value) {
            addCriterion("movie_actors <=", value, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsLike(String value) {
            addCriterion("movie_actors like", value, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsNotLike(String value) {
            addCriterion("movie_actors not like", value, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsIn(List<String> values) {
            addCriterion("movie_actors in", values, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsNotIn(List<String> values) {
            addCriterion("movie_actors not in", values, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsBetween(String value1, String value2) {
            addCriterion("movie_actors between", value1, value2, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieActorsNotBetween(String value1, String value2) {
            addCriterion("movie_actors not between", value1, value2, "movieActors");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Integer value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Integer value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Integer value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Integer value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Integer value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Integer> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Integer> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Integer value1, Integer value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNull() {
            addCriterion("movie_score is null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNotNull() {
            addCriterion("movie_score is not null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreEqualTo(String value) {
            addCriterion("movie_score =", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotEqualTo(String value) {
            addCriterion("movie_score <>", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThan(String value) {
            addCriterion("movie_score >", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThanOrEqualTo(String value) {
            addCriterion("movie_score >=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThan(String value) {
            addCriterion("movie_score <", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThanOrEqualTo(String value) {
            addCriterion("movie_score <=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLike(String value) {
            addCriterion("movie_score like", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotLike(String value) {
            addCriterion("movie_score not like", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIn(List<String> values) {
            addCriterion("movie_score in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotIn(List<String> values) {
            addCriterion("movie_score not in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreBetween(String value1, String value2) {
            addCriterion("movie_score between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotBetween(String value1, String value2) {
            addCriterion("movie_score not between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountIsNull() {
            addCriterion("movie_review_count is null");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountIsNotNull() {
            addCriterion("movie_review_count is not null");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountEqualTo(Long value) {
            addCriterion("movie_review_count =", value, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountNotEqualTo(Long value) {
            addCriterion("movie_review_count <>", value, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountGreaterThan(Long value) {
            addCriterion("movie_review_count >", value, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountGreaterThanOrEqualTo(Long value) {
            addCriterion("movie_review_count >=", value, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountLessThan(Long value) {
            addCriterion("movie_review_count <", value, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountLessThanOrEqualTo(Long value) {
            addCriterion("movie_review_count <=", value, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountIn(List<Long> values) {
            addCriterion("movie_review_count in", values, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountNotIn(List<Long> values) {
            addCriterion("movie_review_count not in", values, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountBetween(Long value1, Long value2) {
            addCriterion("movie_review_count between", value1, value2, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieReviewCountNotBetween(Long value1, Long value2) {
            addCriterion("movie_review_count not between", value1, value2, "movieReviewCount");
            return (Criteria) this;
        }

        public Criteria andMovieTimeIsNull() {
            addCriterion("movie_time is null");
            return (Criteria) this;
        }

        public Criteria andMovieTimeIsNotNull() {
            addCriterion("movie_time is not null");
            return (Criteria) this;
        }

        public Criteria andMovieTimeEqualTo(String value) {
            addCriterion("movie_time =", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeNotEqualTo(String value) {
            addCriterion("movie_time <>", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeGreaterThan(String value) {
            addCriterion("movie_time >", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeGreaterThanOrEqualTo(String value) {
            addCriterion("movie_time >=", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeLessThan(String value) {
            addCriterion("movie_time <", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeLessThanOrEqualTo(String value) {
            addCriterion("movie_time <=", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeLike(String value) {
            addCriterion("movie_time like", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeNotLike(String value) {
            addCriterion("movie_time not like", value, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeIn(List<String> values) {
            addCriterion("movie_time in", values, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeNotIn(List<String> values) {
            addCriterion("movie_time not in", values, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeBetween(String value1, String value2) {
            addCriterion("movie_time between", value1, value2, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieTimeNotBetween(String value1, String value2) {
            addCriterion("movie_time not between", value1, value2, "movieTime");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsIsNull() {
            addCriterion("movie_regions is null");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsIsNotNull() {
            addCriterion("movie_regions is not null");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsEqualTo(String value) {
            addCriterion("movie_regions =", value, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsNotEqualTo(String value) {
            addCriterion("movie_regions <>", value, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsGreaterThan(String value) {
            addCriterion("movie_regions >", value, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsGreaterThanOrEqualTo(String value) {
            addCriterion("movie_regions >=", value, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsLessThan(String value) {
            addCriterion("movie_regions <", value, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsLessThanOrEqualTo(String value) {
            addCriterion("movie_regions <=", value, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsLike(String value) {
            addCriterion("movie_regions like", value, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsNotLike(String value) {
            addCriterion("movie_regions not like", value, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsIn(List<String> values) {
            addCriterion("movie_regions in", values, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsNotIn(List<String> values) {
            addCriterion("movie_regions not in", values, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsBetween(String value1, String value2) {
            addCriterion("movie_regions between", value1, value2, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieRegionsNotBetween(String value1, String value2) {
            addCriterion("movie_regions not between", value1, value2, "movieRegions");
            return (Criteria) this;
        }

        public Criteria andMovieTypesIsNull() {
            addCriterion("movie_types is null");
            return (Criteria) this;
        }

        public Criteria andMovieTypesIsNotNull() {
            addCriterion("movie_types is not null");
            return (Criteria) this;
        }

        public Criteria andMovieTypesEqualTo(String value) {
            addCriterion("movie_types =", value, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesNotEqualTo(String value) {
            addCriterion("movie_types <>", value, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesGreaterThan(String value) {
            addCriterion("movie_types >", value, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesGreaterThanOrEqualTo(String value) {
            addCriterion("movie_types >=", value, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesLessThan(String value) {
            addCriterion("movie_types <", value, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesLessThanOrEqualTo(String value) {
            addCriterion("movie_types <=", value, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesLike(String value) {
            addCriterion("movie_types like", value, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesNotLike(String value) {
            addCriterion("movie_types not like", value, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesIn(List<String> values) {
            addCriterion("movie_types in", values, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesNotIn(List<String> values) {
            addCriterion("movie_types not in", values, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesBetween(String value1, String value2) {
            addCriterion("movie_types between", value1, value2, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieTypesNotBetween(String value1, String value2) {
            addCriterion("movie_types not between", value1, value2, "movieTypes");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIsNull() {
            addCriterion("movie_url is null");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIsNotNull() {
            addCriterion("movie_url is not null");
            return (Criteria) this;
        }

        public Criteria andMovieUrlEqualTo(String value) {
            addCriterion("movie_url =", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotEqualTo(String value) {
            addCriterion("movie_url <>", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlGreaterThan(String value) {
            addCriterion("movie_url >", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlGreaterThanOrEqualTo(String value) {
            addCriterion("movie_url >=", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLessThan(String value) {
            addCriterion("movie_url <", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLessThanOrEqualTo(String value) {
            addCriterion("movie_url <=", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLike(String value) {
            addCriterion("movie_url like", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotLike(String value) {
            addCriterion("movie_url not like", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIn(List<String> values) {
            addCriterion("movie_url in", values, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotIn(List<String> values) {
            addCriterion("movie_url not in", values, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlBetween(String value1, String value2) {
            addCriterion("movie_url between", value1, value2, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotBetween(String value1, String value2) {
            addCriterion("movie_url not between", value1, value2, "movieUrl");
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
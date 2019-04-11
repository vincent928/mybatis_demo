package com.example.demo.entity;

public class DoubanFilmEntity {
    private Integer id;

    private String movieName;

    private String moviePic;

    private String movieActors;

    private Integer movieId;

    private String movieScore;

    private Long movieReviewCount;

    private String movieTime;

    private String movieRegions;

    private String movieTypes;

    private String movieUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public String getMoviePic() {
        return moviePic;
    }

    public void setMoviePic(String moviePic) {
        this.moviePic = moviePic == null ? null : moviePic.trim();
    }

    public String getMovieActors() {
        return movieActors;
    }

    public void setMovieActors(String movieActors) {
        this.movieActors = movieActors == null ? null : movieActors.trim();
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(String movieScore) {
        this.movieScore = movieScore == null ? null : movieScore.trim();
    }

    public Long getMovieReviewCount() {
        return movieReviewCount;
    }

    public void setMovieReviewCount(Long movieReviewCount) {
        this.movieReviewCount = movieReviewCount;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime == null ? null : movieTime.trim();
    }

    public String getMovieRegions() {
        return movieRegions;
    }

    public void setMovieRegions(String movieRegions) {
        this.movieRegions = movieRegions == null ? null : movieRegions.trim();
    }

    public String getMovieTypes() {
        return movieTypes;
    }

    public void setMovieTypes(String movieTypes) {
        this.movieTypes = movieTypes == null ? null : movieTypes.trim();
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl == null ? null : movieUrl.trim();
    }
}
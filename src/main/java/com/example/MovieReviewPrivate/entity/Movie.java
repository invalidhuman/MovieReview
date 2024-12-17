package com.example.MovieReviewPrivate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Movie {
    // table
    @Id
    @GeneratedValue // Id가 자동으로 생성되도록 하는 정책
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column
    private float rating;
    @Column
    private Boolean isScreening;
    @Column
    private String genre;
    @Column
    private Date releaseDate;
    @Column
    private Date closeDate;

    public Movie() {}

    public Movie (String title) {
        this.title = title;
    }

    public Movie (String title, float rating, Boolean isScreening, String genre, Date releaseDate, Date closeDate) {

    }


}

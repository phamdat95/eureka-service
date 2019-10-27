package com.example.ratingbooking.db.entity;

public class BookRating {
    private String name;
    private Long rating;

    public BookRating() {
    }

    public BookRating(String name, Long rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }
}

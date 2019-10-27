package com.example.bookcategory.db.entity;

public class BookDetail {
    private String name;
    private String description;
    private String price;
    private Long rating;

    public BookDetail() {
    }

    public BookDetail(BookInfo bookInfo, Long rating) {
        this.name = bookInfo.getName();
        this.description = bookInfo.getDescription();
        this.price = bookInfo.getPrice();
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }
}

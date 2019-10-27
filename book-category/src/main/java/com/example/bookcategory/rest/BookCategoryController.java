package com.example.bookcategory.rest;

import com.example.bookcategory.db.entity.BookDetail;
import com.example.bookcategory.db.entity.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/book-category")
public class BookCategoryController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET)
    public BookDetail getBookCategory(@RequestParam("id") Long id) {
        BookInfo bookInfo = restTemplate.getForObject("http://book-info/book-info?id=" + id, BookInfo.class);
        Long rating;
        if (bookInfo != null && bookInfo.getName() != null) {
            rating = restTemplate.getForObject("http://book-rating/book-rating?name=" + bookInfo.getName(), Long.class);
            return new BookDetail(bookInfo, rating);
        }
        return null;
    }
}

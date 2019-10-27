package com.example.ratingbooking.rest;

import com.example.ratingbooking.db.entity.BookRating;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/book-rating")
public class BookRatingController {

    @RequestMapping(method = RequestMethod.GET)
    public Long getBookRating(@RequestParam("name") String name) {
        List<BookRating> list =  Arrays.asList(
                new BookRating("book 1", 1L),
                new BookRating("book 2", 2L),
                new BookRating("book 3", 3L),
                new BookRating("book 4", 4L)
        );
        BookRating bookRating = list.stream().filter(r -> r.getName() != null && r.getName().equals(name)).findFirst().orElse(null);
        return bookRating != null ? bookRating.getRating() : null;
    }
}

package com.example.bookinfo.rest;

import com.example.bookinfo.db.entity.BookInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/book-info")
public class BookInfoController {

    @RequestMapping(method = RequestMethod.GET)
    public BookInfo getInfo(@RequestParam("id") Long id) {
        List<BookInfo> list =  Arrays.asList(
                new BookInfo(1L, "book 1", "100", "description 1"),
                new BookInfo(2L, "book 2", "200", "description 2"),
                new BookInfo(3L, "book 3", "300", "description 3"),
                new BookInfo(4L, "book 4", "400", "description 4")
        );
        return list.stream().filter(b -> b.getId() != null && b.getId().equals(id)).findFirst().orElse(null);
    }
}

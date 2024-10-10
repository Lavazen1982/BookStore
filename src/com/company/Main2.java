package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Author a1 = new Author("Author 1", 10, false);
        Book b1 = new Book();
        b1.setAuthor(a1);
        b1.setCategory("category 1");
        b1.setPagesCount(200);
        b1.setPrice(30.0);
        b1.setPublisher("Publisher 1");
        b1.setTitle("Title 1");

        Book b2 = new Book();
        Author a2 = new Author("Author 2", 5, true);
        b2.setAuthor(a2);
        b2.setCategory("category 2");
        b2.setPagesCount(200);
        b2.setPrice(40.0);
        b2.setPublisher("Publisher 2");
        b2.setTitle("Title 2");

        List<Book> books = new ArrayList<>();
        books.add(b1);

//        Bookstore bookstore = new Bookstore(books);

    }
}
package com.company;


import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> books;

    public BookStore() {
        books = new ArrayList<>();
    }


    public BookStore(List<Book> books)
    {
        this.books=books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books=books;
    }

    public void buyBook(Client client, Book book)
        {
            System.out.println("Client" + client.getName() + "bought" + book.getTitle());
            client.getBoughtBooks().add(book);
        }
}

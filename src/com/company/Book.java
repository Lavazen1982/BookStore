package com.company;

public class Book {
    private String title;
    private Author author;
    private int pagesCount;
    private String category;
    private String publisher;
    private double price;

    public Book() {
        author=new Author();
    }

    public Book(String title, Author author, int pagesCount, String category, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.pagesCount = pagesCount;
        this.category = category;
        this.publisher = publisher;
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Book> boughtBooks;
    private List<Book> wishList;

    public Client(String name, List<Book> boughtBooks, List<Book> wishList) {
        this.name = name;
        this.boughtBooks = boughtBooks;
        this.wishList = wishList;
    }

    public Client() {
        name = "Unknown client";
        boughtBooks = new ArrayList<>();
        wishList = new ArrayList<>();
    }

    public Client(String name) {
        this.name = name;
        boughtBooks = new ArrayList<>();
        wishList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBoughtBooks() {
        return boughtBooks;
    }

    public void setBoughtBooks(List<Book> boughtBooks) {
        this.boughtBooks = boughtBooks;
    }

    public List<Book> getWishList() {
        return wishList;
    }

    public void setWishList(List<Book> wishList) {
        this.wishList = wishList;
    }
}
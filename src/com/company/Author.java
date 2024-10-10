package com.company;

public class Author {
    private String name;
    private int booksCount;
    private boolean isBestseller;

    public Author() {
    }

    public Author(String name, int booksCount, boolean isBestseller) {
        this.name = name;
        this.booksCount = booksCount;
        this.isBestseller = isBestseller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    public boolean isBestseller() {
        return isBestseller;
    }

    public void setBestseller(boolean bestseller) {
        isBestseller = bestseller;
    }
}
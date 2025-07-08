package com.Task.Books;

import java.time.Year;

public abstract class Book {
    private String ISBN;
    private String title;
    private double price;
    private Year yearPublished;
    public Book(String ISBN, String title, double price, Year yearPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public Year getYearPublished() {
        return yearPublished;
    }
    public abstract void deliver(String email, String address);
}

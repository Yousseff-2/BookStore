package com.Task.Books;

import java.time.Year;

public abstract class Book {
    private String ISBN;
    private String title;
    private String author;
    private double price;
    private Year yearPublished;
    public Book(String ISBN, String title, String author, double price, Year yearPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public Year getYearPublished() {
        return yearPublished;
    }
    public abstract void deliver(String email, String address);
}

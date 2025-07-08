package com.Task.Books;

import java.time.Year;

public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, String author, double price, Year yearPublished) {
        super(ISBN, title, author, price, yearPublished);
    }

    @Override
    public void deliver(String email, String address) {
    }
}

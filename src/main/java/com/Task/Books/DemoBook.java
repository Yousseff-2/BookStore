package com.Task.Books;

import java.time.Year;

public class DemoBook extends Book {
    public DemoBook(String ISBN, String title, double price, Year yearPublished) {
        super(ISBN, title, price, yearPublished);
    }

    @Override
    public void deliver(String email, String address) {
    }
}

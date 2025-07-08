package com.Task.Books;

import com.Task.Service.MailService;

import java.time.Year;

public class EBook extends Book implements Sellable {
    private String filetype;
    public EBook(String ISBN, String title, String author, double price, Year year, String filetype){
        super(ISBN, title, author, price, year);
        this.filetype = filetype;
    }
    public String getFiletype() {
        return filetype;
    }
    @Override
    public void reduceStock(int quantity) {
    }

    @Override
    public void deliver(String email, String address) {
        MailService.send(email, super.getISBN());
    }
}

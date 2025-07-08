package com.Task.Books;

import com.Task.Service.MailService;

import java.time.Year;

public class EBook extends Book implements Sellable {
    private FileType filetype;
    public EBook(String ISBN, String title, double price, Year year, FileType filetype){
        super(ISBN, title, price, year);
        this.filetype = filetype;
    }
    public FileType getFiletype() {
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

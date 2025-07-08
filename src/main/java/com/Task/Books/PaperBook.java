package com.Task.Books;

import com.Task.Service.ShippingService;

import java.time.Year;

public class PaperBook extends Book implements Sellable {
    private int stock;
    public PaperBook(String ISBN, String title, double price, Year yearPublished, int stock) {
        super(ISBN, title, price, yearPublished);
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    @Override
    public void reduceStock(int quantity) {
        if(quantity <= stock)stock -= quantity;
        else throw new IllegalStateException("Not enough in stock");
    }

    @Override
    public void deliver(String email, String address) {
        ShippingService.send(address, super.getISBN());
    }
}

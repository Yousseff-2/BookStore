package com.Task.Books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookStore {
    HashMap<String, Book>books;
    public BookStore(){
        books = new HashMap<>();
    }
    public void addBook(Book book) {
        books.put(book.getISBN(), book);
    }
    public List<Book> removeOutDatedBooks(int threshold) {
        List<Book> outdatedBooks = new ArrayList<Book>();
        int currentYear = java.time.Year.now().getValue();

        for (Book book : books.values()) {
            int age = currentYear - book.getYearPublished().getValue();
            if (age > threshold) {
                outdatedBooks.add(book);
            }
        }

        for (Book book : outdatedBooks) {
            books.remove(book.getISBN());
        }

        return outdatedBooks;
    }
    public double buyBook(String ISBN, int quantity, String email, String address) {
        Book book = books.get(ISBN);
        if (book == null) {
            throw new IllegalArgumentException(ISBN + " not found.");
        }
        if (!(book instanceof Sellable)) {
            throw new IllegalArgumentException(ISBN + " is not for sale.");
        }
        Sellable sellableBook = (Sellable) book;
        sellableBook.reduceStock(quantity);
        double totalPrice = book.getPrice() * quantity;
        book.deliver(email, address);
        return totalPrice;
    }
}

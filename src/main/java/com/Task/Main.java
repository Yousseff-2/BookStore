package com.Task;

import com.Task.Books.*;

import java.time.Year;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("testAddBooks");
            BookStore store = new BookStore();
            Book java = new PaperBook("001", "Java Basics", 50.0, Year.of(2010), 10);
            Book python = new EBook("002", "Python Basics", 30.0, Year.of(2022), FileType.PDF);
            Book cpp = new DemoBook("003", "C++ Baiscs", 80.0, Year.of(2023));
            store.addBook(java);
            store.addBook(python);
            store.addBook(cpp);
            System.out.println("testAddBooks passed");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        try {
            System.out.println("test buy PaperBook");
            BookStore store = new BookStore();
            Book java = new PaperBook("001", "Java Basics", 50.0, Year.of(2010), 10);
            Book python = new EBook("002", "Python Basics", 30.0, Year.of(2022), FileType.PDF);
            Book cpp = new DemoBook("003", "C++ Baiscs", 80.0, Year.of(2023));
            store.addBook(java);
            store.addBook(python);
            store.addBook(cpp);
            System.out.println("Amount baid : " + store.buyBook("001", 3, "y@gmail.com", "address"));
            System.out.println("testBuy PaperBook passed");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        try {
            System.out.println("test buy EBook");
            BookStore store = new BookStore();
            Book java = new PaperBook("001", "Java Basics", 50.0, Year.of(2010), 10);
            Book python = new EBook("002", "Python Basics", 30.0, Year.of(2022), FileType.PDF);
            Book cpp = new DemoBook("003", "C++ Baiscs", 80.0, Year.of(2023));
            store.addBook(java);
            store.addBook(python);
            store.addBook(cpp);
            System.out.println("Amount baid : " + store.buyBook("002", 6, "y@gmail.com", "address"));
            System.out.println("test Buy EBook passed");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        try {
            System.out.println("test remove books");
            BookStore store = new BookStore();
            Book java = new PaperBook("001", "Java Basics", 50.0, Year.of(2010), 10);
            Book python = new EBook("002", "Python Basics", 30.0, Year.of(2022), FileType.PDF);
            Book cpp = new DemoBook("003", "C++ Baiscs", 80.0, Year.of(2023));
            store.addBook(java);
            store.addBook(python);
            store.addBook(cpp);
            List<Book>rem = store.removeOutDatedBooks(10);
            for(Book book : rem){
                System.out.println(book.getISBN());
            }

            System.out.println("test remove books passed");

        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        try {
            System.out.println("test buy DemoBook");
            BookStore store = new BookStore();
            Book java = new PaperBook("001", "Java Basics", 50.0, Year.of(2010), 10);
            Book python = new EBook("002", "Python Basics", 30.0, Year.of(2022), FileType.PDF);
            Book cpp = new DemoBook("003", "C++ Baiscs", 80.0, Year.of(2023));
            store.addBook(java);
            store.addBook(python);
            store.addBook(cpp);
            System.out.println("Amount baid : " + store.buyBook("003", 9, "y@gmail.com", "address"));
            System.out.println("test Buy DemoBook passed");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();
        System.out.println();


        try {
            System.out.println("test buy book more than in stock");
            BookStore store = new BookStore();
            Book java = new PaperBook("001", "Java Basics", 50.0, Year.of(2010), 10);
            Book python = new EBook("002", "Python Basics", 30.0, Year.of(2022), FileType.PDF);
            Book cpp = new DemoBook("003", "C++ Baiscs", 80.0, Year.of(2023));
            store.addBook(java);
            store.addBook(python);
            store.addBook(cpp);
            System.out.println("Amount baid : " + store.buyBook("001", 100, "y@gmail.com", "address"));
            System.out.println("testBuy PaperBook passed");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

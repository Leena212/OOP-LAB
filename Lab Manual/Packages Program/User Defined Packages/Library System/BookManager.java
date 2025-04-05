
package com.library.management;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library!");
            return;
        }
        
        System.out.println("\nLibrary Books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book #" + (i+1));
            System.out.println(books.get(i));
        }
    }

    public void searchBookByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println(book);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }
}// File: BookManager.java (in the same package)
package com.library.management;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library!");
            return;
        }
        
        System.out.println("\nLibrary Books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book #" + (i+1));
            System.out.println(books.get(i));
        }
    }

    public void searchBookByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println(book);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }
}
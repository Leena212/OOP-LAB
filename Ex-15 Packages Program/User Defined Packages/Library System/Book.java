
package com.library.management;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;

    public Book(String title, String author, String isbn, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getPublicationYear() { return publicationYear; }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nISBN: %s\nYear: %d\n", 
                            title, author, isbn, publicationYear);
    }
}

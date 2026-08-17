package OOPS_Projects.Library_Management_System;

public class Book {
    private String title, author;
    private int isbn;
    private boolean isBorrowed;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // getter
    public String getTitle() {
        return this.title;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    // getter
    public String getAuthor() {
        return this.author;
    }

    // setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter
    public int getIsbn() {
        return this.isbn;
    }

    // setter
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    // getter
    public boolean isBorrowed() {
        return this.isBorrowed;
    }

    // setter
    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}

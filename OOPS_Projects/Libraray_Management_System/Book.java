package OOPS_Projects.Libraray_Management_System;

public class Book {
    private String title, author, isbn;
    private boolean isBorrowed;

    // getter
    String getTitle() {
        return this.title;
    }

    // setter
    void setTitle(String title) {
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
    public String getIsbn() {
        return this.isbn;
    }

    // setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // getter
    public boolean isBorrowed() {
        return this.isBorrowed;
    }

    // setter
    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = true;
    }
}

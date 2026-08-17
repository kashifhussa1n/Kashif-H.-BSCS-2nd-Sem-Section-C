package OOPS_Projects.Libraray_Management_System;

public class Book {
    private String title, author, isbn;
    private boolean isBorrowed;

    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }
}

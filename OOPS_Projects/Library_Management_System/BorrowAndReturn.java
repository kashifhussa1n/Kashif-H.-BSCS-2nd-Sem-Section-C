package OOPS_Projects.Library_Management_System;

import java.util.List;
import java.util.ArrayList;

public class BorrowAndReturn {

    private List<Book> borrowedBooks = new ArrayList<>();

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // METHOD to cap borrowBook at 3
    public boolean borrowBooks(Book book) {
        if (borrowedBooks.size() < 3) {
            borrowedBooks.add(book);
            return true;
        }
        return false;

    }
}

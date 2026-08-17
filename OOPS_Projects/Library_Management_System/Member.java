package OOPS_Projects.Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private int id;

    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;

    }

    public int getId() {
        return this.id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

   
}
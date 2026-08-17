package OOPS_Projects.Library_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    // getters

    public List<Book> getBooks() {
        return this.books;
    }

    public List<Member> getMembers() {
        return this.members;
    }

}

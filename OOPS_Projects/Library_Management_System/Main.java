package OOPS_Projects.Library_Management_System;

public class Main {
    public static void main(String[] args) {

        // books
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 101);
        Book book2 = new Book("Atomic Habits", "James Clear", 102);
        Book book3 = new Book("The Hobbit", "J.R.R. Tolkien", 103);
        Book book4 = new Book("1984", "George Orwell", 104);

        // members
        Member member1 = new Member("Peter Parker", 01);

        // library object
        Library library = new Library();

        // add book and member to list(in library)
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.addMember(member1);

        // borrow/return object
        BorrowAndReturn actions = new BorrowAndReturn();

        // borrow
        System.out.println("Borrow book 1: " + actions.borrowBooks(member1, book1));
        System.out.println("Borrow book 2: " + actions.borrowBooks(member1, book2));
        System.out.println("Borrow book 3: " + actions.borrowBooks(member1, book3));
        System.out.println("Borrow book 4: " + actions.borrowBooks(member1, book4));// return false capped at 3

        // return book
        System.out.println("\nReturn Book 1: " + actions.returnBooks(member1, book1));

        // display borrowed books
        System.out.println("\nBorrowed Books After Return by " + member1.getName() + ": ");
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println("Title: " + book.getTitle() + "|" + " Author: " + book.getAuthor() + "|" + " ISBN: "
                    + book.getIsbn());
        }

        // 1 book now returned now member can borrow another one
        System.out.println(
                "\nBorrow book 4 after returning book 1: " + actions.borrowBooks(member1, book4));

    }
}

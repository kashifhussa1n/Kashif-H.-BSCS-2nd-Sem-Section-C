package OOPS_Projects.Library_Management_System;

public class BorrowAndReturn {

    public boolean borrowBooks(Book book, Member member) {

        if (book.isBorrowed()) {
            return false;
        }
        if (member.getBorrowedBooks().size() >= 3) {
            return false;
        }
        member.getBorrowedBooks().add(book);

        book.setIsBorrowed(true);
        return true;

    }

    public boolean returnBooks(Book book, Member member) {
        if (member.getBorrowedBooks().remove(book)) {

            book.setIsBorrowed(false);

            return true;
        }

        return false;
    }
}

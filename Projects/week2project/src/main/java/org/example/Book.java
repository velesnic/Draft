package org.example;

import java.util.Scanner;

public class Book {

    private int bookId;

    private String bookIsbn;

    private String bookTitle;

    private boolean bookIsCheckedOut;

    private String bookIsCheckedOutTo;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public boolean isBookIsCheckedOut() {
        return bookIsCheckedOut;
    }

    public void setBookIsCheckedOut(boolean bookIsCheckedOut) {
        this.bookIsCheckedOut = bookIsCheckedOut;
    }

    public String getBookIsCheckedOutTo() {
        return bookIsCheckedOutTo;
    }

    public void setBookIsCheckedOutTo(String bookIsCheckedOutTo) {
        this.bookIsCheckedOutTo = bookIsCheckedOutTo;
    }

    public Book(int bookId, String bookIsbn, String bookTitle, boolean bookIsCheckedOut, String bookIsCheckedOutTo) {
        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.bookIsCheckedOut = bookIsCheckedOut;
        this.bookIsCheckedOutTo = bookIsCheckedOutTo;
    }


    public void checkOutBook(String userName){
        bookIsCheckedOut = true;
        bookIsCheckedOutTo = userName;
        System.out.println("You have checked out " + bookTitle + ".");

    }

    public void checkInBook() {
        this.bookIsCheckedOutTo = "";
        this.bookIsCheckedOut = false;
        System.out.println("You have checked in " + bookTitle + ".");

    }

    }


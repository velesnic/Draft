package org.example;

import java.util.Scanner;

public class Book {
    //The word book isn't necessarily needed in front of each property since the class name itself is book
    //Small quibble
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

    //You could do the constructor like this for less typing since you know in the beginning it won't be checked out
    //and it's not checked out to anyone
    public Book(int id, String isbn, String title) {
        this.bookId = id;
        this.bookIsbn = isbn;
        this.bookTitle = title;
        this.bookIsCheckedOut = false;
        this.bookIsCheckedOutTo = "";
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


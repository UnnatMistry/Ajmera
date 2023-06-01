package com.example.ajmera;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        DatabaseClass databaseClass = new DatabaseClass();
        databaseClass.addBook("Book-1", "Author-1");
        databaseClass.addBook("Book-2", "Author-2");
        databaseClass.addBook("Book-3", "Author-3");
        databaseClass.addBook("Book-4", "Author-1");
        databaseClass.addBook("Book-5", "Author-1");
        System.out.println(databaseClass.getAuthors());
        System.out.println(databaseClass.getBooksByAuthorName("Author-1"));
        System.out.println(databaseClass.deleteAuthor("Author-3"));
        System.out.println(databaseClass.deleteBook("Book-3"));
        System.out.println(databaseClass.deleteAuthor("Author-3"));
        System.out.println(databaseClass.getAuthors());

    }

}

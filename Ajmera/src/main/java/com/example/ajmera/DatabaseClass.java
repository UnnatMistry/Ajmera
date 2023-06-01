package com.example.ajmera;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;

import java.util.HashSet;


public class DatabaseClass {

    HashMap<String, Set<String>> authors;
    HashMap<String, String> books;

    public DatabaseClass(){
        authors = new HashMap<>();
        books = new HashMap<>();
    }

    public ArrayList<String> getAuthors(){
        return new ArrayList<>(authors.keySet());
    }

    public boolean addBook(String book, String author){
        if(!authors.containsKey(author))
            authors.put(author, new HashSet<>());
        authors.get(author).add(book);
        books.put(book, author);
        return true;
    }

    public ArrayList<String> getBooksByAuthorName(String author){
        if(!authors.containsKey(author))
            return new ArrayList<>();
        return new ArrayList<>(authors.get(author));
    }

    public boolean deleteBook(String book){
        if(!books.containsKey(book))
            return false;
        String author = books.get(book);
        books.remove(author);
        authors.get(author).remove(book);
        return true;
    }

    public boolean deleteAuthor(String author){
        if(!authors.containsKey(author) || authors.get(author).size() != 0)
            return false;
        authors.remove(author);
        return true;
    }


}

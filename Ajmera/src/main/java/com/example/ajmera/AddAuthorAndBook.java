package com.example.ajmera;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.xml.crypto.Data;
import java.io.IOException;

public class AddAuthorAndBook extends HttpServlet {
    DatabaseClass databaseClass = new DatabaseClass();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        String book = req.getParameter("book");
        databaseClass.addBook(book, author);

        super.doGet(req, resp);
    }
}

package com.example.ajmera;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "getBookByAuthorName", value = "/getBookByAuthorName")
public class GetBookByAuthorName extends HttpServlet {
    DatabaseClass databaseClass = new DatabaseClass();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String author = request.getParameter("author");
        ArrayList<String> books = databaseClass.getBooksByAuthorName(author);
        if(books.isEmpty())
            return;

        out.println("<ol>");
        for(String book : books)
            out.println("</li>" + book + "</li>");
        out.println("</ol>");
    }
}

package com.example.ajmera;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DeleteAuthor extends HttpServlet {
    DatabaseClass databaseClass = new DatabaseClass();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        PrintWriter out = resp.getWriter();
        boolean success = databaseClass.deleteAuthor(author);
        if(!success){
            out.println("<h1>Author's booklist in not empty</h1>");
        }
        else
            out.println("Success");

        super.doGet(req, resp);
    }
}

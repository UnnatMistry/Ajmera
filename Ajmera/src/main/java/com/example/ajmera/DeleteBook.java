package com.example.ajmera;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DeleteBook extends HttpServlet {
    DatabaseClass databaseClass = new DatabaseClass();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String book = req.getParameter("book");
        boolean success = databaseClass.deleteBook(book);
        PrintWriter out = resp.getWriter();
        if(success)
            out.println("<h1>Success</h1>");
        else
            out.print("</h1>Error deleting record...</h1>");
        super.doGet(req, resp);
    }
}

<%@ page import="com.example.ajmera.DatabaseClass" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList"%>
<%
    DatabaseClass databaseClass = new DatabaseClass();
    databaseClass.addBook("Book-1", "Author-1");
    databaseClass.addBook("Book-2", "Author-2");
    databaseClass.addBook("Book-3", "Author-3");
    databaseClass.addBook("Book-4", "Author-1");
    databaseClass.addBook("Book-5", "Author-1");
%>
<!DOCTYPE html>
<html>
<head>
    <title>CRUD Operation</title>
    <style>
        .hidden{
            display: none;
        }
    </style>
</head>
<body>
<h1>CRUD Operation - Unnat Mistry</h1>
<button onclick="listAuthors()">List Authors</button>
<button onclick="showAddAuthorAndBookForm()">Add Author And Book</button>
<button>Get Books By Author Name</button>
<button>Delete Book</button>
<button>Delete Author</button>
<form class="authorAndBookForm hidden">
    <input type="text" name="author" placeholder="Author">
    <input type="text" name="book" placeholder="Book">
    <button>Submit</button>
</form>

<div class="contentBox"></div>
<script>
    const contentBox = document.querySelector(".contentBox");
    const authorAndBookForm = document.querySelector(".authorAndBookForm");

    function clearContextBox(){
        while(contentBox.hasChildNodes()){
            contentBox.removeChild(contentBox.getFirstChild());
        }
    }

    function listAuthors(){
        clearContextBox();
        const newDiv = document.createElement("div");
        newDiv.classList.add("newDiv");
        newDiv.innerHTML = "<ol><%
            ArrayList<String> authors = databaseClass.getAuthors();
                String str = "";
                for(String author: authors){
                    str += "<li>" + author + "<li>";
                }
        %><%=str%></ol>"
        contentBox.appendChild(newDiv);
    }

    function showAddAuthorAndBookForm(){
        authorAndBookForm.classList.remove("hidden");
    }

    function hideAddAuthorAndBookForm(){
        authorAndBookForm.classList.add("hidden");
    }

    function addAuthorAndBook(e){
        e.preventDefault();
        console.log()
    }

</script>
</body>
</html>
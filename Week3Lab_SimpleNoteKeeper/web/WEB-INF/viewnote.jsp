<%-- 
    Document   : viewnote
    Created on : Oct 4, 2020, 6:20:33 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h3>View Note</h3>
        <br>
        <h4>Title: ${note.title}</h4> 
        <br>
        <h4>Contents: ${note.content}</h4>
         
         <br>
        <a href="editnote">Edit</a>  
    </body>
</html>

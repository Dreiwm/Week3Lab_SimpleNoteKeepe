<%-- 
    Document   : editnote
    Created on : Oct 4, 2020, 6:20:41 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h3>Edit Note</h3>
        <br>
        <form> 
            <h5>Title: </h5><input type="text" name="title" value="${note.title}">
            <br>
            <h5>Contents:</h5><input type="text" name="content" value="${note.content}">
            <br>
            <input type="submit" name="Save" value="save">
        </form>
       
    </body>
</html>

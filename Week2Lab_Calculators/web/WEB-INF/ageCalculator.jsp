<%-- 
    Document   : ageCalculator
    Created on : Sep 25, 2020, 11:23:52 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="Calculator">
            <label>Enter your age:</label><input type="number" name="age" value="${age}">
            <br>
            <input type="submit" name="ageCalc" value="Age next birthday">
            <br>
            <a href="Math">Arithmetic Calculator</a>
            <p>${result}</p>
        </form>
    </body>
</html>


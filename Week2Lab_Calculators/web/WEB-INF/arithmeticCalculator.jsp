<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 25, 2020, 11:24:18 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
            <form method="post" action="Calculator">
            <label>First:</label><input type="number" name="firstNumber" value="${firstNumber}">
            <br>
            <label>Second:</label><input type="number" name="secondNumber" value="${secondNumber}">
            <br>
            <input type="submit" name="+" value="+">
            <input type="submit" name="-" value="-">
            <input type="submit" name="*" value="*">
            <input type="submit" name="%" value="%">
            <br>
            <a href="Calculator">Age Calculator</a>
            <br>
            <p>${result}</p>
        </form>
    </body>
</html>

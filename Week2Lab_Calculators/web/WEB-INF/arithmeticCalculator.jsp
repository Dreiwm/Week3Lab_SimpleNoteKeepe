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
            <form method="post" action="Hello">
            <label>First:</label><input type="text" name="firstNumber" value="">
            <br>
            <label>Second:</label><input type="text" name="secondNumber" value="">
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%">
        </form>
    </body>
</html>

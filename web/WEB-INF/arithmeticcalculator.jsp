<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 27, 2021, 1:28:41 AM
    Author     : jagan
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
        <form method="POST" action="arithmetic">
            <label for="First">First</label>
            <input name="FirstNumber" id="First" type="text">
            <br>
            <label for="Second">Second</label>
            <input name="SecondNumber" id="Second" type="text">
            <br>
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%">
            <br>
            ${message}<a href="age">Age Calculator</a>
        </form>
    </body>
</html>


<%-- 
    Document   : agecalculator
    Created on : Sep 26, 2021, 11:56:49 PM
    Author     : jagan
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
        <form method="POST" action="age">
            <label for="age">Enter your age:</label>
            <input name="age" id="age" type="text">
            <br>
            <input type="submit" value="Age next birthday">
            <br>
            ${message}<a href="arithmetic">Arithmetic Calculator</a>
        </form>

    </body>
</html>

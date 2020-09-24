<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 24, 2020, 5:01:51 PM
    Author     : Saurav 808735
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
        <form method="post" action="arithmetic">
            First: <input type="number" name="first"><br>
            Second: <input type="number" name="second"><br>

            <input type="submit" value="+" name="+"> 
            <input type="submit" value="-" name="-">
            <input type="submit" value="*" name="*"> 
            <input type="submit" value="%" name="%">
        </form>
        <p>Result: ${message}</p>
        <br>
        <br>
        <a href="age">Age Calculator</a>
    </body>
</html>

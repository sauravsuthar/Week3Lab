<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2020, 4:50:29 PM
    Author     : Saurav Suthar
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
        <form method="post" action="age">
           Enter your age: <input type="text" name="age"><br>
            
            <input type="submit" value="Age Next Birthday">
        </form>
        <p>${message}</p>
        <br>
        <br>
        <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>

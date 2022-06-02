<%-- 
    Document   : agecalculator
    Created on : May 31, 2022, 4:20:28 PM
    Author     : Guest1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator form</title>
    </head>
    <body>
        <h1>Age Calculator!</h1>
        <form method="post" action="age">
        <label>Enter your age : </label><input type="number" name="ageOf">
        <p>${emessage}</p>
        <input type="submit" value="Calculate age">
          </form>
        <div> <a href="arithmetic"> Arithmetic Calculator</a></div>
    </body>
</html>

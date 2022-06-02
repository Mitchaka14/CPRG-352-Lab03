<%-- 
    Document   : showage
    Created on : May 31, 2022, 5:47:25 PM
    Author     : Guest1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First : </label><input type="number" name="fVal" value="${fVals}"> <br>
            <label>Second : </label><input type="number" name="sVal" value="${sVals}"> <br>
            
            <input type="submit" value="+" name="act">
            <input type="submit" value="-" name="act"> 
            <input type="submit" value="*" name="act"> 
            <input type="submit" value="%" name="act">
          </form>
            <p>Result: ${result}</p>
            
        <div> <a href="age"> Age Calculator</a></div>
    </body>
</html>

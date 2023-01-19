<%-- 
    Document   : home
    Created on : 15-Jan-2023, 8:36:52 PM
    Author     : ericr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
    </head>
    <body>
        <h1>Homepage</h1>
        <p>Hello ${user.username}</p>
        <a href="login?action=logout">Log out</a>        
    </body>
</html>

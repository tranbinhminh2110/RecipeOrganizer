<%-- 
    Document   : homePage
    Created on : May 23, 2023, 1:54:28 PM
    Author     : THIS PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>search</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <form action="DispatchController">
            <a href="login.jsp">Login</a><br/>
            Search Value <input type="text" name="txtSearchValue" 
                                value="<%= request.getParameter("txtSearchValue") %>" /><br/>
            <input type="submit" value="Search" name="btAction" />
        </form><br/>
        
    </body>
</html>

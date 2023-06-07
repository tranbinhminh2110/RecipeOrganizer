<%-- 
    Document   : updateprofile
    Created on : Jun 2, 2023, 1:37:05 PM
    Author     : tranb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Profile</title>
    </head>
    <body>
        <h1>Update Profile</h1>

        <% String message = (String) request.getAttribute("message"); %>
        <% if (message != null) {%>
        <p><%= message%></p>
        <% }%>

        <form action="DispatchController" method="post">
            <table>
                <tr>
                    <td>Username: </td>
                    <td><input type="text" name="txtUsername"></td>
                </tr>
                <tr>
                    <td>Full Name:</td>
                    <td><input type="text" name="txtFullname"></td>
                </tr>
                <tr>
                    <td>Phone:</td>
                    <td><input type="text" name="txtPhone"></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="txtEmail"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value ="Update" name="btAction"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
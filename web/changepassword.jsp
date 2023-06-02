<%-- 
    Document   : changepassword
    Created on : Jun 2, 2023, 7:43:26 AM
    Author     : THIS PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Change Password</h1>

        <% String message = (String) request.getAttribute("message"); %>
        <% if (message != null) {%>
        <p><%= message%></p>
        <% }%>

        <form action="DispatchController" method="post">
            <table>
                <tr>
                    <td>Tên đăng nhập:</td>
                    <td><input type="text" name="txtUsername"></td>
                </tr>
                <tr>
                    <td>Mật khẩu hiện tại:</td>
                    <td><input type="password" name="txtCurrentPassword"></td>
                </tr>
                <tr>
                    <td>Mật khẩu mới:</td>
                    <td><input type="password" name="txtNewPassword"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value ="Save" name="btAction"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
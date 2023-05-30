<%-- 
    Document   : registration
    Created on : May 29, 2023, 2:50:58 PM
    Author     : AS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Page</title>
    </head>
    <body>
        <form action="signup" method="POST" class="form-signup">
            <h1 class="h3 mb-3 font-weight-normal" style="text-align: center">Sign up</h1>
            <div class="aleart alert-danger" role="alert">
                ${mes}
            </div>
                
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name ="txtusername"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name ="txtpassword"></td>
                </tr>
                <tr>
                    <td>RePassword</td>
                    <td><input type="password" name ="txtrepassword"></td>
                </tr>
                <tr>
                    <td>FullName</td>
                    <td><input type="text" name ="txtfullname"></td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td><input type="text" name ="txtphone"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value ="Sign up" name="action"></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>

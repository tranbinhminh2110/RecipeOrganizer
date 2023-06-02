<%-- 
    Document   : forgot_password
    Created on : Jun 1, 2023, 7:39:04 PM
    Author     : MSI BH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
    </head>
    <body>
        <h1>Reset your password</h1>
        <p>Enter your email address and we will send you code to reset your password.</p>
        <form action="DispatchController" method="POST">
            <table>
                        <tr>
                            <td>Email</td>
                            <td><input type="text" name ="txtemail">
                            <input type="submit" value ="Send" name="btAction">
                            </td>
                        </tr>
                        <tr>
                            <td>Code</td>
                            <td><input type="password" name ="txttoken"></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input type="submit" value ="Reset" name="btAction"></td>
                        </tr>
                    </table>
        </form>
    </body>
</html>

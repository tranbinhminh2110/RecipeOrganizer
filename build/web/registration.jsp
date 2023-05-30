<!--
Author: Colorlib
Author URL: https://colorlib.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <head>
        <title>Creative Colorlib SignUp Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- Custom Theme files -->
        <link href="style_signup.css" rel="stylesheet" type="text/css" media="all" />
        <!-- //Custom Theme files -->
        <!-- web font -->
        <link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
        <!-- //web font -->
    </head>
    <body>
        <!-- main -->
        <div class="main-w3layouts wrapper">
            <h1>Creative SignUp Form</h1>
            <div class="main-agileinfo">
                <div class="agileits-top">
                    <form action="DispatchController" method="post">
                        <input class="text" type="text" name="txtusername" placeholder="Username" required="">
                        <input class="text w3lpass" type="password" name="txtpassword" placeholder="Password" required="">
                        <input class="text w3lpass" type="password" name="txtrepassword" placeholder="Confirm Password" required="">
                        <input class="text w3lpass" type="text" name="txtfullname" placeholder="FullName" required="">
                        <input class="text w3lpass" type="text" name="txtphone" placeholder="Phone" required="">
                        <div class="wthree-text">
                            <label class="anim">
                                <input type="checkbox" class="checkbox" required="">
                                <span>I Agree To The Terms & Conditions</span>
                            </label>
                            <div class="clear"> </div>
                        </div>
                        <input type="submit" value="SIGNUP" name="btAction">
                    </form>
                    <p>Don't have an Account? <a href="login.jsp"> Login Now!</a></p>
                </div>
            </div>
            <ul class="colorlib-bubbles">
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
        </div>
    </body>
</html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=1,initial-scale=1,user-scalable=1" />
        <title>Login Page</title>
        <!-- Custom CSS -->
        <link rel="stylesheet" type="text/css" href="style_login.css" />
        <!-- Google Font -->
        <link href="http://fonts.googleapis.com/css?family=Lato:100italic,100,300italic,300,400italic,400,700italic,700,900italic,900" rel="stylesheet" type="text/css">
        <!-- Bootstrap Core CSS -->
        <link type="text/css" rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <!-- jQuery Library -->
        <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.10.0/jquery.min.js"></script>
        <!-- Bootstrap Core JS -->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900'
              rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/css.css">
        <meta name="google-signin-client_id" content="555035018766-035ln8ai7e46bk1gltin1pmc3s9uv6g5.apps.googleusercontent.com">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
    </head>
    <body>
        <div class="logo-container">
            <img src="img/core-img/logo.png" alt="Logo"/>
        </div>
        <section class="container">
            <section class="login-form">
                <form method="post" action="DispatchController" role="login">
                    <h2><b>Sign In</b></h2 >
                    <div class="aleart alert-danger" role="alert">
                        ${mess}
                    </div>
                    <img src="images/user.png" alt="" />
                    <input type="text" name="txtUsername" required placeholder="Username" class="form-control input-lg" /><br/>
                    <input type="password" name="txtPassword" required placeholder="Password" class="form-control input-lg" /><br/>
                    <button type="submit" value ="Login" name="btAction" class="btn btn-block btn-info">Sign in</button>
                    <input type="checkbox" name="remember" value="1" checked /> Stay signed in
                    <a href="#" class="pull-right">Need help?</a>
                </form>
                <section>
                    <a href="registration.jsp">Create an account</a>
                </section>
            </section>
        </section>
        <!--Sign in google function-->
        <script>
            function onSuccess(googleUser) {
                console.log('Logged in as: ' + googleUser.getBasicProfile().getName());
            }
            function onFailure(error) {
                console.log(error);
            }
            function renderButton() {
                gapi.signin2.render('my-signin2', {
                    'scope': 'profile email',
                    'width': 240,
                    'height': 50,
                    'longtitle': true,
                    'theme': 'dark',
                    'onsuccess': onSuccess,
                    'onfailure': onFailure
                });
            }
            function onSignIn(googleUser) {
                var profile = googleUser.getBasicProfile();
                console.log('ID: ' + profile.getId());
                console.log('Name: ' + profile.getName());
                console.log('Image URL: ' + profile.getImageUrl());
                console.log('Email: ' + profile.getEmail());
                window.location.href = 'loginServlet?action=Google&name=' + reponse.name + '&email=' + response.email + '&id=' + response.id;
            }
        </script>
        <script src="https://apis.google.com/js/platform.js?onload=renderButton" async defer></script>
    </body>
</html>
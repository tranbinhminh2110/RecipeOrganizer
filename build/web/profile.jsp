<%-- 
    Document   : profile
    Created on : Jun 1, 2023, 7:46:14 PM
    Author     : tranb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="team3.recipe.RecipeOrganizeDTO"%>
<%@page import="team3.recipe.RecipeOrganizeDAO"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Recipe Organize | Profile</title>

        <!-- Favicon -->
        <link rel="icon" href="img/recipe/favicon.ico">

        <!-- Core Stylesheet -->
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <!-- Preloader -->
        <div id="preloader">
            <i class="circle-preloader"></i>
            <img src="img/recipe/salad.png" alt="">
        </div>
        <!-- Search Wrapper -->
        <div class="search-wrapper">
            <!-- Close Btn -->
            <div class="close-btn"><i class="fa fa-times" aria-hidden="true"></i></div>

            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <form action="#" method="post">
                            <input type="search" name="search" placeholder="Type any keywords...">
                            <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- ##### Header Area Start ##### -->
        <header class="header-area">

            <!-- Top Header Area -->
            <div class="top-header-area">
                <div class="container h-100">
                    <div class="row h-100 align-items-center justify-content-between">
                        <!-- Breaking News -->
                        <div class="col-12 col-sm-6">
                            <div class="breaking-news">
                                <div id="breakingNewsTicker" class="ticker">
                                    <ul>
                                        <li><a href="#">Hello World!</a></li>
                                        <li><a href="#">Welcome to Recipe Organize.</a></li>
                                        <li><a href="#">Hello Delicious!</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <!-- Top Social Info -->
                        <div class="col-12 col-sm-6">
                            <div class="top-social-info text-right">
                                <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                                <a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a>
                                <a href="#"><i class="fa fa-behance" aria-hidden="true"></i></a>
                                <a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Navbar Area -->
            <div class="delicious-main-menu">
                <div class="classy-nav-container breakpoint-off">
                    <div class="container">
                        <!-- Menu -->
                        <nav class="classy-navbar justify-content-between" id="deliciousNav">

                            <!-- Logo -->
                            <a class="nav-brand" href="homePage.jsp"><img src="img/recipe/logo.png" alt=""></a>

                            <!-- Navbar Toggler -->
                            <div class="classy-navbar-toggler">
                                <span class="navbarToggler"><span></span><span></span><span></span></span>
                            </div>

                            <!-- Menu -->
                            <div class="classy-menu">

                                <!-- close btn -->
                                <div class="classycloseIcon">
                                    <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                                </div>

                                <!-- Nav Start -->
                                <div class="classynav">
                                    <ul>
                                        <li class="active"><a href="homePage.jsp">Home</a></li>
                                        <li><a href="#">Pages</a>
                                            <ul class="dropdown">
                                                <li><a href="homePage.jsp">Home</a></li>
                                                <li><a href="about.html">About Us</a></li>
                                                <li><a href="blog-post.html">Blog Post</a></li>
                                                <li><a href="receipe-post.html">Recipe Post</a></li>
                                                <li><a href="contact.html">Contact</a></li>
                                                <li><a href="elements.html">Elements</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Menu</a>
                                            <div class="megamenu">
                                                <ul class="dropdown">
                                                    <li><a href="homePage.jsp">Rice</a></li>
                                                    <li><a href="about.html">Noodles</a></li>
                                                    <li><a href="blog-post.html">Cake</a></li>
                                                    <li><a href="receipe-post.html">Drinks</a></li>
                                                    <li><a href="contact.html">Dessert</a></li>
                                                    <li><a href="elements.html">International dishes</a></li>
                                                </ul>
                                            </div>
                                        </li>
                                        <li><a href="receipe-post.html">Recipes</a></li>
                                        <li><a href="receipe-post.html">Healthy Food</a></li>
                                        <li><a href="contact.html">Contact</a></li>
                                        <li><a href="login.jsp">Login</a></li>
                                    </ul>

                                    <!-- Newsletter Form -->
                                    <div class="search-btn">
                                        <i class="fa fa-search" aria-hidden="true"></i>
                                    </div>

                                </div>
                                <!-- Nav End -->
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <header>
            <style>
                body {
                    background-color: #f9f9fa
                }

                .padding {
                    padding: 3rem !important
                }

                .user-card-full {
                    overflow: hidden;
                }

                .card {
                    border-radius: 5px;
                    -webkit-box-shadow: 0 100px 20px 0 rgba(69,90,100,0.08);
                    box-shadow: 0 1px 20px 0 rgba(69,90,100,0.08);
                    border: none;
                    margin-bottom: 30px;
                }

                .m-r-0 {
                    margin-right: 0px;
                }

                .m-l-0 {
                    margin-left: 0px;
                }

                .user-card-full .user-profile {
                    border-radius: 5px 0 0 5px;
                }

                .bg-c-lite-green {
                    background: -webkit-gradient(linear, left top, right top, from(#f29263), to(#ee5a6f));
                    background: linear-gradient(to right, #ee5a6f, #f29263);
                }

                .user-profile {
                    padding: 100px 0;
                }

                .card-block {
                    padding: 1.25rem;
                }

                .m-b-25 {
                    margin-bottom: 25px;
                }

                .img-radius {
                    border-radius: 5px;
                }



                h6 {
                    font-size: 20px;
                }

                .card .card-block p {
                    line-height: 25px;
                }

                @media only screen and (min-width: 1400px){
                    p {
                        font-size: 20px;
                    }
                }

                .card-block {
                    padding: 1.25rem;
                }

                .b-b-default {
                    border-bottom: 1px solid #e0e0e0;
                }

                .m-b-20 {
                    margin-bottom: 20px;
                }

                .p-b-5 {
                    padding-bottom: 5px !important;
                }

                .card .card-block p {
                    line-height: 25px;
                }

                .m-b-10 {
                    margin-bottom: 10px;
                }

                .text-muted {
                    color: #919aa3 !important;
                }

                .b-b-default {
                    border-bottom: 1px solid #e0e0e0;
                }

                .f-w-600 {
                    font-weight: 600;
                }

                .m-b-20 {
                    margin-bottom: 20px;
                }

                .m-t-40 {
                    margin-top: 20px;
                }

                .p-b-5 {
                    padding-bottom: 5px !important;
                }

                .m-b-10 {
                    margin-bottom: 10px;
                }

                .m-t-40 {
                    margin-top: 20px;
                }

                .user-card-full .social-link li {
                    display: inline-block;
                }

                .user-card-full .social-link li a {
                    font-size: 20px;
                    margin: 0 10px 0 0;
                    -webkit-transition: all 0.3s ease-in-out;
                    transition: all 0.3s ease-in-out;
                }



            </style>
            <div class="page-content page-container" id="page-content">
                <div class="padding">
                    <div class="row">
                        <div class=" col-md-12">
                            <div class="card user-card-full">
                                <div class="row m-l-0 m-r-0">
                                    <div class="col-sm-4 bg-c-lite-green user-profile">
                                        <div class="card-block text-center text-white">
                                            <div class="m-b-25">
                                                <img src="https://img.icons8.com/bubbles/100/000000/user.png" class="img-radius" alt="User-Profile-Image">
                                            </div>
                                            <h6 class="f-w-600">Hembo Tingor</h6>
                                            <p>User</p>
                                            <i class=" mdi mdi-square-edit-outline feather icon-edit m-t-10 f-16"></i>
                                        </div>
                                    </div>
                                    <div class="col-sm-8">
                                        <div class="card-block">
                                            <h6 class="m-b-20 p-b-5 b-b-default f-w-600">Information</h6>
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="m-b-10 f-w-600">Email</p>
                                                    <h6 class="text-muted f-w-400">rntng@gmail.com</h6>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="m-b-10 f-w-600">Phone</p>
                                                    <h6 class="text-muted f-w-400">98979989898</h6>
                                                </div>
                                            </div>
                                            <h6 class="m-b-20 m-t-40 p-b-5 b-b-default f-w-600">Projects</h6>
                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <p class="m-b-10 f-w-600">Recent</p>
                                                    <h6 class="text-muted f-w-400">Sam Disuja</h6>
                                                </div>
                                                <div class="col-sm-6">
                                                    <p class="m-b-10 f-w-600">Most Viewed</p>
                                                    <h6 class="text-muted f-w-400">Dinoter husainm</h6>
                                                </div>
                                                <div class="small">
                                                    <p><a href="changepassword.jsp">Change Pass</a></p>
                                                </div>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </header>
        <!-- ##### Follow Us Instagram Area Start ##### -->
        <div class="follow-us-instagram">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h5>Follow Us Instragram</h5>
                    </div>
                </div>
            </div>
            <!-- Instagram Feeds -->
            <div class="insta-feeds d-flex flex-wrap">
                <!-- Single Insta Feeds -->
                <div class="single-insta-feeds">
                    <img src="img/bg-img/insta1.jpg" alt="">
                    <!-- Icon -->
                    <div class="insta-icon">
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                    </div>
                </div>

                <!-- Single Insta Feeds -->
                <div class="single-insta-feeds">
                    <img src="img/bg-img/insta2.jpg" alt="">
                    <!-- Icon -->
                    <div class="insta-icon">
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                    </div>
                </div>

                <!-- Single Insta Feeds -->
                <div class="single-insta-feeds">
                    <img src="img/bg-img/insta3.jpg" alt="">
                    <!-- Icon -->
                    <div class="insta-icon">
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                    </div>
                </div>

                <!-- Single Insta Feeds -->
                <div class="single-insta-feeds">
                    <img src="img/bg-img/insta4.jpg" alt="">
                    <!-- Icon -->
                    <div class="insta-icon">
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                    </div>
                </div>

                <!-- Single Insta Feeds -->
                <div class="single-insta-feeds">
                    <img src="img/bg-img/insta5.jpg" alt="">
                    <!-- Icon -->
                    <div class="insta-icon">
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                    </div>
                </div>

                <!-- Single Insta Feeds -->
                <div class="single-insta-feeds">
                    <img src="img/bg-img/insta6.jpg" alt="">
                    <!-- Icon -->
                    <div class="insta-icon">
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                    </div>
                </div>

                <!-- Single Insta Feeds -->
                <div class="single-insta-feeds">
                    <img src="img/bg-img/insta7.jpg" alt="">
                    <!-- Icon -->
                    <div class="insta-icon">
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                    </div>
                </div>
            </div>
        </div>
        <!-- ##### Follow Us Instagram Area End ##### -->

        <!-- ##### Footer Area Start ##### -->
        <footer class="footer-area">
            <div class="container h-100">
                <div class="row h-100">
                    <div class="col-12 h-100 d-flex flex-wrap align-items-center justify-content-between">
                        <!-- Footer Social Info -->
                        <div class="footer-social-info text-right">
                            <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-behance" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                        </div>
                        <!-- Footer Logo -->
                        <div class="footer-logo">
                            <a href="homePage.jsp"><img src="img/recipe/logo.png" alt=""></a>
                        </div>

                    </div>
                </div>
            </div>
        </footer>
        <!-- ##### All Javascript Files ##### -->
        <!-- jQuery-2.2.4 js -->
        <script src="js/jquery/jquery-2.2.4.min.js"></script>
        <!-- Popper js -->
        <script src="js/bootstrap/popper.min.js"></script>
        <!-- Bootstrap js -->
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <!-- All Plugins js -->
        <script src="js/plugins/plugins.js"></script>
        <!-- Active js -->
        <script src="js/active.js"></script>
    </body>
</html>

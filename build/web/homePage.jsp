<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="team3.recipe.RecipeOrganizeDTO"%>
<%@page import="team3.recipe.RecipeOrganizeDTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Recipe Organize | Home</title>

        <!-- Favicon -->
        <link rel="icon" href="img/recipe/favicon.ico">

        <!-- Core Stylesheet -->
        <link rel="stylesheet" href="style.css">

    </head>

    <body>

        <c:if test="${requestScope.RESET_PASSWORD_SUCCESS}">
            <c:set var="reset_password_success" value="${requestScope.RESET_PASSWORD_SUCCESS}" scope="request" />
        </c:if>
        <script>
                    var result = ${reset_password_success};
                    if (result) {
                        alert("Reset your password successfully.");
                    }
        </script>

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
                                        <c:if test="${not empty sessionScope.ADMIN}">
                                            <c:set var="customer" value="${sessionScope.ADMIN}" scope="request" />
                                        </c:if>
                                        <c:if test="${not empty sessionScope.USER}">
                                            <c:set var="customer" value="${sessionScope.USER}" scope="request" />
                                        </c:if>
                                        <li><a href="#">Hello ${customer.fullName}</a></li>
                                        <li><a href="#">Welcome to Recipe Organize</a></li>
                                        <li><a href="#">Hi Delicious!</a></li>
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
                                        <li><a href="searchRecipe.jsp">Recipes</a></li>
                                        <li><a href="searchRecipe.jsp">Healthy Food</a></li>
                                        <li><a href="contact.html">Contact</a></li>
                                            <c:if test="${empty sessionScope.ADMIN and empty sessionScope.USER}">
                                            <li><a href="login.jsp">Login</a></li>
                                            </c:if>
                                        <c:if test="${not empty sessionScope.ADMIN or not empty sessionScope.USER}">    
                                        
                                        <li><a href="#">User</a>
                                            <div class="megamenu">
                                                <ul class="dropdown">
                                                    <li><a href="profile.jsp">Profile</a></li>
                                                    <li><a href="setting_interface.jsp">Setting</a></li>
                                                    <c:if test="${not empty sessionScope.ADMIN}">
                                                    <li><a href="account_management.jsp">Management Account</a></li>
                                                    </c:if>
                                                    <li><a href="login.jsp">Logout</a> </li>
                                                </ul>
                                            </div>
                                        </li>
                                            </c:if>                                        
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
        <!-- ##### Header Area End ##### -->

        <!-- ##### Hero Area Start ##### -->
        <section class="hero-area">
            <div class="hero-slides owl-carousel">

                <!-- Single Hero Slide -->
                <div class="single-hero-slide bg-img" style="background-image: url(img/bg-img/bg1.jpg);">
                    <div class="container h-100">
                        <div class="row h-100 align-items-center">
                            <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                                <div class="hero-slides-content" data-animation="fadeInUp" data-delay="100ms">
                                    <h2 data-animation="fadeInUp" data-delay="300ms">Com tam</h2>
                                    <p data-animation="fadeInUp" data-delay="700ms">Broken rice is considered a specialty dish of Saigon people. Each plate of hot, fragrant broken rice is always the first choice for quick but nutritious meals.</p>
                                    <a href="#" class="btn delicious-btn" data-animation="fadeInUp" data-delay="1000ms">See Receipe</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Single Hero Slide -->
                <div class="single-hero-slide bg-img" style="background-image: url(img/bg-img/bg6.jpg);">
                    <div class="container h-100">
                        <div class="row h-100 align-items-center">
                            <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                                <div class="hero-slides-content" data-animation="fadeInUp" data-delay="100ms">
                                    <h2 data-animation="fadeInUp" data-delay="300ms">Pho bo</h2>
                                    <p data-animation="fadeInUp" data-delay="700ms">Pho is a famous Vietnamese dish loved by many people, it will be even more delicious when cooked at home for the family to enjoy. The taste of beef is sweet and nutritious, the noodles are chewy and chewy, and the broth is rich, mixed with the aroma of herbs. Speaking of which, I'm already hungry, don't wait long, let's go to the kitchen to do it right away.</p>
                                    <a href="#" class="btn delicious-btn" data-animation="fadeInUp" data-delay="1000ms">See Receipe</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <!-- Single Hero Slide -->
                <div class="single-hero-slide bg-img" style="background-image: url(img/bg-img/bg7.jpg);">
                    <div class="container h-100">
                        <div class="row h-100 align-items-center">
                            <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                                <div class="hero-slides-content" data-animation="fadeInUp" data-delay="100ms">
                                    <h2 data-animation="fadeInUp" data-delay="300ms">Milk tea</h2>
                                    <p data-animation="fadeInUp" data-delay="700ms">Milk tea is the favorite drink of most young people today, not only because of the sweet aroma of tea with milk but also with the diverse combination of unique types of pearls. Today, we will tell you how to make pearl milk tea at home very simple that everyone knows. Go to the kitchen and do it right away!</p>
                                    <a href="#" class="btn delicious-btn" data-animation="fadeInUp" data-delay="1000ms">See Receipe</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ##### Hero Area End ##### -->

        <!-- ##### Top Catagory Area Start ##### -->
        <section class="top-catagory-area section-padding-80-0">
            <div class="container">
                <div class="row">
                    <!-- Top Catagory Area -->
                    <div class="col-12 col-lg-6">
                        <div class="single-top-catagory">
                            <img src="img/bg-img/bg2.jpg" alt="">
                            <!-- Content -->
                            <div class="top-cta-content">
                                <h3>Cake</h3>
                                <h6>Simple &amp; Delicios</h6>
                                <a href="receipe-post.html" class="btn delicious-btn">See Full Receipe</a>
                            </div>
                        </div>
                    </div>
                    <!-- Top Catagory Area -->
                    <div class="col-12 col-lg-6">
                        <div class="single-top-catagory">
                            <img src="img/bg-img/bg3.jpg" alt="">
                            <!-- Content -->
                            <div class="top-cta-content">
                                <h3>International dishes</h3>
                                <h6>Simple &amp; Delicios</h6>
                                <a href="receipe-post.html" class="btn delicious-btn">See Full Receipe</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ##### Top Catagory Area End ##### -->

        <!-- ##### Best Receipe Area Start ##### -->
        <section class="best-receipe-area">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="section-heading">
                            <h3>The Best Recipes</h3>

                            <div class="row">
                                <%
                                    List<RecipeOrganizeDTO> SEARCHRESULTS = (List<RecipeOrganizeDTO>) request.getAttribute("SEARCHRESULTS");
                                    if (SEARCHRESULTS != null) {
                                        for (RecipeOrganizeDTO recipe : SEARCHRESULTS) {
                                            int rating = recipe.getAvgRating();
                                            if (rating >= 4) {
                                %>
                                <div class="col-12 col-sm-6 col-lg-4">
                                    <div class="single-best-receipe-area mb-30">
                                        <img src="<%= recipe.getImgUrl()%>" alt="">
                                        <div class="receipe-content">
                                            <a href="receipe-post.html">
                                                <h5><%= recipe.getRecipeName()%></h5>
                                            </a>
                                            <div class="ratings">
                                                <%
                                                    for (int i = 0; i < rating; i++) {
                                                %>
                                                <i class="fa fa-star" aria-hidden="true"></i>
                                                <% } %>
                                                <%
                                                    int remainingStars = 5 - rating;
                                                    for (int i = 0; i < remainingStars; i++) {
                                                %>
                                                <i class="fa fa-star-o" aria-hidden="true"></i>
                                                <% } %>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <%
                                        }
                                    }
                                } else {
                                %>
                                <p>No recipes found.</p>
                                <% }%>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ##### Best Receipe Area End ##### -->

        <!-- ##### CTA Area Start ##### -->
        <section class="cta-area bg-img bg-overlay" style="background-image: url(img/bg-img/bg4.jpg);">
            <div class="container h-100">
                <div class="row h-100 align-items-center">
                    <div class="col-12">
                        <!-- Cta Content -->
                        <div class="cta-content text-center">
                            <h2>Healthy Food Recipes</h2>
                            <p>Healthy foods are foods that are healthy, safe and healthy for the user's body. Using organic foods, natural foods, free of harmful impurities, minimal processing to keep the essence of food are the principles of healthy food. As a result, healthy food brings positive values to users' health.</p>
                            <a href="#" class="btn delicious-btn">Discover all the receipies</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ##### CTA Area End ##### -->

        <!-- ##### Small Receipe Area Start ##### -->
        <section class="small-receipe-area section-padding-80-0">
            <div class="container">
                <div class="row">
                    <%
                        if (SEARCHRESULTS != null) {
                            for (RecipeOrganizeDTO recipe : SEARCHRESULTS) {
                                int rating = recipe.getAvgRating();
                                if (rating < 4) {
                    %>
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <div class="receipe-thumb">
                                <img src="<%= recipe.getImgUrl()%>" alt="">
                            </div>
                            <div class="receipe-content">
                                <span>January 04, 2018</span>
                                <a href="receipe-post.html">
                                    <h5><%= recipe.getRecipeName()%></h5>
                                </a>
                                <div class="ratings">
                                    <%
                                        for (int i = 0; i < rating; i++) {
                                    %>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <% } %>
                                    <%
                                        int remainingStars = 5 - rating;
                                        for (int i = 0; i < remainingStars; i++) {
                                    %>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                    <% } %>
                                </div>
                                <p>2 Comments</p>
                            </div>
                        </div>
                    </div>
                    <%
                            }
                        }
                    } else {
                    %>
                    <p>No recipes found.</p>
                    <% }%>
                </div>
            </div>
        </section>
        <!-- ##### CTA Area End ##### -->

        <!-- ##### Small Receipe Area Start ##### -->
        <section class="small-receipe-area section-padding-80-0">
            <div class="container">
                <div class="row">

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr1.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>May 10, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Vegan Smoothie</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>586 Comments</p>
                            </div>
                        </div>
                    </div>

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr2.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>May 29, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Seaweed dried brown rice</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>205 Comments</p>
                            </div>
                        </div>
                    </div>

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr3.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>May 15, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Scalops on salt</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>351 Comments</p>
                            </div>
                        </div>
                    </div>

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr4.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>April 04, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Fruits on plate</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>256 Comments</p>
                            </div>
                        </div>
                    </div>

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr5.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>May 10, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Pan fried chicken breast</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>492 Comments</p>
                            </div>
                        </div>
                    </div>

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr6.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>May 01, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Passion fruit juice</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>456 Comments</p>
                            </div>
                        </div>
                    </div>

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr7.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>March 29, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Berry Dessert</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>289 Comments</p>
                            </div>
                        </div>
                    </div>

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr8.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>March 20, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Zucchini Grilled on peper</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>397 Comments</p>
                            </div>
                        </div>
                    </div>

                    <!-- Small Receipe Area -->
                    <div class="col-12 col-sm-6 col-lg-4">
                        <div class="single-small-receipe-area d-flex">
                            <!-- Receipe Thumb -->
                            <div class="receipe-thumb">
                                <img src="img/bg-img/sr9.jpg" alt="">
                            </div>
                            <!-- Receipe Content -->
                            <div class="receipe-content">
                                <span>March 13, 2023</span>
                                <a href="receipe-post.html">
                                    <h5>Chicken Salad</h5>
                                </a>
                                <div class="ratings">
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star" aria-hidden="true"></i>
                                    <i class="fa fa-star-o" aria-hidden="true"></i>
                                </div>
                                <p>687 Comments</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ##### Small Receipe Area End ##### -->

        <!-- ##### Quote Subscribe Area Start ##### -->
        <section class="quote-subscribe-adds">
            <div class="container">
                <div class="row align-items-end">
                    <!-- Quote -->
                    <div class="col-12 col-lg-4">
                        <div class="quote-area text-center">
                            <span>"</span>
                            <h4>Nothing is better than going home to family and eating good food and relaxing</h4>
                            <p>John Smith</p>
                            <div class="date-comments d-flex justify-content-between">
                                <div class="date">March 04, 2023</div>
                                <div class="comments">1056 Comments</div>
                            </div>
                        </div>
                    </div>

                    <!-- Newsletter -->
                    <div class="col-12 col-lg-4">
                        <div class="newsletter-area">
                            <h4>Subscribe to our newsletter</h4>
                            <!-- Form -->
                            <div class="newsletter-form bg-img bg-overlay" style="background-image: url(img/bg-img/bg1.jpg);">
                                <form action="#" method="post">
                                    <input type="email" name="email" placeholder="Subscribe to newsletter">
                                    <button type="submit" class="btn delicious-btn w-100">Subscribe</button>
                                </form>
                                <p>With just 5 minutes of operation, you have access to recipes from all over the world. So what are you waiting for without following our newsletter.</p>
                            </div>
                        </div>
                    </div>

                    <!-- Adds -->
                    <div class="col-12 col-lg-4">
                        <div class="delicious-add">
                            <img src="img/bg-img/add.png" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ##### Quote Subscribe Area End ##### -->

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
        <!-- ##### Footer Area Start ##### -->

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
<%-- 
    Document   : showrecipe
    Created on : Jun 3, 2023, 11:42:02 AM
    Author     : AS
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="team3.recipe.RecipeOrganizeDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Recipe Organize | Recipe Post</title>

        <!-- Favicon -->
        <link rel="icon" href="img/recipe/favicon.ico">

        <!-- Core Stylesheet -->
        <link rel="stylesheet" href="recipe.css">
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
                                        <li><a href="AllRecipeController">Recipes</a></li>
                                        <li><a href="searchRecipe.jsp">Healthy Food</a></li>
                                        <li><a href="contact.jsp">Contact</a></li>
                                        <li><a href="about.jsp">About Us</a></li>
                                            <c:if test="${empty sessionScope.ADMIN and empty sessionScope.USER}">
                                            <li><a href="login.jsp">Login</a></li>
                                            </c:if>
                                            <c:if test="${not empty sessionScope.ADMIN or not empty sessionScope.USER}">    

                                            <li><a href="#">User</a>
                                                <div class="megamenu">
                                                    <ul class="dropdown">
                                                        <li><a href="profile.jsp">Profile</a></li>
                                                        <li><a href="setting_interface.jsp">Setting</a></li>
                                                        <li><a href="plan.jsp">Meal Planer</a></li>
                                                            <c:if test="${not empty sessionScope.ADMIN}">
                                                            <li><a href="managerAccount.jsp">Management Account</a></li>
                                                            <li><a href="RecipeManagementController">Management Recipe</a></li>
                                                            </c:if>
                                                        <li><a href="LogoutController">Logout</a> </li>
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

        <!-- ##### Breadcumb Area Start ##### -->
        <div class="breadcumb-area bg-img bg-overlay" style="background-image: url(img/bg-img/breadcumb3.jpg);">
            <div class="container h-100">
                <div class="row h-100 align-items-center">
                    <div class="col-12">
                        <div class="breadcumb-text text-center">
                            <h2>Recipe</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- ##### Breadcumb Area End ##### -->

        <div class="receipe-post-area section-padding-80">

            <!-- Receipe Post Search -->
            <div class="receipe-post-search mb-80">
                <div class="container">

                    <form value="${txtS}" action="SearchController" method="post">
                        <div class="row">
                            <!-- Recipe Category-->
                            <div class="col-12 col-lg-4">
                                <ul class="category-list">
                                    <select onchange="location = this.value;">
                                        <option value="CategoryController?categoryID=0">All Recipe Categories</option>
                                        <option value="CategoryController?categoryID=1">Main Dish</option>
                                        <option value="CategoryController?categoryID=2">Pasta</option>
                                        <option value="CategoryController?categoryID=3">Salad</option>
                                        <option value="CategoryController?categoryID=4">Vegetarian</option>
                                        <option value="CategoryController?categoryID=5">Dessert</option>
                                        <option value="CategoryController?categoryID=6">Bakery</option>
                                    </select>

                                </ul>
                            </div>
                            <!-- Recipe Search-->
                            <div class="col-12 col-lg-4">
                                <input type="search" name="txtSearch" placeholder="Search Receipies" >
                            </div>
                            <div class="col-12 col-lg-4 text-right">
                                <button type="submit" class="btn delicious-btn" name="btAction" value="search">Search</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <!-- Result -->
            <div class="">
                <div class="result">
                    <div class="section-heading text-left">
                        <h3>Result</h3>
                        <p class="noFound">${nof}</p>
                    </div>
                </div>
            </div>

            <!-- Recipe by Category -->
            <div class="row">
                <c:forEach items="${list}" var="o">
                    <div class="col-12 col-md-3">
                        <div class="card product-container">
                            <img class="card-img-top" src="${o.imgUrl}" alt="Card image cap">
                            <div class="card-body">
                                <div>
                                    <h3 class="card-title view-title"><b><a href="DetailController?recipeID=${o.recipeID}" title="View Product" >${o.recipeName}</a></b></h3>
                                </div>
                                <div><p class="card-text calo"><b>${o.caloRecipe} calos</b></p></div>
                                <div><p class="card-text show_txt" id="description">${o.description}</p></div>
                                <div class="rating">
                                    <span class="star"><i class="fa fa-star"></i></span>
                                    <span class="star"><i class="fa fa-star"></i></span>
                                    <span class="star"><i class="fa fa-star"></i></span>
                                    <span class="star"><i class="fa fa-star"></i></span>
                                    <span class="star"><i class="fa fa-star"></i></span>
                                </div>
                                <button class="add-to-cart-btn">Favorite</button>
                            </div>
                        </div>
                    </div> 
                </c:forEach>
            </div
        </div>
        <!-- Recipe by search -->
        <div class="row">
            <c:forEach items="${listP}" var="o">
                <div class="col-12 col-md-3">
                    <div class="card product-container">
                        <img class="card-img-top" src="${o.imgUrl}" alt="Card image cap"/>
                        <div class="card-body">
                            <div>
                                <h3 class="card-title view-title" style="line-height: 1.5rem;"><b><a href="DetailController?recipeID=${o.recipeID}" title="View Product" >${o.recipeName}</a></b></h3>
                            </div>
                            <div><p class="card-text calo"><b>${o.caloRecipe}</b></p></div>
                            <div><p class="card-text show_txt" id="description">${o.description}</p></div>
                            <div class="rating">
                                <span class="star"><i class="fa fa-star"></i></span>
                                <span class="star"><i class="fa fa-star"></i></span>
                                <span class="star"><i class="fa fa-star"></i></span>
                                <span class="star"><i class="fa fa-star"></i></span>
                                <span class="star"><i class="fa fa-star"></i></span>
                            </div>
                            <button class="add-to-cart-btn">Favorite</button>
                        </div>
                    </div>
                </div> 
            </c:forEach>
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

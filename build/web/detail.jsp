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
        <!-- Search Wrapper -->
        <div class="search-wrapper">
            <!-- Close Btn -->
            <div class="close-btn"><i class="fa fa-times" aria-hidden="true"></i></div>

            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <form action="SearchController" method="post">
                            <input type="search" name="txtSearch" placeholder="Type any keywords...">
                            <button type="submit" name="btAction" value="search"><i class="fa fa-search" aria-hidden="true"></i></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- ##### Header Area Start ##### -->
        <header class="header-area">

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
                                                <li><a href="recipePost.jsp">Recipe Post</a></li>
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
                                        <li><a href="AllRecipeController">Recipes</a></li>
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
            <!--Detail Page -->
            <c:forEach items="${detailP}" var="detail">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="receipe-slider owl-carousel">
                                <img src="${detail.imgUrl}">
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Receipe Content Area -->
                <div class="receipe-content-area">
                    <div class="container">

                        <div class="row">
                            <div class="col-12 col-md-8">
                                <div class="receipe-headline my-5">
                                    <span>April 05, 2018</span>
                                    <h2>${detail.recipeName}</h2>
                                    <!--                                <div class="receipe-duration">
                                                                        <h6>Prep: 15 mins</h6>
                                                                        <h6>Cook: 30 mins</h6>
                                                                        <h6>Yields: 8 Servings</h6>
                                                                    </div>-->
                                </div>
                            </div>

                            <div class="col-12 col-md-4">
                                <div class="receipe-ratings text-right my-5">
                                    <div class="ratings">
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star-o" aria-hidden="true"></i>
                                    </div>
                                    <a href="#" class="btn delicious-btn">For Begginers</a>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-12 col-lg-8">
                                ${detail.description}
                            </div>

                            <!-- Ingredients -->
                            <div class="col-12 col-lg-4">
                                <div class="ingredients">
                                    <h4>Ingredients</h4>

                                    <!-- Custom Checkbox -->

                                    <!--                                    <div class="custom-control custom-checkbox">-->
                                    <div class="show-ingde">
                                        <%
                                            String[] ingde = (String[]) request.getAttribute("ingde");
                                            if (ingde != null && ingde.length > 0) {
                                                for (int i = 0; i < ingde.length; i++) {
                                        %>
                                        <!-- your code here -->
                                        <p style='color: black'><%= ingde[i]%></p>
                                        <%
                                                }
                                            } else {
                                                return;
                                            }
                                        %>
                                    </div>

                                </div>
                            </div>
                        </c:forEach>
                        <!-- End Detail Page -->
                        <!-- Comment and Review-->
                        <div class="row">
                            <div class="col-12">
                                <div class="section-heading text-left">
                                    <h3>Leave a comment</h3>
                                    <link rel="stylesheet" type="text/css" href="css/feedback.css">
                                    <div class="comments-container">
                                        <%-- Hiển thị thông báo lỗi nếu có --%>
                                        <c:if test="${not empty commentError}">
                                            <p style="color: red">${commentError}</p>
                                        </c:if>

                                        <%-- Form để người dùng thêm bình luận --%>
                                        <h2>Add Comment:</h2>
                                        <form action="DetailController" method="post" class="add-comment-form">
                                            <c:forEach items="${detailP}" var="detail">
                                                <input type="hidden" name="recipeID" value="${detail.recipeID}" /> <%-- Giá trị recipeID giả định --%>
                                            </c:forEach>
                                            <textarea name="comment" rows="4" cols="50"></textarea>
                                            <br/>
                                            <c:if test="${empty sessionScope.USER && empty sessionScope.ADMIN}">
                                                <p style="color: black; font-weight: bold;">Bạn cần <a style="color: red;" href="login.jsp">đăng nhập</a> để thêm bình luận.</p>
                                            </c:if>
                                            <input type="submit" value="Submit Comment" />
                                        </form>

                                        <%-- Hiển thị danh sách bình luận --%>
                                        <h2>Comments:</h2>
                                        <div class="container">
                                            <div class="row" id="commentsRow">
                                                <%-- Lặp qua danh sách bình luận và hiển thị --%>
                                                <c:forEach var="comment" items="${userComments}">
                                                    <%-- Tính toán thời gian tương đối --%>
                                                    <c:set var="currentTime" value="${System.currentTimeMillis()}" />
                                                    <c:set var="timeDiff" value="${currentTime - comment.feedbackDate.time}" />
                                                    <c:choose>
                                                        <c:when test="${timeDiff < 60000}"> <!-- Thời gian dưới 1 phút -->
                                                            <c:set var="relativeTime" value="A few seconds ago" />
                                                        </c:when>
                                                        <c:when test="${timeDiff < 3600000}"> <!-- Thời gian dưới 1 giờ -->
                                                            <c:set var="minutes" value="${Math.round(timeDiff / 60000)}" />
                                                            <c:set var="relativeTime" value="${minutes} minutes ago" />
                                                        </c:when>
                                                        <c:when test="${timeDiff < 86400000}"> <!-- Thời gian dưới 1 ngày -->
                                                            <c:set var="hours" value="${Math.round(timeDiff / 3600000)}" />
                                                            <c:set var="relativeTime" value="${hours} hours ago" />
                                                        </c:when>
                                                        <c:when test="${timeDiff < 2592000000}"> <!-- Thời gian dưới 1 tháng -->
                                                            <c:set var="days" value="${Math.round(timeDiff / 86400000)}" />
                                                            <c:set var="relativeTime" value="${days} days ago" />
                                                        </c:when>
                                                        <c:when test="${timeDiff < 31536000000}"> <!-- Thời gian dưới 1 năm -->
                                                            <c:set var="months" value="${Math.round(timeDiff / 2592000000)}" />
                                                            <c:set var="relativeTime" value="${months} months ago" />
                                                        </c:when>
                                                        <c:otherwise> <!-- Thời gian trên 1 năm -->
                                                            <fmt:formatDate var="formattedDate" value="${comment.feedbackDate}" pattern="dd/MM/yyyy HH:mm:ss" />
                                                            <c:set var="relativeTime" value="${formattedDate}" />
                                                        </c:otherwise>
                                                    </c:choose>

                                                    <%-- Hiển thị thông tin bình luận --%>
                                                    <div class="col-md-8">
                                                        <div class="media g-mb-30 media-comment">
                                                            <img class="d-flex g-width-50 g-height-50 rounded-circle g-mt-3 g-mr-15" src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Image Description">
                                                            <div class="media-body u-shadow-v18 g-bg-secondary g-pa-30">
                                                                <div class="g-mb-15">
                                                                    <h5 class="h5 g-color-gray-dark-v1 mb-0">${comment.userName}</h5>
                                                                    <span class="g-color-gray-dark-v4 g-font-size-12">${relativeTime}</span>
                                                                </div>
                                                                <p>${comment.comment}</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </c:forEach>
                                            </div>
                                        </div>
                                    </div>

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

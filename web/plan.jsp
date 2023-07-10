<%-- 
    Document   : plan
    Created on : Jun 16, 2023, 8:52:31 AM
    Author     : MSI BH
--%>
<%@page import="team3.recipe.RecipeOrganizeDAO"%>
<%@page import="java.util.List"%>
<%@page import="team3.recipe.RecipeOrganizeDTO"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Recipe Organize | Plan for healthy</title>

        <!-- Favicon -->
        <link rel="icon" href="img/recipe/favicon.ico">

        <!-- Core Stylesheet -->
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <section>

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
                <div class="breadcumb-area bg-img bg-overlay" style="background-image: url(img/bg-img/breadcumb4.jpg);">
                    <div class="container h-100">
                        <div class="row h-100 align-items-center">
                            <div class="col-12">
                                <div class="breadcumb-text text-center">
                                    <h2>Meal Planer</h2>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> <br>
                </section>

                <section>
                    <style>
                        .popup {
                            display: none;
                            position: fixed;
                            top: 0;
                            left: 0;
                            width: 100%;
                            height: 100%;
                            background-color: rgba(0, 0, 0, 0.5); /* Màu nền của overlay */
                            z-index: 9999; /* Đảm bảo hiển thị trên các phần tử khác */
                        }

                        .popup-content {
                            position: absolute;
                            top: 50%;
                            left: 50%;
                            transform: translate(-50%, -50%);
                            background-color: #fff;
                            padding: 20px;
                            min-width: 300px; /* Chiều rộng tối thiểu */
                            max-width: 800px; /* Chiều rộng tối đa */
                            min-height: 200px; /* Chiều cao tối thiểu */
                            max-height: 500px; /* Chiều cao tối đa */
                            overflow: auto; /* Hiển thị thanh cuộn khi nội dung vượt quá kích thước */
                            border-radius: 5px; /* Bo góc của popup */
                            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3); /* Đổ bóng cho popup */
                        }

                        .close-button {
                            position: absolute;
                            top: 10px;
                            right: 10px;
                            padding: 10px;
                            background-color: #ccc;
                            color: #fff;
                            border: none;
                            cursor: pointer;
                            border-radius: 50%; /* Bo góc của nút đóng */
                        }
                    </style>

                    <script>
                        function openPopup() {
                            document.getElementById("popup").style.display = "block";
                        }

                        function closePopup() {
                            document.getElementById("popup").style.display = "none";
                        }

                        function calculate() {
                            var your_hope = document.querySelector('input[name="goal"]:checked').value;
                            var your_gender = document.querySelector('input[name="gender"]:checked').value;
                            var your_height = document.getElementById('height').value;
                            var your_weight = document.getElementById('weight').value;
                            var your_age = document.getElementById('age').value;
                            var your_activity_level = parseFloat(document.getElementById('activity_level').value);
                            var BMR;
                            if (your_gender == "M") {
                                if (your_hope == "L") {
                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * (your_activity_level - 0.3);
                                } else if (your_hope == "M") {
                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * your_activity_level;
                                } else if (your_hope == "B") {
                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * (your_activity_level + 0.3);
                                }
                            } else {
                                if (your_hope == "L") {
                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * (your_activity_level - 0.3);
                                } else if (your_hope == "M") {
                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * your_activity_level;
                                } else if (your_hope == "B") {
                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * (your_activity_level + 0.3);
                                }
                            }
                            document.getElementById("bmrInput").value = BMR;
                            // Close the popup
                            document.getElementById("popup").style.display = "none";
                        }
                    </script>

                    <h3>Put your diet on autopilot</h3>
                    <button onclick="openPopup()">Not sure?</button><br>

                    <form action="DispatchController">
                        <label>I want to eat </label>
                        <input type="number" min="1000" max="4500" step="any" pattern="[0-9]*" placeholder="####" name="numcalo" id="bmrInput" value="0">
                        <label>Calories</label><br>
                        <input type="submit" value="Generate" name="btAction" />
                    </form>

                    <div id="popup" class="popup">
                        <div class="popup-content">
                            <!-- Nội dung của cửa sổ popup -->
                            <h3>Nutrition calculator</h3>
                            <p>
                                This calculator uses a standard BMR equation (the Mifflin-St Jeor formula) to estimate your Calorie needs.
                                We also make some rough macronutrient suggestions, but you're free to completely customize these values
                                when you create a free account.
                            </p>
                            <p>
                                <strong>Keep in mind that this is a general estimate.</strong> For best results, consult your healthcare provider.
                            </p>


                            <div class="col-12 col-sm-8">
                                <div class="row">
                                    <div id="c59_goal" class="btn-group btn-group-toggle" name="goal" data-toggle="buttons">
                                        <label>I want to: </label> <label>
                                            <input type="radio" name="goal" value="L" id="c59_goal-0">Lose weight
                                        </label> 
                                        <label>
                                            <input type="radio" name="goal" value="M" id="c59_goal-1" checked="">Maintain
                                        </label>
                                        <label>
                                            <input type="radio" name="goal" value="B" id="c59_goal-2">Build muscle
                                        </label>
                                    </div>
                                </div>
                            </div>

                            <div class="col-12 col-sm-8">
                                <div class="row">
                                    <div id="c59_goal" class="btn-group btn-group-toggle" name="gender" data-toggle="buttons">
                                        <label>I am: </label> <label>
                                            <input type="radio" name="gender" value="M" id="c59_gender-0">Male
                                        </label>
                                        <label>
                                            <input type="radio" name="gender" value="F" id="c59_gender-1" checked="">Female
                                        </label>

                                    </div>
                                </div>
                            </div>


                            <br>

                            <div class="row">
                                <div class="col-6">
                                    <label>Height:</label>
                                    <input id="height" name="height" value="" class="form-control inline_block" type="number">
                                    <label for="height-secondary" class="metric_inputs signup_input_label">cms</label>
                                </div>
                            </div>

                            <br>

                            <div class="row">
                                <div class="col-12 col-sm-4">
                                    <label>Weight:</label>
                                    <input id="weight" name="weight" value="" class="form-control inline_block" type="number">
                                    <label for="weight" class="signup_input_label metric_inputs">kgs</label>
                                </div>
                            </div>

                            <br>

                            <div class="row">
                                <div class="col-12 col-sm-4">
                                    <label>Age:</label>
                                    <input name="age" id="age" value="" class="form-control inline_block" type="number">
                                    <label for="age" class="signup_input_label">years</label>
                                </div>
                            </div>

                            <br>

                            <div class="col-12 col-sm-8">
                                <label>Activity level:</label>
                                <select id="activity_level" class="form-control" name="activity_level">
                                    <option value="1.375">Lightly Active</option>
                                    <option value="1.55" selected>Moderately Active</option>
                                    <option value="1.725">Very Active</option>
                                </select>
                            </div>

                            <br>

                            <div class="offset-sm-2 col-12 col-sm-8 top_spacer bottom_spacer">
                                <button onclick="calculate()">Calculate</button>
                            </div>

                            <button class="close-button" onclick="closePopup()">Close</button>
                        </div>
                    </div>
                    <style>
                        .popup {
                            display: none;
                            position: fixed;
                            top: 0;
                            left: 0;
                            width: 100%;
                            height: 100%;
                            background-color: rgba(0, 0, 0, 0.5);
                        }

                        .popup-content {
                            position: absolute;
                            top: 50%;
                            left: 50%;
                            transform: translate(-50%, -50%);
                            background-color: #fff;
                            padding: 20px;
                            min-width: 300px;
                            max-width: 800px;
                            min-height: 200px;
                            max-height: 500px;
                            overflow: auto;
                        }

                        .close-button {
                            position: absolute;
                            bottom: 0;
                            right: 0;
                            padding: 10px 20px;
                            background-color: #ccc;
                            color: #fff;
                            cursor: pointer;
                        }
                    </style>
                </section>
                <section>
                    <style>
                        body {
                            background-color: #fff; /* chọn màu trắng */
                        }

                        section {
                            padding: 20px;
                            background-color: #f2f2f2;
                            border-radius: 5px;
                        }

                        h2, h3 {
                            color: #008000; /* chọn màu xanh lá cây */
                        }

                        img {
                            margin-right: 10px;
                            margin-bottom: 5px;
                            border-radius: 5px;
                        }

                        .meal-category {
                            margin-top: 20px;
                        }

                        .meal-category h3 {
                            margin-bottom: 10px;
                        }
                    </style>


                    <c:if test="${not empty sessionScope.USER || not empty sessionScope.ADMIN}">
                        <c:if test="${not empty sessionScope.MEAL_PLAN}">
                            <h2>
                                <%
                                    LocalDate currentDate = LocalDate.now();
                                    String planDate = currentDate.toString();
                                    RecipeOrganizeDAO dao = new RecipeOrganizeDAO();
                                    if (session.getAttribute("USER") != null) {
                                        RecipeOrganizeDTO user = (RecipeOrganizeDTO) session.getAttribute("USER");
                                        int userID = user.getUserID();
                                        List<RecipeOrganizeDTO> mealplan = dao.getMealPlan(userID);
                                        if (!mealplan.get(0).getPlanDate().equals(planDate)) {
                                            out.println(mealplan.get(0).getPlanDate());
                                        } else {
                                            out.println("Today's Meal Plan");
                                        }
                                    } else {
                                        RecipeOrganizeDTO admin = (RecipeOrganizeDTO) session.getAttribute("ADMIN");
                                        int adminID = admin.getUserID();
                                        List<RecipeOrganizeDTO> mealplan = dao.getMealPlan(adminID);
                                        if (!mealplan.get(0).getPlanDate().equals(planDate)) {
                                            out.println(mealplan.get(0).getPlanDate());
                                        } else {
                                            out.println("Today's Meal Plan");
                                        }
                                    }
                                %>
                            </h2>
                            <h3>Your calories estimate: ${param.numcalo}</h3>
                            <%
                                float totalCalories = 0;
                                if (session.getAttribute("USER") != null) {
                                    RecipeOrganizeDTO user = (RecipeOrganizeDTO) session.getAttribute("USER");
                                    int userID = user.getUserID();
                                    List<RecipeOrganizeDTO> mealplan = dao.getMealPlan(userID);
                                    for (RecipeOrganizeDTO mealPlan : mealplan) {
                                        totalCalories = totalCalories + mealPlan.getCaloRecipe();
                                    }
                                    request.setAttribute("TotalCalories", totalCalories);
                                } else {
                                    RecipeOrganizeDTO admin = (RecipeOrganizeDTO) session.getAttribute("ADMIN");
                                    int adminID = admin.getUserID();
                                    List<RecipeOrganizeDTO> mealplan = dao.getMealPlan(adminID);
                                    for (RecipeOrganizeDTO mealPlan : mealplan) {
                                        totalCalories = totalCalories + mealPlan.getCaloRecipe();
                                    }
                                    request.setAttribute("TotalCalories", totalCalories);
                                }
                            %>
                            <h3>Total food's calories: ${requestScope.TotalCalories}</h3>
                            <div class="meal-category">
                                <h3>Breakfast</h3>
                                <c:forEach var="meal_plan" items="${sessionScope.MEAL_PLAN}" varStatus="loop">
                                    <c:if test="${loop.index < 2}">
                                        <img src=${meal_plan.imgUrl} alt="kk" width="100" height="100">
                                        ${meal_plan.recipeName} has
                                        ${meal_plan.caloRecipe} Calories<br>
                                    </c:if>
                                </c:forEach>
                            </div>
                            <div class="meal-category">
                                <h3>Lunch</h3>
                                <c:forEach var="meal_plan" items="${sessionScope.MEAL_PLAN}" varStatus="loop">
                                    <c:if test="${loop.index > 1 && loop.index < 4}">
                                        <img src=${meal_plan.imgUrl} alt="kk" width="100" height="100">
                                        ${meal_plan.recipeName} has
                                        ${meal_plan.caloRecipe} Calories<br>
                                    </c:if>
                                </c:forEach>
                            </div>
                            <div class="meal-category">
                                <h3>Dinner</h3>
                                <c:forEach var="meal_plan" items="${sessionScope.MEAL_PLAN}" varStatus="loop">
                                    <c:if test="${loop.index > 3}">
                                        <img src=${meal_plan.imgUrl} alt="kk" width="100" height="100">
                                        ${meal_plan.recipeName} has
                                        ${meal_plan.caloRecipe} Calories<br>
                                    </c:if>
                                </c:forEach>
                            </div>
                        </c:if>
                    </c:if>
                    <c:if test="${not empty sessionScope.USER || not empty sessionScope.ADMIN || (empty sessionScope.USER and empty sessionScope.ADMIN)}">
                        <c:if test="${empty sessionScope.MEAL_PLAN}">
                            <h2>You haven't set a meal plan yet!</h2>
                        </c:if>
                    </c:if>
                </section>
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

                <!-- All Plugins js -->
                <script src="js/plugins/plugins.js"></script>
                <!-- Active js -->
                <script src="js/active.js"></script>
                </body>
                </html>

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import team3.recipe.RecipeOrganizeDAO;
import java.util.List;
import team3.recipe.RecipeOrganizeDTO;
import java.time.LocalDate;

public final class plan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("        <!-- Title -->\n");
      out.write("        <title>Recipe Organize | Plan for healthy</title>\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"img/recipe/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- Core Stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <!-- Preloader -->\n");
      out.write("            <div id=\"preloader\">\n");
      out.write("                <i class=\"circle-preloader\"></i>\n");
      out.write("                <img src=\"img/recipe/salad.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <!-- Search Wrapper -->\n");
      out.write("            <div class=\"search-wrapper\">\n");
      out.write("                <!-- Close Btn -->\n");
      out.write("                <div class=\"close-btn\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></div>\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                                <input type=\"search\" name=\"search\" placeholder=\"Type any keywords...\">\n");
      out.write("                                <button type=\"submit\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- ##### Header Area Start ##### -->\n");
      out.write("            <header class=\"header-area\">\n");
      out.write("\n");
      out.write("                <!-- Top Header Area -->\n");
      out.write("                <div class=\"top-header-area\">\n");
      out.write("                    <div class=\"container h-100\">\n");
      out.write("                        <div class=\"row h-100 align-items-center justify-content-between\">\n");
      out.write("                            <!-- Breaking News -->\n");
      out.write("                            <div class=\"col-12 col-sm-6\">\n");
      out.write("                                <div class=\"breaking-news\">\n");
      out.write("                                    <div id=\"breakingNewsTicker\" class=\"ticker\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            <li><a href=\"#\">Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                            <li><a href=\"#\">Welcome to Recipe Organize</a></li>\n");
      out.write("                                            <li><a href=\"#\">Hi Delicious!</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Top Social Info -->\n");
      out.write("                            <div class=\"col-12 col-sm-6\">\n");
      out.write("                                <div class=\"top-social-info text-right\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-behance\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Navbar Area -->\n");
      out.write("                <div class=\"delicious-main-menu\">\n");
      out.write("                    <div class=\"classy-nav-container breakpoint-off\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <!-- Menu -->\n");
      out.write("                            <nav class=\"classy-navbar justify-content-between\" id=\"deliciousNav\">\n");
      out.write("\n");
      out.write("                                <!-- Logo -->\n");
      out.write("                                <a class=\"nav-brand\" href=\"homePage.jsp\"><img src=\"img/recipe/logo.png\" alt=\"\"></a>\n");
      out.write("\n");
      out.write("                                <!-- Navbar Toggler -->\n");
      out.write("                                <div class=\"classy-navbar-toggler\">\n");
      out.write("                                    <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Menu -->\n");
      out.write("                                <div class=\"classy-menu\">\n");
      out.write("\n");
      out.write("                                    <!-- close btn -->\n");
      out.write("                                    <div class=\"classycloseIcon\">\n");
      out.write("                                        <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!-- Nav Start -->\n");
      out.write("                                    <div class=\"classynav\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li class=\"active\"><a href=\"homePage.jsp\">Home</a></li>\n");
      out.write("                                            <li><a href=\"#\">Pages</a>\n");
      out.write("                                                <ul class=\"dropdown\">\n");
      out.write("                                                    <li><a href=\"homePage.jsp\">Home</a></li>\n");
      out.write("                                                    <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("                                                    <li><a href=\"blog-post.html\">Blog Post</a></li>\n");
      out.write("                                                    <li><a href=\"receipe-post.html\">Recipe Post</a></li>\n");
      out.write("                                                    <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                                    <li><a href=\"elements.html\">Elements</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li><a href=\"#\">Menu</a>\n");
      out.write("                                                <div class=\"megamenu\">\n");
      out.write("                                                    <ul class=\"dropdown\">\n");
      out.write("                                                        <li><a href=\"homePage.jsp\">Rice</a></li>\n");
      out.write("                                                        <li><a href=\"about.html\">Noodles</a></li>\n");
      out.write("                                                        <li><a href=\"blog-post.html\">Cake</a></li>\n");
      out.write("                                                        <li><a href=\"receipe-post.html\">Drinks</a></li>\n");
      out.write("                                                        <li><a href=\"contact.html\">Dessert</a></li>\n");
      out.write("                                                        <li><a href=\"elements.html\">International dishes</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li><a href=\"receipe-post.html\">Recipes</a></li>\n");
      out.write("                                            <li><a href=\"receipe-post.html\">Healthy Food</a></li>\n");
      out.write("                                            <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("          \n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                        <!-- Newsletter Form -->\n");
      out.write("                                        <div class=\"search-btn\">\n");
      out.write("                                            <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Nav End -->\n");
      out.write("                                </div>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"breadcumb-area bg-img bg-overlay\" style=\"background-image: url(img/bg-img/breadcumb4.jpg);\">\n");
      out.write("                    <div class=\"container h-100\">\n");
      out.write("                        <div class=\"row h-100 align-items-center\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"breadcumb-text text-center\">\n");
      out.write("                                    <h2>Meal Planer</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> <br>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section>\n");
      out.write("                    <style>\n");
      out.write("                        .popup {\n");
      out.write("                            display: none;\n");
      out.write("                            position: fixed;\n");
      out.write("                            top: 0;\n");
      out.write("                            left: 0;\n");
      out.write("                            width: 100%;\n");
      out.write("                            height: 100%;\n");
      out.write("                            background-color: rgba(0, 0, 0, 0.5); /* Màu nền của overlay */\n");
      out.write("                            z-index: 9999; /* Đảm bảo hiển thị trên các phần tử khác */\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        .popup-content {\n");
      out.write("                            position: absolute;\n");
      out.write("                            top: 50%;\n");
      out.write("                            left: 50%;\n");
      out.write("                            transform: translate(-50%, -50%);\n");
      out.write("                            background-color: #fff;\n");
      out.write("                            padding: 20px;\n");
      out.write("                            min-width: 300px; /* Chiều rộng tối thiểu */\n");
      out.write("                            max-width: 800px; /* Chiều rộng tối đa */\n");
      out.write("                            min-height: 200px; /* Chiều cao tối thiểu */\n");
      out.write("                            max-height: 500px; /* Chiều cao tối đa */\n");
      out.write("                            overflow: auto; /* Hiển thị thanh cuộn khi nội dung vượt quá kích thước */\n");
      out.write("                            border-radius: 5px; /* Bo góc của popup */\n");
      out.write("                            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3); /* Đổ bóng cho popup */\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        .close-button {\n");
      out.write("                            position: absolute;\n");
      out.write("                            top: 10px;\n");
      out.write("                            right: 10px;\n");
      out.write("                            padding: 10px;\n");
      out.write("                            background-color: #ccc;\n");
      out.write("                            color: #fff;\n");
      out.write("                            border: none;\n");
      out.write("                            cursor: pointer;\n");
      out.write("                            border-radius: 50%; /* Bo góc của nút đóng */\n");
      out.write("                        }\n");
      out.write("                    </style>\n");
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        function openPopup() {\n");
      out.write("                            document.getElementById(\"popup\").style.display = \"block\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        function closePopup() {\n");
      out.write("                            document.getElementById(\"popup\").style.display = \"none\";\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        function calculate() {\n");
      out.write("                            var your_hope = document.querySelector('input[name=\"goal\"]:checked').value;\n");
      out.write("                            var your_gender = document.querySelector('input[name=\"gender\"]:checked').value;\n");
      out.write("                            var your_height = document.getElementById('height').value;\n");
      out.write("                            var your_weight = document.getElementById('weight').value;\n");
      out.write("                            var your_age = document.getElementById('age').value;\n");
      out.write("                            var your_activity_level = parseFloat(document.getElementById('activity_level').value);\n");
      out.write("                            var BMR;\n");
      out.write("                            if (your_gender == \"M\") {\n");
      out.write("                                if (your_hope == \"L\") {\n");
      out.write("                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * (your_activity_level - 0.3);\n");
      out.write("                                } else if (your_hope == \"M\") {\n");
      out.write("                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * your_activity_level;\n");
      out.write("                                } else if (your_hope == \"B\") {\n");
      out.write("                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * (your_activity_level + 0.3);\n");
      out.write("                                }\n");
      out.write("                            } else {\n");
      out.write("                                if (your_hope == \"L\") {\n");
      out.write("                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * (your_activity_level - 0.3);\n");
      out.write("                                } else if (your_hope == \"M\") {\n");
      out.write("                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * your_activity_level;\n");
      out.write("                                } else if (your_hope == \"B\") {\n");
      out.write("                                    BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * (your_activity_level + 0.3);\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                            document.getElementById(\"bmrInput\").value = BMR;\n");
      out.write("                            // Close the popup\n");
      out.write("                            document.getElementById(\"popup\").style.display = \"none\";\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("                    <h3>Put your diet on autopilot</h3>\n");
      out.write("                    <button onclick=\"openPopup()\">Not sure?</button><br>\n");
      out.write("\n");
      out.write("                    <form action=\"DispatchController\">\n");
      out.write("                        <label>I want to eat </label>\n");
      out.write("                        <input type=\"number\" min=\"1000\" max=\"4500\" step=\"any\" pattern=\"[0-9]*\" placeholder=\"####\" name=\"numcalo\" id=\"bmrInput\" value=\"0\">\n");
      out.write("                        <label>Calories</label><br>\n");
      out.write("                        <input type=\"submit\" value=\"Generate\" name=\"btAction\" />\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div id=\"popup\" class=\"popup\">\n");
      out.write("                        <div class=\"popup-content\">\n");
      out.write("                            <!-- Nội dung của cửa sổ popup -->\n");
      out.write("                            <h3>Nutrition calculator</h3>\n");
      out.write("                            <p>\n");
      out.write("                                This calculator uses a standard BMR equation (the Mifflin-St Jeor formula) to estimate your Calorie needs.\n");
      out.write("                                We also make some rough macronutrient suggestions, but you're free to completely customize these values\n");
      out.write("                                when you create a free account.\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <strong>Keep in mind that this is a general estimate.</strong> For best results, consult your healthcare provider.\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-12 col-sm-8\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div id=\"c59_goal\" class=\"btn-group btn-group-toggle\" name=\"goal\" data-toggle=\"buttons\">\n");
      out.write("                                        <label>I want to: </label> <label>\n");
      out.write("                                            <input type=\"radio\" name=\"goal\" value=\"L\" id=\"c59_goal-0\">Lose weight\n");
      out.write("                                        </label> \n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"goal\" value=\"M\" id=\"c59_goal-1\" checked=\"\">Maintain\n");
      out.write("                                        </label>\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"goal\" value=\"B\" id=\"c59_goal-2\">Build muscle\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-12 col-sm-8\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div id=\"c59_goal\" class=\"btn-group btn-group-toggle\" name=\"gender\" data-toggle=\"buttons\">\n");
      out.write("                                        <label>I am: </label> <label>\n");
      out.write("                                            <input type=\"radio\" name=\"gender\" value=\"M\" id=\"c59_gender-0\">Male\n");
      out.write("                                        </label>\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"radio\" name=\"gender\" value=\"F\" id=\"c59_gender-1\" checked=\"\">Female\n");
      out.write("                                        </label>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-6\">\n");
      out.write("                                    <label>Height:</label>\n");
      out.write("                                    <input id=\"height\" name=\"height\" value=\"\" class=\"form-control inline_block\" type=\"number\">\n");
      out.write("                                    <label for=\"height-secondary\" class=\"metric_inputs signup_input_label\">cms</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-12 col-sm-4\">\n");
      out.write("                                    <label>Weight:</label>\n");
      out.write("                                    <input id=\"weight\" name=\"weight\" value=\"\" class=\"form-control inline_block\" type=\"number\">\n");
      out.write("                                    <label for=\"weight\" class=\"signup_input_label metric_inputs\">kgs</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-12 col-sm-4\">\n");
      out.write("                                    <label>Age:</label>\n");
      out.write("                                    <input name=\"age\" id=\"age\" value=\"\" class=\"form-control inline_block\" type=\"number\">\n");
      out.write("                                    <label for=\"age\" class=\"signup_input_label\">years</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <div class=\"col-12 col-sm-8\">\n");
      out.write("                                <label>Activity level:</label>\n");
      out.write("                                <select id=\"activity_level\" class=\"form-control\" name=\"activity_level\">\n");
      out.write("                                    <option value=\"1.375\">Lightly Active</option>\n");
      out.write("                                    <option value=\"1.55\" selected>Moderately Active</option>\n");
      out.write("                                    <option value=\"1.725\">Very Active</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <div class=\"offset-sm-2 col-12 col-sm-8 top_spacer bottom_spacer\">\n");
      out.write("                                <button onclick=\"calculate()\">Calculate</button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <button class=\"close-button\" onclick=\"closePopup()\">Close</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <style>\n");
      out.write("                        .popup {\n");
      out.write("                            display: none;\n");
      out.write("                            position: fixed;\n");
      out.write("                            top: 0;\n");
      out.write("                            left: 0;\n");
      out.write("                            width: 100%;\n");
      out.write("                            height: 100%;\n");
      out.write("                            background-color: rgba(0, 0, 0, 0.5);\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        .popup-content {\n");
      out.write("                            position: absolute;\n");
      out.write("                            top: 50%;\n");
      out.write("                            left: 50%;\n");
      out.write("                            transform: translate(-50%, -50%);\n");
      out.write("                            background-color: #fff;\n");
      out.write("                            padding: 20px;\n");
      out.write("                            min-width: 300px;\n");
      out.write("                            max-width: 800px;\n");
      out.write("                            min-height: 200px;\n");
      out.write("                            max-height: 500px;\n");
      out.write("                            overflow: auto;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        .close-button {\n");
      out.write("                            position: absolute;\n");
      out.write("                            bottom: 0;\n");
      out.write("                            right: 0;\n");
      out.write("                            padding: 10px 20px;\n");
      out.write("                            background-color: #ccc;\n");
      out.write("                            color: #fff;\n");
      out.write("                            cursor: pointer;\n");
      out.write("                        }\n");
      out.write("                    </style>\n");
      out.write("                </section>\n");
      out.write("                <section>\n");
      out.write("                    <style>\n");
      out.write("                        body {\n");
      out.write("                            background-color: #fff; /* chọn màu trắng */\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        section {\n");
      out.write("                            padding: 20px;\n");
      out.write("                            background-color: #f2f2f2;\n");
      out.write("                            border-radius: 5px;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        h2, h3 {\n");
      out.write("                            color: #008000; /* chọn màu xanh lá cây */\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        img {\n");
      out.write("                            margin-right: 10px;\n");
      out.write("                            margin-bottom: 5px;\n");
      out.write("                            border-radius: 5px;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        .meal-category {\n");
      out.write("                            margin-top: 20px;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                        .meal-category h3 {\n");
      out.write("                            margin-bottom: 10px;\n");
      out.write("                        }\n");
      out.write("                    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_5.setPageContext(_jspx_page_context);
      _jspx_th_c_if_5.setParent(null);
      _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USER || not empty sessionScope.ADMIN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_6.setPageContext(_jspx_page_context);
          _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
          _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.MEAL_PLAN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
          if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                            <h2>\n");
              out.write("                                ");

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
                                
              out.write("\n");
              out.write("                            </h2>\n");
              out.write("                            <h3>Your calories estimate: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.numcalo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("</h3>\n");
              out.write("                            ");

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
                            
              out.write("\n");
              out.write("                            <h3>Total food's calories: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.TotalCalories}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("</h3>\n");
              out.write("                            <div class=\"meal-category\">\n");
              out.write("                                <h3>Breakfast</h3>\n");
              out.write("                                ");
              if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                            </div>\n");
              out.write("                            <div class=\"meal-category\">\n");
              out.write("                                <h3>Lunch</h3>\n");
              out.write("                                ");
              if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                            </div>\n");
              out.write("                            <div class=\"meal-category\">\n");
              out.write("                                <h3>Dinner</h3>\n");
              out.write("                                ");
              if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                            </div>\n");
              out.write("                        ");
              int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
            return;
          }
          _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </section>\n");
      out.write("                <!-- ##### Follow Us Instagram Area Start ##### -->\n");
      out.write("                <div class=\"follow-us-instagram\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <h5>Follow Us Instragram</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Instagram Feeds -->\n");
      out.write("                    <div class=\"insta-feeds d-flex flex-wrap\">\n");
      out.write("                        <!-- Single Insta Feeds -->\n");
      out.write("                        <div class=\"single-insta-feeds\">\n");
      out.write("                            <img src=\"img/bg-img/insta1.jpg\" alt=\"\">\n");
      out.write("                            <!-- Icon -->\n");
      out.write("                            <div class=\"insta-icon\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Single Insta Feeds -->\n");
      out.write("                        <div class=\"single-insta-feeds\">\n");
      out.write("                            <img src=\"img/bg-img/insta2.jpg\" alt=\"\">\n");
      out.write("                            <!-- Icon -->\n");
      out.write("                            <div class=\"insta-icon\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Single Insta Feeds -->\n");
      out.write("                        <div class=\"single-insta-feeds\">\n");
      out.write("                            <img src=\"img/bg-img/insta3.jpg\" alt=\"\">\n");
      out.write("                            <!-- Icon -->\n");
      out.write("                            <div class=\"insta-icon\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Single Insta Feeds -->\n");
      out.write("                        <div class=\"single-insta-feeds\">\n");
      out.write("                            <img src=\"img/bg-img/insta4.jpg\" alt=\"\">\n");
      out.write("                            <!-- Icon -->\n");
      out.write("                            <div class=\"insta-icon\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Single Insta Feeds -->\n");
      out.write("                        <div class=\"single-insta-feeds\">\n");
      out.write("                            <img src=\"img/bg-img/insta5.jpg\" alt=\"\">\n");
      out.write("                            <!-- Icon -->\n");
      out.write("                            <div class=\"insta-icon\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Single Insta Feeds -->\n");
      out.write("                        <div class=\"single-insta-feeds\">\n");
      out.write("                            <img src=\"img/bg-img/insta6.jpg\" alt=\"\">\n");
      out.write("                            <!-- Icon -->\n");
      out.write("                            <div class=\"insta-icon\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Single Insta Feeds -->\n");
      out.write("                        <div class=\"single-insta-feeds\">\n");
      out.write("                            <img src=\"img/bg-img/insta7.jpg\" alt=\"\">\n");
      out.write("                            <!-- Icon -->\n");
      out.write("                            <div class=\"insta-icon\">\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ##### Follow Us Instagram Area End ##### -->\n");
      out.write("\n");
      out.write("                <!-- ##### Footer Area Start ##### -->\n");
      out.write("                <footer class=\"footer-area\">\n");
      out.write("                    <div class=\"container h-100\">\n");
      out.write("                        <div class=\"row h-100\">\n");
      out.write("                            <div class=\"col-12 h-100 d-flex flex-wrap align-items-center justify-content-between\">\n");
      out.write("                                <!-- Footer Social Info -->\n");
      out.write("                                <div class=\"footer-social-info text-right\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-behance\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Footer Logo -->\n");
      out.write("                                <div class=\"footer-logo\">\n");
      out.write("                                    <a href=\"homePage.jsp\"><img src=\"img/recipe/logo.png\" alt=\"\"></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("        <!-- ##### All Javascript Files ##### -->\n");
      out.write("        <!-- jQuery-2.2.4 js -->\n");
      out.write("        <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("        <!-- Popper js -->\n");
      out.write("        <script src=\"js/bootstrap/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap js -->\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("        <!-- All Plugins js -->\n");
      out.write("        <script src=\"js/plugins/plugins.js\"></script>\n");
      out.write("        <!-- Active js -->\n");
      out.write("        <script src=\"js/active.js\"></script>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.ADMIN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_0.setVar("customer");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setScope("request");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_1.setVar("customer");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setScope("request");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.ADMIN and empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <li><a href=\"login.jsp\">Login</a></li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.ADMIN or not empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("\n");
        out.write("                                                <li><a href=\"#\">User</a>\n");
        out.write("                                                    <div class=\"megamenu\">\n");
        out.write("                                                        <ul class=\"dropdown\">\n");
        out.write("                                                            <li><a href=\"profile.jsp\">Profile</a></li>\n");
        out.write("                                                            <li><a href=\"setting_interface.jsp\">Setting</a></li>\n");
        out.write("                                                                ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                            <li><a href=\"LogoutController\">Logout</a> </li>\n");
        out.write("                                                        </ul>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </li>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.ADMIN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                <li><a href=\"managerAccount.jsp\">Management Account</a></li>\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_forEach_0.setVar("meal_plan");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.MEAL_PLAN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index < 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <img src=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.imgUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" alt=\"kk\" width=\"100\" height=\"100\">\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" has\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.caloRecipe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" Calories<br>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_forEach_1.setVar("meal_plan");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.MEAL_PLAN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index > 1 && loop.index < 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <img src=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.imgUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" alt=\"kk\" width=\"100\" height=\"100\">\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" has\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.caloRecipe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" Calories<br>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_forEach_2.setVar("meal_plan");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.MEAL_PLAN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index > 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <img src=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.imgUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" alt=\"kk\" width=\"100\" height=\"100\">\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" has\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.caloRecipe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" Calories<br>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USER || not empty sessionScope.ADMIN || (empty sessionScope.USER and empty sessionScope.ADMIN)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.MEAL_PLAN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <h2>You haven't set a meal plan yet!</h2>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }
}

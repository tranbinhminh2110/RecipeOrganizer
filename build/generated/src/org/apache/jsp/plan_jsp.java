package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head >\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title -->\r\n");
      out.write("        <title>Recipe Organize | Plan for healthy</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"icon\" href=\"img/recipe/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_plan.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- Preloader -->\r\n");
      out.write("        <div id=\"preloader\">\r\n");
      out.write("            <i class=\"circle-preloader\"></i>\r\n");
      out.write("            <img src=\"img/recipe/salad.png\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Header Area Start ##### -->\r\n");
      out.write("        <header class=\"header-area\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Top Header Area -->\r\n");
      out.write("            <div class=\"top-header-area\">\r\n");
      out.write("                <div class=\"container h-100\">\r\n");
      out.write("                    <div class=\"row h-100 align-items-center justify-content-between\">\r\n");
      out.write("                        <!-- Breaking News -->\r\n");
      out.write("                        <div class=\"col-12 col-sm-6\">\r\n");
      out.write("                            <div class=\"breaking-news\">\r\n");
      out.write("                                <div id=\"breakingNewsTicker\" class=\"ticker\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        <li><a href=\"#\">Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Welcome to Recipe Organize</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Hi Delicious!</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Top Social Info -->\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Navbar Area -->\r\n");
      out.write("            <div class=\"delicious-main-menu\">\r\n");
      out.write("                <div class=\"classy-nav-container breakpoint-off\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <!-- Menu -->\r\n");
      out.write("                        <nav class=\"classy-navbar justify-content-between\" id=\"deliciousNav\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Logo -->\r\n");
      out.write("                            <a class=\"nav-brand\" href=\"homePage.jsp\"><img src=\"img/recipe/logo.png\" alt=\"\"></a>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Navbar Toggler -->\r\n");
      out.write("                            <div class=\"classy-navbar-toggler\">\r\n");
      out.write("                                <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Menu -->\r\n");
      out.write("                            <div class=\"classy-menu\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- close btn -->\r\n");
      out.write("                                <div class=\"classycloseIcon\">\r\n");
      out.write("                                    <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <!-- Nav Start -->\r\n");
      out.write("                                <div class=\"classynav\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li class=\"active\"><a href=\"homePage.jsp\">Home</a></li>\r\n");
      out.write("                                        <li><a href=\"AllRecipeController\">Recipes</a></li>\r\n");
      out.write("                                        <li><a href=\"favorite.jsp\">Favorite</a></li>\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("                                        \r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Newsletter Form -->\r\n");
      out.write("                                    <div class=\"search-btn\">\r\n");
      out.write("                                        <i></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Nav End -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"breadcumb-area bg-img bg-overlay\" style=\"background-image: url(img/bg-img/breadcumb4.jpg);\">\r\n");
      out.write("                <div class=\"container h-100\">\r\n");
      out.write("                    <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"breadcumb-text text-center\">\r\n");
      out.write("                                <h2>Meal Plan</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <br>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <section>\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    function openPopup() {\r\n");
      out.write("                        document.getElementById(\"popup\").style.display = \"block\";\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    function closePopup() {\r\n");
      out.write("                        document.getElementById(\"popup\").style.display = \"none\";\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    function calculate() {\r\n");
      out.write("                        var your_hope = document.querySelector('input[name=\"goal\"]:checked').value;\r\n");
      out.write("                        var your_gender = document.querySelector('input[name=\"gender\"]:checked').value;\r\n");
      out.write("                        var your_height = document.getElementById('height').value;\r\n");
      out.write("                        var your_weight = document.getElementById('weight').value;\r\n");
      out.write("                        var your_age = document.getElementById('age').value;\r\n");
      out.write("                        var your_activity_level = parseFloat(document.getElementById('activity_level').value);\r\n");
      out.write("                        var BMR;\r\n");
      out.write("                        if (your_height >= 100 && your_height <= 210) {\r\n");
      out.write("                            if (your_weight >= 30 && your_weight <= 180 ) {\r\n");
      out.write("                        if (your_age >= 12 && your_age <= 110){\r\n");
      out.write("                        if (your_gender == \"M\") {\r\n");
      out.write("                            if (your_hope == \"L\") {\r\n");
      out.write("                                BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * (your_activity_level - 0.3);\r\n");
      out.write("                            } else if (your_hope == \"M\") {\r\n");
      out.write("                                BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * (your_activity_level - 0.15);\r\n");
      out.write("                            } else if (your_hope == \"B\") {\r\n");
      out.write("                                BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * your_activity_level;\r\n");
      out.write("                            }\r\n");
      out.write("                        } else {\r\n");
      out.write("                            if (your_hope == \"L\") {\r\n");
      out.write("                                BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * (your_activity_level - 0.3);\r\n");
      out.write("                            } else if (your_hope == \"M\") {\r\n");
      out.write("                                BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * (your_activity_level - 0.15);\r\n");
      out.write("                            } else if (your_hope == \"B\") {\r\n");
      out.write("                                BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * your_activity_level;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    \r\n");
      out.write("                        document.getElementById(\"bmrInput\").value = BMR;\r\n");
      out.write("                        // Close the popup\r\n");
      out.write("                        document.getElementById(\"popup\").style.display = \"none\";\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert (\"Age is 12 - 110\");\r\n");
      out.write("                        }}else {\r\n");
      out.write("                            alert (\"Weight is 30 - 180\");\r\n");
      out.write("                        }\r\n");
      out.write("                            \r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert (\"Height is 100 - 210\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                </script>\r\n");
      out.write("                <div class=\"popup-card\">\r\n");
      out.write("                    <div class=\"form\">\r\n");
      out.write("                        <div class=\"icon\">\r\n");
      out.write("                            <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" viewBox=\"0 0 34 34\" height=\"34\" width=\"34\">\r\n");
      out.write("                            <path stroke-linejoin=\"round\" stroke-width=\"2.5\" stroke=\"#40ba37\"\r\n");
      out.write("                                  d=\"M7.08385 9.91666L5.3572 11.0677C4.11945 11.8929 3.50056 12.3055 3.16517 12.9347C2.82977 13.564 2.83226 14.3035 2.83722 15.7825C2.84322 17.5631 2.85976 19.3774 2.90559 21.2133C3.01431 25.569 3.06868 27.7468 4.67008 29.3482C6.27148 30.9498 8.47873 31.0049 12.8932 31.1152C15.6396 31.1838 18.3616 31.1838 21.1078 31.1152C25.5224 31.0049 27.7296 30.9498 29.331 29.3482C30.9324 27.7468 30.9868 25.569 31.0954 21.2133C31.1413 19.3774 31.1578 17.5631 31.1639 15.7825C31.1688 14.3035 31.1712 13.564 30.8359 12.9347C30.5004 12.3055 29.8816 11.8929 28.6437 11.0677L26.9171 9.91666\">\r\n");
      out.write("                            </path>\r\n");
      out.write("                            <path stroke-linejoin=\"round\" stroke-width=\"2.5\" stroke=\"#40ba37\"\r\n");
      out.write("                                  d=\"M2.83331 14.1667L12.6268 20.0427C14.7574 21.3211 15.8227 21.9603 17 21.9603C18.1772 21.9603 19.2426 21.3211 21.3732 20.0427L31.1666 14.1667\">\r\n");
      out.write("                            </path>\r\n");
      out.write("                            <path stroke-width=\"2.5\" stroke=\"#40ba37\"\r\n");
      out.write("                                  d=\"M7.08331 17V8.50001C7.08331 5.82872 7.08331 4.49307 7.91318 3.66321C8.74304 2.83334 10.0787 2.83334 12.75 2.83334H21.25C23.9212 2.83334 25.2569 2.83334 26.0868 3.66321C26.9166 4.49307 26.9166 5.82872 26.9166 8.50001V17\">\r\n");
      out.write("                            </path>\r\n");
      out.write("                            <path stroke-linejoin=\"round\" stroke-linecap=\"round\" stroke-width=\"2.5\" stroke=\"#40ba37\"\r\n");
      out.write("                                  d=\"M14.1667 14.1667H19.8334M14.1667 8.5H19.8334\"></path>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"note\">\r\n");
      out.write("                            <h4 class=\"title\">Put Your Diet On Autopilot</h4>\r\n");
      out.write("                            <button type=\"button\" class=\"button\" onclick=\"openPopup()\">\r\n");
      out.write("                                <span class=\"button__text\">Not sure?</span>\r\n");
      out.write("                                <span class=\"button__icon\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" viewBox=\"0 0 24 24\"\r\n");
      out.write("                                                                stroke-width=\"2\" stroke-linejoin=\"round\" stroke-linecap=\"round\" stroke=\"currentColor\"\r\n");
      out.write("                                                                height=\"24\" fill=\"none\" class=\"svg\">\r\n");
      out.write("                                    <line y2=\"19\" y1=\"5\" x2=\"12\" x1=\"12\"></line>\r\n");
      out.write("                                    <line y2=\"12\" y1=\"12\" x2=\"19\" x1=\"5\"></line>\r\n");
      out.write("                                    </svg></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <form action=\"DispatchController\" method=\"post\">\r\n");
      out.write("                                <span class=\"subtitle\">I want to eat: </span>\r\n");
      out.write("                                <input type=\"number\" min=\"1500\" max=\"4000\" step=\"any\" pattern=\"[0-9]*\" placeholder=\"####\"\r\n");
      out.write("                                       name=\"numcalo\" id=\"bmrInput\" value=\"0\" class=\"input_field\">\r\n");
      out.write("                                <span class=\"subtitle\"><b>Calories</b></span>\r\n");
      out.write("                                <button type=\"submit\" value=\"Generate\" name=\"btAction\" class=\"submit\">Generate</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"popup\" class=\"modal\">\r\n");
      out.write("                    <div class=\"  modal-dialog \">\r\n");
      out.write("                        <div class =\" modal-content overflow-y-auto \">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Nội dung của cửa sổ popup -->\r\n");
      out.write("                            <div class=\"modal-header\">   \r\n");
      out.write("                                <h3 class=\"modal-title\">Nutrition calculator</h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body  flex-column \">\r\n");
      out.write("                                <!--                                <p>\r\n");
      out.write("                                                                    This calculator uses a standard BMR equation (the Mifflin-St Jeor formula) to estimate your Calorie needs.\r\n");
      out.write("                                                                    We also make some rough macronutrient suggestions, but you're free to completely customize these values\r\n");
      out.write("                                                                    when you create a free account.\r\n");
      out.write("                                                                </p>\r\n");
      out.write("                                                                <p>\r\n");
      out.write("                                                                    <strong>Keep in mind that this is a general estimate.</strong> For best results, consult your healthcare provider.\r\n");
      out.write("                                                                </p>-->\r\n");
      out.write("                                <div class=\"px-6 w-100 \">\r\n");
      out.write("                                    <div class=\" w-100 \">\r\n");
      out.write("                                        <div id=\"\" class=\"btn-group btn-group-toggle d-flex flex-row w-100 align-items-center \" name=\"goal\" data-toggle=\"buttons\">\r\n");
      out.write("                                            <div class=\"w-25\">I want to: </div>\r\n");
      out.write("                                            <div class=\"w-100 d-flex justify-content-between align-items-center \">\r\n");
      out.write("                                                <input type=\"radio\" name=\"goal\" value=\"L\" id=\"c59_goal-0\">Lose weight\r\n");
      out.write("                                                <input type=\"radio\" name=\"goal\" value=\"M\" id=\"c59_goal-1\" checked=\"\">Maintain\r\n");
      out.write("                                                <input type=\"radio\" name=\"goal\" value=\"B\" id=\"c59_goal-2\">Build muscle\r\n");
      out.write("                                            </div> \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"w-100 mt-2\">\r\n");
      out.write("                                    <div id=\"c59_goal\" class=\"btn-group btn-group-toggle w-100 d-flex align-items-center \" name=\"gender\" data-toggle=\"buttons\">\r\n");
      out.write("                                        <div class=\"w-25\">I am: </div>\r\n");
      out.write("                                        <div class=\"w-100 d-flex\">\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                                <input type=\"radio\" name=\"gender\" value=\"M\" id=\"c59_gender-0\" value=\"Male\"/>\r\n");
      out.write("                                                <label for=\"Male\">Male</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"ml-4\" >\r\n");
      out.write("                                                <input type=\"radio\" name=\"gender\" value=\"F\" id=\"c59_gender-1\" checked=\"\" value=\"Female\"/>\r\n");
      out.write("                                                <label for=\"Female\">Female</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"w-100 d-flex  \">\r\n");
      out.write("                                    <div class=\" d-flex align-items-center\">\r\n");
      out.write("                                        <label>Height:</label>\r\n");
      out.write("                                        <input type=\"number\" min=\"100\" max=\"210\" step=\"any\" pattern=\"[0-9]*\" id=\"height\" name=\"height\" value=\"\" class=\"form-control  inline_block ml-15\">\r\n");
      out.write("                                        <label for=\"height-secondary\" class=\"metric_inputs signup_input_label ml-15\">cms</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"w-100 d-flex mt-2 \">\r\n");
      out.write("                                    <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                        <label>Weight:</label>\r\n");
      out.write("                                        <input type=\"number\" min=\"30\" max=\"180\" step=\"any\" pattern=\"[0-9]*\" id=\"weight\" name=\"weight\" value=\"\" class=\"form-control inline_block ml-15\" type=\"number\" >\r\n");
      out.write("                                        <label for=\"weight\" class=\"signup_input_label metric_inputs ml-15\">kgs</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"w-100 d-flex mt-2\">\r\n");
      out.write("                                    <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                        <label>Age:</label>\r\n");
      out.write("                                        <input type=\"number\" min=\"12\" max=\"100\" step=\"any\" pattern=\"[0-9]*\" name=\"age\" id=\"age\" value=\"\" class=\"form-control inline_block ml-30 \" type=\"number\">\r\n");
      out.write("                                        <label for=\"age\" class=\"signup_input_label ml-15\">years</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <br>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"w-100 d-flex mt-2\">\r\n");
      out.write("                                    <label>Activity level:</label>\r\n");
      out.write("                                    <select id=\"activity_level\" class=\"form-control\" name=\"activity_level\">\r\n");
      out.write("                                        <option value=\"1.375\">Lightly Active</option>\r\n");
      out.write("                                        <option value=\"1.55\" selected>Moderately Active</option>\r\n");
      out.write("                                        <option value=\"1.725\">Very Active</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-footer\">\r\n");
      out.write("\r\n");
      out.write("                                <button class=\"py-2 px-4 rounded bg-success text-center text-white \" onclick=\"calculate()\">Calculate</button>\r\n");
      out.write("                                <button class=\"py-2 px-4 rounded  text-center  \" onclick=\"closePopup()\">Close</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <section>\r\n");
      out.write("\r\n");
      out.write("                <!-- Start Today's -->\r\n");
      out.write("                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_6.setPageContext(_jspx_page_context);
      _jspx_th_c_if_6.setParent(null);
      _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USER || not empty sessionScope.ADMIN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_7.setPageContext(_jspx_page_context);
          _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
          _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.MEAL_PLAN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
          if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                        <div class='form-main'>\r\n");
              out.write("                            <div class=\"show-cart-plan\">\r\n");
              out.write("                                <h2>\r\n");
              out.write("                                    ");

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
                                                out.println("<div style='text-align: center; font-family: Times New Roman '>Today's Meal Plan</div>");
                                            }
                                        } else {
                                            RecipeOrganizeDTO admin = (RecipeOrganizeDTO) session.getAttribute("ADMIN");
                                            int adminID = admin.getUserID();
                                            List<RecipeOrganizeDTO> mealplan = dao.getMealPlan(adminID);
                                            if (!mealplan.get(0).getPlanDate().equals(planDate)) {
                                                out.println(mealplan.get(0).getPlanDate());
                                            } else {
                                                out.println("<div style='text-align: center; font-family: Times New Roman'>Today's Meal Plan</div>");
                                            }
                                        }
                                    
              out.write("\r\n");
              out.write("                                </h2>\r\n");
              out.write("                                <p style=\"display: inline-block; font-size: 20px; padding-left: 37% \">|</p>\r\n");
              out.write("                                <p style=\"display: inline-block;text-align: center; color: black; font-family: Times New Roman; font-size: 20px;\">Your Calories Estimate: \r\n");
              out.write("                                    ");

                                        float calo;
                                        if (session.getAttribute("USER") != null) {
                                            RecipeOrganizeDTO user = (RecipeOrganizeDTO) session.getAttribute("USER");
                                            int userID = user.getUserID();
                                            calo = dao.getIndividualCalory(userID);
                                            out.println(calo);
                                        } else {
                                            RecipeOrganizeDTO admin = (RecipeOrganizeDTO) session.getAttribute("ADMIN");
                                            int adminID = admin.getUserID();
                                            calo = dao.getIndividualCalory(adminID);
                                            out.println(calo);
                                        }
                                    
              out.write("\r\n");
              out.write("                                </p>\r\n");
              out.write("                                ");

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
                                
              out.write("\r\n");
              out.write("                                <p style=\"display: inline-block; font-size: 20px;\">|</p>\r\n");
              out.write("                                <p style=\"display: inline-block; color: black; font-family: Times New Roman; font-size: 20px\">Total Food's Calories: ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.TotalCalories}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("</p>\r\n");
              out.write("                            </div>\r\n");
              out.write("                        </div>\r\n");
              out.write("                        <form action=\"RefreshRecipeController\" method=\"POST\">\r\n");
              out.write("                            <div class=\"meal-frame\">\r\n");
              out.write("                                <div class=\"meal-title\"><h2 style=\"color: green; font-family: Times New Roman; text-align: center\">Breakfast</h2></div>\r\n");
              out.write("                                <div style=\"background-color: grey; height: 3px\"></div>\r\n");
              out.write("                                <div style=\"padding-bottom: 15px; padding-top: -5px\"></div>\r\n");
              out.write("                                <div style=\"display: flex; justify-content: center;\">\r\n");
              out.write("                                    <div class=\"container\">\r\n");
              out.write("                                        <div class=\"row meal-items\">\r\n");
              out.write("                                            ");
              if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                        </div>\r\n");
              out.write("                                    </div>\r\n");
              out.write("                                </div>\r\n");
              out.write("                            </div>\r\n");
              out.write("                            <div class=\"meal-frame\">\r\n");
              out.write("                                <div class=\"meal-title\"><h2 style=\"color: green; font-family: Times New Roman; text-align: center\">Lunch</h2></div>\r\n");
              out.write("                                <div style=\"background-color: grey; height: 3px\"></div>\r\n");
              out.write("                                <div style=\"padding-bottom: 15px; padding-top: -5px\"></div>\r\n");
              out.write("                                <div style=\"display: flex; justify-content: center;\">\r\n");
              out.write("                                    <div class=\"container\">\r\n");
              out.write("                                        <div class=\"inline-block-center\">\r\n");
              out.write("                                            <div class=\"row meal-items\">\r\n");
              out.write("                                                ");
              if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                            </div>\r\n");
              out.write("                                        </div>\r\n");
              out.write("                                    </div>\r\n");
              out.write("                                </div>\r\n");
              out.write("                            </div>\r\n");
              out.write("                            <div class=\"meal-frame\">\r\n");
              out.write("                                <div class=\"meal-title\"><h2 style=\"color: green; font-family: Times New Roman; text-align: center\">Dinner</h2></div>\r\n");
              out.write("                                <div style=\"background-color: grey; height: 3px\"></div>\r\n");
              out.write("                                <div style=\"padding-bottom: 15px; padding-top: -5px\"></div>\r\n");
              out.write("                                <div style=\"display: flex; justify-content: center;\">\r\n");
              out.write("                                    <div class=\"container\">\r\n");
              out.write("                                        <div class=\"row meal-items\">\r\n");
              out.write("                                            ");
              if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                        </div> \r\n");
              out.write("                                    </div> \r\n");
              out.write("                                </div> \r\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
            return;
          }
          _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
          out.write("\r\n");
          out.write("\r\n");
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
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- End Today's -->\r\n");
      out.write("            <!-- ##### Follow Us Instagram Area Start ##### -->\r\n");
      out.write("        <div class=\"follow-us-instagram\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <h5>Enjoy Your Passion</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Instagram Feeds -->\r\n");
      out.write("            <div class=\"insta-feeds d-flex flex-wrap\">\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta1.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"DetailController?recipeID=101\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta2.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"DetailController?recipeID=102\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta3.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"DetailController?recipeID=103\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta4.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"DetailController?recipeID=104\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta5.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"DetailController?recipeID=105\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta6.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"DetailController?recipeID=106\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta7.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"DetailController?recipeID=107\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <!-- ##### Follow Us Instagram Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("            <!-- ##### Footer Area Start ##### -->\r\n");
      out.write("            <footer class=\"footer-area\">\r\n");
      out.write("                <div class=\"container h-100\">\r\n");
      out.write("                    <div class=\"row h-100\">\r\n");
      out.write("                        <div class=\"col-12 h-100 d-flex flex-wrap align-items-center justify-content-between\">\r\n");
      out.write("                            <!-- Footer Social Info -->\r\n");
      out.write("                            <!-- Footer Logo -->\r\n");
      out.write("                            <div class=\"footer-logo\">\r\n");
      out.write("                                <a href=\"homePage.jsp\"><img src=\"img/recipe/logo.png\" alt=\"\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("            <!-- ##### All Javascript Files ##### -->\r\n");
      out.write("            <!-- jQuery-2.2.4 js -->\r\n");
      out.write("            <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("            <!-- Popper js -->\r\n");
      out.write("            <script src=\"js/bootstrap/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!-- All Plugins js -->\r\n");
      out.write("            <script src=\"js/plugins/plugins.js\"></script>\r\n");
      out.write("            <!-- Active js -->\r\n");
      out.write("            <script src=\"js/active.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
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
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(empty sessionScope.USER and empty sessionScope.ADMIN) or not empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <li><a href=\"contact.jsp\">Contact</a></li>\r\n");
        out.write("                                        ");
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.ADMIN and empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <li><a href=\"login.jsp\">Login</a></li>\r\n");
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

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.ADMIN or not empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \r\n");
        out.write("\r\n");
        out.write("                                            <li><a href=\"#\">User</a>\r\n");
        out.write("                                                <div class=\"megamenu\">\r\n");
        out.write("                                                    <ul class=\"dropdown\">\r\n");
        out.write("                                                        <li><a href=\"profile.jsp\">Profile</a></li>\r\n");
        out.write("                                                        <li><a href=\"plan.jsp\">Meal Plan</a></li>\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        <li><a href=\"LogoutController\">Logout</a> </li>\r\n");
        out.write("                                                    </ul>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                            </li>\r\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.ADMIN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <li><a href=\"managerAccount.jsp\">Management Account</a></li>\r\n");
        out.write("                                                            <li><a href=\"RecipeManagementController\">Management Recipe</a></li>\r\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forEach_0.setVar("meal_plan");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.MEAL_PLAN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <div class=\"col-12 col-sm-6\">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index < 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <div class=\"row meal-item\">\r\n");
        out.write("                                                            <div class=\"col-12 col-sm-6\">\r\n");
        out.write("                                                                <img src=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.imgUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                            <div class=\"col-12 col-sm-6\">\r\n");
        out.write("                                                                <a href=\"DetailController?recipeID=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"View Product\">\r\n");
        out.write("                                                                    <h4 style=\"font-family: Times New Roman\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\r\n");
        out.write("                                                                </a>\r\n");
        out.write("                                                                <p><b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.caloRecipe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" calories </b></p>\r\n");
        out.write("\r\n");
        out.write("                                                                <button type=\"submit\" name=\"refreshRecipe\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"refresh-button\">\r\n");
        out.write("                                                                    <img src=\"img/recipe/refresh.png\" alt=\"Refresh\">\r\n");
        out.write("                                                                </button>\r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                        </div>\r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forEach_1.setVar("meal_plan");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.MEAL_PLAN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <div class=\"col-12 col-md-6\">\r\n");
          out.write("                                                        ");
          if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                ");
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

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index > 1 && loop.index < 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <div class=\"row meal-item\">\r\n");
        out.write("                                                                <div class=\"col-12 col-md-6\">\r\n");
        out.write("                                                                    <img src=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.imgUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\r\n");
        out.write("                                                                </div>\r\n");
        out.write("                                                                <div class=\"col-12 col-md-6\">\r\n");
        out.write("                                                                    <a href=\"DetailController?recipeID=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"View Product\">\r\n");
        out.write("                                                                        <h4 style=\"font-family: Times New Roman\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\r\n");
        out.write("                                                                    </a>\r\n");
        out.write("                                                                    <p><b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.caloRecipe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" calories </b></p>\r\n");
        out.write("                                                                    <button type=\"submit\" name=\"refreshRecipe\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"refresh-button\">\r\n");
        out.write("                                                                        <img src=\"img/recipe/refresh.png\" alt=\"Refresh\">\r\n");
        out.write("                                                                    </button>\r\n");
        out.write("                                                                </div>    \r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                        ");
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

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forEach_2.setVar("meal_plan");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.MEAL_PLAN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <div class=\"col-12 col-sm-6\">\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index > 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <div class=\"row meal-item\">\r\n");
        out.write("                                                            <div class=\"col-12 col-sm-6\">\r\n");
        out.write("                                                                <img src=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.imgUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\r\n");
        out.write("                                                            </div>\r\n");
        out.write("                                                            <div class=\"col-12 col-sm-6\">\r\n");
        out.write("                                                                <a href=\"DetailController?recipeID=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" title=\"View Product\">\r\n");
        out.write("                                                                    <h4 style=\"font-family: Times New Roman\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\r\n");
        out.write("                                                                </a>\r\n");
        out.write("                                                                <p><b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.caloRecipe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" calories </b></p>\r\n");
        out.write("                                                                <button type=\"submit\" name=\"refreshRecipe\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${meal_plan.recipeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"refresh-button\">\r\n");
        out.write("                                                                    <img src=\"img/recipe/refresh.png\" alt=\"Refresh\">\r\n");
        out.write("                                                                </button>\r\n");
        out.write("                                                            </div>                                               \r\n");
        out.write("                                                        </div>\r\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USER || not empty sessionScope.ADMIN || (empty sessionScope.USER and empty sessionScope.ADMIN)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.MEAL_PLAN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <h2>You haven't set a meal plan yet!</h2>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }
}

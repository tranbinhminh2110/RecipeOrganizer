package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.List;
import team3.recipe.RecipeOrganizeDTO;
import team3.recipe.RecipeOrganizeDTO;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title -->\r\n");
      out.write("        <title>Recipe Organize | Home</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"icon\" href=\"img/recipe/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("                    var result = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reset_password_success}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("                    if (result) {\r\n");
      out.write("                        alert(\"Reset your password successfully.\");\r\n");
      out.write("                    }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Preloader -->\r\n");
      out.write("        <div id=\"preloader\">\r\n");
      out.write("            <i class=\"circle-preloader\"></i>\r\n");
      out.write("            <img src=\"img/recipe/salad.png\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Search Wrapper -->\r\n");
      out.write("        <div class=\"search-wrapper\">\r\n");
      out.write("            <!-- Close Btn -->\r\n");
      out.write("            <div class=\"close-btn\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <form action=\"SearchController\" method=\"post\">\r\n");
      out.write("                            <input type=\"search\" name=\"txtSearch\" placeholder=\"Type any keywords...\">\r\n");
      out.write("                            <button type=\"submit\" name=\"btAction\" value=\"search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
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
      out.write("                    <div class=\"col-12 col-sm-6\">\r\n");
      out.write("                        <div class=\"top-social-info text-right\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-behance\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
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
      out.write("                                \r\n");
      out.write("                                <!-- Nav Start -->\r\n");
      out.write("                                <div class=\"classynav\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li class=\"active\"><a href=\"homePage.jsp\">Home</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Pages</a>\r\n");
      out.write("                                            <ul class=\"dropdown\">\r\n");
      out.write("                                                <li><a href=\"homePage.jsp\">Home</a></li>\r\n");
      out.write("                                                <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                                                <li><a href=\"blog-post.html\">Blog Post</a></li>\r\n");
      out.write("                                                <li><a href=\"recipePost.jsp\">Recipe Post</a></li>\r\n");
      out.write("                                                <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                                                <li><a href=\"elements.html\">Elements</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"#\">Menu</a>\r\n");
      out.write("                                            <div class=\"megamenu\">\r\n");
      out.write("                                                <ul class=\"dropdown\">\r\n");
      out.write("                                                    <li><a href=\"homePage.jsp\">Rice</a></li>\r\n");
      out.write("                                                    <li><a href=\"about.html\">Noodles</a></li>\r\n");
      out.write("                                                    <li><a href=\"blog-post.html\">Cake</a></li>\r\n");
      out.write("                                                    <li><a href=\"receipe-post.html\">Drinks</a></li>\r\n");
      out.write("                                                    <li><a href=\"contact.html\">Dessert</a></li>\r\n");
      out.write("                                                    <li><a href=\"elements.html\">International dishes</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"AllRecipeController\">Recipes</a></li>\r\n");
      out.write("                                        <li><a href=\"searchRecipe.jsp\">Healthy Food</a></li>\r\n");
      out.write("                                        <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("                                        \r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Newsletter Form -->\r\n");
      out.write("                                    <div class=\"search-btn\">\r\n");
      out.write("                                        <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Nav End -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- ##### Header Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Hero Area Start ##### -->\r\n");
      out.write("        <section class=\"hero-area\">\r\n");
      out.write("            <div class=\"hero-slides owl-carousel\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Hero Slide -->\r\n");
      out.write("                <div class=\"single-hero-slide bg-img\" style=\"background-image: url(img/bg-img/bg1.jpg);\">\r\n");
      out.write("                    <div class=\"container h-100\">\r\n");
      out.write("                        <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                            <div class=\"col-12 col-md-9 col-lg-7 col-xl-6\">\r\n");
      out.write("                                <div class=\"hero-slides-content\" data-animation=\"fadeInUp\" data-delay=\"100ms\">\r\n");
      out.write("                                    <h2 data-animation=\"fadeInUp\" data-delay=\"300ms\">Com tam</h2>\r\n");
      out.write("                                    <p data-animation=\"fadeInUp\" data-delay=\"700ms\">Broken rice is considered a specialty dish of Saigon people. Each plate of hot, fragrant broken rice is always the first choice for quick but nutritious meals.</p>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn delicious-btn\" data-animation=\"fadeInUp\" data-delay=\"1000ms\">See Receipe</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Single Hero Slide -->\r\n");
      out.write("                <div class=\"single-hero-slide bg-img\" style=\"background-image: url(img/bg-img/bg6.jpg);\">\r\n");
      out.write("                    <div class=\"container h-100\">\r\n");
      out.write("                        <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                            <div class=\"col-12 col-md-9 col-lg-7 col-xl-6\">\r\n");
      out.write("                                <div class=\"hero-slides-content\" data-animation=\"fadeInUp\" data-delay=\"100ms\">\r\n");
      out.write("                                    <h2 data-animation=\"fadeInUp\" data-delay=\"300ms\">Pho bo</h2>\r\n");
      out.write("                                    <p data-animation=\"fadeInUp\" data-delay=\"700ms\">Pho is a famous Vietnamese dish loved by many people, it will be even more delicious when cooked at home for the family to enjoy. The taste of beef is sweet and nutritious, the noodles are chewy and chewy, and the broth is rich, mixed with the aroma of herbs. Speaking of which, I'm already hungry, don't wait long, let's go to the kitchen to do it right away.</p>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn delicious-btn\" data-animation=\"fadeInUp\" data-delay=\"1000ms\">See Receipe</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Hero Slide -->\r\n");
      out.write("                <div class=\"single-hero-slide bg-img\" style=\"background-image: url(img/bg-img/bg7.jpg);\">\r\n");
      out.write("                    <div class=\"container h-100\">\r\n");
      out.write("                        <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                            <div class=\"col-12 col-md-9 col-lg-7 col-xl-6\">\r\n");
      out.write("                                <div class=\"hero-slides-content\" data-animation=\"fadeInUp\" data-delay=\"100ms\">\r\n");
      out.write("                                    <h2 data-animation=\"fadeInUp\" data-delay=\"300ms\">Milk tea</h2>\r\n");
      out.write("                                    <p data-animation=\"fadeInUp\" data-delay=\"700ms\">Milk tea is the favorite drink of most young people today, not only because of the sweet aroma of tea with milk but also with the diverse combination of unique types of pearls. Today, we will tell you how to make pearl milk tea at home very simple that everyone knows. Go to the kitchen and do it right away!</p>\r\n");
      out.write("                                    <a href=\"#\" class=\"btn delicious-btn\" data-animation=\"fadeInUp\" data-delay=\"1000ms\">See Receipe</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ##### Hero Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Top Catagory Area Start ##### -->\r\n");
      out.write("        <section class=\"top-catagory-area section-padding-80-0\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!-- Top Catagory Area -->\r\n");
      out.write("                    <div class=\"col-12 col-lg-6\">\r\n");
      out.write("                        <div class=\"single-top-catagory\">\r\n");
      out.write("                            <img src=\"img/bg-img/bg2.jpg\" alt=\"\">\r\n");
      out.write("                            <!-- Content -->\r\n");
      out.write("                            <div class=\"top-cta-content\">\r\n");
      out.write("                                <h3>Cake</h3>\r\n");
      out.write("                                <h6>Simple &amp; Delicios</h6>\r\n");
      out.write("                                <a href=\"receipe-post.html\" class=\"btn delicious-btn\">See Full Receipe</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Top Catagory Area -->\r\n");
      out.write("                    <div class=\"col-12 col-lg-6\">\r\n");
      out.write("                        <div class=\"single-top-catagory\">\r\n");
      out.write("                            <img src=\"img/bg-img/bg3.jpg\" alt=\"\">\r\n");
      out.write("                            <!-- Content -->\r\n");
      out.write("                            <div class=\"top-cta-content\">\r\n");
      out.write("                                <h3>International dishes</h3>\r\n");
      out.write("                                <h6>Simple &amp; Delicios</h6>\r\n");
      out.write("                                <a href=\"receipe-post.html\" class=\"btn delicious-btn\">See Full Receipe</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ##### Top Catagory Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Best Receipe Area Start ##### -->\r\n");
      out.write("        <section class=\"best-receipe-area\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"section-heading\">\r\n");
      out.write("                            <h3>The Best Recipes</h3>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                ");

                                    List<RecipeOrganizeDTO> SEARCHRESULTS = (List<RecipeOrganizeDTO>) request.getAttribute("SEARCHRESULTS");
                                    if (SEARCHRESULTS != null) {
                                        for (RecipeOrganizeDTO recipe : SEARCHRESULTS) {
                                            int rating = recipe.getAvgRating();
                                            if (rating >= 4) {
                                
      out.write("\r\n");
      out.write("                                <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                                    <div class=\"single-best-receipe-area mb-30\">\r\n");
      out.write("                                        <img src=\"");
      out.print( recipe.getImgUrl());
      out.write("\" alt=\"\">\r\n");
      out.write("                                        <div class=\"receipe-content\">\r\n");
      out.write("                                            <a href=\"receipe-post.html\">\r\n");
      out.write("                                                <h5>");
      out.print( recipe.getRecipeName());
      out.write("</h5>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            <div class=\"ratings\">\r\n");
      out.write("                                                ");

                                                    for (int i = 0; i < rating; i++) {
                                                
      out.write("\r\n");
      out.write("                                                <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                ");
 } 
      out.write("\r\n");
      out.write("                                                ");

                                                    int remainingStars = 5 - rating;
                                                    for (int i = 0; i < remainingStars; i++) {
                                                
      out.write("\r\n");
      out.write("                                                <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                                ");
 } 
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                ");

                                        }
                                    }
                                } else {
                                
      out.write("\r\n");
      out.write("                                <p>No recipes found.</p>\r\n");
      out.write("                                ");
 }
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ##### Best Receipe Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### CTA Area Start ##### -->\r\n");
      out.write("        <section class=\"cta-area bg-img bg-overlay\" style=\"background-image: url(img/bg-img/bg4.jpg);\">\r\n");
      out.write("            <div class=\"container h-100\">\r\n");
      out.write("                <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <!-- Cta Content -->\r\n");
      out.write("                        <div class=\"cta-content text-center\">\r\n");
      out.write("                            <h2>Healthy Food Recipes</h2>\r\n");
      out.write("                            <p>Healthy foods are foods that are healthy, safe and healthy for the user's body. Using organic foods, natural foods, free of harmful impurities, minimal processing to keep the essence of food are the principles of healthy food. As a result, healthy food brings positive values to users' health.</p>\r\n");
      out.write("                            <a href=\"#\" class=\"btn delicious-btn\">Discover all the receipies</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ##### CTA Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Small Receipe Area Start ##### -->\r\n");
      out.write("        <section class=\"small-receipe-area section-padding-80-0\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    ");

                        if (SEARCHRESULTS != null) {
                            for (RecipeOrganizeDTO recipe : SEARCHRESULTS) {
                                int rating = recipe.getAvgRating();
                                if (rating < 4) {
                    
      out.write("\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"");
      out.print( recipe.getImgUrl());
      out.write("\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>January 04, 2018</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>");
      out.print( recipe.getRecipeName());
      out.write("</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    ");

                                        for (int i = 0; i < rating; i++) {
                                    
      out.write("\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    ");
 } 
      out.write("\r\n");
      out.write("                                    ");

                                        int remainingStars = 5 - rating;
                                        for (int i = 0; i < remainingStars; i++) {
                                    
      out.write("\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    ");
 } 
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>2 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");

                            }
                        }
                    } else {
                    
      out.write("\r\n");
      out.write("                    <p>No recipes found.</p>\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ##### CTA Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Small Receipe Area Start ##### -->\r\n");
      out.write("        <section class=\"small-receipe-area section-padding-80-0\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr1.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>May 10, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Vegan Smoothie</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>586 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr2.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>May 29, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Seaweed dried brown rice</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>205 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr3.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>May 15, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Scalops on salt</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>351 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr4.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>April 04, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Fruits on plate</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>256 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr5.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>May 10, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Pan fried chicken breast</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>492 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr6.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>May 01, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Passion fruit juice</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>456 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr7.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>March 29, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Berry Dessert</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>289 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr8.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>March 20, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Zucchini Grilled on peper</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>397 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Small Receipe Area -->\r\n");
      out.write("                    <div class=\"col-12 col-sm-6 col-lg-4\">\r\n");
      out.write("                        <div class=\"single-small-receipe-area d-flex\">\r\n");
      out.write("                            <!-- Receipe Thumb -->\r\n");
      out.write("                            <div class=\"receipe-thumb\">\r\n");
      out.write("                                <img src=\"img/bg-img/sr9.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Receipe Content -->\r\n");
      out.write("                            <div class=\"receipe-content\">\r\n");
      out.write("                                <span>March 13, 2023</span>\r\n");
      out.write("                                <a href=\"receipe-post.html\">\r\n");
      out.write("                                    <h5>Chicken Salad</h5>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <div class=\"ratings\">\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <i class=\"fa fa-star-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p>687 Comments</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ##### Small Receipe Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Quote Subscribe Area Start ##### -->\r\n");
      out.write("        <section class=\"quote-subscribe-adds\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-end\">\r\n");
      out.write("                    <!-- Quote -->\r\n");
      out.write("                    <div class=\"col-12 col-lg-4\">\r\n");
      out.write("                        <div class=\"quote-area text-center\">\r\n");
      out.write("                            <span>\"</span>\r\n");
      out.write("                            <h4>Nothing is better than going home to family and eating good food and relaxing</h4>\r\n");
      out.write("                            <p>John Smith</p>\r\n");
      out.write("                            <div class=\"date-comments d-flex justify-content-between\">\r\n");
      out.write("                                <div class=\"date\">March 04, 2023</div>\r\n");
      out.write("                                <div class=\"comments\">1056 Comments</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Newsletter -->\r\n");
      out.write("                    <div class=\"col-12 col-lg-4\">\r\n");
      out.write("                        <div class=\"newsletter-area\">\r\n");
      out.write("                            <h4>Subscribe to our newsletter</h4>\r\n");
      out.write("                            <!-- Form -->\r\n");
      out.write("                            <div class=\"newsletter-form bg-img bg-overlay\" style=\"background-image: url(img/bg-img/bg1.jpg);\">\r\n");
      out.write("                                <form action=\"#\" method=\"post\">\r\n");
      out.write("                                    <input type=\"email\" name=\"email\" placeholder=\"Subscribe to newsletter\">\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn delicious-btn w-100\">Subscribe</button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                                <p>With just 5 minutes of operation, you have access to recipes from all over the world. So what are you waiting for without following our newsletter.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Adds -->\r\n");
      out.write("                    <div class=\"col-12 col-lg-4\">\r\n");
      out.write("                        <div class=\"delicious-add\">\r\n");
      out.write("                            <img src=\"img/bg-img/add.png\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- ##### Quote Subscribe Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Follow Us Instagram Area Start ##### -->\r\n");
      out.write("        <div class=\"follow-us-instagram\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <h5>Follow Us Instragram</h5>\r\n");
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
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta2.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta3.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta4.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta5.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta6.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Single Insta Feeds -->\r\n");
      out.write("                <div class=\"single-insta-feeds\">\r\n");
      out.write("                    <img src=\"img/bg-img/insta7.jpg\" alt=\"\">\r\n");
      out.write("                    <!-- Icon -->\r\n");
      out.write("                    <div class=\"insta-icon\">\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ##### Follow Us Instagram Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Footer Area Start ##### -->\r\n");
      out.write("        <footer class=\"footer-area\">\r\n");
      out.write("            <div class=\"container h-100\">\r\n");
      out.write("                <div class=\"row h-100\">\r\n");
      out.write("                    <div class=\"col-12 h-100 d-flex flex-wrap align-items-center justify-content-between\">\r\n");
      out.write("                        <!-- Footer Social Info -->\r\n");
      out.write("                        <div class=\"footer-social-info text-right\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-behance\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Footer Logo -->\r\n");
      out.write("                        <div class=\"footer-logo\">\r\n");
      out.write("                            <a href=\"homePage.jsp\"><img src=\"img/recipe/logo.png\" alt=\"\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- ##### Footer Area Start ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### All Javascript Files ##### -->\r\n");
      out.write("        <!-- jQuery-2.2.4 js -->\r\n");
      out.write("        <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("        <!-- Popper js -->\r\n");
      out.write("        <script src=\"js/bootstrap/popper.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap js -->\r\n");
      out.write("        <script src=\"js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- All Plugins js -->\r\n");
      out.write("        <script src=\"js/plugins/plugins.js\"></script>\r\n");
      out.write("        <!-- Active js -->\r\n");
      out.write("        <script src=\"js/active.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.RESET_PASSWORD_SUCCESS}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
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
    _jspx_th_c_set_0.setVar("reset_password_success");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.RESET_PASSWORD_SUCCESS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.ADMIN}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_set_2.setVar("customer");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_2.setScope("request");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
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
        out.write("                                        \r\n");
        out.write("                                        <li><a href=\"#\">User</a>\r\n");
        out.write("                                            <div class=\"megamenu\">\r\n");
        out.write("                                                <ul class=\"dropdown\">\r\n");
        out.write("                                                    <li><a href=\"profile.jsp\">Profile</a></li>\r\n");
        out.write("                                                    <li><a href=\"setting_interface.jsp\">Setting</a></li>\r\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                    <li><a href=\"LogoutController\">Logout</a> </li>\r\n");
        out.write("                                                </ul>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </li>\r\n");
        out.write("                                            ");
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
        out.write("                                                    <li><a href=\"account_management.jsp\">Management Account</a></li>\r\n");
        out.write("                                                    ");
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
}

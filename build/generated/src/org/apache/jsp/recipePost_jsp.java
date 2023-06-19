package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import team3.recipe.RecipeOrganizeDTO;

public final class recipePost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("        <!-- Title -->\n");
      out.write("        <title>Recipe Organize | Recipe Post</title>\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"icon\" href=\"img/recipe/favicon.ico\">\n");
      out.write("\n");
      out.write("        <!-- Core Stylesheet -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"recipe.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Search Wrapper -->\n");
      out.write("        <div class=\"search-wrapper\">\n");
      out.write("            <!-- Close Btn -->\n");
      out.write("            <div class=\"close-btn\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></div>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <form action=\"SearchController\" method=\"post\">\n");
      out.write("                            <input type=\"search\" name=\"txtSearch\" placeholder=\"Type any keywords...\">\n");
      out.write("                            <button type=\"submit\" name=\"btAction\" value=\"search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- ##### Header Area Start ##### -->\n");
      out.write("        <header class=\"header-area\">\n");
      out.write("\n");
      out.write("            <!-- Navbar Area -->\n");
      out.write("            <div class=\"delicious-main-menu\">\n");
      out.write("                <div class=\"classy-nav-container breakpoint-off\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <!-- Menu -->\n");
      out.write("                        <nav class=\"classy-navbar justify-content-between\" id=\"deliciousNav\">\n");
      out.write("\n");
      out.write("                            <!-- Logo -->\n");
      out.write("                            <a class=\"nav-brand\" href=\"homePage.jsp\"><img src=\"img/recipe/logo.png\" alt=\"\"></a>\n");
      out.write("\n");
      out.write("                            <!-- Navbar Toggler -->\n");
      out.write("                            <div class=\"classy-navbar-toggler\">\n");
      out.write("                                <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Menu -->\n");
      out.write("                            <div class=\"classy-menu\">\n");
      out.write("\n");
      out.write("                                <!-- close btn -->\n");
      out.write("                                <div class=\"classycloseIcon\">\n");
      out.write("                                    <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Nav Start -->\n");
      out.write("                                <div class=\"classynav\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li class=\"active\"><a href=\"homePage.jsp\">Home</a></li>\n");
      out.write("                                        <li><a href=\"#\">Pages</a>\n");
      out.write("                                            <ul class=\"dropdown\">\n");
      out.write("                                                <li><a href=\"homePage.jsp\">Home</a></li>\n");
      out.write("                                                <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("                                                <li><a href=\"blog-post.html\">Blog Post</a></li>\n");
      out.write("                                                <li><a href=\"receipe-post.html\">Recipe Post</a></li>\n");
      out.write("                                                <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                                <li><a href=\"elements.html\">Elements</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"#\">Menu</a>\n");
      out.write("                                            <div class=\"megamenu\">\n");
      out.write("                                                <ul class=\"dropdown\">\n");
      out.write("                                                    <li><a href=\"homePage.jsp\">Rice</a></li>\n");
      out.write("                                                    <li><a href=\"about.html\">Noodles</a></li>\n");
      out.write("                                                    <li><a href=\"blog-post.html\">Cake</a></li>\n");
      out.write("                                                    <li><a href=\"receipe-post.html\">Drinks</a></li>\n");
      out.write("                                                    <li><a href=\"contact.html\">Dessert</a></li>\n");
      out.write("                                                    <li><a href=\"elements.html\">International dishes</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li><a href=\"AllRecipeController\">Recipes</a></li>\n");
      out.write("                                        <li><a href=\"receipe-post.html\">Healthy Food</a></li>\n");
      out.write("                                        <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                    <!-- Newsletter Form -->\n");
      out.write("                                    <div class=\"search-btn\">\n");
      out.write("                                        <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Nav End -->\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- ##### Header Area End ##### -->\n");
      out.write("\n");
      out.write("        <!-- ##### Breadcumb Area Start ##### -->\n");
      out.write("        <div class=\"breadcumb-area bg-img bg-overlay\" style=\"background-image: url(img/bg-img/breadcumb3.jpg);\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <div class=\"row h-100 align-items-center\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"breadcumb-text text-center\">\n");
      out.write("                            <h2>Recipe</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ##### Breadcumb Area End ##### -->\n");
      out.write("\n");
      out.write("        <div class=\"receipe-post-area section-padding-80\">\n");
      out.write("\n");
      out.write("            <!-- Receipe Post Search -->\n");
      out.write("            <div class=\"receipe-post-search mb-80\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <form action=\"SearchController\" method=\"post\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <!-- Recipe Category-->\n");
      out.write("                            <div class=\"col-12 col-lg-4\">\n");
      out.write("                                <ul class=\"category-list\">\n");
      out.write("                                    <select onchange=\"location = this.value;\">\n");
      out.write("                                        <option value=\"CategoryController?categoryID=0\">All Recipe Categories</option>\n");
      out.write("                                        <option value=\"CategoryController?categoryID=1\">Main Dish</option>\n");
      out.write("                                        <option value=\"CategoryController?categoryID=2\">Pasta</option>\n");
      out.write("                                        <option value=\"CategoryController?categoryID=3\">Salad</option>\n");
      out.write("                                        <option value=\"CategoryController?categoryID=4\">Vegetarian</option>\n");
      out.write("                                        <option value=\"CategoryController?categoryID=5\">Dessert</option>\n");
      out.write("                                        <option value=\"CategoryController?categoryID=6\">Bakery</option>\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Recipe Search-->\n");
      out.write("                            <div class=\"col-12 col-lg-4\">\n");
      out.write("                                <input type=\"search\" name=\"txtSearch\" placeholder=\"Search Receipies\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 col-lg-4 text-right\">\n");
      out.write("                                <button type=\"submit\" class=\"btn delicious-btn\" name=\"btAction\" value=\"search\">Search</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Result -->\n");
      out.write("            <div class=\"\">\n");
      out.write("                <div class=\"result\">\n");
      out.write("                    <div class=\"section-heading text-left\">\n");
      out.write("                        <h3>Result</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Comment and Review-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"section-heading text-left\">\n");
      out.write("                    <h3>Leave a comment</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"contact-form-area\">\n");
      out.write("                    <form action=\"#\" method=\"post\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-12 col-lg-6\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 col-lg-6\">\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"E-mail\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"subject\" placeholder=\"Subject\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <textarea name=\"message\" class=\"form-control\" id=\"message\" cols=\"30\" rows=\"10\" placeholder=\"Message\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <button class=\"btn delicious-btn mt-30\" type=\"submit\">Post Comments</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- ##### Follow Us Instagram Area Start ##### -->\n");
      out.write("<div class=\"follow-us-instagram\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <h5>Follow Us Instragram</h5>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Instagram Feeds -->\n");
      out.write("    <div class=\"insta-feeds d-flex flex-wrap\">\n");
      out.write("        <!-- Single Insta Feeds -->\n");
      out.write("        <div class=\"single-insta-feeds\">\n");
      out.write("            <img src=\"img/bg-img/insta1.jpg\" alt=\"\">\n");
      out.write("            <!-- Icon -->\n");
      out.write("            <div class=\"insta-icon\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Single Insta Feeds -->\n");
      out.write("        <div class=\"single-insta-feeds\">\n");
      out.write("            <img src=\"img/bg-img/insta2.jpg\" alt=\"\">\n");
      out.write("            <!-- Icon -->\n");
      out.write("            <div class=\"insta-icon\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Single Insta Feeds -->\n");
      out.write("        <div class=\"single-insta-feeds\">\n");
      out.write("            <img src=\"img/bg-img/insta3.jpg\" alt=\"\">\n");
      out.write("            <!-- Icon -->\n");
      out.write("            <div class=\"insta-icon\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Single Insta Feeds -->\n");
      out.write("        <div class=\"single-insta-feeds\">\n");
      out.write("            <img src=\"img/bg-img/insta4.jpg\" alt=\"\">\n");
      out.write("            <!-- Icon -->\n");
      out.write("            <div class=\"insta-icon\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Single Insta Feeds -->\n");
      out.write("        <div class=\"single-insta-feeds\">\n");
      out.write("            <img src=\"img/bg-img/insta5.jpg\" alt=\"\">\n");
      out.write("            <!-- Icon -->\n");
      out.write("            <div class=\"insta-icon\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Single Insta Feeds -->\n");
      out.write("        <div class=\"single-insta-feeds\">\n");
      out.write("            <img src=\"img/bg-img/insta6.jpg\" alt=\"\">\n");
      out.write("            <!-- Icon -->\n");
      out.write("            <div class=\"insta-icon\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Single Insta Feeds -->\n");
      out.write("        <div class=\"single-insta-feeds\">\n");
      out.write("            <img src=\"img/bg-img/insta7.jpg\" alt=\"\">\n");
      out.write("            <!-- Icon -->\n");
      out.write("            <div class=\"insta-icon\">\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- ##### Follow Us Instagram Area End ##### -->\n");
      out.write("\n");
      out.write("<!-- ##### Footer Area Start ##### -->\n");
      out.write("<footer class=\"footer-area\">\n");
      out.write("    <div class=\"container h-100\">\n");
      out.write("        <div class=\"row h-100\">\n");
      out.write("            <div class=\"col-12 h-100 d-flex flex-wrap align-items-center justify-content-between\">\n");
      out.write("                <!-- Footer Social Info -->\n");
      out.write("                <div class=\"footer-social-info text-right\">\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-behance\" aria-hidden=\"true\"></i></a>\n");
      out.write("                    <a href=\"#\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Footer Logo -->\n");
      out.write("                <div class=\"footer-logo\">\n");
      out.write("                    <a href=\"homePage.jsp\"><img src=\"img/recipe/logo.png\" alt=\"\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<!-- ##### Footer Area Start ##### -->\n");
      out.write("\n");
      out.write("<!-- ##### All Javascript Files ##### -->\n");
      out.write("<!-- jQuery-2.2.4 js -->\n");
      out.write("<script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\n");
      out.write("<!-- Popper js -->\n");
      out.write("<script src=\"js/bootstrap/popper.min.js\"></script>\n");
      out.write("<!-- Bootstrap js -->\n");
      out.write("<script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("<!-- All Plugins js -->\n");
      out.write("<script src=\"js/plugins/plugins.js\"></script>\n");
      out.write("<!-- Active js -->\n");
      out.write("<script src=\"js/active.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listAll}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col-12 col-md-3\">\n");
          out.write("                        <div class=\"card product-container\">\n");
          out.write("                            <img class=\"card-img-top\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.imgUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Card image cap\">\n");
          out.write("                            <div class=\"card-body\">\n");
          out.write("                                <div>\n");
          out.write("                                    <h3 class=\"card-title view-title\"><b><a href=\"DetailController?recipeID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.recipeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.recipeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></b></h3>\n");
          out.write("                                </div>\n");
          out.write("                                <div><p class=\"card-text calo\"><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.caloRecipe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></p></div>\n");
          out.write("                                <div><p class=\"card-text show_txt\" id=\"description\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p></div>\n");
          out.write("                                <div class=\"rating\">\n");
          out.write("                                    <span class=\"star\"><i class=\"fa fa-star\"></i></span>\n");
          out.write("                                    <span class=\"star\"><i class=\"fa fa-star\"></i></span>\n");
          out.write("                                    <span class=\"star\"><i class=\"fa fa-star\"></i></span>\n");
          out.write("                                    <span class=\"star\"><i class=\"fa fa-star\"></i></span>\n");
          out.write("                                    <span class=\"star\"><i class=\"fa fa-star\"></i></span>\n");
          out.write("                                </div>\n");
          out.write("                                <button class=\"add-to-cart-btn\">Favorite</button>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div> \n");
          out.write("                ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

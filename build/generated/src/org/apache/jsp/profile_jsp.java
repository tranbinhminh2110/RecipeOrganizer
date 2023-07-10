package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import team3.recipe.RecipeOrganizeDTO;
import team3.recipe.RecipeOrganizeDAO;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title -->\r\n");
      out.write("        <title>Recipe Organize | Profile</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"icon\" href=\"img/recipe/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                margin-top:20px;\r\n");
      out.write("                background:#f8f8f8\r\n");
      out.write("            }\r\n");
      out.write("        </style> \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- Preloader -->\r\n");
      out.write("        <div id=\"preloader\">\r\n");
      out.write("            <i class=\"circle-preloader\"></i>\r\n");
      out.write("            <img src=\"img/recipe/salad.png\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Search Wrapper -->\r\n");
      out.write("        <div class=\"search-wrapper\">\r\n");
      out.write("            <!-- Close Btn -->\r\n");
      out.write("            <div class=\"close-btn\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <form action=\"#\" method=\"post\">\r\n");
      out.write("                            <input type=\"search\" name=\"search\" placeholder=\"Type any keywords...\">\r\n");
      out.write("                            <button type=\"submit\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></button>\r\n");
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
      out.write("                        <div class=\"col-12 col-sm-6\">\r\n");
      out.write("                            <div class=\"top-social-info text-right\">\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-behance\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
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
      out.write("                                <!-- Nav Start -->\r\n");
      out.write("                                <div class=\"classynav\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li class=\"active\"><a href=\"homePage.jsp\">Home</a></li>\r\n");
      out.write("                                        <li><a href=\"AllRecipeController\">Recipes</a></li>\r\n");
      out.write("                                        <li><a href=\"searchRecipe.jsp\">Healthy Food</a></li>\r\n");
      out.write("                                        <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                                        <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
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
      out.write("\r\n");
      out.write("            <div class=\"breadcumb-area bg-img bg-overlay\" style=\"background-image: url(img/bg-img/breadcumb4.jpg);\">\r\n");
      out.write("                <div class=\"container h-100\">\r\n");
      out.write("                    <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"breadcumb-text text-center\">\r\n");
      out.write("                                <h2>Profile</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <br>\r\n");
      out.write("        </header>\r\n");
      out.write("        <header>\r\n");
      out.write("            ");

                RecipeOrganizeDTO user = (RecipeOrganizeDTO) session.getAttribute("USER");
                RecipeOrganizeDTO admin = (RecipeOrganizeDTO) session.getAttribute("ADMIN");
                if (user != null || admin != null) {
                    if (user != null && admin == null) {

            
      out.write("\r\n");
      out.write("            <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row flex-lg-nowrap\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col mb-3\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"e-profile\">                                            \r\n");
      out.write("                                            <form action=\"ChangePhotoProfileController\" method = \"post\"> \r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-12 col-sm-auto mb-3\">\r\n");
      out.write("                                                        <div class=\"mx-auto\" style=\"width: 140px;\">\r\n");
      out.write("                                                            <div class=\"d-flex justify-content-center align-items-center rounded\" style=\"height: 140px; background-color: rgb(233, 236, 239);\">\r\n");
      out.write("                                                                ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                                ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col d-flex flex-column flex-sm-row justify-content-between mb-3\">\r\n");
      out.write("                                                        <div class=\"text-center text-sm-left mb-2 mb-sm-0\">\r\n");
      out.write("                                                            <h4 class=\"pt-sm-2 pb-1 mb-0 text-nowrap\">");
      out.print( user.getFullName());
      out.write("</h4>\r\n");
      out.write("                                                            <p class=\"mb-0\">Fullname: ");
      out.print( user.getFullName());
      out.write("</p>\r\n");
      out.write("                                                            <p class=\"mb-0\">Phone: ");
      out.print( user.getPhone());
      out.write("</p>\r\n");
      out.write("                                                            <p class=\"mb-0\">Email: ");
      out.print( user.getEmail());
      out.write("</p>\r\n");
      out.write("                                                            <div class=\"mt-2\">\r\n");
      out.write("                                                                <button class=\"btn btn-primary\" type=\"file\" accept=\".jpg,.png\">\r\n");
      out.write("                                                                    <i class=\"fa fa-fw fa-camera\"></i>\r\n");
      out.write("                                                                    <span>Change Photo</span>\r\n");
      out.write("                                                                </button>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                                                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("                <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row flex-lg-nowrap\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col mb-3\">\r\n");
      out.write("                                    <div class=\"card\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <div class=\"e-profile\">\r\n");
      out.write("\r\n");
      out.write("                                                <form action=\"ChangePhotoProfileController\" method = \"post\"> \r\n");
      out.write("                                                    <div class=\"row\">\r\n");
      out.write("                                                        <div class=\"col-12 col-sm-auto mb-3\">\r\n");
      out.write("                                                            <div class=\"mx-auto\" style=\"width: 140px;\">\r\n");
      out.write("                                                                <div class=\"d-flex justify-content-center align-items-center rounded\" style=\"height: 140px; background-color: rgb(233, 236, 239);\">\r\n");
      out.write("                                                                    ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                                    ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"col d-flex flex-column flex-sm-row justify-content-between mb-3\">\r\n");
      out.write("                                                            <div class=\"text-center text-sm-left mb-2 mb-sm-0\">\r\n");
      out.write("                                                                <h4 class=\"pt-sm-2 pb-1 mb-0 text-nowrap\">");
      out.print( admin.getFullName());
      out.write("</h4>\r\n");
      out.write("                                                                <p class=\"mb-0\">Fullname: ");
      out.print( admin.getFullName());
      out.write("</p>\r\n");
      out.write("                                                                <p class=\"mb-0\">Phone: ");
      out.print( admin.getPhone());
      out.write("</p>\r\n");
      out.write("                                                                <p class=\"mb-0\">Email: ");
      out.print( admin.getEmail());
      out.write("</p>\r\n");
      out.write("                                                                <div class=\"mt-2\">\r\n");
      out.write("                                                                    <button class=\"btn btn-primary\" type=\"file\" accept=\".jpg,.png\">\r\n");
      out.write("                                                                        <i class=\"fa fa-fw fa-camera\"></i>\r\n");
      out.write("                                                                        <span>Change Photo</span>\r\n");
      out.write("                                                                    </button>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </form>\r\n");
      out.write("\r\n");
      out.write("                                                ");
 } 
      out.write("\r\n");
      out.write("                                                ");
 String message1 = (String) request.getAttribute("message1"); 
      out.write("\r\n");
      out.write("                                                ");
 if (message1 != null) {
      out.write("\r\n");
      out.write("                                                <p style=\"color: red;\">");
      out.print( message1);
      out.write("</p>\r\n");
      out.write("                                                ");
 }
      out.write("  \r\n");
      out.write("                                                ");
 String message2 = (String) request.getAttribute("message2"); 
      out.write("\r\n");
      out.write("                                                ");
 if (message2 != null) {
      out.write("\r\n");
      out.write("                                                <p style=\"color: red;\">");
      out.print( message2);
      out.write("</p>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("                                                ");
 String message3 = (String) request.getAttribute("message3"); 
      out.write("\r\n");
      out.write("                                                ");
 if (message3 != null) {
      out.write("\r\n");
      out.write("                                                <p style=\"color: red;\">");
      out.print( message3);
      out.write("</p>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("                                                ");
 String message4 = (String) request.getAttribute("message4"); 
      out.write("\r\n");
      out.write("                                                ");
 if (message4 != null) {
      out.write("\r\n");
      out.write("                                                <p style=\"color: red;\">");
      out.print( message4);
      out.write("</p>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("                                                ");
 String message5 = (String) request.getAttribute("message5"); 
      out.write("\r\n");
      out.write("                                                ");
 if (message5 != null) {
      out.write("\r\n");
      out.write("                                                <p style=\"color: green;\">");
      out.print( message5);
      out.write("</p>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("                                                ");
 String message6 = (String) request.getAttribute("message6"); 
      out.write("\r\n");
      out.write("                                                ");
 if (message6 != null) {
      out.write("\r\n");
      out.write("                                                <p style=\"color: green;\">");
      out.print( message6);
      out.write("</p>\r\n");
      out.write("                                                ");
 }
      out.write("\r\n");
      out.write("                                                <ul class=\"nav nav-tabs\">\r\n");
      out.write("                                                    <li class=\"nav-item\"><a href=\"\" class=\"active nav-link\">Update Profile</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                                <div class=\"tab-content pt-3\">\r\n");
      out.write("                                                    <div class=\"tab-pane active\">\r\n");
      out.write("                                                        <form action=\"DispatchController\" method=\"post\" class=\"form\" novalidate=\"\">\r\n");
      out.write("                                                            <div class=\"row\">\r\n");
      out.write("                                                                <div class=\"col\">\r\n");
      out.write("                                                                    <div class=\"row\">\r\n");
      out.write("                                                                        <div class=\"col\">\r\n");
      out.write("                                                                            <div class=\"form-group\">\r\n");
      out.write("                                                                                <label>Full Name</label>\r\n");
      out.write("                                                                                <input class=\"form-control\" type=\"text\" name=\"txtFullname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtFullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"1 - 50 characters\">\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                        <div class=\"col\">\r\n");
      out.write("                                                                            <div class=\"form-group\">\r\n");
      out.write("                                                                                <label>Phone</label>\r\n");
      out.write("                                                                                <input class=\"form-control\" type=\"text\" name=\"txtPhone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"row\">\r\n");
      out.write("                                                                        <div class=\"col\">\r\n");
      out.write("                                                                            <div class=\"form-group\">\r\n");
      out.write("                                                                                <label>Email</label>\r\n");
      out.write("                                                                                <input class=\"form-control\" type=\"text\" name=\"txtEmail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"your email\">\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div>\r\n");
      out.write("                                                                        <input type=\"submit\" value =\"Update\" name=\"btAction\" class=\"btn btn-primary\">\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div> \r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </form>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"tab-content pt-3\">\r\n");
      out.write("                                                    <div class=\"tab-pane active\">\r\n");
      out.write("                                                        <form action=\"DispatchController\" method=\"post\" class=\"form\" novalidate=\"\">\r\n");
      out.write("                                                            <div class=\"row\">\r\n");
      out.write("                                                                <div class=\"col-12 col-sm-6 mb-3\">\r\n");
      out.write("                                                                    <div class=\"mb-2\"><b>Change Password</b></div>\r\n");
      out.write("                                                                    <div class=\"row\">\r\n");
      out.write("                                                                        <div class=\"col\">\r\n");
      out.write("                                                                            <div class=\"form-group\">\r\n");
      out.write("                                                                                <label>Username</label>\r\n");
      out.write("                                                                                <input class=\"form-control\" type=\"text\" name=\"txtUsername\" placeholder=\"Enter a username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"row\">\r\n");
      out.write("                                                                        <div class=\"col\">\r\n");
      out.write("                                                                            <div class=\"form-group\">\r\n");
      out.write("                                                                                <label>Current Password</label>\r\n");
      out.write("                                                                                <input class=\"form-control\" type=\"password\" name=\"txtCurrentPassword\" placeholder=\"Enter a current password\">\r\n");
      out.write("                                                                                <font color=\"red\">\r\n");
      out.write("                                                                                ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                                                </font>\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"row\">\r\n");
      out.write("                                                                        <div class=\"col\">\r\n");
      out.write("                                                                            <div class=\"form-group\">\r\n");
      out.write("                                                                                <label>New Password</label>\r\n");
      out.write("                                                                                <input class=\"form-control\" type=\"password\" name=\"txtNewPassword\" placeholder=\"Enter a new password\">\r\n");
      out.write("                                                                                <font color=\"red\">                                                                                     \r\n");
      out.write("                                                                                ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                                                </font>\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                            <div class=\"row\">\r\n");
      out.write("                                                                <div class=\"col d-flex justify-content-end\">\r\n");
      out.write("                                                                    <input type=\"submit\" value =\"Save\" name=\"btAction\" class=\"btn btn-primary\">\r\n");
      out.write("\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-12 col-md-3 mb-3\">\r\n");
      out.write("                                    <form action=\"DispatchController\" method =\"post\">\r\n");
      out.write("                                        <div class=\"card mb-3\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                <div class=\"px-xl-3\">\r\n");
      out.write("                                                    <button class=\"btn btn-block btn-secondary\">\r\n");
      out.write("                                                        <i class=\"fa fa-sign-out\"></i>\r\n");
      out.write("                                                        <span>Back</span>\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"card\">\r\n");
      out.write("                                        <div class=\"card-body\">\r\n");
      out.write("                                            <h6 class=\"card-title font-weight-bold\">Support</h6>\r\n");
      out.write("                                            <p class=\"card-text\">Get fast, free help from our friendly assistants.</p>\r\n");
      out.write("                                            <a href=\"contact.html\" class=\"btn btn-primary\">Contact Us</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("                <p>Cannot find user with username ");
      out.print( request.getParameter("txtUsername"));
      out.write("</p>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </header>\r\n");
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
      out.write("\r\n");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.ADMIN and empty sessionScope.USER}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <li><a href=\"login.jsp\">Login</a></li>\r\n");
        out.write("                                            ");
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
        out.write("    \r\n");
        out.write("\r\n");
        out.write("                                            <li><a href=\"#\">User</a>\r\n");
        out.write("                                                <div class=\"megamenu\">\r\n");
        out.write("                                                    <ul class=\"dropdown\">\r\n");
        out.write("                                                        <li><a href=\"profile.jsp\">Profile</a></li>\r\n");
        out.write("                                                        <li><a href=\"setting_interface.jsp\">Setting</a></li>\r\n");
        out.write("                                                        <li><a href=\"plan.jsp\">Meal Planer</a></li>\r\n");
        out.write("                                                            ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                        <li><a href=\"LogoutController\">Logout</a> </li>\r\n");
        out.write("                                                    </ul>\r\n");
        out.write("                                                </div>\r\n");
        out.write("                                            </li>\r\n");
        out.write("                                        ");
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
        out.write("\r\n");
        out.write("                                                            <li><a href=\"managerAccount.jsp\">Management Account</a></li>\r\n");
        out.write("                                                            ");
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

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER.image_path == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <img src=\"img/recipe/default-user.jpg\" alt=\"hình ảnh\" width=\"140\" height=\"140\"/>\r\n");
        out.write("                                                                ");
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

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER.image_path != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                    <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER.image_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" alt=\"picture\" width=\"140\" height=\"140\" />\r\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN.image_path == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                        <img src=\"img/recipe/default-user.jpg\" alt=\"hình ảnh\" width=\"140\" height=\"140\"/>\r\n");
        out.write("                                                                    ");
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

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN.image_path != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                        <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ADMIN.image_path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" alt=\"picture\" width=\"140\" height=\"140\" />\r\n");
        out.write("                                                                    ");
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

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty message8}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message8}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <br/>\r\n");
        out.write("                                                                                ");
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
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty message7}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message7}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <br/>\r\n");
        out.write("                                                                                ");
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
}

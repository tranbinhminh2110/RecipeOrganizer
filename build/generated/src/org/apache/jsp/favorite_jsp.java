package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import team3.recipe.RecipeOrganizeDAO;
import team3.recipe.RecipeOrganizeDTO;
import team3.DTO.FavoriteDTO;
import java.util.List;

public final class favorite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Title -->\r\n");
      out.write("        <title> Favorite </title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"icon\" href=\"img/recipe/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Core Stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/recipe.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/favorite.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <!-- Preloader -->\r\n");
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
      out.write("                                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        <li><a href=\"plan.jsp\">Meal Plan</a></li>\r\n");
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
      out.write("        </header>\r\n");
      out.write("        <!-- ##### Header Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <!-- ##### Breadcumb Area Start ##### -->\r\n");
      out.write("        <div class=\"breadcumb-area bg-img bg-overlay\" style=\"background-image: url(img/bg-img/breadcumb3.jpg);\">\r\n");
      out.write("            <div class=\"container h-100\">\r\n");
      out.write("                <div class=\"row h-100 align-items-center\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"breadcumb-text text-center\">\r\n");
      out.write("                            <h2>Recipe</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- ##### Breadcumb Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"receipe-post-area section-padding-80\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Receipe Post Search -->\r\n");
      out.write("            <div class=\"receipe-post-search mb-80\">\r\n");
      out.write("                ");

                     RecipeOrganizeDTO admin = (RecipeOrganizeDTO) session.getAttribute("ADMIN");
                    RecipeOrganizeDTO user = (RecipeOrganizeDTO) session.getAttribute("USER");

                    if (user != null || admin != null) {
                        
      out.write("\r\n");
      out.write("                        <h4 style=\"font-family: sans-serif; margin-bottom: 5px;\">Your Favorite Recipe</h4>\r\n");
      out.write("                ");

                        RecipeOrganizeDAO dao = new RecipeOrganizeDAO();
                    if (user != null ) {
                        dao.AllFavorite(user.getUserID());
                    } else if (admin != null) {
                        dao.AllFavorite(admin.getUserID());
                    }

                    List<FavoriteDTO> result = dao.getListFavorite();
                    if (result != null) {
                
      out.write("\r\n");
      out.write("                <table border=\"1\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Recipe ID</th>\r\n");
      out.write("                            <th>Recipe Name</th>\r\n");
      out.write("                            <th>Image</th>\r\n");
      out.write("                            <th>Remove Favorite</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

                            for (FavoriteDTO dto : result) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td style=\"width: 15px\">\r\n");
      out.write("                                ");
      out.print( dto.getRecipeID());
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <a href=\"DetailController?recipeID=");
      out.print( dto.getRecipeID());
      out.write("\" >");
      out.print( dto.getRecipeName());
      out.write("</a>\r\n");
      out.write("                            </td>\r\n");
      out.write("\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <a href=\"DetailController?recipeID=");
      out.print( dto.getRecipeID());
      out.write("\" ><img style=\"width: 300px; height: 300px;\" src=\"");
      out.print(dto.getImgUrl());
      out.write("\" alt=\"\" /></a>\r\n");
      out.write("                            </td>\r\n");
      out.write("\r\n");
      out.write("                            <td> \r\n");
      out.write("                                <form action=\"DispatchController\" method=\"POST\">\r\n");
      out.write("                                    ");

                                        if (user != null) {
                                    
      out.write("\r\n");
      out.write("                                    <input type=\"hidden\" name=\"txtUserID\" value=\"");
      out.print( user.getUserID());
      out.write("\" />\r\n");
      out.write("                                    ");

                                    } else if (admin != null) {
                                    
      out.write("\r\n");
      out.write("                                    <input type=\"hidden\" name=\"txtUserID\" value=\"");
      out.print( admin.getUserID());
      out.write("\" />\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                                    <input type=\"hidden\" name=\"txtRecipeID\" value=\"");
      out.print( dto.getRecipeID());
      out.write("\" />\r\n");
      out.write("                                    <input type=\"submit\" value=\"Remove\" name=\"btAction\" />\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </td>\r\n");
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("                <h2>\r\n");
      out.write("                    No favorite\r\n");
      out.write("                </h2>\r\n");
      out.write("                ");

                    }
                } else {
                
      out.write("\r\n");
      out.write("                <h4>You need login</h4>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("                            <!-- Footer Logo -->\r\n");
      out.write("                            <div class=\"footer-logo\">\r\n");
      out.write("                                <a href=\"homePage.jsp\"><img src=\"img/recipe/logo.png\" alt=\"\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!-- ##### Footer Area Start ##### -->\r\n");
      out.write("\r\n");
      out.write("            <!-- ##### All Javascript Files ##### -->\r\n");
      out.write("            <!-- jQuery-2.2.4 js -->\r\n");
      out.write("            <script src=\"js/jquery/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("            <!-- Popper js -->\r\n");
      out.write("            <script src=\"js/bootstrap/popper.min.js\"></script>\r\n");
      out.write("            <!-- Bootstrap js -->\r\n");
      out.write("            <script src=\"js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("            <!-- All Plugins js -->\r\n");
      out.write("            <script src=\"js/plugins/plugins.js\"></script>\r\n");
      out.write("            <!-- Active js -->\r\n");
      out.write("            <script src=\"js/active.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
        out.write("                                            <li><a href=\"contact.jsp\">Contact</a></li>\r\n");
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
}
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("<!--\r\n");
      out.write("Author: Colorlib\r\n");
      out.write("Author URL: https://colorlib.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Creative Colorlib SignUp Form</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <!-- Custom Theme files -->\r\n");
      out.write("        <link href=\"style_signup.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <!-- //Custom Theme files -->\r\n");
      out.write("        <!-- web font -->\r\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- //web font -->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- main -->\r\n");
      out.write("        <div class=\"main-w3layouts wrapper\">\r\n");
      out.write("            <h1>Creative SignUp Form</h1>\r\n");
      out.write("            <div class=\"main-agileinfo\">\r\n");
      out.write("                <div class=\"agileits-top\">\r\n");
      out.write("                    <form action=\"DispatchController\" method=\"post\">\r\n");
      out.write("                        <input class=\"text\" type=\"text\" name=\"txtusername\" placeholder=\"Username\" required=\"\">\r\n");
      out.write("                        <input class=\"text\" type=\"password\" name=\"txtpassword\" placeholder=\"Password\" required=\"\">\r\n");
      out.write("                        <input class=\"text w3lpass\" type=\"password\" name=\"txtrepassword\" placeholder=\"Confirm Password\" required=\"\">\r\n");
      out.write("                        <input class=\"text\" type=\"text\" name=\"txtfullname\" placeholder=\"FullName\" required=\"\">\r\n");
      out.write("                        <input class=\"text\" type=\"text\" name=\"txtphone\" placeholder=\"Phone\" required=\"\">\r\n");
      out.write("                        <div class=\"wthree-text\">\r\n");
      out.write("                            <label class=\"anim\">\r\n");
      out.write("                                <input type=\"checkbox\" class=\"checkbox\" required=\"\">\r\n");
      out.write("                                <span>I Agree To The Terms & Conditions</span>\r\n");
      out.write("                            </label>\r\n");
      out.write("                            <div class=\"clear\"> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"submit\" value=\"SIGNUP\" name=\"btAction\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <p>Don't have an Account? <a href=\"login.jsp\"> Login Now!</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"colorlib-bubbles\">\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("                <li></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
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
}

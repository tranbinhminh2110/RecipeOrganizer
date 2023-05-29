package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Login page</title>      \n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900'\n");
      out.write("              rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css.css\">\n");
      out.write("        <!--Specify app's client ID--> \n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"555035018766-035ln8ai7e46bk1gltin1pmc3s9uv6g5.apps.googleusercontent.com\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js\"></script>\n");
      out.write("        <!--Google Platform library-->\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("        <!--Google Recaptcha-->\n");
      out.write("        <script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"login-box animated fadeInUp\" id=\"login\">\n");
      out.write("                <div class=\"box-header\">\n");
      out.write("                    <h2>Log In</h2>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"mainController\" method = \"post\" class=\"formlogin\">\n");
      out.write("                <font style='color:red;'>");
      out.print( (request.getAttribute("WARNING")==null)?"":(String)request.getAttribute("WARNING") );
      out.write(" </font>\n");
      out.write("\n");
      out.write("                     <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"text\" name =\"txtemail\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"password\" name =\"txtpassword\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td colspan=\"2\"><input type=\"submit\" value =\"login\" name=\"action\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td colspan=\"2\"><input type=\"checkbox\" value =\"savelogin\" name=\"savelogin\">Stayed signed in</td>\n");
      out.write("                   </tr>\n");
      out.write("                   </table>\n");
      out.write("                </form>\t\t\n");
      out.write("                <div class=\"small\">\n");
      out.write("                    <p>Don’t you have an account? <a href=\"registration.jsp\">Sign up</a></p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <br/>\n");
      out.write("              \n");
      out.write("                <!--Sign in google button-->             \n");
      out.write("                <div id=\"my-signin2\" data-onsuccess=\"onSignIn\"></div>  \n");
      out.write("                <!--Recaptcha-->\n");
      out.write("                <div class=\"g-recaptcha\" data-sitekey=\"6Lfgcr4gAAAAACF-d6wRjCIvvYwqn8cwCLyNy9HP\"></div> \n");
      out.write("            </div>\t\t\n");
      out.write("        </div>\n");
      out.write("        <!--Sign in google function-->\n");
      out.write("        <script>\n");
      out.write("            function onSuccess(googleUser) {\n");
      out.write("                console.log('Logged in as: ' + googleUser.getBasicProfile().getName());\n");
      out.write("            }\n");
      out.write("            function onFailure(error) {\n");
      out.write("                console.log(error);\n");
      out.write("            }\n");
      out.write("            function renderButton() {\n");
      out.write("                gapi.signin2.render('my-signin2', {\n");
      out.write("                    'scope': 'profile email',\n");
      out.write("                    'width': 240,\n");
      out.write("                    'height': 50,\n");
      out.write("                    'longtitle': true,\n");
      out.write("                    'theme': 'dark',\n");
      out.write("                    'onsuccess': onSuccess,\n");
      out.write("                    'onfailure': onFailure\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            function onSignIn(googleUser) {\n");
      out.write("                var profile = googleUser.getBasicProfile();\n");
      out.write("                console.log('ID: ' + profile.getId());\n");
      out.write("                console.log('Name: ' + profile.getName());\n");
      out.write("                console.log('Image URL: ' + profile.getImageUrl());\n");
      out.write("                console.log('Email: ' + profile.getEmail());\n");
      out.write("                window.location.href='loginServlet?action=Google&name='+reponse.name+'&email='+response.email+'&id='+response.id;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js?onload=renderButton\" async defer></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

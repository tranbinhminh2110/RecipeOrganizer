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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=1,initial-scale=1,user-scalable=1\" />\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style_login.css\" />\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Lato:100italic,100,300italic,300,400italic,400,700italic,700,900italic,900\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <!-- jQuery Library -->\n");
      out.write("        <script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/1.10.0/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap Core JS -->\n");
      out.write("        <script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900'\n");
      out.write("              rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css.css\">\n");
      out.write("        <meta name=\"google-signin-client_id\" content=\"555035018766-035ln8ai7e46bk1gltin1pmc3s9uv6g5.apps.googleusercontent.com\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("        <script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"logo-container\">\n");
      out.write("            <img src=\"img/core-img/logo.png\" alt=\"Logo\"/><br/>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <section class=\"login-form\">\n");
      out.write("                <form method=\"post\" action=\"DispatchController\" role=\"login\">\n");
      out.write("                    <h2><b>Sign In</b></h2 >\n");
      out.write("                    <div class=\"aleart alert-danger\" role=\"alert\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <img src=\"images/user.png\" alt=\"\" />\n");
      out.write("                    <input type=\"text\" name=\"txtUsername\" required placeholder=\"Username\" class=\"form-control input-lg\" /><br/>\n");
      out.write("                    <input type=\"password\" name=\"txtPassword\" required placeholder=\"Password\" class=\"form-control input-lg\" /><br/>\n");
      out.write("                    <button type=\"submit\" value =\"Login\" name=\"btAction\" class=\"btn btn-block btn-info\">Sign in</button>\n");
      out.write("                    <input type=\"checkbox\" name=\"remember\" value=\"1\" checked /> Stay signed in\n");
      out.write("                    <a href=\"#\" class=\"pull-right\">Need help?</a>\n");
      out.write("                </form>\n");
      out.write("                <section>\n");
      out.write("                    <a href=\"registration.jsp\">Create an account</a>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
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
      out.write("                window.location.href = 'loginServlet?action=Google&name=' + reponse.name + '&email=' + response.email + '&id=' + response.id;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js?onload=renderButton\" async defer></script>\n");
      out.write("    </body>\n");
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

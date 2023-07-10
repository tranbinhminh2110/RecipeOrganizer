package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class popup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("                            <style>\n");
      out.write("                .popup {\n");
      out.write("                    display: none;\n");
      out.write("                    position: fixed;\n");
      out.write("                    top: 0;\n");
      out.write("                    left: 0;\n");
      out.write("                    width: 100%;\n");
      out.write("                    height: 100%;\n");
      out.write("                    background-color: rgba(0, 0, 0, 0.5); /* Màu nền của overlay */\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .popup-content {\n");
      out.write("                    position: absolute;\n");
      out.write("                    top: 50%;\n");
      out.write("                    left: 50%;\n");
      out.write("                    transform: translate(-50%, -50%);\n");
      out.write("                    background-color: #fff;\n");
      out.write("                    padding: 20px;\n");
      out.write("                    min-width: 300px; /* Chiều rộng tối thiểu */\n");
      out.write("                    max-width: 800px; /* Chiều rộng tối đa */\n");
      out.write("                    min-height: 200px; /* Chiều cao tối thiểu */\n");
      out.write("                    max-height: 500px; /* Chiều cao tối đa */\n");
      out.write("                    overflow: auto; /* Hiển thị thanh cuộn khi nội dung vượt quá kích thước */\n");
      out.write("                }\n");
      out.write("                .close-button {\n");
      out.write("                    position: absolute;\n");
      out.write("                    bottom: 0;\n");
      out.write("                    right: 0;\n");
      out.write("                    padding: 10px 20px;\n");
      out.write("                    background-color: #ccc;\n");
      out.write("                    color: #fff;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            <script>\n");
      out.write("                function openPopup() {\n");
      out.write("                    document.getElementById(\"popup\").style.display = \"block\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function closePopup() {\n");
      out.write("                    document.getElementById(\"popup\").style.display = \"none\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function calculate() {\n");
      out.write("                    var your_hope = document.querySelector('input[name=\"goal\"]:checked').value;\n");
      out.write("                    var your_gender = document.querySelector('input[name=\"gender\"]:checked').value;\n");
      out.write("                    var your_height = document.getElementById('height').value;\n");
      out.write("                    var your_weight = document.getElementById('weight').value;\n");
      out.write("                    var your_age = document.getElementById('age').value;\n");
      out.write("                    var your_activity_level = parseFloat(document.getElementById('activity_level').value);\n");
      out.write("                    var BMR;\n");
      out.write("                    if (your_gender == \"M\") {\n");
      out.write("                        if (your_hope == \"L\") {\n");
      out.write("                            BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * (your_activity_level - 0.3);\n");
      out.write("                        } else if (your_hope == \"M\") {\n");
      out.write("                            BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * your_activity_level;\n");
      out.write("                        } else if (your_hope == \"B\") {\n");
      out.write("                            BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) + 5) * (your_activity_level + 0.3);\n");
      out.write("                        }\n");
      out.write("                    } else {\n");
      out.write("                        if (your_hope == \"L\") {\n");
      out.write("                            BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * (your_activity_level - 0.3);\n");
      out.write("                        } else if (your_hope == \"M\") {\n");
      out.write("                            BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * your_activity_level;\n");
      out.write("                        } else if (your_hope == \"B\") {\n");
      out.write("                            BMR = ((10 * your_weight) + (6.25 * your_height) - (5 * your_age) - 161) * (your_activity_level + 0.3);\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    document.getElementById(\"bmrInput\").value = BMR;\n");
      out.write("                    // Close the popup\n");
      out.write("                    document.getElementById('popup').style.display = 'none';\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                    <div id=\"popup\" class=\"popup\">\n");
      out.write("                <div class=\"popup-content\">\n");
      out.write("                    <!-- Nội dung của cửa sổ popup -->\n");
      out.write("                    <h3>Nutrition calculator</h3>\n");
      out.write("                    <p>\n");
      out.write("                        This calculator uses a standard BMR equation (the Mifflin-St Jeor formula) to estimate your Calorie\n");
      out.write("                        needs. We also make some rough macronutrient suggestions, but you're free to\n");
      out.write("                        completely customize these values when you create a free account.\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"pb-0 mb-0\">\n");
      out.write("                        <strong>Keep in mind that this is a general estimate.</strong> For best results, consult your healthcare\n");
      out.write("                        provider.\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-12 col-sm-8\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div id=\"c59_goal\" class=\"btn-group btn-group-toggle\" name=\"goal\" data-toggle=\"buttons\">\n");
      out.write("                                <label>I want to: </label> <label>\n");
      out.write("                                    <input type=\"radio\" name=\"goal\" value=\"L\" id=\"c59_goal-0\">Lose weight\n");
      out.write("                                </label>\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"radio\" name=\"goal\" value=\"M\" id=\"c59_goal-1\" checked=\"\">Maintain\n");
      out.write("                                </label>\n");
      out.write("                                <label>\n");
      out.write("                                    <input type=\"radio\" name=\"goal\" value=\"B\" id=\"c59_goal-2\">Build muscle\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group row\">\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 col-sm-8 two-segment-radio\" data-editors=\"gender\" id=\"gender-radio\">\n");
      out.write("                            <div id=\"c59_gender\" class=\"btn-group btn-group-toggle\" name=\"gender\" data-toggle=\"buttons\">\n");
      out.write("                                <label for=\"gender-radio\" class=\"col-12 col-sm-4 col-form-label\">I am: </label><label for=\"c59_gender-0\" class=\"btn btn-selector-primary active\">\n");
      out.write("                                    <input type=\"radio\" name=\"gender\" value=\"M\" id=\"c59_gender-0\" checked=\"\">Male\n");
      out.write("                                </label>\n");
      out.write("                                <label for=\"c59_gender-1\" class=\"btn btn-selector-primary \">\n");
      out.write("                                    <input type=\"radio\" name=\"gender\" value=\"F\" id=\"c59_gender-1\">Female\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"inline_block col-12 col-sm-8\" id=\"height-inputs\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <label>Height: </label><input id=\"height\" name=\"height\" value=\"\" class=\"form-control inline_block\" type=\"number\">\n");
      out.write("                                <label for=\"height-secondary\" class=\"metric_inputs signup_input_label\"> cms</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"inline_block col-12 col-sm-4\" id=\"weight-input\">\n");
      out.write("                            <label>Weight: </label><input id=\"weight\" name=\"weight\" value=\"\" class=\"form-control inline_block\" type=\"number\">\n");
      out.write("                            <label for=\"weight\" class=\"signup_input_label metric_inputs\" style=\"\"> kgs </label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12 col-sm-4\" id=\"age-input\">\n");
      out.write("                            <label>Age: </label><input name=\"age\" id=\"age\" value=\"\" class=\"form-control inline_block\" type=\"number\">\n");
      out.write("                            <label for=\"age\" class=\"signup_input_label\"> years </label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"col-12 col-sm-8\">\n");
      out.write("                        <label>Activity level: </label><select id=\"activity_level\" class=\"form-control\" name=\"activity_level\">\n");
      out.write("                            <option value=\"1.375\">Lightly Active</option>\n");
      out.write("                            <option selected=\"\" value=\"1.55\">Moderately Active</option>\n");
      out.write("                            <option value=\"1.725\">Very Active</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"offset-sm-2 col-12 col-sm-8 top_spacer bottom_spacer\">\n");
      out.write("                        <button onclick=\"calculate()\">Calculate</button>\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"close-button\" onclick=\"closePopup()\">Close</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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

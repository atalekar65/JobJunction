package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-2.1.3.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("        function IsValidZipCode(Zipcode) {\n");
      out.write("            var isValid = /^[0-9]{5}(?:-[0-9]{4})?$/.test(zip);\n");
      out.write("            if (isValid)\n");
      out.write("                alert('Valid ZipCode');\n");
      out.write("            else {\n");
      out.write("                alert('Invalid ZipCode');\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script><script>\n");
      out.write(" $(function(){\n");
      out.write("\t$.validator.setDefaults({\n");
      out.write("\t\thighlight: function(element){\n");
      out.write("\t\t\t$(element)\n");
      out.write("\t\t\t.closest('.form-group')\n");
      out.write("\t\t\t.addClass('has-error')\n");
      out.write("\t\t},\n");
      out.write("\t\tunhighlight: function(element){\n");
      out.write("\t\t\t$(element)\n");
      out.write("\t\t\t.closest('.form-group')\n");
      out.write("\t\t\t.removeClass('has-error')\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$.validate({\n");
      out.write("\t\trules:\n");
      out.write("\t\t{\t\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\t\t    password: \"required\",\n");
      out.write("\t\t\tbirthDate: \"required\",\n");
      out.write("\t\t\tweight: {\n");
      out.write("\t\t\t    required:true,\n");
      out.write("\t\t\t    number:true\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\theight:  {\n");
      out.write("\t\t\t    required:true,\n");
      out.write("\t\t\t    number:true\n");
      out.write("\t\t\t},\n");
      out.write("\t\t\temail: {\n");
      out.write("\t\t\t\trequired: true,\n");
      out.write("\t\t\t\temail: true\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\t\tmessages:{\t\t\t\n");
      out.write("\t\t\t\temail: {\n");
      out.write("\t\t\t\trequired: true,\n");
      out.write("\t\t\t\temail: true\n");
      out.write("\t\t\t}\n");
      out.write("\t\t},\n");
      out.write("\t\t\t\tpassword: {\n");
      out.write("\t\t\t\t\trequired: \" Please enter password\"\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tbirthDate: {\n");
      out.write("\t\t\t\t\trequired: \" Please enter birthdate\"\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\temail: {\n");
      out.write("\t\t\t\t\trequired: ' Please enter email',\n");
      out.write("\t\t\t\t\temail: ' Please enter valid email'\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tweight: {\n");
      out.write("\t\t\t\t\trequired: \" Please enter your weight\",\n");
      out.write("\t\t\t\t\tnumber: \" Only numbers allowed\"\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\theight: {\n");
      out.write("\t\t\t\t\trequired: \" Please enter your height\",\n");
      out.write("\t\t\t\t\tnumber: \" Only numbers allowed\"\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t});\n");
      out.write("});  -->\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("     background: url('https://static-communitytable.parade.com/wp-content/uploads/2014/03/rethink-target-heart-rate-number-ftr.jpg') fixed;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("*[role=\"form\"] {\n");
      out.write("    max-width: 530px;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    border-radius: 0.3em;\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("}\n");
      out.write("\n");
      out.write("*[role=\"form\"] h2 { \n");
      out.write("    font-family: 'Open Sans' , sans-serif;\n");
      out.write("    font-size: 40px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    color: #000000;\n");
      out.write("    margin-top: 5%;\n");
      out.write("    text-align: center;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    letter-spacing: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form method=\"post\" action=\"signin.do\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("                <h2>Registration</h2>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"firstName\" class=\"col-sm-3 control-label\">First Name</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"firstName\" placeholder=\"First Name\" class=\"form-control\" name=\"candidate_name\" autofocus>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"lastName\" class=\"col-sm-3 control-label\">Last Name</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"lastName\" placeholder=\"Last Name\" class=\"form-control\" name=\"candidate_name\" autofocus>\n");
      out.write("                    </div>\n");
      out.write("                </div>             \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\" class=\"col-sm-3 control-label\">Email* </label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"email\" id=\"email\" placeholder=\"Email\" class=\"form-control\" name=\"candidate_email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"Address\" class=\"col-sm-3 control-label\">Address</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" id=\"Address\" placeholder=\"Address\" class=\"form-control\" name=\"candidate_address\" autofocus>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-3 control-label\">City</label>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                    <select class=\"custom-select\" name=\"candidate_city\">\n");
      out.write("                      <option>Mumbai</option>\n");
      out.write("                    <option>Delhi</option>\n");
      out.write("                <option>Kolkata</option>\n");
      out.write("                <option>Kolkata</option>\n");
      out.write("                <option>Chennai</option>\n");
      out.write("                <option>Bengaluru</option><option>Ahmadabad</option>\n");
      out.write("                <option>Hyderabad</option><option>Pune</option>\n");
      out.write("                <option>Lucknow</option> <option>Nagpur</option>\n");
      out.write("                 <option>Indore</option><option>Kochi</option>\n");
      out.write("                <option>Nashik</option><option>Agra</option>\n");
      out.write("                <option>Rajkot</option> <option>Chandigarh</option>\n");
      out.write("                 <option>Bhopal</option> <option>Jaipur</option>  \n");
      out.write("                    </select></div>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"ZipCode\" class=\"col-sm-3 control-label\">Zip Code</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"ZipCode\" id=\"phoneNumber\" placeholder=\"ZipCode\" class=\"form-control\" name=\"zip_code\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"password\" class=\"col-sm-3 control-label\">Password*</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"password\" id=\"password\" placeholder=\"Password\" class=\"form-control\" name=\"canadidate_password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("<!--                <div class=\"form-group\">\n");
      out.write("                    <label for=\"password\" class=\"col-sm-3 control-label\">Confirm Password*</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"password\" id=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"birthDate\" class=\"col-sm-3 control-label\">Date of Birth*</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"date\" id=\"birthDate\" class=\"form-control\" name=\"candidate_dob\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    <label for=\"Experience\" class=\"col-sm-3 control-label\">Experience</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"Experience\" id=\"phoneNumber\" placeholder=\"Experience in years\" class=\"form-control\" name=\"candidate_experience\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    <label for=\"Qualification\" class=\"col-sm-3 control-label\">Qualification</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"Qualification\" id=\"phoneNumber\" placeholder=\"Qualification\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"phoneNumber\" class=\"col-sm-3 control-label\">Contact number</label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"phoneNumber\" id=\"phoneNumber\" placeholder=\"Phone number\" class=\"form-control\" name=\"candidate_contact\">\n");
      out.write("                        <span class=\"help-block\">Your phone number won't be disclosed anywhere </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-3\">Gender</label>\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <label class=\"radio-inline\">\n");
      out.write("                                    <input type=\"radio\" id=\"femaleRadio\" value=\"FEMALE\" name=\"candidate_gender\">FEMALE\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <label class=\"radio-inline\">\n");
      out.write("                                    <input type=\"radio\" id=\"maleRadio\" value=\"MALE\" name=\"candidate_gender\">MALE\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> <!-- /.form-group -->\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-sm-9 col-sm-offset-3\">\n");
      out.write("                        <span class=\"help-block\">*Required fields</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"submit\" >\n");
      out.write("            </form> <!-- /form -->\n");
      out.write("        </div> <!-- ./container -->\n");
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

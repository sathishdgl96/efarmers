package org.apache.jsp.delivery_0020boy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logn_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<link href=\"../css/logn.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    h6\n");
      out.write("    {\n");
      out.write("        color:red;\n");
      out.write("        font-weight: bold;\n");
      out.write("        font-size:20px;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");

String error=request.getParameter("error");
if(error!=null)
{
    out.println("<h6>");
    out.println(error);
    out.println("</h6>");
}
if(session.getAttribute("usertype").equals("delivery"))
{
 
 String loginerror="your'e already logged in ";

  response.sendRedirect("deliveryhome.jsp"); 
}
    
      out.write("\n");
      out.write("<body>\n");
      out.write("   <div class=\"signin\">\n");
      out.write("\n");
      out.write("<form action=\"LoginDelivery\">\n");
      out.write("<h2 style=\"color:#fff;\">Log In - Delivery boy</h2>\n");
      out.write("<input type=\"text\" name=\"username\" placeholder=\"Username\"/><br /><br />\n");
      out.write("<input type=\"password\" name=\"password\" placeholder=\"Password\" /><br /><br />\n");
      out.write("<input type=\"submit\" value=\"Log In\" /><br /><br />\n");
      out.write("<div id=\"container\">\n");
      out.write("<a href=\"../re.html\" style=\" margin-right:0px; font-size:13px; font-family:Tahoma, Geneva, sans-serif;\">Reset password?</a>\n");
      out.write("    <a href=\"../for.html\" style=\" margin-left:30px; font-size:13px; font-family:Tahoma, Geneva, sans-serif;\">Forget password</a>\n");
      out.write("    </div><br /><br /><br /><br /><br /><br />\n");
      out.write("Don't have account?<a href=\"signup.html\" style=\"font-family:'Play', sans-serif;\">&nbsp;Sign Up</a>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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

package org.apache.jsp.delivery_0020boy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.Connection;

public final class deliveryhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\t\t\n");
      out.write("<script type=\"text/javascript\" src=\"selectitem.js\"></script>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Untitled Document</title>\n");
      out.write("       <style>\n");
      out.write("           \n");
      out.write("           .button {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 10px 22px;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-left: 200px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write(" \n");
      out.write("  cursor: pointer;\n");
      out.write("\n");
      out.write("}\n");
      out.write("            ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            li a {\n");
      out.write("                display: block;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover:not(.active) {\n");
      out.write("                background-color: #111;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .active {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("            }\n");
      out.write("\t\t\t#customers {\n");
      out.write("  font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th \n");
      out.write("\t\t   {\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("#customers tr:nth-child(odd){background-color: white;}\n");
      out.write("#customers tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("  padding-top: 12px;\n");
      out.write("  padding-bottom: 12px;\n");
      out.write("  text-align: left;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("        table {\n");
      out.write("    margin-top: -13px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    padding-right: 2px;\n");
      out.write("    padding-left: 2px;\n");
      out.write("}\n");
      out.write("       h3 {\n");
      out.write("    color: #26A41C;\n");
      out.write("    font-family: \"Gill Sans\", \"Gill Sans MT\", \"Myriad Pro\", \"DejaVu Sans Condensed\", Helvetica, Arial, sans-serif;\n");
      out.write("    font-weight: bolder;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\t\t   #addItem{\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("       #post {\n");
      out.write("    margin-top: 4px;\n");
      out.write("    color: #14AA0A;\n");
      out.write("    font-family: Cambria, \"Hoefler Text\", \"Liberation Serif\", Times, \"Times New Roman\", serif;\n");
      out.write("    font-weight: bold;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("       #addItem fieldset {\n");
      out.write("    margin-left: 349px;\n");
      out.write("    color: #AF3918;\n");
      out.write("    margin-top: 10px;\n");
      out.write("    margin-bottom: 6px;\n");
      out.write("}\n");
      out.write("       #delete {\n");
      out.write("    float: right;\n");
      out.write("    margin-top: 6px;\n");
      out.write("}\n");
      out.write("       </style>\n");
      out.write("    </head>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("    <body>\n");
      out.write("\t\t\n");
      out.write("\t<header>\n");
      out.write("\t\t<ul>\n");
      out.write("            <li><a href=\"#home\">Home</a></li>\n");
      out.write("            <li><a href=\"#Go to cart \" class=\"active\">Dashboard</a></li>\n");
      out.write("            <li><a href=\"#contact\" >Contact</a></li>\n");
      out.write("            <li style=\"float:right\"><a href=\"../logout\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Seller dashboard</title>\n");
      out.write("\t\t</header>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div id=\"dashboard\">\n");
      out.write("\t\t<p>Delivering location set according to your home address</p>\n");
      out.write("\t\t<h3>Deliveries</h3>\n");
      out.write("<table id=\"customers\">\n");
      out.write("  <tr>\n");
      out.write("    <th>Date</th>\n");
      out.write("    <th><a>Delivering From<a></th>\n");
      out.write("    <th>Delivering to</th>\n");
      out.write("\t<th>Payment</th>\n");
      out.write("\t  <th>status</th>\n");
      out.write("\t  \n");
      out.write("  </tr>\n");
      out.write("  ");

                 String url = "jdbc:oracle:thin:@localhost:1521:xe";
 
  String driver = "oracle.jdbc.driver.OracleDriver";
  String userName = "sathish"; 
  String password = "sathish";
try
{
   Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",userName,password);
 String username =(String)session.getAttribute("email");
 String strQuery="select * from productbuyer where iscart=0";
 System.out.println(strQuery);
 Statement st = conn.createStatement();
 ResultSet rs = st.executeQuery(strQuery);

 while(rs.next())
      {
    int itemid=rs.getInt(1);
    String fromemail=rs.getString(8);
    String toemail=rs.getString(2);
   
   
     out.println("<tr onclick='window.location='hi.html''>");

    out.println("<td>"+itemid+"</td>");
    out.println("<td>"+fromemail+"</td>");
    out.println("<td>"+toemail+"</td>");
    out.println ("<td>"+rs.getInt(5)+"</td>");
     out.println("<td> yet to be deliverd");
      out.println("<a href='deliveryfrom?fromemail="+fromemail+"&toemail="+toemail+"&itemid="+itemid+"'>");
      out.println("<input type='button' class='button' value='details'/>");
      out.println("</a>");  
            //   out.println("<a href='../picked?itemid="+itemid+"' > <img id='pick' src='pickeup.jpg' width='40px' height='40px'></a><a href='../delivered?itemid="+itemid+"' > <img id='delivered' src='tick.jpg' width='40px' height='40px'></a></td></tr>");
      }
    }     
catch(Exception e)
{
    out.println(e);
}
 
      out.write("\n");
      out.write(" \n");
      out.write("</table>\n");
      out.write("\t</div>\n");
      out.write("        <div>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("\t</body>\n");
      out.write("\t</html>");
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

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html>
<head>
<html>
    <head>
      
 <%
     if(session==null)
     {
      String loginerror="your'e not logged in,login to proceed ";
      response.sendRedirect("logn.jsp?error="+loginerror);   
     }
   %>
   
		
<script type="text/javascript" src="selectitem.js"></script>
        <meta charset="utf-8">
        <title>Untitled Document</title>
       <style>
            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333;
            }

            li {
                float: left;
            }
            li a {
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            li a:hover:not(.active) {
                background-color: #111;
            }

            .active {
                background-color: #4CAF50;
            }
			#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th 
		   {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}
#customers tr:nth-child(odd){background-color: white;}
#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
        table {
    margin-top: -13px;
    margin-bottom: 10px;
    padding-right: 2px;
    padding-left: 2px;
}
       h3 {
    color: #26A41C;
    font-family: "Gill Sans", "Gill Sans MT", "Myriad Pro", "DejaVu Sans Condensed", Helvetica, Arial, sans-serif;
    font-weight: bolder;
    text-align: left;
}
		   #addItem{
    display: inline-block;
}
       #post {
    margin-top: 4px;
    color: #14AA0A;
    font-family: Cambria, "Hoefler Text", "Liberation Serif", Times, "Times New Roman", serif;
    font-weight: bold;
    text-align: left;
}
       #addItem fieldset {
    margin-left: 349px;
    color: #AF3918;
    margin-top: 10px;
    margin-bottom: 6px;
}
       #delete {
    float: right;
    margin-top: 6px;
}
h6
    {
        color:red;
        font-weight: bold;
        font-size:20px;
        text-align: center;
     
        
    }
       </style>
    </head>
	
	
	
    <body>
	<header>
		<ul>
            <li><a href="#home">Home</a></li>
            <li><a href="#Go to cart " class="active">Dashboard</a></li>
            <li><a href="#contact">Contact</a></li>
            <%if(session.getAttribute("username")==null)
    {
    out.println("<li style='float:right;'><a href='../logn.jsp'>Login</a></li>");
    }
            else
            {
            out.println("<li style='float:right;'><a>logged in as:");
         String username=(String)session.getAttribute("username");
          out.println(username);
            
            out.println("<li style='float:right'><a href='../logout'>logout<input type='hidden'name='status'value='logout'></input></a>");
       }
       %>
                </ul>

<meta charset="utf-8">

<title>Seller dashboard</title>
		</header>

	
	
	
	
	<div id="dashboard">
            <% String error=request.getParameter("status");
    if(error!=null)
{
    out.println("<h6>");
    out.println(error);
    out.println("</h6>");
    error=null;
}


   
    %>
		<h3>Reports</h3>
<table id="customers">
  <tr>
    <th>Date</th>
    <th>Item</th>
    <th>Sold</th>
	<th>Payment</th>
	  <th>status</th>
	  
  </tr>
  <%
                 String url = "jdbc:oracle:thin:@localhost:1521:xe";
 
  String driver = "oracle.jdbc.driver.OracleDriver";
  String userName = "sathish"; 
  String password = "sathish";
try
{
   Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",userName,password);
 String username =(String)session.getAttribute("email");
 String strQuery="select * from productseller where name='"+username+"' and isavailable=1 ORDER BY selldate DESC";
 System.out.println(strQuery);
 Statement st = conn.createStatement();
 ResultSet rs = st.executeQuery(strQuery);

 while(rs.next())
      {
    int payment=rs.getInt(5)* rs.getInt(4);
    out.println ("<tr>");
    out.println("<td>"+rs.getString(7)+"</td>");
    out.println("<td>"+rs.getString(3)+"</td>");
    out.println("<td>"+rs.getString(8)+"</td>");
    out.println ("<td>"+payment+"</td>");
     out.println("<td>");
          if(rs.getInt(6)==1)
          {
              out.print("alive");
          }
          else
          {
              out.print("deleted</td></tr>");
          }
               out.println("<a href='../deleteproduct?date="+rs.getString(7)+"' > <img id='delete' src='delete.png' width='10px' height='10px'></a></td></tr>");
      }
    }     
catch(Exception e){System.out.println(e);}%>
        
  
  
 
</table>
	</div>
		<div id="addItem">
			<h3>Sell your product:</h3>
		<fieldset style="width: 230px;">
<legend><strong>Sell your farming product</strong></legend>
<p>
<form name="test" method="POST" action="../selleraddproduct">
<table id="post">
<tr>
<td style="text-align: left;">Category:</td>
<td style="text-align: left;">
<select name="category" id="country" onchange="setStates();">
  <option value="Vegetables">Vegetables</option>
  <option value="fruits">Fruits</option>
  <option value="pulses">Pulses</option>
</select>
</td>
	</tr><tr>
<td style="text-align: left;">Item:</td>
<td style="text-align: left;">
<select name="item" id="state" onchange="setCities();">
  <option value="">Please select a category</option>
</select>
</td>
</tr>
	<tr>
		<td>Quantity(kg)<input type="number" name="quantity"/></td>
	</tr>
	<tr>
		<td>Price(RS): <input type="number" name="price"/> </td>
	</tr>
<tr>
		<td> <input type="submit" value="post" /> </td>
	</tr>
</table>
</form>
			</fieldset>

		</div>
	</body>
	</html>
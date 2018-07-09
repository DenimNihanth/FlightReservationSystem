package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Statement;



/**
 * Servlet implementation class CustReg
 */
@WebServlet("/CustReg")
public class CustReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String src=request.getParameter("src");
		String des=request.getParameter("des");
		String doj=request.getParameter("doj");
		if(src.equalsIgnoreCase(des)){
			System.out.println("Source and Destination cannot be the same");
		}
		else
		{
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
	    	PreparedStatement ps=null;
	    	ResultSet rs=null;
	    	ps=con.prepareStatement("select * from fdetails where fsrc=? and fdes=? and depdt=?");
	    	ps.setString(1,src);
	    	ps.setString(2,des);
	    	ps.setString(3, doj);
	    	rs=ps.executeQuery();
	    	if(rs.next()){
	    		System.out.println("Flights are available");
	    		Statement stmt=(Statement) con.createStatement();
		    	rs=stmt.executeQuery("select * from fdetails");
		    	out.println("<html><table><tr>"); 
		    	 
		    	
		     

		    	while(rs.next()){
		    		out.println("<tr><td>Flight ID:"  +rs.getString(1)+ "</td></tr>");
		    		out.println("<tr><td>Flight Source : " +rs.getString(2)+ "</td></tr>");
		    		out.println("<tr><td>Flight Destination : " +rs.getString(3)+ "</td></tr>");
		    		out.println("<tr><td>Flight Departure Date: " +rs.getString(4)+ "</td><tr>");
		    		out.println("<tr><td>Flight Arrival Date: " +rs.getString(5) +"</tr></td>");
		    		out.println("<tr><td>Flight Departure time " +rs.getString(6)+ "</tr></td>");
		    		out.println("<tr><td>Flight Arrival time : " +rs.getString(7) + "</tr></td>");
		    		out.println("<tr><td>Flight Status: " +rs.getString(8)+ "</tr></td>");
		    		out.println("<tr><td>Seat Availbility: " +rs.getString(9) + "</tr></td>");
		    		out.println(""
		    				+ "");
		    		out.println("<tr><td><a href=\"bookSeat.jsp\">Click here to book seat</a>"+ "</tr></td>");
		    		out.println("<tr><td><a href=\"cancelSeat.jsp\">Click here to cancel reservation</a>" + "</tr></td>");
		    		out.println("</tr></table></html>");

	    		
	    	}

		}
	    	else
	    	{
	    		System.out.println("No Flights are available");
	    		String redirectURL="custHome.jsp";
	    		response.sendRedirect(redirectURL);
	    	}
	}
		catch(Exception e){
			e.printStackTrace();
			}
		}
	}
}

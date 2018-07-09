package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;


/**
 * Servlet implementation class AddPackage
 */
@WebServlet("/FlightView")
public class FlightView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightView() {
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
		PrintWriter pw=response.getWriter();
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
	    	Statement stmt=(Statement) con.createStatement();
	    	ResultSet rs=stmt.executeQuery("select * from fdetails");
	    	pw.println("<html><table><tr>"); 
	    	while(rs.next()){
	    		pw.println("<tr><td>Flight ID:"  +rs.getString(1)+ "</td></tr>");
	    		pw.println("<tr><td>Flight Source : " +rs.getString(2)+ "</td></tr>");
	    		pw.println("<tr><td>Flight Destination : " +rs.getString(3)+ "</td></tr>");
	    		pw.println("<tr><td>Flight Departure Date: " +rs.getString(4)+ "</td><tr>");
	    		pw.println("<tr><td>Flight Arrival Date: " +rs.getString(5) +"</tr></td>");
	    		pw.println("<tr><td>Flight Departure time " +rs.getString(6)+ "</tr></td>");
	    		pw.println("<tr><td>Flight Arrival time : " +rs.getString(7) + "</tr></td>");
	    		pw.println("<tr><td>Flight Status: " +rs.getString(8)+ "</tr></td>");
	    		pw.println("<tr><td>Seat Availbility: " +rs.getString(9) + "</tr></td>");
	    		pw.println("</tr></table></html>");

	    		
	    	}
		}
	    	
		catch(Exception e){
			e.printStackTrace();
		}
	}
}


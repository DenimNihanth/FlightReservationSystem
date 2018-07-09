package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DeleteHotel
 */
@WebServlet("/SeatBook")
public class SeatBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeatBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Random random = new Random() ;
        int seatid = random.nextInt(5) + 5;

		String sname=request.getParameter("sname");
		String cat=request.getParameter("cat");
		String gender=request.getParameter("gender");
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
	    	PreparedStatement ps=con.prepareStatement("insert into sdetails values(?,?,?,?)");
	    	ps.setInt(1, seatid);
	    	ps.setString(2, sname);
	    	ps.setString(3, cat);
	    	ps.setString(4, gender);
	    	int i=ps.executeUpdate();
	    	if(i>0){
	    		System.out.println("Your seat is booked with your seat number: "+seatid);
	    		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}



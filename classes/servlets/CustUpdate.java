package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustUpdate
 */
@WebServlet("/CustUpdate")
public class CustUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cname=request.getParameter("cname");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String cpass=request.getParameter("cpass");
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
	    	PreparedStatement ps=con.prepareStatement("insert into user_profile values(?,?,?,?)");
	    	ps.setString(1, cname);
	    	ps.setString(2, contact);
	    	ps.setString(3, email);
	    	ps.setString(4, cpass);
	    	int i=ps.executeUpdate();
	    	if(i>0){
	    		System.out.println("Successfully Registered");
	    		System.out.println("Your username is your email-ID and the password is the one which you have entered");
	    		String redirectURL="index.html";
		    	response.sendRedirect(redirectURL);
	    	}
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

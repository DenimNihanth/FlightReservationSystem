package servlets;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class check
 */
@WebServlet("/CustLogin")
public class CustLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

		  PrintWriter out=response.getWriter();
		 String username=request.getParameter("uname");
		    String password=request.getParameter("password");
		  
			try{
		    	Class.forName("com.mysql.jdbc.Driver");
		    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
		    	PreparedStatement ps=null;
		    	ResultSet rs=null;
		    	ps=con.prepareStatement("select * from user_profile where email=? and cpass=?");
		    	ps.setString(1,username);
		    	ps.setString(2,password);
		    	rs=ps.executeQuery();
		    	if(rs.next()){
		    		System.out.println("Logged in");
		    		String redirectURL="custHome.jsp";
		    		response.sendRedirect(redirectURL);
		    	}
		    	else
		    	{
		    	String redirectURL="index.html";
		    	response.sendRedirect(redirectURL);
		    	}
		    }
		    catch(Exception e){
		    	out.println("Data is not inserted");
		    }
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

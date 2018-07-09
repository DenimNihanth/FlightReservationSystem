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
 * Servlet implementation class HotMerchAdd
 */
@WebServlet("/FlightEdit")
public class FlightEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightEdit() {
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
		String fid=request.getParameter("fid");
		String frsc=request.getParameter("fsrc");
		String fdes=request.getParameter("fdes");
		String depdt=request.getParameter("depdt");
		String arrdt=request.getParameter("arrdt");
		String deptm=request.getParameter("deptm");
		String arrtm=request.getParameter("arrtm");
		String fstatus=request.getParameter("fstatus");
		String seats=request.getParameter("seats");
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
	    	PreparedStatement ps=con.prepareStatement("update fdetails set fsrc=?, fdes=?, depdt=?, arrdt=?, deptm=?, arrtm=?, fstatus=?, seats=? where fid=?");
	    	
	    	
	    	ps.setString(1, frsc);
	    	ps.setString(2, fdes);
	    	ps.setString(3, depdt);
	    	ps.setString(4, arrdt);
	    	ps.setString(5, deptm);
	    	ps.setString(6, arrtm);
	    	ps.setString(7, fstatus);
	    	ps.setString(8, seats);
	    	ps.setString(9, fid);
	    	int i=ps.executeUpdate();
	    	if(i>0){
	    		System.out.println("Successfully Updated");
	    	}
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}			
}



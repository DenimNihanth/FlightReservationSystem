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
 * Servlet implementation class AddPackage
 */
@WebServlet("/FlightAdd")
public class FlightAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightAdd() {
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
		String fsrc=request.getParameter("fsrc");
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
	    	PreparedStatement ps=con.prepareStatement("insert into fdetails values(?,?,?,?,?,?,?,?,?)");
	    	ps.setString(1, fid);
	    	ps.setString(2, fsrc);
	    	ps.setString(3, fdes);
	    	ps.setString(4, depdt);
	    	ps.setString(5, arrdt);
	    	ps.setString(6, deptm);
	    	ps.setString(7, arrtm);
	    	ps.setString(8, fstatus);
	    	ps.setString(9, seats);
	    	int i=ps.executeUpdate();
	    	if(i>0){
	    		System.out.println("Successfully Inserted");
	    		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}


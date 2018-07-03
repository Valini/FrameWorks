package test;

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

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//get the data from the login form
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
	//make a query to database to get the password and username stored
		//make a connection
		try {
			//establish a connection with database
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "root");
			//database query
			String query = "select * from student where userName=?";
			PreparedStatement st = myConn.prepareStatement(query);
			st.setString(1, userName);
			ResultSet rs = st.executeQuery();
			String result = "User not found";
			if(rs.next()) {
				String studentNameFromDB = rs.getString("studentName");
				String IdFromDB = rs.getString("id");
				String userNameFromDB = rs.getString("userName");
				String passwordFromDB = rs.getString("password");
				String emailFromDB = rs.getString("email");
				String cityFromDB = rs.getString("city");
				if(passwordFromDB.equalsIgnoreCase(password)) {
					result = "Password match for  " + userNameFromDB  ;
				}
				}
				//Print the data 
				PrintWriter pw = response.getWriter();
				pw.write("<html>\r\n" + 
						"<head>\r\n" + 
						"<title>Result page</title>\r\n" + 
						"</head>\r\n" + 
						"<body>\r\n" +
						result+
						"</body>\r\n" + 
						"</html>");
				//result = "user found and details are "
						//+ "\n Name: "+nameFromDB+" "
								//+ "and \n ID: "+IDFromDB;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		
		}
		
		
		
		
		
	}

}

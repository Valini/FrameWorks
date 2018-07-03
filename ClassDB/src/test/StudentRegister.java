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
 * Servlet implementation class StudentRegister
 */
@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get all the data from the form 
		String studentName= request.getParameter("studentName");
		String idString= request.getParameter("id");
		int id= Integer.parseInt(idString);
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		String email = request.getParameter("email");
		String city= request.getParameter("city");
		
		//create a student object and set the data
		Student student = new Student();
		student.setStudentName(studentName);
		student.setId(id);
		student.setUserName(userName);
		student.setPassword(password);
		student.setEmail(email);
		student.setCity(city);
		
		//insert this data in the database
		try {
			//establish a connection with database
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "root");
			//insert data with sql insert statement
			String query = "insert into student values(?,?,?,?,?,?)";
			PreparedStatement st = myConn.prepareStatement(query);
			st.setString(1, student.getStudentName());
			st.setInt(2, student.getId());
			st.setString(3, student.getUserName());
			st.setString(4, student.getPassword());
			st.setString(5, student.getEmail());
			st.setString(6, student.getCity());
			
			int res = st.executeUpdate();
			String result = "User save was not successful";
			//if insert was successful
			if(res == 1) {
				result = "User successfully saved!";
			}
			
			//Print the data 
			PrintWriter pw = response.getWriter();
			pw.write("<html>\r\n" + 
					"<head>\r\n" + 
					"<title>Result page</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" +
					result+
					"<a href=\"/ClassDB\"> Welcome page </a>"
					+"</body>" + 
					"</html>");
			//close connection
			myConn.close();

			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}
		
		
		
	}

}

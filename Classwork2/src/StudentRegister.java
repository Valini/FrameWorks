

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
 * Servlet implementation class StudentRegister
 */
@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setConteb
	printwriter pw = request.response.getWrite();
	pw.write(paste from string)
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 string  username = request.getParameter 
}try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = 
	DriverManager.getConnection("jbdc:mysql://localhost:3306/student","root","root");
	String query ="insert into student values(?,?)";
	PreparedStatement st= conn.prepareStatement(query);
	st.setString(1,  s1.getName());
	st.setInt(2,  s1.getStudentID);
	
	
	int result= st.executeUpdate();
	String result = "User was not save succesfully"
	//do something
	myConnection.close();
}
catch(java.lang.Exception) {
	ex.printStackTrace();
}

}
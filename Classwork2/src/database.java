
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
	Connection conn = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/students?" +
		                                   "user=root&password=root");

		    // Do something with the Connection

		  
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

}

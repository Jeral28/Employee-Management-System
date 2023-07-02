package employee;
import java.sql.Connection;
import java.sql.DriverManager;

public class Employee {
	public static Connection getDBConnection() {
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DMK","root","");
		return con;
		}
		catch(Exception e) {
		e.printStackTrace();
		}
		return con;
		}
}

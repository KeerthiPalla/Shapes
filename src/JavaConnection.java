import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class JavaConnection {

	static final String DB_URL = "jdbc:mysql://localhost:3306?useSSL=false";
	static final String USER = "root";
	static final String PASS = "pass";

	static final ArrayList<set> set = null;

	public static Connection getConnection() throws Exception{
    Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// Open a connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected to database...");
			return conn;
		}
		catch (Exception e){System.out.println(e);}
	    return null;
	}
}

package framework;
import java.sql.*;
public class ConnectionManager {
static Connection jdbcConnection() throws SQLNonTransientConnectionException,Exception
{
	String url="jdbc:mysql://localhost:3306/random";
	String uname="root";
	String pass="";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	return con;
}
}

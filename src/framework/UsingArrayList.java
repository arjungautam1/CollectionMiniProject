package framework;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLNonTransientConnectionException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {
public void array() throws SQLNonTransientConnectionException, Exception
{
	String query="select * from student";
	Connection con=ConnectionManager.jdbcConnection();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);

	
	ArrayList<Integer> rollno=new ArrayList<Integer>();
	
	while(rs.next())
	{
	int roll=rs.getInt("rollno");
	rollno.add(roll);
	}
	
	//for sorting 
	Collections.sort(rollno);
	rollno.forEach(r->System.out.println(r));
	System.out.println("Total Numbers of Students:"+rollno.size());
	//for finding maximum value
	int max=Collections.max(rollno);
	System.out.println("Maximum value"+max);
	//for minimum value
	int min=Collections.min(rollno);
	System.out.println("Minimum value"+min);
	

}
}

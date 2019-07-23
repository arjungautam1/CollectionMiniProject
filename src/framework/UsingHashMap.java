package framework;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLNonTransientConnectionException;
import java.sql.Statement;
import java.util.HashMap;

public class UsingHashMap {
	public void hashmap() throws SQLNonTransientConnectionException, Exception
	{
		String query="select * from student";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		HashMap<Integer,String> hash=new HashMap<Integer,String>();
		while(rs.next())
		{
			String stud_id=rs.getString("stud_id");
			int roll=rs.getInt("rollno");
			hash.put(roll, stud_id);
		}
		for(Integer key:hash.keySet())
		{
			System.out.println(key+" "+hash.get(key));
			
		}
		
	}

}

package framework;
import java.sql.*;
import java.util.Random;


public class RandomIdentifier{
	public void insert() throws SQLNonTransientConnectionException,Exception {
	
		 
		Random random = new Random(); 
		int roll = 0; 
		String  uname = null;
		
		System.out.println("Data is being inserted please have patience....");
		System.out.println("On progress..");
		for(int i=0;i <100;i++)
		{
		System.out.print(".");
		String c[]= {"Bsc CSIT","BIT","BSW","MBA","MBBS","BE"};
		String course=c[new Random().nextInt(c.length)];

	    roll=random.nextInt(1000); 
	
	    uname=Long.toHexString(random.nextInt());
		
		  
	    String query="insert into student(rollno,stud_id,course)values("+roll+",'"+uname+"','"+course+"')";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		st.executeUpdate(query);
	
}
    System.out.println("\n");
	System.out.println("Data inserted successfully");
	
		  } 
		  	  
		 }


	

 
 

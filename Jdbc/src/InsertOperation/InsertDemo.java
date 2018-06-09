package InsertOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class InsertDemo {

	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		
		try
		{
			
	
			
	
			Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","system");
		stmt=con.createStatement();
		
			
		
		
		
		
		
		int count=stmt.executeUpdate("insert into student values(4,'Sangeeta',79,'21-jan-1986')");
		System.out.println(count + "rows inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				con.clearWarnings();
			}
			catch(Exception e2)
			{
			e2.printStackTrace();
				
			}
		}
	}

}

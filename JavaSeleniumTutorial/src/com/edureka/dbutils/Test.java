package com.edureka.dbutils;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Test {
	static Connection con=null;
	static Statement stm=null;
	String createQuery="create table emp5(id number,name varchar2(10))";
	public void createTable()
	{
		try {
			stm=con.createStatement();
			stm.execute(createQuery);
			System.out.println("table is created....");
			closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(stm!=null)
			{
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	

	public void closeConnection()
	{
		
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	 
	public static void main(String[] args)  {
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			System.out.println("11111111");
	       	 try {
				Class.forName(myDriver);
				String myUrl = "jdbc:oracle:thin:@localhost:1521:xe";
				con = DriverManager.getConnection(myUrl, "system", "suraj");
				 
//					stm = con.createStatement();
//			
//				 String insrt="insert into book (id,authors,code,name) values(120,'AAA','cd123','Junglebook')";
//				  int istupdate=stm.executeUpdate(insrt);
//				  if(istupdate>=1)
//				    {
//				    	System.out.println("insertion is successful...");
//				    }
				
				Test t=new Test();
				t.createTable();    
				
			} catch (ClassNotFoundException |SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	       	 
//	       	 finally
//	       	 {
//	       		 try {
//	       			 if(stm!=null)
//					stm.close();
//	       			 if(con!=null)
//					con.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	       	 }
	// String query="select * from book";
    //		 con=getConnection();
		  
			
		     // System.out.println("55555555555555");
 
		
     }
	
	
	
	
	
}

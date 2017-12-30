package com.edureka.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestSelect
{
	//private static final Logger log=Logger.getLogger(TestSelect.class.getName());
	static Connection con=null;
  public static void main(String[] args) {
	  toTestSelectUnion();
}
  public static  List<Map<String,Object>> getSelectedData(String tableName,Map<String,TYPE>columntoSelect,Map<String,Object>whereCluse) throws SQLException
	{
		StringBuilder sql = new StringBuilder();
			List<Map<String,Object>> records=new ArrayList<>();
			Map<String,Object> row=new HashMap<>();
				sql.append(" select ");
				if(!columntoSelect.isEmpty())
				{
					for(String colName:columntoSelect.keySet())
					{
						                  sql.append(colName);
						                  sql.append(",");
					}
					 sql = new StringBuilder(sql.subSequence(0, sql.length() - 1));
				}
				sql.append(" from ");
				sql.append(tableName);
				if (!whereCluse.isEmpty()) {
					sql.append(" WHERE ");
					for (Map.Entry<String, Object> entry : whereCluse.entrySet()) {
						sql.append(entry.getKey()).append("=").append("?");
						sql.append(" AND ");
					}
					// sql = new StringBuilder(sql.subSequence(0, sql.length() - 5));
					int LastComIndx = sql.toString().lastIndexOf("D ");
					sql = new StringBuilder(sql.substring(0, LastComIndx - 2));
				
			}
			
		System.out.println("oooooooooooooooooo");		
				
	//log.info("#######3333  sql sura...."+sql);		
	//System.out.println("pppppppppp");
	//System.out.println("sql ..."+sql);
	 con = getConnection();
	System.out.println("aaaaaaaaaaaaa");
	//Connection con = ConnectionUtils.getConnection();
	//log.info("#### con  ::" + con);

	//log.info("#### sql query ::" + sql);
	System.out.println("ssssssssssssss");
	PreparedStatement prepareSatement = con.prepareStatement(sql.toString());
	System.out.println("1111111111");
	//log.info("####connection...." + con);
	ResultSet rs = prepareSatement.executeQuery();
	System.out.println("99999999");

System.out.println("sql .8888888888.."+sql);
			
//          ResultSet rs;
		
	while(rs.next())
	     {
                  
			for(Map.Entry<String,TYPE> entry :columntoSelect.entrySet())
			{
		      String colName=entry.getKey();
			row=new HashMap<String,Object>();
			TYPE temp=columntoSelect.get(colName);
			switch (temp){
			case STRING :
			{
			     row.put(colName,rs.getString(colName));//rs.getString(colName);
			     break;
			}
			
			case INTEGER :
			{
				 row.put(colName,rs.getInt(colName));
			     break;
			}
			case FLOAT:
			{
			     row.put(colName,rs.getFloat(colName));
			     break;
			}
			case DATE:
			{
			     row.put(colName,rs.getDate(colName));
			     break;
			}
			
			default : 
				   throw new IllegalArgumentException(temp.toString());
			
			}
		
			}//end of for loop

			records.add(row);
        }   //end while loop
	
			return records;
	}

  
  enum TYPE {
		INTEGER, FLOAT, LONG, STRING, DATE
	}
  
  public static void toTestSelectUnion()
  {
	  
	  System.out.println("kkkkkkkkkkkkk");
	  String tableName="Book";
  	
  	  Map<String,Object> columnValueMappingForCondition = new HashMap<String,Object>();
  	  
//  	  columnValueMappingForCondition.put("id","Ankit");
//  	  columnValueMappingForCondition.put("authors", 25);
  	  columnValueMappingForCondition.put("code","343");
       
  	  Map<String,TYPE> columnValue = new HashMap<>();
  	  
  	  
  	  System.out.println("ddddddddddddddddd");
        columnValue.put("id",TYPE.INTEGER);
        columnValue.put("authors", TYPE.STRING);
        columnValue.put("code", TYPE.STRING);
//        columnValueMappingForColumn.put("c3","v4");
 	   try {
        
 		   System.out.println("66666777777777766");
 		   List<Map<String,Object>> records= getSelectedData(tableName,columnValue,columnValueMappingForCondition);
  	  
 	       System.out.println("333333333333");
 	   
 	     System.out.println("no of records..."+records.size());
 	   
 	        } 
 	     catch (SQLException e) {
			e.printStackTrace();
		}
  }
  
  
  
  static Connection getConnection() {
		try
		{
			// create a mysql database connection
			String myDriver = "oracle.jdbc.driver.OracleDriver";
			String myUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			System.out.println("444444");
			Class.forName(myDriver);
			System.out.println("66666666666666666");
			con = DriverManager.getConnection(myUrl, "system", "suraj");
			// the mysql insert statement
		} catch (Exception e)
		{
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());

		}
		return con;
	}

  
  
  
  
  
  
  
  
	
	
	
	
	
}

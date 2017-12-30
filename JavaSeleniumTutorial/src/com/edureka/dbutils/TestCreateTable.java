package com.edureka.dbutils;


public class TestCreateTable {
	
    public static void main(String[] args) {
		
    	
    	String s="surycfg";
   
    /*	if(s.contains("a"))
    	{
    		System.out.println("fine");
    	}
    	
    	else if(s.contains("c"))
    	{
    		System.out.println("cherry");
    	}
    	*/
    
    	
    	
    	
    /*	final Matcher m = Pattern.compile("[ABCD]").matcher("aoeuaAaoe");
    	if (m.find())
    	  switch (m.group().charAt(0)) {
    	  case 'A': break;
    	  case 'B': break;
    	  }
    	
    	*/
    	
    	
    	String[] arr={"a","c"};
    	
    	int i;
    	for(i=0;i<arr.length;i++)
    	{
    		if(s.contains(arr[i]))
    			break;
    	}
    	
    	switch(i)
    	{
    	  case 0:
    		  System.out.println("fine");
    		  break;
    	  case 1 :
    		  System.out.println("cherry");
    	
    	}
    	 
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
	}
	
}

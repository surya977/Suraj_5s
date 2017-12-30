package com.edureka.enumswitchcase;


// enum Day1
//{
//	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY  
//}

interface Day1
{
	
	//static final Day1 SUNDAY=new Day1();
	
	
}

public class Test {
	
	
	 enum Day implements Day1
	{
		  
		 SUNDAY,MONDAY,TUESDAY(200),WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
		int x;
		public int getT()
		{
			return x;
		}
		Day()
		{
			System.out.println("constructor");
			x=80;
		}
		Day(int p)
		{
			System.out.println("constructor");
			x=p;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		/*Day[] da=Day.values();
		for(Day ddd:da)
		{
			System.out.println(ddd);
		}
		
		
		System.out.println(Day.TUESDAY.getT());
		System.out.println(Day.SUNDAY.ordinal());
		for(Day d:Day.values())
		{
		todaysWork(d);
		}*/
		
		String s="abc";
		
		/*if(s.equals("abc")||s.equals("pqr"))
		{
			System.out.println("fine....");
		}
		else
		{
			System.out.println("not fine...");
		}
		*/
		
		
		switch(s)
		{
		    case "abc" :
		    case "pqr" :
		    	    System.out.println("fine...");
		    	    
		    default :
		    	    System.out.println("not fine...");
		    
		    
		    
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

	private static void todaysWork(Day d) {
		
		
		switch(d)
		{
		
		case SUNDAY:
			   System.out.println("its sunday...");
			   break;
			
		case MONDAY:
			 System.out.println("its monday...");
			   break;
		case FRIDAY:
			 System.out.println("its friday...");
			   break;
			
			
	    default:
		
		       
		
		}
		
		
	}
	

}

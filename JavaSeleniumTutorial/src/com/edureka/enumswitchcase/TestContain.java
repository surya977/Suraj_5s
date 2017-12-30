package com.edureka.enumswitchcase;

import java.util.concurrent.atomic.*;
import java.awt.*;
public class TestContain {

	static class A
	{
		String name="Amit";
		int age=20;
	}
	public static void main(String[] args) {
		
		//A a=new A();
		System.out.println("hello...........");	
		System.out.println("hello.111..........");	
		System.out.println("hello.2222..........");	
		System.out.println("hello..3333.........");	
		
		int a=10;
		int b=30;
		
		int x=a+b;
		
		if(x==40)
		{
		    System.out.println("kkk  .. "+x);
		}
		
		TestContain.get();
		
		
	}
	private static void get() {
		System.out.println("kkkkkkkkkkkkkkkkk");
		
	}
	
	void get2()
	{
		get3();
	}
	
	void get3()
	{
		
	}
	
}

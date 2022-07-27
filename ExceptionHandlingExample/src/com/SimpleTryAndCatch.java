package com;

public class SimpleTryAndCatch {
	public static void main(String args[])
	{
		System.out.println("Hi");
		int a=10;
		int b=0;
		try {
			int res=a/b;
			System.out.println("Result is "+res);
		}
		catch(Exception e) {
			System.out.println("bye.."); // custom message 
			System.out.println(e.toString());  // exception name and message 
			System.out.println(e.getMessage());  // pre-defined message
		}
	}
	}

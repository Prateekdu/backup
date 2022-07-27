package com;

public class FinallyBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jhi");
		try {
			int result =10/1;
			System.out.println("No exception");
		}
		catch(Exception e)
		{
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("Normal statement");
	}

}

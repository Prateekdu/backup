package com;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("get value using index position"+al.get(1));
		al.add(1,20);
		System.out.println("get value using index position"+al.get(1));
		System.out.println("get value using index position"+al.get(2));
		al.set(1,200);
		System.out.println("get value using index position"+al.get(1));
		al.remove(2);
		al.remove(new Integer(200));
		System.out.println(al);
	}

}

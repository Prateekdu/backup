package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Hashtable;
import java.util.TreeMap;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Map m=new HashMap();   // un order
	//	Map m=new LinkedHashMap();  // it maintain the order
	//	Map m=new TreeMap();  // ascending order as a key
		Map m=new Hashtable(); // by default methoid are synchronized or decending order as a key value
		m.put(2, "ravi");
		m.put(1, "Ajay");
		m.put(3, "Jerry");
		m.put(4, "Jack");
		System.out.println(m);
		m.put(2, "prateek");
		m.put(6, "shivam");
		System.out.println(m);
		System.out.println(m.get(1));
		System.out.println(m.get(100));
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("Jerry"));
	}

}

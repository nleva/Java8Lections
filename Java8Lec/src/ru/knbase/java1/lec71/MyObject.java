package ru.knbase.java1.lec71;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;

public class MyObject<R extends Comparable<R>> {
	
	R field;
	
	public R getField() {
		return field;
	}
//	
//	public R createNewR(Class<R> clz) throws InstantiationException, IllegalAccessException{
//		return clz.newInstance();
//	}
//	
//	public int compareTo(R o){
//		
//		return 0;
//	}

	public static void main(String[] args) {
		
//		m1();
		
		TreeSet<Object> set = new TreeSet<>();

		set.add(new Object());
		set.add(new Object());
		set.add(new Object());
		
		System.out.println(set);
				
		
	}
private static void m1() {
	Integer[] array = new Integer[10];
	Integer[] a2 = new Integer[10];
//		a2[0]="Hello!";
	a2[1]=1;
//		a2[2]=new Date();
	
	
	System.out.println(a2[0]);
	
	ArrayList<Date> todoList = new ArrayList<>();

//		todoList.add("Hello");
//		todoList.add("world");
//		todoList.add("!");
	todoList.add(new Date());
//		todoList.add(new Integer(100));
	
	todoList.get(0);
	
	
//		MyObject<String> mo  = new MyObject<>();
//		mo.compareTo("Hello");
	
	MyObject<BigInteger> mo2 = new MyObject<>();
//		mo2.compareTo(BigInteger.ZERO);
	
	
	
	System.out.println(todoList);
}
}

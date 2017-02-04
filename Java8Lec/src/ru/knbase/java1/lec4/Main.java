package ru.knbase.java1.lec4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class Main extends Object {

	public static void main(String[] args) {
		
//		newObject();
		
		
//		matrix();
//		ext();
		
		WebSite site = new SpecSite();
		System.out.println(site.getContent());
		

		
	}

	static int log(int i, String log){
		System.out.println(log);
		return i;
	}
	
	private static void ext() {
		System.out.println("START");
		A a = new B(); 
		
		a.printHello();
		Base base = a;
		base.printHello();

		System.out.println(a.field);
		System.out.println(base.field);
		new B();
	}

	private static void matrix() {
		Matrix matrix = new Matrix(2,2);
		matrix.setValue(0, 0, 9)
				.setValue(0, 1, 7)
				.setValue(1, 0, 4)
				.setValue(1, 1, 5);
		
		
		
		System.out.println(matrix.add(matrix));
	}

	private static void newObject() {
		Object obj = new Main();
		System.out.println(obj.toString());
		System.out.println(new Main().toString());
	}

	@Override
	public String toString() {
		return "hello world";
	}
	
	
	
	
}

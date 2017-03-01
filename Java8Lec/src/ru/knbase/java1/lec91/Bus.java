package ru.knbase.java1.lec91;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Bus {
	
	public static void main(String[] args) {
		
		
		
//		process(123.0);

	}

	static void processCase(Object o){
		
		System.out.println(o.getClass().getName());
		
		switch (o.getClass().getName()) {
		case "java.lang.String":
			f1((String) o);
			break;

		case "java.lang.Integer":
			f2((Integer) o);
			break;

		default:
			break;
		}
	}
	static void processIf(Object o){
		
		System.out.println(o.getClass().getName());
		
//		if(){
//			
//		}
	}

	static void f1(String s){
		System.out.println("String F1");
	}
	static void f2(Integer s){
		System.out.println("Int F2");
		
	}
	static void f3(Date s){
		System.out.println("Date F3");
		
	}
	static void f4(Long s){
		System.out.println("Long F4");
		
	}
	static void f5(BigDecimal s){
		System.out.println("BigDecimal F5");
		
	}

}

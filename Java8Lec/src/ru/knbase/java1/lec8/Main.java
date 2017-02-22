package ru.knbase.java1.lec8;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@MyAnnotation(value = "world", ages = {5,123})
//@Deprecated
public class Main {
	
	static class Nested extends Main{
		void f() {
			System.out.println("Nested.f()");
			super.f();
		}
	}
	
	private void f(){
		System.out.println("Main.f()");
	}
	
	
	
	
	@MyAnnotation
	public static void main( String[] args) throws InterruptedException {
		
		Main m;
		m = new Main();
		m.f();
		m = new Nested();
		m.f();
		
		
		
		String i = "hello";
		
		//
		int k=7;
		
		MenuItem item = MenuItem.Projects;

		System.out.println(item);
		System.out.println(item.toString());
		System.out.println(item.name());
		System.out.println(item.ordinal());
		

		Thread.sleep(2*60*60*1000);
		Thread.sleep(TimeUnit.HOURS.toMillis(2));
		TimeUnit.HOURS.sleep(2);
		
		
		switch (item) {
		case Main:
			
			break;
		case Projects:
			
			break;
		case About:
			
			break;
		case Countacts:
			
			break;

		default:
			break;
		}

	}

}

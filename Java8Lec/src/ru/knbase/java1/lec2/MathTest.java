package ru.knbase.java1.lec2;

import java.util.Date;

public class MathTest {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		long nanoTime = System.nanoTime();
		
		
		Date date = new Date();
		
		
		
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(time);
		System.out.println(nanoTime);
		
		System.out.println(new Date(time - nanoTime/1_000_000));
		
		

	}

}

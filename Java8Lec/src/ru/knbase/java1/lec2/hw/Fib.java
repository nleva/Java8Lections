package ru.knbase.java1.lec2.hw;

import java.math.BigInteger;

public class Fib {

	public static void main(String[] args) {
		BigInteger a=new BigInteger("1"),
				b=new BigInteger("1"),
				c;
		
		int MAX = 10000;
		for(int i =0 ;i<MAX;i++){
			System.out.println("["
					+ (i+1)
					+ "]"
					+ "="
					+ a);
			
			
			c=a.add(b);
			a=b;
			b=c;
		}
			
	}
}

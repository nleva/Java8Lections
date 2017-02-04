package ru.knbase.java1.lec3;

import java.util.Arrays;

public class Cast {

	public static void main(String[] args) {
		float f = 5L;
		long k = (long) 5.0f;
		
		int i = 0;

		int[][] array = {{1,2,3},{4,5,6}};
		int[][] array2 = {{1}};
//		long[] a2 = array;
		
//		Arrays.sort(array);
		
//		for (int j : array) {
//			System.out.println(j);
//		}
		
		System.out.println(Arrays.deepEquals(array, array2));
		
		String asString = Arrays.deepToString(array);
		System.out.println(asString);

		System.out.println(1+2+"hello");
		System.out.println("world"+1+2);
		
		i='A';
		char c = 'A';

		System.out.println("c="+c);
		System.out.println(""+'c'+'='+c);
		
		String s1 = "hello world";
		String s2 = "hello world";
		String s3 = "h"
				+ "e"
				+ "l"
				+ "l"
				+ "o"
				+ " "
				+ "w"
				+ "o"
				+ "r"
				+ "l"
				+ "d";

		String s4_1 = "hello";
		String s4_2 = " world";
		String s4 = s4_1+s4_2;
		
		String s5 = "hello".concat(" world");
		String s6 = new String(s1);
		String s7 = s6.intern();
		
		
		
		

		System.out.println("s1==s1? "+(s1==s1));
		System.out.println("s1==s2? "+(s1==s2));
		System.out.println("s1==s3? "+(s1==s3));
		System.out.println("s1==s4? "+(s1==s4));
		System.out.println("s1==s5? "+(s1==s5));
		System.out.println("s1 equals s6? "+(s1.equals(s6)));
		System.out.println("s1==s7? "+(s1==s7));
		
		
		byte val = 127;
		System.out.println(val); //127
		System.out.println(val+1); //128 
		System.out.println(val+=256); //0 val=1
		System.out.println(++val); //val=2 2
		
		val =0;
	    byte b1 = 0b00000001;
	    byte b2 = 1;
	    byte b3 = (byte) (b1+b2);
	}

}

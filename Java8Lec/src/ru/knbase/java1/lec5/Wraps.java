package ru.knbase.java1.lec5;

public class Wraps {

	public static void main(String[] args) {

//		wraps_1();

		Integer i = 555;
		Integer j = 555;

		System.out.println(i==j);
		System.out.println(i.equals(j));
		System.out.println(i == (j+=0));
		
		for(int k=-200; k<200;k++){
			i=k;
			j=new Integer(k);
			System.out.println(k+" \t\t"+(i==j));
		}
		
		
		
		

	}

	private static void wraps_1() {
		double i = 5;
		Integer j = 5;
		int[] k = { 5 };

		String s = j.toString(); // s = "5";

		Character c = 'A';
		char cc = c;

		System.out.println(Integer.toString(35 * 35, 36));
		System.out.println(Integer.parseInt("11", 36));

		// "asddsa"

		String src = Integer.toString(111, 36);

		boolean isPalindrom = isPalindrom(src);
		System.out.println(src + " is " + (isPalindrom ? "palindrom" : "not palindrom"));

		int radix_1 = 7;
		int radix_2 = 23;
		printPalindroms(3, 11);
	}

	private static void printPalindroms(int radix_1, int radix_2) {
		for (int num = 0; num < 10_000_000; num++) {
			String string_1 = Integer.toString(num,radix_1);
			String string_2 = Integer.toString(num,radix_2);
			if(isPalindrom(string_1) && isPalindrom(string_2)){
				System.out.println(num+"(10) = "+string_1+"("
						+ radix_1
						+ ") = "+string_2+"("
						+ radix_2
						+ ")");
			}
		}
	}

	/**
	 * явл€етс€ ли строка палиндромом
	 * 
	 * @param src
	 * @return
	 */
	public static boolean isPalindrom(String src) {
		int halfLen = src.length() / 2;// alt+shft+L
		for (int indx = 0; indx < halfLen; indx++) {

			int otherIndx = src.length() - 1 - indx;

			char a = src.charAt(indx);
			char b = src.charAt(otherIndx);

			if (a != b)
				return false;
		}
		return true;
	}

}

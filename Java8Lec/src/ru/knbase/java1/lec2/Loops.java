package ru.knbase.java1.lec2;

public class Loops {

	public static void main(String[] args) {
		// #####################
		// #####################
		// #####################
		// #####################
		// #####################
		
		int W = 10;
		int H = 9;
		
		
		printSquare(2, 2);

		return;
//		int a= add(add(2,3),5);
//		System.out.println(a);
	}

//	static int add(int a, int b){
//		return 0;
//	}

	/**
	 * Печать прямоугольника
	 * @param width ширина
	 * @param height высота
	 */
	private static void printSquare(int width, int height) {
		for(int h =0 ; h<height ; h++){
			printLine(width);
		}
		return;
	}

	private static void printLine(int W) {
//		System.exit(0);
//		System.
		for(int w=0; w<W ; w++){
			System.out.print("#");
		}
		System.out.println();
		return;
	}

}

package ru.knbase.java1.lec2;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = new int[10];

		array[0] = 5;
		array[9] = 6;
		array[9] = array[0];

		int[] a2 = { 4, 4, 4, 4 };

		int[] a3 = a2;

		a2 = new int[] { 5, 5, 5, 5, 5, 5 };
		
		int[] j[] = {};
		
		int arraySize = 2;
		int matrix[][] = new int[20][30];
		int[] tmp;
		tmp=matrix[1];
		
		matrix[0][0] = 1; matrix[0][1] = 2;
		matrix[1][0] = 3; matrix[1][1] = 4;
	
		System.out.println(matrix[0]);
		System.out.println(tmp[1]);
//		tmp[1]=5;
		System.out.println(matrix[1][1]);
		
//		for
//		while
//		do

		System.out.println("--------------");
		int i=0;
		while( i < tmp.length ){
			System.out.println(tmp[i]);
			i++;
		}
		//i=2
		System.out.println("--------------");
		
		for( int k = 0 ; k < tmp.length ; k++ ){
			if(tmp[k] % 2 == 1){
				continue;
			}
			System.out.println("tmp["
					+ k
					+ "] = "
					+ tmp[k]);
//			break;
			
		}
		
		
		do{
			System.out.println("i="+i);
		}while(i < tmp.length );
		

		System.out.println("matrix.length="+matrix.length);
		System.out.println("matrix[0].length="+matrix[0].length);
		
		

	}

}

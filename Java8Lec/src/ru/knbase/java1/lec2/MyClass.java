package ru.knbase.java1.lec2;

public class MyClass {

	public static void main(String[] args) {
		double d = 1e2 +  0x1F / 2;
		double k = 0; // 111111111 -> 00000000 -> 1111111
		
		boolean bool = true; //false

		bool = false & true;
		bool = true | false;
		bool = true ^ false;

		bool = false && true;
		
		boolean bool2=false;
		
//		bool = bool = !bool;
		
		bool = (5<3) && (/*bool=*/5>0);
		bool = true || false;
		bool = true == false;
		bool = true != false;

		bool = !true ;

		bool = 5 < 3;
		bool = 5 <= 3;
		bool = 5 > 3;
		bool = 5 >= 3;
		bool = 5 == 3;
		bool = 5 != 3;
		
		bool= Math.random()>0.5;
		
		String j = bool ? "hello" : "world";
		
		//   (_1_) + (_2_) -> (_R_)
		//   (_1_) ? (_2_) : (_3_) -> (_R_)
		
		System.out.println(j);
		if(bool){
			j="hello";
		}else{
			j="world";
		}

		boolean array[] = {true,false,true,true,true,true};//new boolean[32];
		int flags = 0b0000_0000__0000_0000__0000_0000__0000_0000; 
		
		//from boolean array to int
		for(int i=0; i<array.length; i++){ //[true] [false] [true] [...]
			int tmp =  (array[i]?1:0) << i ;
			flags |= tmp; // 0011 * 0100 -> 0111; 1111 * 0100 -> 1111
		}
		
		System.out.println(Integer.toString(flags, 2));
		
		
		k = 0b101 
		  & 0b011;
		k = 0b101 
		  | 0b011;
		k = 0b101 
		  ^ 0b011;
		k= ~0;
		k= (1<<31)<<1;  //  0001 << 3 1000
		k= -1>>>1; // 1111 >> 1 -> 1111
		k=128>>6;
		
		k=~(1L<<63); // 1000
		
		k=Math.pow(5, 2.12);
		
		k=-k;
		
		int i = 1;
		i++;
//		i = i+1;
		++i;
		i--;
		--i;
		
		i+=5;
		i*=8;
		
		i=0;
		i=i++ + 0;
		// tmp=0  //i
		// i=i+1
		// tmp = tmp+0
		// i = tmp 
		
		System.out.println(i);
		

	}

}

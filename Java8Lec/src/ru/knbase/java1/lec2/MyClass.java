package ru.knbase.java1.lec2;

public class MyClass {

	public static void main(String[] args) {
		double d = 1e2 + 1 / (double)2;
		double k = 0; // 111111111 -> 00000000 -> 1111111
		
		boolean bool = true; //false

		bool = false & true;
		bool = true | false;
		bool = true ^ false;

		bool = false && true;
		
		boolean bool2=false;
		
		bool = (5<3) && (5>0);
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
		// tmp=0
		// i=i+1
		// tmp = tmp+0
		// i = tmp 
		
		System.out.println(i);
		

	}

}

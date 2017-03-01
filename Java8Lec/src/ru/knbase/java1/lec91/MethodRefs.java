package ru.knbase.java1.lec91;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

interface Operator<X>{
	
	X f(X op1, X op2);
	
}

public class MethodRefs {
	
	public static void main(String[] args) {

		BigInteger a = BigInteger.ONE;
		
		BigInteger b = a.add(a);
		

//		new BigInteger
		
		System.out.println(process(a, b, (op1,op2) -> op1.add(op2)));
		System.out.println(process(a, b, BigInteger::subtract));
		
		List<String> list = Arrays.asList("1","100","10000000000000","999999999999999999999999999999999999999999999999999999999999999999999999999999");
		List<Integer> list2 = Arrays.asList(1,2,3,4);
		BigInteger result = list2.stream()
			.map(i->i.toString())
			.map(BigInteger::new)
//			
//			.map(i -> new BigInteger(""+i))
			.reduce(BigInteger::add).orElse(BigInteger.ZERO);
		System.out.println(result);
		
		
		
//		list.forEach(action);
		
		
		
	}

	
	static <T> T process(T operand1, T operand2, Operator<T> operator){
		return operator.f(operand1, operand2);
	}

}


package ru.knbase.java1.lec91;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ForEachTest {

	public static void main(String[] args) {
		String[] strings = { "hello", "world", "!" };
		List<String> list = Arrays.asList(strings);

		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		};

		// forEachMethod(list, c);

		// forEachMethod(list, (String str) -> { print(str); });

		// до 20:35

		// forEachMethod(list, ForEachTest::print);

		list.forEach(ForEachTest::print);

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 7, 7, 3454, 35, 5, 65, 43, 45, 34, 5, 23, 2, 34, 2346,
				547, 658, 768, 66, 65);

//		integers.forEach(i -> {
//			if (i > 100)
//				System.out.println(i);
//		});

//		new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		};
		new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {
				return ""+t;
			}
		};
		List<Double> longs = integers.parallelStream()
			.filter(i -> i > 10)
			.filter(i -> i < 100)
			.map(i-> new StringBuilder(i+"").reverse().toString() )
//			.map(StringBuilder::new)
			
			.map(Integer::parseInt)
			.map(Integer::doubleValue)
			.collect(Collectors.toList())
			;
		
		
		System.out.println(longs);
//			.forEach(i -> System.out.println(i+1));

	}

	private static void print(Object str) {
		System.out.print(str + " ");
	}

	static public <T> void forEachMethod(Collection<T> collection, Consumer<T> consumer) {
		for (T o : collection) {
			consumer.accept(o);
		}
	}

}

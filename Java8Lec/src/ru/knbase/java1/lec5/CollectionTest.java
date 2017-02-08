package ru.knbase.java1.lec5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>(10);

		arrayList.add("world");
		arrayList.add("aasd");
		arrayList.add("qwe");
		arrayList.add(0,"hello");
//		list.remove(2);

//		Collections.shuffle(list);
//		list.retainAll();
		System.out.println(arrayList);
		
		
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("asd");
		linkedList.add("xcvxc");
		linkedList.add("fghfg");
		linkedList.add("wer");
		
		
		Iterator<String> iterator = arrayList.iterator();
		for (;iterator.hasNext();) {
			System.out.println(iterator.next());
//			iterator.remove();
		}
		for (String string : arrayList) {
			System.out.println(string);
		}
		
		List<String> list = arrayList;
		
		for(int i = 0 ; i<50; i++){
			list.clear();
			long duration = addRandomStrings(list, 10_000);
			System.out.println(duration/1000/1000.0+"ms");
		}
//		System.out.println(list);
		
		
		Set<String> set = new TreeSet<>();
		set = new HashSet<>();
		set.add("hello");
		set.add("hello");
		set.add("hello");
		set.add("hello");
		set.add("world");
		System.out.println(set);
		

	}

	/**
	 * Добавление случайных строк
	 * @param dest
	 * @param count
	 * @return Время выполнения метода в ns
	 */
	private static long addRandomStrings(List<String> dest, int count) {
		long start = System.nanoTime();
		for(int i =0 ; i<count; i++){
			String rnd = Integer.toString((int)(Math.random()*Integer.MAX_VALUE), 36);
			dest.add(0,rnd);
//			dest[0]=rnd;
			
		}
		long stop = System.nanoTime();
		return - start + stop;
	}

}

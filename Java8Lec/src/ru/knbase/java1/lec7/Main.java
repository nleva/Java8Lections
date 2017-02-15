package ru.knbase.java1.lec7;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	static String src = "askfbdjhbdsdbsfhsdgjfjdsgfsdfgjsd";
	
	public static void main(String[] args) {
		// 20 продуктов на экран
		
//		System.out.println(src.substring(2,2+i));
		List<Product>  products;
		
		int size = 20;
		products = getProducts(size, 0);
		
		Page<Product> page = new Page<>();
		page.setItems(products);
		page.setCurrentPage(0);
		page.setTotalPages(10);
//		page.setItems(new ArrayList<String>());
		
//		System.out.println(getChars(4, 2));
		

	}

	private static List<Product> getProducts( int size, int offset) {
		List<Product>  products = new ArrayList<>();
		for(int i=0; i<size; i++){
			products.add(new Product());
		}
		return products;
	}


	private static List<Character> getChars( int size, int offset) {
		List<Character>  chars = new ArrayList<>();
		for(int i=offset; i<offset+size; i++){
			chars.add(src.charAt(i));
		}
		return chars;
	}

	
	
	
	
	
}

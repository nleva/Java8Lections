package ru.knbase.java1.lec6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReadFromConsole {

	static HashMap<Character, Integer> stat = new HashMap<>();
	static HashMap<String, Integer> wordStat = new HashMap<>();
	static HashMap<String, String> props = new HashMap<>();

	public static void main(String[] args) throws Exception {

		props.put("volume", "100%");
		props.put("height", "50%");
		props.put("width", "none!!!");
		props.put("path", "c:/asd/asdasd/asd/asd/asd");
		props.put("url","yandex.ru" );
		props.put("width", "asdasd");

		System.out.println(props.get("width"));
		
		InputStream is = System.in;
		is = new FileInputStream(new File("c:/txt/test.txt.txt"));
		// is=new URL("https://github.com").openConnection().getInputStream();
		Scanner scanner = new Scanner(is);

		System.out.println("enter line:");
		for (; scanner.hasNextLine();) {
			String line = scanner.nextLine();
			// System.out.println("scanned: "+nextLine);
			int words = 1;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == ' ') {
					words++;
				}
			}
			// System.out.println("words count:
			// "+nextLine.split("\\s+").length);
			countLetters(line);
			countWorlds(line);
		}
		printStat();
		printWordStat();

	}

	private static void printStat() {
		Set<Entry<Character, Integer>> set = stat.entrySet();
		for (Entry<Character, Integer> e : set) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

	private static void printWordStat() {

		Set<Entry<String, Integer>> set = wordStat.entrySet();

		Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				int res = o1.getValue().compareTo(o2.getValue());
				return res > 0 ? 1 : -1;
			}
		};

		TreeSet<Entry<String, Integer>> sortedSet = new TreeSet<>(comparator);
		sortedSet.addAll(set);

		for (Entry<String, Integer> e : sortedSet) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}

		System.out.println("uniq words = " + set.size());
	}

	private static void countLetters(String nextLine) {
		// stat.clear();
		for (int i = 0; i < nextLine.length(); i++) {
			char current = nextLine.charAt(i);
			Integer count = stat.get(current);
			stat.put(current, (count == null) ? 1 : (count + 1));
		}
	}

	private static void countWorlds(String line) {
		String[] words = line.split("[\\s,._!?)(\";:]+");

//		for(String word : words){
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			Integer count = wordStat.get(word);//<--- world:null
			wordStat.put(word, (count == null) ? 1 : (count + 1));// hello:2, world:1
			
		}
	}

}

package ru.knbase.java1.lec9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		
		String str = "hdsvf 01.11.2012 sdhfbvsdbfsjdvf jh 10.11.2017 sdjfhf hsdfv sjdgfs djfgshd f";
		
		String regex = "[0-9][0-9]\\.[0-9][0-9]\\.[0-9][0-9][0-9][0-9]";
		regex = "\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d";
		regex = "\\d{2,2}\\.\\d{2,2}\\.\\d{4,4}";
		regex = "\\d{2}\\.\\d{2}\\.\\d{4}";
		regex = "(\\d{2})\\.(\\d{2})\\.(?<year>\\d{4})";
		regex = "((\\d{2})\\.){2}(?<year>\\d{4})";
		System.out.println(regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		
		for(;m.find();){
			System.out.println(m.group(0));
			System.out.println(m.group("year"));
		}
		
		System.out.println(str.replaceAll("(\\d{2})\\.(\\d{2})\\.(?<year>\\d{4})", "$1-$2-$3"));

	}

}

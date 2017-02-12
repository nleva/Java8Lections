package ru.knbase.java1.lec6;

import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	int age;
	String name;
	long width;
	Date date;
	boolean isTrue;
	Boolean isOK;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((isOK == null) ? 0 : isOK.hashCode());
		result = prime * result + (isTrue ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (width ^ (width >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapTest other = (MapTest) obj;
		if (age != other.age)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (isOK == null) {
			if (other.isOK != null)
				return false;
		} else if (!isOK.equals(other.isOK))
			return false;
		if (isTrue != other.isTrue)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	static String en = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./"
			+ "~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?";

	static String ru = "¸1234567890-=éöóêåíãøùçõú\\ôûâàïğîëäæıÿ÷ñìèòüáş."
			+ "¨!\"¹;%:?*()_+ÉÖÓÊÅÍÃØÙÇÕÚ/ÔÛÂÀÏĞÎËÄÆİß×ÑÌÈÒÜÁŞ,";

	static HashMap<Character, Integer> enMap = new HashMap<>();
	static HashMap<Character, Integer> ruMap = new HashMap<>();

	
	
	static {
		for (int i = 0; i < en.length(); i++) {
			enMap.put(en.charAt(i), i);
			ruMap.put(ru.charAt(i), i);
		}
		
		Set<Entry<Character, Integer>> entrySet = enMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
	}

	static String fromEnToRU(String src) {

		String res = "";

		for (int i = 0; i < src.length(); i++) {
			char current = src.charAt(i);
			Integer indx = enMap.get( current );
			if(indx==null){
				res+=current;
			}else{
				res+=ru.charAt(indx);
			}
		}

		return res;
	}
	
	static String fromRuToEn(String src) {

		String res = "";

//		res+="a";//a
//		res+="a";//aa
//		res+="a";//aaa

		for (int i = 0; i < src.length(); i++) {
			char current = src.charAt(i);
			Integer indx = ruMap.get( current );
			if(indx==null){
				res+=current;
			}else{
				res+=en.charAt(indx);
			}
		}

		return res;
	}

	public static void main(String[] args) {

		// 000101010010 -> 0
		// 000101010001 -> 0

		// maps1();

		String src = "Ghbdtn vbh! ïğèâåò sddfhgfghhlkj";

		System.out.println(fromEnToRU(src));
		System.out.println(fromRuToEn("Ğóääù öùêäâ"));

	}

	private static void maps1() {
		HashMap<String, String> map = new HashMap<>();
		map.put("Hello", "world");
		map.put("asd", "111");
		map.put("dsa", "222");
		map.put("zxc", "world");
		map.put("Hello", "world!!!");

		String val = map.get("Hello");
		System.out.println(val);

		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}

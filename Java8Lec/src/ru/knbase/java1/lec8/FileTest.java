package ru.knbase.java1.lec8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class FileTest implements Serializable {
//	private static final long serialVersionUID = 1_000_001L;
	
	
	
	
	int i;
	String k;
	Date d;
	transient Socket s;

	static HashMap<String, Integer> map = new HashMap<>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("/home/tuser/stats_.bin");
		
		String[] words = FileUtils.readFileToString(new File("/home/tuser/text_.txt"), "utf-8").split("[\\s]+");
		for (String w : words) {
			Integer count = map.get(w);
			map.put(w, count==null?1:(count+1));
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(map);
		
	
		String s = "–Û‰‰˘ ˆ˘Í‰‚";
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		System.out.println(obj);
//		write(f);
		
//		Scanner scanner = new Scanner(f);
//		for(;scanner.hasNextLine();){
//			scanner.nextLine();
//		}
		
//		String str = read(f);
		
//		copy(f);
		
		
//		System.out.println(str);

	}

	private static void copy(File f) throws IOException, MalformedURLException, FileNotFoundException {
		IOUtils.copy(new URL("http://specialist.ru").openStream(), new FileOutputStream(f));
	}

	private static String read(File f) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(f);
		int available = fis.available();
		byte[] buf = new byte[available];
		fis.read(buf);
		
		String str = FileUtils.readFileToString(f,"utf-8");
		buf = FileUtils.readFileToByteArray(f);
		List<String> lines = FileUtils.readLines(f,"utf-8");
		return str;
	}

	private static void write(File f) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream(f);
		
		fos.write("hello world!!!".getBytes());
		
		//21:19
		for(int i=0;i<10;i++)
		FileUtils.writeStringToFile(f, "ASDFGHJK\n", "utf-8", true);
	}

}



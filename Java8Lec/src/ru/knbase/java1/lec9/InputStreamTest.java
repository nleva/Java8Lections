package ru.knbase.java1.lec9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class InputStreamTest {

	public static void main(String[] args) throws Exception {
		
		Runtime runtime = Runtime.getRuntime();
		Process bash = runtime.exec("chromium http://habrahabr.ru");//dir    ls
//		OutputStream os = bash.getOutputStream();
//		os.write("dir\r\n".getBytes());
//		os.flush();
		InputStream is = bash.getInputStream();
		Scanner scanner = new Scanner(is);
		for(;scanner.hasNext();){
			String line = scanner.nextLine();
			System.out.println(line);
		}
		bash.waitFor();
		
//		read();

	}

	private static void read() throws IOException {
		InputStream is = System.in;

//		TimeUnit.SECONDS.sleep(5);
		
		System.out.println("press enter");
		
		System.out.println("available = "+is.available());
		int b = is.read();

		System.out.println("available = "+is.available());
		if(b>=0)
			System.out.println((char)b);
		else{
			System.out.println(b);
		}
		System.out.println("stop");
		//		scan(is);
	}

	private static void scan(InputStream is) {
		Scanner scanner = new Scanner(is);
		for(;;){
			System.out.println("enter long number");
			long nextLong = scanner.nextLong();
			System.out.println(nextLong);
		}
	}

}

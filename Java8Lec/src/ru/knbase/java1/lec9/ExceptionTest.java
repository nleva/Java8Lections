package ru.knbase.java1.lec9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

class UserNotFound extends Exception {

	public UserNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}

public class ExceptionTest {

	public static void main(String[] args) {

		chain();
//		m4();
		
		
//		m3();
		
//		m2();
		// m1();

	}

	static void chain(){
		try {
			throw new UserNotFound("Base exception");
		} catch (Exception e) {
			throw new RuntimeException("chain ",e);
		}
	}
	
	private static void m4() {
		try {
			Scanner scanner = new Scanner(new URL("").openStream());
		} catch (IOException notImportant) {}
	}
	
	static String readFile(){
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("/home/tuser/spec.html"));
			scanner.nextLine();
			int i = 2/0;
		} catch (RuntimeException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(scanner!=null)
				scanner.close();
		}
		
		return "";
	}

	private static void m3() {
		System.out.println(fin());
	}

	static int fin(){
		
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("fin.catch");
			throw new RuntimeException("qwer");
		} finally {
//			throw new RuntimeException("HELLO WORLD");
		}
	}
	
	private static void m2() {
		try {
			int i[] = { 1, 2, 3 };
			System.out.println(i[123]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
		}
		System.out.println("stop");
	}

	private static void m1() {
		for (int i = 0; i < 2; i++) {
			try {
				login("user", "1234");
				break;
			} catch (RuntimeException e) {
				e.printStackTrace();
				continue;
			}
		}
		System.out.println("login ok");
	}

	public static void login(String user, String pass) {

		switch (user) {
		case "user":
			if (pass.equals("123"))
				return;
			break;

		default:
			throw new RuntimeException("User not found");
		}

		RuntimeException exception = new RuntimeException("Try login again");
		throw exception;
	}

}

package ru.knbase.java1.lec4;

public class Base extends Object{
	static {
		System.out.println("static Base.init1");
	}
	int field = Main.log(5, "Base.field=5");
	
	public Base() {
		System.out.println("Base()");
	}
	
	public Base(int field) {
		this.field = field;
	}


	public void printHello(){
		System.out.println("Hello Base");
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		new A();
		System.out.println("stop");
	}
}

class A extends Base{
	static {
		System.out.println("static A.init1");
	}
	public A() {
		System.out.println("A()");
	}
	{
		System.out.println("A.init1");
		field=5;
	}
	int field = Main.log(10, "A.field=10");

	{
		System.out.println(field);
		System.out.println("A.init2");
	}
	public A(int i) {
		super(i);
	}
	

	@Override
	public void printHello() {
		System.out.println("Hello A");
	}
}

class B extends A implements Runnable{
	public B() {
		System.out.println("B()");
	}
	public B(int i) {
		super(i);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

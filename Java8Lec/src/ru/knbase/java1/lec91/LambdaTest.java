package ru.knbase.java1.lec91;

import java.util.function.Consumer;

public class LambdaTest {

	static class Target implements Runnable {
		@Override
		public void run() {
			System.out.println("Target.run()");
		}
	}

	static Runnable[] runnables = new Runnable[10];
	
	public static void main(String[] args) {
		System.out.println("start");
		Runnable t = new Target();

		System.out.println("-1-");
		class Inner implements Runnable {
			@Override
			public void run() {
				System.out.println("Inner.run()");
			}
		}

		System.out.println("-2-");

		t = new Inner();

		System.out.println("-3-");
		test(t);
		System.out.println("stop");
	}

	private static void test(Runnable t) {
		
		class Inner implements Runnable {
			int v;
			public Inner(int v) {
				this.v=v;
			}
			
			@Override
			public void run() {
				System.out.println("anon.run() "+v);
				
			}
		}
		
		for (int i = 0; i < 10; i++) {
			int value = 100+i;
			int tmp = i;
//			value++;
			runnables[i] = new Inner(value);
			
			runnables[i] = new Runnable(/*value*/) {
				//int value;
				@Override
				public void run() {
					System.out.println("anon.run() "+tmp);
					
				}
			};

			runnables[i] = () -> {
				System.out.println("lambda.run() "+tmp);
			};
			
			runnables[i] = () -> System.out.println("lambda.run() "+tmp);
			
//			Consumer<T>
			
			
			

			runnables[i].run();
		}
	}

}

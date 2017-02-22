package ru.knbase.java1.lec71;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

class OnClick implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("clicked!!!");
	}
}

public class Outter {// Static!!!

	private int i;
	private static int j;
	
	class Nested{ //Non static!!!!
		
		public Nested() {
			i=1;
			j=1;
		}
	}
	
	static class StaticNested{// Static!!!
		
		
		int f(){
			return 0;
		}
		static int k(){
			return 0;
		}
		public StaticNested() {
			j=5;
//			i=5;
		}
	}
	
	
	public static void main(String[] args) {

//		classes();
		
		JFrame frame = new JFrame("My App");
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		JButton button = new JButton("ok");
//		button.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("create button");
				button.setText("qwer");
				
			}
		});

		button.addActionListener((ActionEvent e) -> {
			System.out.println("listener");
		});

		button.addActionListener(( e ) -> {
			System.out.println("listener2");
		});

		button.addActionListener( e  -> {
			System.out.println("listener3");
		});
		
		button.addActionListener( e  -> System.out.println("listener4") );
		
		
		
		frame.add(button);
		
		
		
		
	}


	private static void classes() {
		Outter outter = new Outter();
		Outter.StaticNested staticNested = new Outter.StaticNested();
		Outter.Nested nested = outter.new Nested();
		
		HashMap<String, String> map = new HashMap<>();
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		
		class Inner extends Number { // Non static!!!
			public Inner() {
				// TODO Auto-generated constructor stub
			}
			int f(){
				int i2 = outter.i;
				return 0;
			}
			@Override
			public int intValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public long longValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public float floatValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public double doubleValue() {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		
		Inner inner = new Inner();
		inner.f();
		
		ArrayList<String> list = new ArrayList<String>(){
			@Override
			public boolean add(String e) {
				System.out.println(e);
				return super.add(e);
			}
		};

		list.add("hello");
		list.add("world");
		list.add("!");
	}

}

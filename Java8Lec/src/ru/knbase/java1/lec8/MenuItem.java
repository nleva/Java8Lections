package ru.knbase.java1.lec8;

public enum MenuItem {
	Main("������� ��������"),
	Projects("�������"),
	Project_1("������ 1", Projects),
	About("� ���"),
	Countacts("��������");
	
	String ruName;
	MenuItem parent;

	private MenuItem() {
	}
	private MenuItem(String name) {
		ruName = name;
	}
	private MenuItem(String name, MenuItem item) {
		ruName = name;
		parent = item;
	}
	
	
	@Override
	public String toString() {
		return ruName;
	}
}

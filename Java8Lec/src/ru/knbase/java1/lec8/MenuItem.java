package ru.knbase.java1.lec8;

public enum MenuItem {
	Main("Главная страница"),
	Projects("Проекты"),
	Project_1("Проект 1", Projects),
	About("О нас"),
	Countacts("Контакты");
	
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

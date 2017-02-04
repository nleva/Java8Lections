package ru.knbase.java1.lec4;

public interface WebSite {
	
	abstract void setUrl(String url);
	abstract String getUrl();
	public abstract String getContent();
	String[] getNews();
	String[] getProducts();
	String[] getMenuUrls();

}

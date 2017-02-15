package ru.knbase.java1.lec4;

import java.io.InputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SpecSite implements WebSite, Serializable {

	private String url="http://specialist.ru";
	String content="";
	
	@Override
	public void setUrl(String url) {
		this.url=url;
	}

	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public String getContent() {
		if(content.isEmpty()){
			try {
				URL u = new URL(url);
				InputStream is = u.openConnection().getInputStream();
				Scanner scanner = new Scanner(is,"utf-8");
				for(;scanner.hasNextLine();){
					content+=scanner.nextLine()+"\n";
				}
				return content;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}

	@Override
	public String[] getNews() {
		return null;
	}

	@Override
	public String[] getProducts() {
		return null;
	}

	@Override
	public String[] getMenuUrls() {
		return null;
	}

}

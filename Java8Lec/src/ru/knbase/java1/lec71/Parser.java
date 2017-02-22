package ru.knbase.java1.lec71;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.activation.MimeType;
import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser {

	public static void main(String[] args) throws Exception {

		// System.out.println("hello wolrd ");

		// test1();

		// spec_menu();

		// URL u = new
		// URL("https://ru.wikipedia.org/wiki/%D0%A0%D0%B5%D0%B3%D1%83%D0%BB%D1%8F%D1%80%D0%BD%D1%8B%D0%B5_%D0%B2%D1%8B%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F");
		// InputStream is = u.openConnection().getInputStream();

		// is.available()

		// socket();
		String urlString = "";
		String filePath = "";

		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			
			switch (arg) {
			case "-u":
			case "--url":
				urlString = args[++i];
				break;
			case "-f":
			case "--file":
				filePath = args[++i];
				break;
			case "-h":
			case "--help":
				printHelp();
				break;

			default:
				printHelp();
				System.exit(-1);
			}
			
		}
		if(urlString==null || urlString.isEmpty()){
			System.out.println("--url is emplty.");
			System.exit(-1);
		}
		if(filePath==null || filePath.isEmpty()){
			System.out.println("--file path is emplty.");
			System.exit(-1);
		}
		
		int size = saveHtml(urlString, filePath);
		System.out.println(size + "bytes loaded.");
	}

	private static void printHelp() {
		System.out.println("java -jar saveHtml.jar -u <url> -f <to_file>");
	}

	private static int saveHtml(String urlString, String filePath)
			throws MalformedURLException, IOException, FileNotFoundException {
		URL u = new URL(urlString);
		HttpURLConnection con = (HttpURLConnection) u.openConnection();
		int contentLength = con.getContentLength();
		InputStream is = con.getInputStream();
		File html = new File(filePath);

		
		
		byte[] buf = new byte[contentLength];
		is.read(buf);

		FileOutputStream fos = new FileOutputStream(html, false);
		fos.write(buf);
		fos.close();
		return contentLength;
	}

	private static void socket() throws UnknownHostException, IOException {
		Socket s = new Socket("www.specialist.ru", 80);
		OutputStream os = s.getOutputStream();
		os.write(("" + "GET / HTTP/1.1\r\n" + "Host: www.specialist.ru\r\n" + "Connection: keep-alive\r\n"
				+ "Cache-Control: max-age=0\r\n" + "Upgrade-Insecure-Requests: 1\r\n"
				+ "User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36\r\n"
				+ "\r\n").getBytes());
		os.flush();
		InputStream is = s.getInputStream();
		Scanner scanner = new Scanner(is, "utf-8");
		for (; scanner.hasNextLine();) {
			System.out.println(scanner.nextLine());
		}
		s.close();
	}

	private static void spec_menu() throws IOException, MalformedURLException {
		// CSS SELECTOR " ", ">", "+", "~", ".", "#", "[]",
		Document dom = Jsoup.parse(new URL("http://www.specialist.ru/"), 10_000);
		Elements select = dom.select(".menu_main a");
		for (Element el : select) {
			System.out.println(el.attr("href"));// Ghbdtn vbh
		}
	}

	private static void test1() throws MalformedURLException, IOException {
		URL u = new URL("https://habrahabr.ru/post/321446/");
		InputStream is = u.openConnection().getInputStream();

		Scanner scanner = new Scanner(is, "utf-8");

		String html = "";
		StringBuilder sb = new StringBuilder();
		// StringBuffer sbuf;

		for (; scanner.hasNextLine();) {
			String line = scanner.nextLine();
			// html+=line;
			sb.append(line);
			sb.append('\n');
			// System.out.println(html.length());
		}

		html = sb.toString();
		Pattern p = Pattern.compile(".*comment_10065010.*");
		Matcher m = p.matcher(html);
		for (; m.find();) {
			System.out.println(m.group(0));
		}

		Document dom = Jsoup.parse(html);
		Elements select = dom.select("#comment_10065010");
		for (Element el : select) {
			System.out.println(el.text());
		}
	}

}

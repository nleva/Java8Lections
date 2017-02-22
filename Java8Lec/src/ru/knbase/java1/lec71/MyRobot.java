package ru.knbase.java1.lec71;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

public class MyRobot {
	
	public static void main(String[] args) throws Exception {
		
		Robot r = new Robot();
		
		BufferedImage snapshot = r.createScreenCapture(new Rectangle(100, 100, 500, 500));
		
		invert(snapshot);
		
		ImageIO.write(snapshot, "jpg", new File("/home/tuser/screen.jpg"));
		
//		TimeUnit.MILLISECONDS.sleep(5000);
//		System.out.println(location);
		
//		r.mouseMove(1519,792);
		Window w = new Window(null);
		w.setVisible(true);
		w.setAlwaysOnTop(true);
		w.setBounds(0, 0, 100, 100);
		Graphics graphics = w.getGraphics();
		System.out.println(graphics);
		for(;;){
			Point p = MouseInfo.getPointerInfo().getLocation();
			Color pixelColor = r.getPixelColor(p.x, p.y);
			graphics.setColor(pixelColor);
			graphics.fillRect(0, 0, 100, 100);
			System.out.println(pixelColor);
			TimeUnit.MILLISECONDS.sleep(300);
		}
//		r.mousePress(InputEvent.BUTTON1_MASK);
//		r.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
	}

	private static void invert(BufferedImage snapshot) {
		for(int x=0;x<500;x++){
			for(int y=0;y<500;y++){
				
				snapshot.setRGB(x, y, snapshot.getRGB(x, y)^-1);
			}					
		}
	}

}

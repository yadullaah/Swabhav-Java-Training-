package com.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) throws IOException {
		
		FileInputStream a = new FileInputStream("D:\\Aurionpro\\07_13 July\\src\\com\\training\\Untitled 1");
		
		int ch;
		
		//FileOutputStream b = new FileOutputStream ("D:\\Aurionpro\\07_13 July\\src\\com\\training\\Untitled 2");
		
		
		while((ch= a.read())!=-1) {
			System.out.print((char)ch);
			//b.write(ch);
		}
		
		System.out.println("File copied successfully");
		a.close();
		//b.close();
	}

}

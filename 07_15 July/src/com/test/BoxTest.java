package com.test;
import java.util.Scanner;

import com.model.*;

public class BoxTest {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of width");
		int width = sc.nextInt();
	//	box1.setwidth(width);

		System.out.println("Enter the value of height");
		int height = sc.nextInt();
		//box1.setheight(height);

		System.out.println("Enter the value of depth");
		int depth = sc.nextInt();
	//	box1.sethdepth(depth);

		Box box1 = new Box(width, height, depth);
		System.out.println("width is "+ box1.getwidth() );
	}

}

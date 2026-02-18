package com.corejava.fundamentals;

import java.util.Scanner;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base of the triangle: ");
		double base=s.nextDouble();
		System.out.println("Enter height of the triangle: ");
		double height=s.nextDouble();
		double area=0.5*base*height;
		System.out.println("Area of the triangle: "+area);
		s.close();
	}

}

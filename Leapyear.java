package com.corejava.fundamentals;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year to check leap year: ");
		int year=sc.nextInt();
		String result=year%4==0?"leap year":"not a leap year";
		System.out.println(result);
		sc.close();
	}

}

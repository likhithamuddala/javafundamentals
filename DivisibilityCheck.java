package com.corejava.fundamentals;

import java.util.Scanner;

public class DivisibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check number is divisible by 5 or not: ");
		int num=sc.nextInt();
		String result=num%5==0?"divisible by 5":"not divisible by 5";
		System.out.println(result);
	}

}

package com.corejava.fundamentals;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check number is positive or negative: ");
		int num=sc.nextInt();
		String result=num>0?"positive number":"negative number";
		System.out.println(result);
		sc.close();

	}

}

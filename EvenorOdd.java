package com.corejava.fundamentals;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number to check even or odd: ");
		int n=s.nextInt();
		String result=n%2==0?"Even number":"Odd number";
		System.out.println(result);
		s.close();
	}

}

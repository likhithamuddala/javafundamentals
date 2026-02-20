package com.corejava.fundamentals;

import java.util.Scanner;

public class DayGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time in hours format:");
		int hour=sc.nextInt();
		System.out.println("AM or PM");
		String ampm=sc.next();
		String greeting=(ampm.equalsIgnoreCase("am")&&hour>=5)?"Good morning":
			(ampm.equalsIgnoreCase("am")&&hour>=5&&hour<=11)?"Good Afternoon":
				(ampm.equalsIgnoreCase("am")&&hour<5)?"Good Night":
					(ampm.equalsIgnoreCase("am")&&hour==12)?"Good afternoon":
						"Good Evening";
		System.out.println(greeting);
		sc.close();

	}

}

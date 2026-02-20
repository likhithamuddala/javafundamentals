package com.corejava.fundamentals;

import java.util.Scanner;

public class AgeGroupCategorizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr age:");
		int age=sc.nextInt();
		String result=(age<=12)?"Child":
			(age<=19)?"Teenager":
				(age<=64)?"Adult":
					"Senior";
		System.out.println(result);
		sc.close();
	}

}

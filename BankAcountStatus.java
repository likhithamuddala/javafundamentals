package com.corejava.fundamentals;

import java.util.Scanner;

public class BankAcountStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr account balance:");
		int balance=sc.nextInt();
		String result=(balance>=1000)?"Good standing":
			balance>=500&balance<=999?"Low balance":
				"Account overdrawn";
			System.out.println(result);
			sc.close();

	}

}

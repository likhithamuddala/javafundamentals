package com.corejava.fundamentals;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Total amount:");
		int amount=sc.nextInt();
		double result=(amount>=1000)?(amount*0.20):
			amount>=500&amount<=999?(amount*0.10):
				amount*0;
		double finalamount=amount-result;
		System.out.println("discount amount="+result);
		System.out.println("final amount="+finalamount);
		sc.close();
				

	}

}

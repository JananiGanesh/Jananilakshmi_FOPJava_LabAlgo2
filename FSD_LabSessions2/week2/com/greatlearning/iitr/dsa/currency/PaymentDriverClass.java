package com.greatlearning.iitr.dsa.currency;

import java.util.Scanner;

public class PaymentDriverClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IntegerSorting sorting=new BubbleSort();
		IntegerSorting sorting=new MergeSort();
		NotesCount counting=new NotesCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the currency denominations");
		int n=sc.nextInt();
		System.out.println("Enter the currency denomination value");
		int []denominations=new int[n];
		for(int i=0;i<n;i++) {
			denominations[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		sorting.sort(denominations);
		counting.calculateDenomination(denominations,amount);
		
	}




}



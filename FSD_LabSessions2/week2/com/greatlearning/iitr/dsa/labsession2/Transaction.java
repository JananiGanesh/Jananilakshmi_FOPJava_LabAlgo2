package com.greatlearning.iitr.dsa.labsession2;
import java.util.Scanner;
public class Transaction {
	protected int transactionFunc(int[] arr,int target) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>target) {
				return i+1;
			}
		}	
		return -1;
		
	}
}


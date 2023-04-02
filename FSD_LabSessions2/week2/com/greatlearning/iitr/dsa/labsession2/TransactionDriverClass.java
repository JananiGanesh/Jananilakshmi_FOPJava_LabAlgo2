package com.greatlearning.iitr.dsa.labsession2;
import java.util.*;
public class TransactionDriverClass {

	public static void main(String[] args)throws Exception {
		Transaction transaction=new Transaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int n=sc.nextInt();
		System.out.println("Enter the values of transaction array");
		int []trans_array=new int[n];

		for(int i=0;i<n;i++) {

			trans_array[i]=sc.nextInt();
		}
		System.out.println("Enter the total number of targets that needs to be achieved");
		int no_target=sc.nextInt();
		while(no_target>0) {
			System.out.println("Enter the value of target");
			int target=sc.nextInt();
			if(transaction.transactionFunc(trans_array,target)>0) {
				System.out.println("Target achieved after "+transaction.transactionFunc(trans_array,target)+"times");
			}
			else
				System.out.println("Given target is not achieved");
			no_target--;
		}
		sc.close();
	}

}

package com.greatlearning.iitr.dsa.currency;

public class NotesCount {

	public void calculateDenomination(int []sortedDenomination,int amount) {
		int[] notesCount=new int[sortedDenomination.length];
		try {
			for(int i=0;i<sortedDenomination.length;i++) {
				if(sortedDenomination[i]<=amount) {
					notesCount[i]=(int)amount/sortedDenomination[i];
					amount=amount%sortedDenomination[i];
					if(amount==0) {
						break;	
					}
				}
			}

			if (amount==0) {
				System.out.println("Your payment approach in order to give minimum number of notes will be");
				for(int i=0;i<sortedDenomination.length;i++) {
					if(notesCount[i]>0) {
						System.out.println(sortedDenomination[i]+":"+notesCount[i]);
					}
				}
			}
			else {
				System.out.println("The given amount cannot be achieved using highest denominations");
			}
		}catch(ArithmeticException e) {
			System.out.println("Zero is not valid denominations");
		}
	}
}

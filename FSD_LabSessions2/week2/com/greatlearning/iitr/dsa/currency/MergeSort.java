package com.greatlearning.iitr.dsa.currency;

public class MergeSort implements IntegerSorting {

	@Override
	public void sort(int[] arr) {
	sort(arr,0,arr.length-1);			
	}

	private void sort(int[] arr, int l, int h) {
		if(l<h) {
			int mid=(l+h)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
		
	}

	private void merge(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int n1=mid-l+1;
		int n2=r-mid;
		
		int[] leftarr=new int[n1];
		int[]rightarr=new int[n2];
		for(int i=0;i<n1;i++) {
			leftarr[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			rightarr[j]=arr[mid+j+1];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(leftarr[i]>=rightarr[j]) {
				arr[k]=leftarr[i];
				i++;
			}
			else
			{
				arr[k]=rightarr[j];
				j++;
			}
			k++;
		}
			while(i<n1) {
				arr[k]=leftarr[i];
				i++;
				k++;
			}
			while(j<n2) {
				arr[k]=rightarr[j];
				j++;
				k++;
			}
		}
		
	}

	




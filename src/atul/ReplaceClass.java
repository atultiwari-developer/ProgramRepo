package atul;

import java.util.Arrays;

public class ReplaceClass {
	
	public static void main(String[] args) {
		
		int[]arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int n = arr.length;
		
		int j = -1;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i] < 0) {
				j++;
				swap(arr,i,j);
			}
		}
		
		int neg = 0;
		int pos = j+1;
		
		while(pos<n &&  neg<pos && arr[neg]<0) {
			
			swap(arr,neg,pos);
			neg = neg+2;
			pos = pos +1;
			
		}
		
		
		System.out.println("ho gya");
		
	   for(int k=0;k<n;k++) {
		   System.out.print(arr[k]+" ");
	   }
		
	    	
		
	}
	
	public static void swap(int[]arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}

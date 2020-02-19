package arrray;

import java.util.Arrays;

public class AtLeastTwoGr {
	
	public static void main(String[] args) {
		int arr[] = {2, 8, 7, 1, 5};
		int n = arr.length;
		findLeast(arr,n);
		
	}
	
	public static void findLeast(int[]arr,int n) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			
			else if(arr[i] > second) {
				second  = arr[i];
			}
			
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]<second) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}

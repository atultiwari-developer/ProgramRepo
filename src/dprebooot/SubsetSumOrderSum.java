package dprebooot;

import java.util.Arrays;

public class SubsetSumOrderSum {
	
	public static void main(String[] args) {
		int arr[] = {6,2,5};
		Arrays.sort(arr);
		int sum = 7;
		int n = arr.length;
		
		boolean res = subsetSumFunc(arr,n,sum);
		System.out.println("the result is"+res);
	}

	private static boolean subsetSumFunc(int[] arr, int n, int sum) {
	
		boolean brr[][]= new boolean[2][sum+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=sum;j++) {
				if(j==0) {
					brr[i%2][j] = true;
				}
				else if(i==0) {
					brr[i%2][j] = false;

				}
				else if(arr[i-1]<=j) {
					brr[i%2][j] = brr[(i+1)%2][j-arr[i-1]] || brr[(i+1)%2][j];
				}
				else 
					brr[i%2][j] = brr[(i+1)%2][j];
			}
		}
		return brr[n%2][sum];
		
	}

}

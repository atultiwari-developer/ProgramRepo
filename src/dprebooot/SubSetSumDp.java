package dprebooot;

import java.util.Arrays;

public class SubSetSumDp {
	static int[][]brr;
	public static void main(String[] args) {
		int[]arr = {1,2,7,5};
		Arrays.sort(arr);
		int sum = 8;
		int n = arr.length;
		
		brr = new int[n+1][sum+1];
		boolean ans = getSumSet(arr,n,sum);
		System.out.println("the answer is"+ans);
	}
	private static boolean getSumSet( int[] arr, int n,int sum) {
		boolean[][]brr = new boolean[n+1][sum+1];
		for(int i=1;i<=sum;i++) {
			brr[0][i] = false;
		}
		
		for(int i=0;i<=n;i++) {
			brr[i][0] = true;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
//				else if(arr[i]>j) {
//					brr[i][j] = brr[i-1][j];
//				}
				brr[i][j] = brr[i-1][j];
				if(brr[i][j]==false && j>=arr[i-1]) {
					brr[i][j] = brr[i][j] || brr[i-1][j-arr[i-1]];
				}
			}
		}
		System.out.println("atul");
		return brr[n][sum];
	}

}

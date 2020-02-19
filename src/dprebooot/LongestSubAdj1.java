package dprebooot;

import java.util.Arrays;

public class LongestSubAdj1 {
	
	public static void main(String[] args) {
		int arr[] = {10, 9, 4, 5, 4, 8, 6};
		int n = arr.length;
		int ans = getLongestSub(arr,n);
		System.out.println("the ans is"+ans);
	}
	
	public static int getLongestSub(int[]arr,int n) {
		
		int []dp = new int[n];
		Arrays.fill(dp, 1);
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if((arr[i]==arr[j]+1) || (arr[i]==arr[j]-1)) {
					dp[i] = Math.max(dp[i],dp[j]+1);
				}
			}
		}
			
		int res = 1;
		for(int i=0;i<n;i++) {
			if(res<dp[i]) {
				res = dp[i];
			}
		}
		return res;
	}

}

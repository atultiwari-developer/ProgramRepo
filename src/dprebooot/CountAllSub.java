package dprebooot;

import java.util.ArrayList;

public class CountAllSub {
	
	public static void main(String[] args) {
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 arr.add(1);
		 arr.add(2);
		 arr.add(3);
		 arr.add(4);
		int k = 10;
		

		int res = getCountAll(arr,k);
		System.out.println("the res is"+res);
	}
	
	public static int getCountAll(ArrayList<Integer>arr,int k) {
		int n = arr.size();
		int[][]dp = new int[k+1][n+1];
		
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j] = dp[i][j-1];
				if(arr.get(j-1)<=i && arr.get(j-1)>0) {
					dp[i][j] = dp[i][j] + dp[i/arr.get(j-1)][j-1]+1;
				}
			}
		}
		
		return dp[k][n];
	}

}

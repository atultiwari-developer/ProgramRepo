package dprebooot;

public class LongestRepeatedSubDP {
	
	public static void main(String[] args) {
		String str="AABEBCDD";
		char[]arr = str.toCharArray();
		int n = str.length();
		
		String res = getLongestReapSub(arr,n);
		System.out.println("the res"+res);
	}
	public static String getLongestReapSub(char[]arr,int n) {
		int dp[][] = new int[n+1][n+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
				else if(arr[i-1]==arr[j-1] && i !=j) {
					dp[i][j] = 1+ dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		int x  = dp[n][n];
		
		int i= n;
		int j = n;
		String res = "";
		while(i>0 && j>0) {
			if(dp[i][j]==dp[i-1][j-1]+1) {
				res = arr[i-1]+res;
				i--;
				j--;
			}
			else if(dp[i][j]==dp[i-1][j]) {
				i--;
			}
			else
				j--;
		}
		return res;
		
	}

}

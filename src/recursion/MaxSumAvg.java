package recursion;

public class MaxSumAvg {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},
			           {6,5,4},
				       {7,3,9}				
		};
		
		int n =3;
		
		double res = getMaxSumAvg(arr,n);
		System.out.println("the res is"+res);
 	}
	
	public static double getMaxSumAvg(int[][]arr,int n) {
		int[][]dp = new int[n+1][n+1];
		
		dp[0][0] = arr[0][0];
		
		for(int i=1;i<n;i++) {
			dp[i][0] = dp[i-1][0] + arr[i][0];
		}
		for(int j=1;j<n;j++) {
			dp[0][j] = dp[0][j-1] + arr[0][j];
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]+arr[i][j]);
			}
		}
		
		
		return (double)dp[n-1][n-1]/(2*n-1);
	}

}

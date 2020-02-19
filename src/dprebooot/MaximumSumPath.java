package dprebooot;

public class MaximumSumPath {
public static void main(String[] args) {
	int cost[][] = {{1, 2, 3}, 
            {6, 5, 4}, 
            {7, 3, 9}}; 
      
System.out.println(maxAverageOfPath(cost, 3)); 
}


public static double maxAverageOfPath(int cost[][],int n) {
	int[][]dp = new int[n+1][n+1];
	dp[0][0] = cost[0][0];
	
	for(int i=1;i<n;i++) {
		dp[i][0] = dp[i-1][0]+cost[i][0];
	}
	
	for(int j=1;j<n;j++) {
		dp[0][j] = dp[0][j-1]+cost[0][j];
	}
	for(int i=1;i<n;i++) {
		for(int j=1;j<n;j++) {
			dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]+cost[i][j]);
		}
	}
	
	return (double)dp[n-1][n-1]/(2*n-1);
	
}
}

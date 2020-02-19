package febprac;

public class CoinChangePro {
	
	public static void main(String[] args) {
		int []arr = {1,2,3};
		int sum = 4;
		int n  =arr.length;
	}
	
	public static int getSum(int[]arr,int sum,int n) {
		
		int[][]dp = new int[n+1][sum+1];
		dp[0][0] = 1;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=sum;j++) {
				if(i>j) {
					dp[i][j] = dp[i-1][j];	
				}
//				dp[i][j] = dp[i-1][j] + arr[i-1]
			}
		}
		
		return 0;
		
		
		
	}

}

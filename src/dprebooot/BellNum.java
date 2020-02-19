package dprebooot;

public class BellNum {
     static int []arr;
	public static void main(String[] args) {
		int x = 5;
	    int k = 0;
		int res = getBellNum(5);
		System.out.println("the res"+res);
	}
	
	public static int getBellNum(int n){
		int[][]arr = new int[n+1][n+1];
		arr[0][0] = 1;
		for(int i=1;i<=n;i++) {
			arr[i][0] = arr[i-1][i-1];
			for(int j=1;j<=i;j++) {
				arr[i][j] = arr[i-1][j-1]+arr[i][j-1];
			}
		}
		
		return arr[n-1][n-1];
		
		
	}
	
}

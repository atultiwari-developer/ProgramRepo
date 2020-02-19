package dprebooot;

public class LongestIncSub {
	public static void main(String[] args) {
		String str1 = "abcvdefgh";
		String str2 = "bqdrcvefgh";
		int n =str1.length();
		int m = str2.length();
		int[][]arr = new int[n+1][m+1];
		int i;
		int j=0;
		for(i=0;i<=n;i++) {
			for(j=0;j<=m;j++) {
				if(i==0 || j==0) {
					arr[i][j] = 0;
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1]+1;
				}
				else {
					arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
				}
			}
		}
		System.out.println("atul");
		System.out.println("the ans is "+arr[n][m]);
		
	}

}

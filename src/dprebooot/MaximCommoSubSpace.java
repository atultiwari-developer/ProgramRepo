package dprebooot;

public class MaximCommoSubSpace {
	
	public static void main(String[] args) {
		String str1 = "ABCDGH";
		String str2 = "AEDFHR";
		char[]arr = str1.toCharArray();
		char[]brr = str2.toCharArray();
		int m = arr.length;
		int n  =brr.length;
		int res = getLCSLen(arr,brr,m,n);
		System.out.println("the result is"+res);
	}
	
	public static int getLCSLen(char[]arr,char[]brr,int m ,int n){
	int[][] seqArr = new int[2][n+1];
	int bi=0;
	for(int i=0;i<=m;i++) {
		bi = i &1;
		for(int j=0;j<=n;j++) {
			if(i==0 || j==0) {
				seqArr[bi][j] = 0;
			}
			else if(arr[i-1]==brr[j-1]) {
				seqArr[i][j] = seqArr[1-bi][j-1] +1 ; 
			}
			else
				seqArr[i][j] = Math.max(seqArr[bi][j-1], seqArr[1-bi][j]);
		}
	}
	
	return seqArr[m][n];
	}

}

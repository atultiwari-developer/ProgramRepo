package dprebooot;

public class LongestCommomSubDP {
	
	public static void main(String[] args) {
		String str1 = "AGGTAB";
		String str2 = "GXTXAYB";
		char[]arr = str1.toCharArray();
		char[]brr = str2.toCharArray();
		int x = arr.length;
		int y = brr.length;
		char[] res = getMaxSub(arr,brr,x,y);
		//System.out.println("the result is"+res);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}

	}	
	
	
	public static char[] getMaxSub(char[]arr,char[]brr,int x,int y) {
		
		int[][]baba = new int[x+1][y+1];
		for(int i=0;i<=x;i++) {
			for(int j=0;j<=y;j++) {
				if(i==0 || j==0) {
					baba[i][j] = 0;
				}
				else if(arr[i-1]==brr[j-1]) {
					baba[i][j] = baba[i-1][j-1]+1;
				}
				else {
					baba[i][j] = Math.max(baba[i-1][j], baba[i][j-1]);
				}
			}
			
		}
		int index = baba[x][y];

		char[]res = new char[index+1];
		int i = x;
		int j = y;
		res[index] = ' ';
		while(i>0 && j>0) {
			if(arr[i-1]==brr[j-1]) {
				res[index-1] = arr[i-1];
				index = index-1;
				i--;
				j--;
			}
			else if(baba[i-1][j] >baba[i][j-1]) {
				i--;
			}
			else
				j--;
			
		}		
		return res;
	}
	

}

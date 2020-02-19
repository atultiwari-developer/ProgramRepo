package arrray.dp;

public class PermutationCoffi {
	
	public static void main(String[] args) {
		int n =8;
		int k = 3;
		
		System.out.println("get permutation coffi"+getPermuteCoffi(n,k));
	}

	private static int getPermuteCoffi(int n, int k) {
		
		int[][]arr = new int[n+1][k+1];
	
		int i;
		int j;
		
		for(i=0;i<=n;i++) {
			for(j=0;j<=minFunc(i,k);j++) {
				
				if(j==0) {
					arr[i][j] = 1;
				}
				else if(j==1) {
					arr[i][j] = i;
				}
				
				else if(j==k) {
					arr[i][j] = arr[i][j-1]*2;
				}
				else {
					arr[i][j] = arr[i][j-1]*arr[i-1][j-1];

				}
			}
		}
		
		return arr[n][k];
	}

	private static int minFunc(int a, int b) {
		
		return a<b?a:b;
	}

}

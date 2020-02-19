package arrray.dp;

public class BioCoffie {
	
	public static void main(String[] args) {
		int n  =8;
		int k = 2;
		System.out.println("the bionomual coff "+getBioCoffie(n,k));
	}

	private static int getBioCoffie(int n, int k) {
	     int arr[][] = new int[n+1][k+1];
	     int i;
	     int j;
	     for(i=0;i<=n;i++) {
	    	 for(j=0;j<=minFunc(i,k);j++) {
	    		 if(i==j || j==0) {
	    			 arr[i][j] = 1;
	    		 }
	    		 else
	    			 arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
	    		 
	    	 }
	    	 
	     }		
		return arr[n][k];

}
	
	public static int minFunc(int a,int b) {
		return (a<b)?a:b;
	}
	
}

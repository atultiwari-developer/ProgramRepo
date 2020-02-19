package dprebooot;

public class BioCoeff {
	static int[]arr;
	public static void main(String[] args) {
		int x = 5;
		int k = 2;
		arr = new int [k+1];
		int res = getBioCoeff(x,k);
		System.out.println("res is"+res);
	}
	
	public static int getBioCoeff(int n,int k) {
		
	     arr[0] = 1;
	     for(int i=1;i<=n;i++) {
	    	 for(int j = Math.min(i, k);j>0;j--) {
	    		 arr[j] = arr[j]+arr[j-1];
	    	 }
	     }
	     return arr[k];
	}

}

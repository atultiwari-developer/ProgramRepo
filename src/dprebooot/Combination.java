package dprebooot;

public class Combination {
	
	public static void main(String[] args) {
		int x = 5;
		int res = calculateComb(5,2);
		System.out.println(res);
		
	}
	
	public static int calculateComb(int n,int r) {
		
	     int res = 1;
	     for(int i=0;i<r;i++) {
	    	 res*=n/(i+1);
	    	 n--;
	     }
		
		
		return res;
	}

}

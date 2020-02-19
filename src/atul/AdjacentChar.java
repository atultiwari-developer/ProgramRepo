package atul;

public class AdjacentChar {
	public static void main(String[] args) {
    
		int[]arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int d = 3;
		int n = 12;
		
		int gc = gcd(n,d);
		
		
		
		
     
	}
	public static int gcd(int n,int d) {
		
		if(d==0) {
			return n;
		}
		else {
			return gcd(d,n%d);
		}
	}

}

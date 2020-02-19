package kevinbhai;

public class BionomialCoeffi {
	
	public static void main(String[] args) {
		int n = 8;
		int k = 2;
		int x = getBioCoefficient(n,k);
		System.out.println("the value of bionomial coeeff"+x);
	}

	private static int getBioCoefficient(int n, int k) {
		
		int res = 1;
		
		if(k>n-k) {
			k = n-k;
		}
		
		for(int i=0;i<k;i++) {
			res*=(n-i);
			res/=i+1;
		}
		
		return res;
	}

}

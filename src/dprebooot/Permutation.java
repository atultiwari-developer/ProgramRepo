package dprebooot;

public class Permutation {
	
public static void main(String[] args) {
	int x = 5;
	int r = 2;
	int res = permute(x,r);
	System.out.println("the result is"+res);
}

public static int permute(int n,int k) {
	int res=1;
	for(int i=0;i<n;i++) {
		res = res* (i+1) ;
		if(i<(n-k)) {
			res = res/(i+1);
		}
	}
	
	return res;
}
}

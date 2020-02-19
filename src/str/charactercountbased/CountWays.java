package str.charactercountbased;

public class CountWays {
	
	public static void main(String[] args) {
		
		int n = 3;
		System.out.println("the ways are"+countStr(n,1,2));
		
	}

	private static int countStr(int n, int i, int j) {
		// TODO Auto-generated method stub
		if(i<0 || j<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		if(i==0 && j==0) {
			return 1;
		}
		
		int res = countStr(n-1,i,j);
           res+=countStr(n-1,i-1,j);
           res+=countStr(n-1,i,j-1);
		
		return res;
	}

}

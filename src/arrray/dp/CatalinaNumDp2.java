package arrray.dp;

public class CatalinaNumDp2 {
	
	public static void main(String[] args) {
		int n = 10;
		for(int i=0;i<n;i++) {
			System.out.print(cataLinaDp(i)+" ");
		}
		
	}

	private static int cataLinaDp(int n) {
		
		int[]arr = new int[n+2];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2;i<=n;i++) {
			arr[i] = 0;
			for(int j=0;j<i;j++) {
				arr[i]+= arr[j]*arr[i-j-1];
			}
			
		}
		
		return arr[n];
	}

}

package arrray.dp;

public class CatalinNo {
	
	public static void main(String[] args) {
		CatalinNo obj = new CatalinNo();
		for(int i=0;i<10;i++) {
			System.out.println(findCatalinNo(i));
		}
	}

	private static int findCatalinNo(int n) {
		
		int res = 0;
		if(n<=1) {
			return 1;
		}
		
		for(int i=0;i<n;i++) {
			res+=findCatalinNo(i)*findCatalinNo(n-i-1);
		}
		
		return res;
	}

}

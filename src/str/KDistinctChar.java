package str;

public class KDistinctChar {
	
	public static void main(String[] args) {
		int n = 5;
		int k = 3;
		
		System.out.println("find the string"+findString(n,k));
		
	}

	private static String findString(int n, int k) {
		String res = "";
		for(int i=0;i<k;i++) {
			res = res +(char)('a'+i);
		}
		int count = 0;
		for(int i=0;i<n-k;i++) {
			res = res + (char)('a'+count);
			count++;
			if(count==k) {
				count = 0;
			}
		}
		
		return res;
	}

}

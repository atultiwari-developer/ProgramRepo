package str;

public class FindMin1 {
	
	public static final int no_of_cahrs = 256;
	
	public static void main(String[] args) {
		
		String str = "this is a test string";		
		String ptr = "tist";
		
		System.out.println("the pattern string is"+findPatternStr(str,ptr));
	}
	
	public static String findPatternStr(String str,String ptr) {
		int []hash_str = new int[no_of_cahrs];
		int []hash_ptr = new int[no_of_cahrs];
		
		int n1 = str.length();
		int n2 = ptr.length();
		
		if(n1<n2) {
			System.out.println("no such window exist");
			return "";
		}
		
		for(int i=0;i<n2;i++) {
		//	hash_ptr[ptr.charAt(i)]++;			
		
		}
		
		int count = 0;
		int start = 0;
		int start_index = -1;
		int minLen = Integer.MAX_VALUE;
		
		for(int j = 0;j<n1;j++) {
			hash_str[str.charAt(j)]++;
			
			if(hash_ptr[str.charAt(j)]!= 0 && hash_str[str.charAt(j)] <= hash_ptr[str.charAt(j)] ) {
				count++;
			}
			
			if(count==n2) {
				while(hash_str[str.charAt(start)] > hash_ptr[str.charAt(start)] || hash_ptr[str.charAt(start)]==0) {
					hash_str[str.charAt(start)]--;
					start++;

				}
				
				int window_len = j-start+1;
				
				if(window_len<minLen) {
					minLen = window_len;
					start_index = start;
				}
			}
			
		}
		if(start_index==-1) {
			System.out.println("no such window exixt");
			return "";
		}
		
		return str.substring(start_index, start_index+minLen);
	}

}

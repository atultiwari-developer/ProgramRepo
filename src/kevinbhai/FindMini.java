package kevinbhai;

public class FindMini {
	
	public static final int no_of_char= 256;
	
	public static void main(String[] args) {
        String str = "this is a test string"; 
        String pat = "tist"; 
        
        System.out.print("Smallest window is :\n " + 
                findSubString(str, pat)); 


		
	}

	private static String findSubString(String str, String pat) {
		
		int len1 = str.length();
		int len2 = pat.length();
		
		if(len1<len2) {
			System.out.println("NO such window exist");
			return " ";
		}
		
		int hash_pat [] = new int[no_of_char];
		int hash_str[] = new int[no_of_char];
		
		for(int i=0;i<len2;i++) {
			hash_pat[pat.charAt(i)]++;
		}
		
		int start = 0,minLen = Integer.MAX_VALUE,start_index = -1;
		int count = 0;
		
		for(int j=0;j<len1;j++) {
			hash_str[str.charAt(j)]++;
			
			if(hash_pat[str.charAt(j)] !=0 && hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)]) {
				count++;
				
			}
			
			if(count==len2) {
				while(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]) {
					hash_str[str.charAt(start)]--;
					start++;
				}
				
				//update window size
				int let_window = j-start+1;
				
				if(minLen>let_window) {
					minLen = let_window;
					start_index = start;
				}
			}
			
		}
		
		if(start_index==-1) {
			System.out.println("no such window exist");
			return "";
		}
		
		
		return str.substring(start_index, start_index+minLen);
	}

}

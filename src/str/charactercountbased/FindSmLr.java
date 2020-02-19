package str.charactercountbased;

public class FindSmLr {
	
	static String minWord="";
	static String maxWord = "";
	public static void main(String[] args) {
		String str = "This is a test string";
		
		minMaxWord(str);
		
		System.out.println("the min word is"+minWord);
		System.out.println("the max word is"+maxWord);

		
	}
	
	public static void minMaxWord(String str) {
	 
		
		int len = str.length();
		int minLength = len;
		int maxLength = 0;
		int min_start_indx = 0;
		int max_start_indx = 0;
		int si = 0;
		int ei = 0;
		
		while(ei <= len) {
			if(ei < len && str.charAt(ei) !=' ') {
				ei++;
			}
			else {
				int current_len = ei-si;
				if(current_len<minLength) {
					minLength = current_len;
					min_start_indx = si;
				}
				
				if(current_len > maxLength) {
					maxLength = current_len;
					max_start_indx = si;
				}				
				ei++;
				si = ei;
				
				
			}
			
		}
		
        minWord = str.substring(min_start_indx, min_start_indx + minLength);
        maxWord = str.substring(max_start_indx,max_start_indx+maxLength);

	}

}

package kevinbhai;

public class FirstNonRepeat {
	
	public static void main(String[] args) {
		String str = "leetcode";
		int[]arr = new int[26];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;
		}
		
		int minIndex = Integer.MAX_VALUE;
		boolean found = false;
		Character ch = null;
		for(int i=0;i<26;i++) {
			if(arr[i]==1) {
				if(minIndex>=str.indexOf((char)(i+'a'))) {
					minIndex = str.indexOf((char)(i+'a'));
					found = true;
					ch = (char)(i+'a');
				}
			}
		}
		if(!found) {
			System.out.println(0);
		}
		else {
			
		}
		
		System.out.println(ch);
		System.out.println(minIndex);
		
	}

}

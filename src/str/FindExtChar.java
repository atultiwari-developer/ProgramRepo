package str;

public class FindExtChar {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "cbdae";
		
		int[]arr = new int[26];
		
		for(int i=0;i<str2.length();i++) {
			arr[str2.charAt(i)-'a']++ ;
		}
		
		for(int j=0;j<str1.length();j++) {
			arr[str1.charAt(j)-'a']-- ;
		}
		
		for(int x=0;x<26;x++) {
			if(arr[x]==1)
			System.out.println((char)(x+'a'));
		}
		
	}

}

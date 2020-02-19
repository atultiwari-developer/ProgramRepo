package atul;

public class MakePan {
public static void main(String[] args) {
	
	String str = "The quick brown fox jumps";
	int[]arr = new int [26];
	for(int i=0;i<str.toLowerCase().length();i++) {
		if(str.charAt(i)==' ')
			continue;
		arr[str.charAt(i)-'a'] = 1;
	}
	StringBuilder res = new StringBuilder();
	for(int i=0;i<26;i++) {
		
	  if(arr[i]==0) {
		 char c =  (char)(i+97);
		 res.append(c+ "\t");
		 
	  }
	}
	System.out.println(res);
	
}

}

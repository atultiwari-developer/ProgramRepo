package str;

import java.util.HashMap;
import java.util.Map;

public class ChangeCharSet {
	public static void main(String[] args) {
		
		String str = "qwertyuiopasdfghjklzxcvbnm";

		Map<Character,Character> myMap = new HashMap<>();
		int[]arr = new int[26];
		
		for(int i=0;i<str.length();i++) {
			myMap.put(str.charAt(i),(char)(i+97));

		}
		
		
		
		String myStr = "egrt";
		StringBuilder res = new StringBuilder();
		for(int j=0;j<myStr.length();j++) {
			res.append(myMap.get(myStr.charAt(j)));
		}
		
		System.out.println("the restriction are pos");
		System.out.println(res);
		
	}

}

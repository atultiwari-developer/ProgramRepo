package kevinbhai;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowel2 {
	
	public static void main(String[] args) {
		String str = "leetcodeisacommunityforcoders";
		
		Set<Character> mySet = new HashSet<>();
		
		mySet.add('a');
		mySet.add('e');
		mySet.add('i');
		mySet.add('o');
		mySet.add('u');
		
	    StringBuilder sb = new StringBuilder();
	    for(char ch:str.toCharArray()) {
	    	if(!mySet.contains(ch)) {
	    		sb.append(ch);
	    	}
	    }
	    System.out.println(sb);
		
	}

}

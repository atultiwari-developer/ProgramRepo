package str.charactercountbased;

import java.util.HashSet;
import java.util.Set;

public class CountDistinct {
	
	public static void main(String[] args) {
        String input[] = {"abcd", "acbd", "adcb", "cdba", 
                "bcda", "badc"}; 
        int n = input.length; 
  
        System.out.println(countDistinct(input, n)); 
       // System.out.println(0&1);

	}

	private static char[] countDistinct(String[] input, int n) {
		
		int countdist = 0;
		Set<String> s = new HashSet<String>();
		for(int i=0;i<n;i++) {
			System.out.println(s);
			if(!s.contains(encodeString(input[i].toCharArray()))) {
                s.add(encodeString(input[i].toCharArray())); 
				countdist++;
			}
		}
		
		return null;
	}

	private static String encodeString(char[] charArray) {
		int[]evenchar = new int[26];
		int[]oddchar = new int[26];
		
		for(int i=0;i<charArray.length;i++) {
			char ch = charArray[i];
			if((i & 1)!=0) {
				oddchar[ch-'a']++;
			}
			else {
				evenchar[ch-'a']++;
			}
		}
		
		String encoding = "";
		
		for(int i=0;i<26;i++) {
			encoding+=(evenchar[i]);
			encoding+="-";
			encoding+=(oddchar[i]);
			encoding+="-";
			
		}
		
		return encoding;
	}

}

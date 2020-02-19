package str;

import java.util.Set;
import java.util.*;

public class KumarSan {
	
	public static void main(String[] args) {
		
		String[]arr = {"eva","jqw","tyn","jan"};
		String res = solution(arr);
		System.out.println("the res is"+res);
		
	}
	
	public static String solution(String[]arr) {
		String maxStr = "";
		String s="";
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				s +=arr[j];
				if(isAllDistinct(s)) {
					if(s.length()>maxStr.length())
					maxStr = s;
				}
	
			}
			s="";
		}
return maxStr;
		
	}
	
	public static  boolean isAllDistinct(String str) {
		Set<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(!set.add(str.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}

}

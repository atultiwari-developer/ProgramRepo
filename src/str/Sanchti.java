package str;
import java.util.*;

public class Sanchti {
	
	public static void main(String[] args) {
		String str="This a good day";
		//System.out.println("the string is"+compreeStr(str));
		
//		String str1 = "1-5,8,11-14,18,20,26-29";
//		String res = expandStr(str1);
//		System.out.println("the result is "+res);
		int[]arr= {7, 6, 5, 4, 3, 2, 1};
		//System.out.println(pq);
		
		//printLevelOreder(arr,arr.length);
		
		 revereWord(str);
	}
	
	private static void revereWord(String str) {
		String res="";
		int n= str.length();
		for(int i=n-1;i>=0;i--) {
			if(str.charAt(i)==' ') {
				System.out.print(res+" ");
				res="";
				continue;
			}
			else {
				res= str.charAt(i)+res;
			}
			
		}
		System.out.print(res+" ");

	}

	public static String compreeStr(String str) {
		
		Map<Character,Integer> map  = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i),1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()){
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
    return sb.toString();		
	}
	
	public static String expandStr(String str) {		
		String[]strArr = str.split(",");
		int n = strArr.length;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			String sub = strArr[i];
			
			if(sub.contains("-")) {
				String []arr = sub.split("-");
				int lower = Integer.parseInt(arr[0]);
				int upper = Integer.parseInt(arr[1]);
				for(int j=lower;j<=upper;j++) {
				      sb.append(j+",");
				}				
			}
			else {
				sb.append(sub+",");
			}
		}

		return sb.toString().substring(0, sb.length()-1);
		
	}
	
	public static void printLevelOreder(int[]arr,int n) {
		
		int level = 0;
		for(int i=0;i<n;level++) {
		int  lastIndex = (int)Math.pow(2,level)-1;
		 
		lastIndex = Math.min(i+lastIndex,n-1);

			 Arrays.sort(arr, i, lastIndex+1);
			 
			 while(i<=lastIndex){
				 System.out.print(arr[i]+" ");
				 i++;
				 
			 }
		 System.out.println();
		}
		
	}

}

package str;

public class QueueChan {
	
	
	public static void main(String[] args) {
		//String[]arr = {"co","di","ity"};
		//String[]arr = {"abc","yyy","def","csv"};
		//String[]arr = {"potato","kyak","banana","racecar"};
		String[]arr = {"eva","jqw","tyn","jan"};
		int n = arr.length;
		int res = getLength(arr,n);
		System.out.println("the result is"+res);
	}
	
	public static int getLength(String[]arr,int n) {
		int len = 0;
		for(int i=0;i<n;i++) {
			StringBuilder sb = new StringBuilder(arr[i]);

			for(int j=0;j<n;j++) {
				//String concate = arr[i]+arr[j];
				sb.append(arr[j]);
				if(isDuplicate(sb.toString())) {
					continue;
				}
				else {
					if(sb.length()>len) {
						len = sb.length(); 
					}
				}
			}
		}
		
		return len;
	}
	
	public static boolean isDuplicate(String str) {
		int[]arr = new int[26];
		int x = str.length();
		for(int i=0;i<x;i++) {
			arr[str.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++) {
			if(arr[i]>1) {
				return true;
			}
		}
		
		return false;
	}

}

package str;

public class LongestPaliSubDP {
	
	public static void main(String[] args) {
		String str = "abaabc";
		int len = str.length();
		String myres = getLargestStr(str,len);
		System.out.println("the res"+myres);
		
		
	}
	public static String getLargestStr(String str,int len){
		boolean[][]arr = new boolean[len][len];
		String res ="";
		int longest = 0;
		int stIndex = 0;
		int endIndex = 0;
		for(int x=0;x<len;x++) {
			arr[x][x] = true;
		}
		for(int j=0;j<len;j++) {
			for(int i=0;i<len;i++) {
				if( str.charAt(i)== str.charAt(j) && (j-i<=2 ||  arr[i+1][j-1]==true)) {
					arr[j][i] = true;
					if(j-i+1>longest) {
						longest = j-i+1;
						stIndex = i;
						endIndex = j;
					}

				}
			

			}
		}
		res = str.substring(stIndex, endIndex+1);
		return res;
	}

}

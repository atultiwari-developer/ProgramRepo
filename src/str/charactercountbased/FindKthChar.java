package str.charactercountbased;

public class FindKthChar {
	
	public static void main(String[] args) {
		String str = "a2b2c3def";
		int k = 5;
		System.out.println(findChar(str,k));
	}
	
	public static char findChar(String str,int k) {
		
		String fullStr ="";
		String rep="";
	    String digStr = "";
	    boolean integrate = false;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
			digStr = digStr + str.charAt(i);
			if((i +1)<str.length() && !Character.isDigit(str.charAt(i+1))) {
				integrate= true;
			}
			else if(i+1==str.length() && Character.isDigit(str.charAt(i))) {
				integrate= true;
			}

			}
			else {
				rep = rep + str.charAt(i);
				
				if(i+1==str.length() && !Character.isDigit(str.charAt(i))) {
					fullStr +=rep;
				}

			}
			
			if(integrate) {
				if(!digStr.equals("")) {
				int n = Integer.parseInt(digStr);
				for(int x =0;x<n;x++) {
					fullStr +=rep;
				}
				
				}
				else				
				fullStr +=rep;
				
				rep = "";
				digStr="";
				integrate = false;
			}
			
		}
		
		System.out.println("the full str is"+fullStr);
		return fullStr.charAt(k);
		
	}

}

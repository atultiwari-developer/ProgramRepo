package javaprac;

public class Hacker {
	static String strVal;
	public static void main(String[] args) {
		Hacker h1 = new Hacker();
		strVal = h1.getString("Program");
		System.out.println("the val is"+strVal);
	}
	
	public static String getString(String str) {
		StringBuffer sb = new StringBuffer(str.length());
		for(int i=str.length()-1;i>0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}

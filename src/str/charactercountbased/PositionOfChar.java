package str.charactercountbased;

public class PositionOfChar {
	
	public static void main(String[] args) {
		String str = "ABcD";
		 int count = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch) && str.charAt(i)-'A'==i) {
				count++;
			}
			else if(str.charAt(i)-'a'==i) {
				count++;
			}
		}
		
		System.out.println("the count is"+count);
	}

}

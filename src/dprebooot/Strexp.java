package dprebooot;

public class Strexp {

	public static void main(String[] args) {
		String str = "abc"+" ";
		int count = 0;
      for(int i=0;str.charAt(i) != ' ';i++) {		
    	  count++;
      }

      System.out.println(count);
	}
}

package javaprac;
import java.util.*;
public class StackExm {
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
	    s.add(1);
	    s.add(2);
	    s.add(3);
	    s.add(4);
	    s.add(5);
	    String str="";
	  while(!s.isEmpty()) {  
		  str = str +" "+s.pop();
	  }
	  System.out.println(str);
	    
	}

}

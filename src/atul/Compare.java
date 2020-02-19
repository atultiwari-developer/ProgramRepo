package atul;

import java.util.*;


public class Compare {
	
	static void compare(Pair arr[],int n) {
		
		Arrays.sort(arr, new Comparator<Pair>() {
			@Override public int compare(Pair p1,Pair p2){
				return p1.y - p2.y;
			}
		});
		
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i].x + " " + arr[i].y + " "); 
        } 
        System.out.println(); 		
		
	}
	public static void main(String[] args) {
		int n = 5;
        Pair arr[] = new Pair[n]; 
        
        arr[0] = new Pair(10, 20); 
        arr[1] = new Pair(1, 2); 
        arr[2] = new Pair(3, 1); 
        arr[3] = new Pair(10, 8); 
        arr[4] = new Pair(4, 3); 
        compare(arr,n);
	}

}

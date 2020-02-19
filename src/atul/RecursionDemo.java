package atul;

public class RecursionDemo {

	public static void main(String[] args) {
		 int arr[] = {-12, -11, -13, -5, -6, 7, 5, 3, 6}; 
		 int length = arr.length;
		 
		    int countNegative = 0; 
		      
		    for(int i = 0; i < length; i++) 
		    { 
		        if(arr[i] < 0) 
		            countNegative++; 
		    }
		    
		    rearrange(arr, 0, (length - 1)); 
		    reverse(arr, countNegative, (length - 1)); 

           for(int i=0;i<length;i++) {
        	   System.out.print(arr[i]+" ");
           }

	}
	
	static void rearrange(int array[], int start, int end) 
	{ 
	    // exit condition  
	    if(start == end) 
	        return; 
	      
	    // rearrange the array except the first 
	    // element in each recursive call  
	    rearrange(array, (start + 1), end); 
	      
	    // If the first element of the array is positive,  
	    // then right-rotate the array by one place first 
	    // and then reverse the merged array. 
	    if(array[start] >= 0) 
	    { 
	        reverse(array, (start + 1), end); 
	        reverse(array, start, end); 
	    } 
	} 
	
	
	static void reverse(int array[], int start, int end) 
	{ 
	    while(start < end) 
	    { 
	        int temp = array[start]; 
	        array[start] = array[end]; 
	        array[end] = temp; 
	        start++; 
	        end--; 
	    } 
	} 


}

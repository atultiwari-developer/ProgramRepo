package arrray;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class SortMap {
	
	public static void main(String[] args) {
		int[]arr = {4,3,4,3,3,2,1,1,3,5,6,3,2,1};
        Map<Integer,Integer> map  = new LinkedHashMap<>();
        Map<Integer, Integer> countMap = getCountMap(arr, arr.length); 
        StringBuffer result = new StringBuffer(); 
        
        countMap.entrySet().stream().sorted(Map.Entry.<Integer,Integer> comparingByValue())
        		.forEach(e->{
        			
                    int key = e.getKey(); 
                    int val = e.getValue(); 
                    for (int i = 0; i < val; i++) { 
                        result.append(key + " "); 
                    } 

        });
        System.out.println(result);
 
}
	
	private static Map<Integer,Integer> getCountMap(int []arr,int n){
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}
			else {
				map.put(arr[i],1);
			}

		}
		return map;
	}
}

//Collections.sort(listEntry, (o1,o2)->o1.getValue().compareTo(o2.getValue()));


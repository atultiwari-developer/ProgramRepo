package arrray;

import java.util.LinkedHashMap;
import java.util.Map;

public class CarPro {
	
	public static void main(String[] args) {
		String carNumStr = "8812 3897 2275 8583 6930 2092 4862 8859 7349 4202 7990 5068 6357 1324 8199 8320 5287 1758 4959 1050 3540 2560 3166 3007 2098 9760 5969 1192 1601 6817 6903 6188 6292 5916 7537 9965 8407 5735 4668 7245 4413 5885 2088 3167 3468 7266 8317 8909 5410 2746 2072 3320 8199 4046 9415 3912 8135 8742 7716 9996 7889 4669 5568 9118 7328 8767 9162 8202 6358 3789 4306 5979 2290";
		String penalStr = "331 899 356 914 59 104 30 678 534 485 222 6 936 798 504 789 455 695 168 684 822 209 49 348 433 113 288 84 748 927 304 78 825 12 992 236 115 373 265 1000 209 486 6 144 284 861 284 738 907 452 773 729 12 821 428 444 934 715 879 33 993 535 110 170 546 101 405 660 826 21 660 34 507";
		
		String[]carArr = carNumStr.trim().split(" ");
		String[]penalArr = penalStr.trim().split(" ");
		int x = penalArr.length;
		int y = carArr.length;
		System.out.println("x"+x);
		System.out.println("y"+y);
		
		Map<Integer,Integer> map = new LinkedHashMap<>();
		int penalsum = 0;
		for(int i=0;i<penalArr.length;i++) {
			map.put(Integer.parseInt(carArr[i]),Integer.parseInt(penalArr[i]));
			penalsum = penalsum+Integer.parseInt(penalArr[i]);
		}
		//System.out.println("the penal sum is"+penalsum);
		System.out.println(map);
		int sum = 0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getKey()%2==0) {
				sum = sum + entry.getValue();
			}
		}
		
		System.out.println("the sum is"+sum);
		
	}

}

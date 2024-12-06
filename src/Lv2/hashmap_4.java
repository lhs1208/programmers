// 위장
// https://school.programmers.co.kr/learn/courses/30/lessons/42578

package Lv2;
import java.util.HashMap;

import java.util.Arrays;
import java.util.*;
import static java.util.stream.Collectors.*;

public class hashmap_4 {


	 public static int solution(String[][] clothes) {
	        int answer = 1;
	        
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (int i = 0; i < clothes.length; i++){ 
	        	hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
	        }
	        for(String key : hm.keySet()) {
	        	int temp = hm.get(key) + 1;
	        	answer = temp * answer;
	        }
	        answer = answer - 1;
	        System.out.println(answer);
	        return answer;
	    }
	
	 public static int solution2(String[][] clothes) {
		 return Arrays.stream(clothes)
	                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
	                .values()
	                .stream()
	                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
	    }
	 
	 
	public static void main(String[] args) {
		
		//String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};	
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
				
		solution(clothes);
	}

}

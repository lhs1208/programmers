//포켓몬 Lv1
//https://school.programmers.co.kr/learn/courses/30/lessons/1845

package Lv1;

import java.util.HashMap;

public class hashmap_1 {
	
	 public static int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
		for(Integer key : nums){
			hm.put(key, hm.getOrDefault(key, 0) + 1);
			System.out.println(hm);
		}
		if(hm.size() > nums.length/2){
			answer = nums.length/2;
		}else{
			answer = hm.size();
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		//int[] nums = {3,1,2,7,3};
		int[] nums = {3,3,3,2,2,2};
		solution(nums);
	}

}

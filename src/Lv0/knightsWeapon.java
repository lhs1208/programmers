// 기사단원의 무기
// https://school.programmers.co.kr/learn/courses/30/lessons/136798

package Lv0;

public class knightsWeapon {

	public static int Solution(int num, int limit, int power){
        int answer = 0;
        for(int z=1; z<=num; z++){
			int count = 0;
	        int i = 1;
	        while(i <= z)
	        {
	            if(z % i == 0)
	                count += 1;
	            i++;
	        }
	        if(count > limit){
	        	answer += power;
	        }else{
	        	answer += count;
	        }
		}
		return answer;
	}
	
	public static void main(String[] args){
		System.out.println(Solution(20,4,2));
	}
	
	
}

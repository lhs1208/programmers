//입국심사
//https://school.programmers.co.kr/learn/courses/30/lessons/43238
package Lv3;
import java.util.*;

public class binarySearch_1 {

	public static long solution(int n, int[] times){
		long answer = 0;
		//Arrays.sort(times);

		long left = 1;
		//제일 마지막 값이 10을 가지고 n명을 심사하면 최고로 느린 값이 나온다. 
		long right = (long) times[0] * n;
		
		while(left <= right){
			long mid = (left + right)/2;
			long complete = 0;
			
			for(int time : times){
				complete += mid / time;
			}
			
			if(complete >= n){
				answer = mid;
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		
		System.out.println(answer);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		int n = 6;
		int[] times = {7,10};
		solution(n, times);
	}

}

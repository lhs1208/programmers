//중앙값 구하기
//https://school.programmers.co.kr/learn/courses/30/lessons/120811

package Lv0;

import java.util.*;

public class introCodingTest_1 {

	public static int solution(int[] array) {
		int answer =0;
		Arrays.sort(array); 
		int midSize = array.length/2;
		answer = (int) array[midSize];
		return answer;
	}
	
	public static void main(String[] args) {
		//int[] array = {1, 2, 7, 10, 11};
		int[] array = {9, -1, 0};
		System.out.println(solution(array));
	}

}

//최소값 만들기
//https://school.programmers.co.kr/learn/courses/30/lessons/12941

package Lv2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class makeMin {

	public static int solution(int[] A, int[] B){
		int answer = 0;
		
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i=0; i<A.length; i++){
			int temp = A.length - 1 - i;
			int temp2 = A[i] * B[temp];
			answer += temp2;
		}
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		int[] A = {1,4,2}; 
		//int[] A = {1,2};
		int[] B = {5,4,4};
		//int[] B = {3,4};
		
		solution(A,B);
		
	}

}

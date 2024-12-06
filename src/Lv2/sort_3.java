// H-index  Lv2
// https://school.programmers.co.kr/learn/courses/30/lessons/42747
package Lv2;

import java.util.Arrays;

public class sort_3 {

	 public static int solution(int[] citations) {
	        int answer = 0;
	        Arrays.sort(citations);
	        for(int i=0; i<citations.length; i++){
	        	int count = citations.length-i;
	        	if(citations[i] >= count){
	        		answer = count;
	        		break;
	        	}
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		solution(citations);
	}

}

// 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
	
package Lv1;

import java.util.ArrayList;

public class stackQue_1 {

	 public static int[] solution(int[] arr) {
		 
		 ArrayList<Integer> list = new ArrayList<>();
		 int temp = 0;
		 
		 for(int i=0; i<arr.length; i++){
			 if(arr.length - 1 != i){
				 if(arr[i] == arr[i+1]){
					 continue;
				 }else{
					 list.add(arr[i]);
					 temp++;
				 }
			 }else{
				 list.add(arr[i]);
			 }
		 }
		 
		 int[] answer = new int[list.size()];
		 for(int z=0; z<list.size(); z++){
			 answer[z] = list.get(z);
		 }
		 
		 return answer;
	    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		solution(arr);
	}
	
}

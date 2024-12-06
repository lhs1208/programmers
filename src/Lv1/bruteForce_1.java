//최소직사각형
//https://school.programmers.co.kr/learn/courses/30/lessons/86491
package Lv1;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class bruteForce_1 {

	
	public static int solution(int[][] sizes){
		int maxLeft  = 0;
		int maxRight = 0;
		
		//단순 for구문으로 이용해서 공부.
		for(int i=0; i<sizes.length; i++){
			Arrays.sort(sizes[i]);
			if(maxLeft<sizes[i][0]){
				maxLeft = sizes[i][0];
			}
			if(maxRight<sizes[i][1]){
				maxRight = sizes[i][1];
			}
		}
		
		//속도적인 측면에서 완전 앞선 코드
		for (int[] card : sizes) {
			maxLeft = Math.max(maxLeft, Math.max(card[0], card[1]));
			maxRight = Math.max(maxRight, Math.min(card[0], card[1]));
        }
		
		
		
		int answer = maxLeft * maxRight;
		return answer;
	}
	
	
	public static void main(String[] args) {
		//int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		
		System.out.println(solution(sizes));
		
	}

}

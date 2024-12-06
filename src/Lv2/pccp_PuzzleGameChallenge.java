// [PCCP 기출문제] 2번 / 퍼즐 게임 챌린지
//https://school.programmers.co.kr/learn/courses/30/lessons/340212

package Lv2;
import java.util.Arrays;

public class pccp_PuzzleGameChallenge {
	
	public static int solution(int[] diffs, int[] times, long limit){
		int answer =0;
		int left = 1;
		int right = Arrays.stream(diffs).max().getAsInt();
		
		while(left <=right){
			int mid = left + (right - left) / 2;
			if(levelTest(diffs,times,limit,mid)){
				// true 가 나오면 level이 너무 높으니깐 최소의 레벨을 구해야하기 때문에 레벨을 낮춘다.
				// 레벨을 낮추다가 처음 false가 나올때를 가져온다.
				answer = mid;
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		return answer;
	}
	
	public static boolean levelTest(int[] diffs, int[] times, long limit, int level){
		long answer =0;
		answer += times[0];
		for(int i=1; i<diffs.length; i++){
			if(diffs[i] <= level){
				answer += times[i];
			}else{
				answer += ( (int)times[i-1] + (int)times[i] )*((int)diffs[i] - (int)level) + (int)times[i];
			}
		}
		return answer <= limit;
	}
	
	public static void main(String[] args) {
		int[] diffs ={1,5,3};
		int[] times ={2,4,7};
		long limit = 30;
		
//		int[] diffs ={1,4,4,2};
//		int[] times ={6,3,8,2};
//		long limit = 59;
		
//		int[] diffs ={1, 328, 467, 209, 54};
//		int[] times ={2, 7, 1, 4, 3};
//		long limit = 1723;
		
//		int[] diffs ={1,99999,100000,99995};
//		int[] times ={9999, 9001, 9999, 9001};
//		long limit = 3456789012L;
		
		System.out.println(solution(diffs, times, limit));
	}

}

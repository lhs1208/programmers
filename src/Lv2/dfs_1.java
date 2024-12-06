// 타겟넘버  Lv2
// https://school.programmers.co.kr/learn/courses/30/lessons/43165

package Lv2;

public class dfs_1 {
	static int[] number;
	static int targets;
	static int answer; 
	
	public static int solution(int[] numbers, int target){
		number = numbers;
		targets = target;
		dfs(0,0);		
		return answer;
	}
	
	
	public static void dfs(int index, int sum){
		if(index == number.length){
			if(sum == targets){
				answer++;
			}
			return;
		}else{
			dfs(index+1, sum + number[index]);
			dfs(index+1, sum - number[index]);
		}
	}
	
	
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1};
		int target = 2;
		System.out.println(solution(numbers, target));
	}

}

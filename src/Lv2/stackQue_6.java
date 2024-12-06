//https://school.programmers.co.kr/learn/courses/30/lessons/42584
//주식가격
package Lv2;


import java.util.*;

public class stackQue_6 {

	
	public static int[] solution(int[] prices){
		int answer[] = new int[prices.length];
		
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<prices.length; i++){
			
			System.out.println("prices[i] >> "+ prices[i] );
			while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
				System.out.println("hi");
				answer[stack.peek()] = i - stack.peek();
				stack.pop();
			}
			System.out.println(i);
			stack.push(i);
			System.out.println(stack);
		}
		
		
			
		while(!stack.isEmpty()){
			answer[stack.peek()] = prices.length - stack.peek() -1;
			stack.pop();
		}
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
		System.out.println(answer[3]);
		System.out.println(answer[4]);
		
			
		
		return answer;
		
	}
	
	
	
	public static void main(String[] args) {
		//int[] prices = {1, 2, 2, 1, 3};
		//int[] prices = {5, 4, 3, 2, 1};
		int[] prices = {8, 9, 10, 9, 10};
		//int[] prices = {1};
		
		solution(prices);
		
		//System.out.println(solution(prices));
		
	}

}

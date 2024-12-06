// 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909

package Lv2;

import java.util.Stack;

public class stackQue_3 {

	public static boolean solution(String s) {
		 Stack<Character> stack = new Stack<>();
		    for (int i = 0; i < s.length(); i++) {
		        char c = s.charAt(i);
		        if (c == '(') {
		            stack.push(c);
		        } else if (!stack.empty() && stack.peek() == '(') {
		            stack.pop();
		        } else {
		            return false;
		        }
		    }
		    return stack.empty();
	}
	
	public static void main(String[] args) {
		String s = "()()";
		solution(s);
		
	}

}
